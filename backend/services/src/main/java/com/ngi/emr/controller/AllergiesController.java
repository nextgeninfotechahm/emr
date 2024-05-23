package com.ngi.emr.controller;

import com.ngi.emr.contract.AllergyContract;
import com.ngi.emr.service.AllergyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/allergies")
public class AllergiesController {
    @Autowired
    private AllergyService allergyService;

    @RequestMapping(method= RequestMethod.POST)
    public void addAllergy(@RequestBody AllergyContract allergy){
        allergyService.addAllergy(allergy);
    }

    @RequestMapping(method=RequestMethod.DELETE,value="/{id}")
    public void removeAllergy(@PathVariable("id") int id){
        allergyService.removeAllergy(id);
    }

    @RequestMapping(method=RequestMethod.PUT,value="/{id}")
    public void updateAllergy(@PathVariable("id") int id,@RequestBody AllergyContract allergy){
        allergyService.updateAllergy(id,allergy);
    }
}
