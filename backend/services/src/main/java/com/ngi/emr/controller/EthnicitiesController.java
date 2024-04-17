package com.ngi.emr.controller;

import com.ngi.emr.contract.EthnicityContract;
import com.ngi.emr.service.EthnicityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ethnicities")
public class EthnicitiesController {
    @Autowired
    private EthnicityService service;
    @RequestMapping(method=RequestMethod.GET)
    public List<EthnicityContract> getAllEthnicities(){
        return service.getEthnicities();
    }

    @RequestMapping(method=RequestMethod.POST)
    public void addEthnicity(@RequestBody EthnicityContract ethnicity){
        service.addEnthnicity(ethnicity);
    }

    @RequestMapping(method=RequestMethod.DELETE,value="/{id}")
    public void removeEthnicity(@PathVariable("id") int id){
        service.removeEthnicity(id);
    }

    @RequestMapping(method=RequestMethod.PUT,value="/{id}")
    public void removeEthnicity(@PathVariable("id") int id,@RequestBody EthnicityContract ethnicity){
        service.updateEthnicity(id,ethnicity);
    }

}
