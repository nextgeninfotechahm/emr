package com.ngi.emr.controller;

import com.ngi.emr.AppConfig;
import com.ngi.emr.contract.EthnicityContract;
import com.ngi.emr.contract.QueryResultsContract;

import com.ngi.emr.service.EthnicityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/ethnicities")
public class EthnicitiesController {
    @Autowired
    private EthnicityService service;
    @Autowired
    private AppConfig appConfig;
 
    @RequestMapping(method=RequestMethod.GET)
    public QueryResultsContract<EthnicityContract> getEthnicities(
        @RequestParam(required = false,value = "text") String query,
        @RequestParam(required = false,value = "paged",defaultValue = "false") boolean paged,
        @RequestParam(required = false,value = "pageno", defaultValue = "0") int pageNo,
        @RequestParam(required = false,value = "sortby", defaultValue = "ID") String sortColumn,
        @RequestParam(required = false,value = "sortOrder", defaultValue = "0") int sortOrder){
        return service.getEthnicities(query, paged, pageNo, sortColumn, sortOrder);
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
