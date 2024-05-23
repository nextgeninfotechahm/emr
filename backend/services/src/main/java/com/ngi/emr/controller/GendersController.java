package com.ngi.emr.controller;

import com.ngi.emr.contract.GenderContract;
import com.ngi.emr.service.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/genders")
public class GendersController {
    @Autowired
    private GenderService genderService;

    @RequestMapping(method = RequestMethod.GET)
    public void getGenders() {
        genderService.getGenders();
    }

    @RequestMapping(method=RequestMethod.POST)
    public void addGender(GenderContract gender) {
        genderService.addGender(gender);
    }

    @RequestMapping(method=RequestMethod.DELETE, value = "/{id}")
    public void removeGender(@PathVariable("id") int id) {
        genderService.removeGender(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/{id}")
    public void updateGender(@PathVariable("id") int id, GenderContract gender) {
        genderService.updateGender(id, gender);
    }
}
