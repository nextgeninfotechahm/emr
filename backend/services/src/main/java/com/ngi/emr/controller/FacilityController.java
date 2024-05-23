package com.ngi.emr.controller;

import com.ngi.emr.contract.EthnicityContract;
import com.ngi.emr.contract.FacilityContract;
import com.ngi.emr.entity.Facility;
import com.ngi.emr.service.FacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/facilites")
public class FacilityController {
    @Autowired
    private FacilityService facilityService;

    @RequestMapping(method= RequestMethod.GET)
    public List<FacilityContract> getAllFacilities(){

        return facilityService.getFacilities();
    }

    @RequestMapping(method=RequestMethod.POST)
    public void addFacility(@RequestBody FacilityContract facility){
        facilityService.addFacility(facility);
    }

    @RequestMapping(method=RequestMethod.DELETE,value="/{id}")
    public void removeFacility(@PathVariable("id") int id){
        facilityService.removeFacility(id);
    }

    @RequestMapping(method=RequestMethod.PUT,value="/{id}")
    public void updateFacility(@PathVariable("id") int id,@RequestBody FacilityContract facility){
        facilityService.updateFacility(id, facility);
    }
}
