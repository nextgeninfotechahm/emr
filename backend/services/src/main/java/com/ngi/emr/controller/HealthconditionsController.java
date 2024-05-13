package com.ngi.emr.controller;

import com.ngi.emr.contract.HealthconditionContract;
import com.ngi.emr.service.HealthconditionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/healthconditions")
public class HealthconditionsController {
    @Autowired
    private HealthconditionsService healthconditionsService;

    @RequestMapping(method = RequestMethod.GET)
    public List<HealthconditionContract> getHealthconditions() {
        return healthconditionsService.getHealthconditions();
    }

    @RequestMapping(method=RequestMethod.POST)
    public void addHealthcondition(@RequestBody HealthconditionContract healthconditionContract) {
        healthconditionsService.addHealthcondition(healthconditionContract);
    }

    @RequestMapping(method=RequestMethod.DELETE, value ="/{id}")
    public void removeHealthcondition(@PathVariable("id") int id) {
        healthconditionsService.removeHealthcondition(id);
    }

    @RequestMapping(method=RequestMethod.PUT, value = "/{id}")
    public void updateHealthcondition(@PathVariable("id") int id, @RequestBody HealthconditionContract healthconditionContract) {
        healthconditionsService.updateHealthcondition(id, healthconditionContract);
    }
}
