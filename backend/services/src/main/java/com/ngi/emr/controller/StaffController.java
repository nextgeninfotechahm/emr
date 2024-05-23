package com.ngi.emr.controller;

import com.ngi.emr.contract.StaffContract;
import com.ngi.emr.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/staff")
public class StaffController {
    @Autowired
    private StaffService staffService;

    @RequestMapping(method = RequestMethod.GET)
    public void getAllStaff() {
        staffService.getAllStaff();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addStaff(@RequestBody StaffContract staff) {
        staffService.addStaff(staff);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/{id}")
    public void removeStaff(@PathVariable("id") int id) {
        staffService.removeStaff(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/{id}")
    public void updateStaff(@PathVariable("id") int id, @RequestBody StaffContract staff) {
        staffService.updateStaff(id, staff);
    }
}
