package com.ngi.emr.controller;

import com.ngi.emr.contract.RolepermissionContract;
import com.ngi.emr.service.RolepermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rolepermissions")
public class RolepermissionsController {
    @Autowired
    private RolepermissionService rolepermissionService;

    @RequestMapping(method = RequestMethod.GET)
    public List<RolepermissionContract> getRolepermissions() {
        return rolepermissionService.getRolepermissions();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addRolepermission(@RequestBody RolepermissionContract rolepermission) {
        rolepermissionService.addRolepermission(rolepermission);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/{id}")
    public void deleteRolepermission(@PathVariable("id") int id) {
        rolepermissionService.removeRolepermission(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/{id}")
    public void updateRolepermission(@PathVariable("id") int id, @RequestBody RolepermissionContract rolepermission) {
        rolepermissionService.updateRolepermission(id, rolepermission);
    }
}
