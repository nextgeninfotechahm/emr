package com.ngi.emr.controller;

import com.ngi.emr.contract.EthnicityContract;
import com.ngi.emr.service.EthnicityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ethnicities")
public class EthnicitiesController {
    @Autowired
    private EthnicityService service;
 
    @RequestMapping(method=RequestMethod.GET)
    public List<EthnicityContract> getAllEthnicities(@RequestParam(required = false,value = "text") String query){
    
        return service.getEthnicities(query);
    }

    @RequestMapping(method=RequestMethod.POST)
    public void addEthnicity(@RequestBody EthnicityContract ethnicity){
        service.addEthnicity(ethnicity);
    }

    @RequestMapping(method=RequestMethod.DELETE,value="/{id}")
    public void removeEthnicity(@PathVariable("id") int id){
        service.removeEthnicity(id);
    }

    @RequestMapping(method=RequestMethod.PUT,value="/{id}")
    public void updateEthnicity(@PathVariable("id") int id,@RequestBody EthnicityContract ethnicity){
        service.updateEthnicity(id,ethnicity);
    }

    @RequestMapping(method=RequestMethod.GET,value="/count")
    public long getCount(){
        return service.getCount();
    }

}
