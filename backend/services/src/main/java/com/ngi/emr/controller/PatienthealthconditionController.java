package com.ngi.emr.controller;

import com.ngi.emr.contract.PatienthealthconditionContract;
import com.ngi.emr.entity.Patienthealthcondition;
import com.ngi.emr.service.PatienthealthconditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patienthealthconditions")
public class PatienthealthconditionController {
    @Autowired
    private PatienthealthconditionService patienthealthconditionService;
    @RequestMapping(method= RequestMethod.GET)
    public List<PatienthealthconditionContract> getPatienthealthconditions() {return patienthealthconditionService.getphcs(); }

    @RequestMapping(method= RequestMethod.POST)
    public void addPatienthealthcondition(@RequestBody PatienthealthconditionContract patienthealthcondition) {
        patienthealthconditionService.addPatienthealthcondition(patienthealthcondition);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/{id}")
    public void deletePatienthealthcondition(@PathVariable("id") int id) {patienthealthconditionService.removePatienthealthcondition(id);}

    @RequestMapping(method= RequestMethod.PUT, value="/{id}")
    public void updatePatienthealthcondition(@PathVariable("id") int id, @RequestBody PatienthealthconditionContract patienthealthcondition) {
        patienthealthconditionService.updatePatienthealthcondition(id,patienthealthcondition);
    }


}
