package com.tahadonuk.restaurantmanagementsystem.controller;

import com.tahadonuk.restaurantmanagementsystem.data.TableStatus;
import com.tahadonuk.restaurantmanagementsystem.data.entity.RestaurantTable;
import com.tahadonuk.restaurantmanagementsystem.dto.StringResponse;
import com.tahadonuk.restaurantmanagementsystem.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TableController {

    @Autowired
    TableService tableService;

    @PostMapping(path = "/api/table/save")
    @ResponseBody
    public ResponseEntity<Object> addTable(@RequestBody RestaurantTable table) {
        if(table.getTableId() <= 0) return ResponseEntity.badRequest().body(new StringResponse("ID: "+table.getTableId()+" no es valido."));

        try{
            table.setStatus(TableStatus.AVAILABLE);

            tableService.addTable(table);
            return ResponseEntity.ok().body(new StringResponse("Mesa " + table.getTableId() + " ha sido agregada."));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new StringResponse(e.getMessage()));
        }
    }

    @DeleteMapping(path = "/api/table/{id}/delete")
    @ResponseBody
    public ResponseEntity<Object> deleteTable(@PathVariable long id) {
        try{
            tableService.deleteTable(id);
            return ResponseEntity.ok().body(new StringResponse("Mesa " + id + " se elimino"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new StringResponse(e.getMessage()));
        }
    }

    @GetMapping(path = "/api/table/{id}")
    @ResponseBody
    public ResponseEntity<Object> getById(@PathVariable long id) {
        try {
            return ResponseEntity.ok(tableService.getById(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new StringResponse(e.getMessage()));
        }
    }

    @GetMapping(path = "/api/table")
    @ResponseBody
    public ResponseEntity<List<RestaurantTable>> getTables() {
        return new ResponseEntity<>(tableService.getAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/api/table/cap")
    @ResponseBody
    public ResponseEntity<List<RestaurantTable>> getByCapacity(@RequestParam("capacity") int capacity) {
        return new ResponseEntity<>(tableService.getByCapacity(capacity), HttpStatus.OK);
    }

    @PostMapping(path = "/api/table/{id}/status")
    @ResponseBody
    public ResponseEntity<Object> setStatus(@RequestBody String statusString, @PathVariable long id) {
        try {
            TableStatus status = TableStatus.valueOf(statusString.toUpperCase().replaceAll(" ", "_"));
            tableService.updateTableStatus(status, id);
            return ResponseEntity.ok(new StringResponse("El estado de la mesa ha sido actualizado."));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new StringResponse(e.getMessage()));
        }
    }
}
