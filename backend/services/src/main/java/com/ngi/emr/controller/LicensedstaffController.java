package com.ngi.emr.controller;

import com.ngi.emr.contract.LicensedstaffContract;
import com.ngi.emr.service.LicensedstaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/licensedstaff")
public class LicensedstaffController {
    @Autowired
    private LicensedstaffService licensedstaffService;

    @RequestMapping(method= RequestMethod.GET)
    public List<LicensedstaffContract> getLicensedstaff() {
        return licensedstaffService.getLicensedstaff();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addLicensedstaff(@RequestBody LicensedstaffContract licensedstaff) {
        licensedstaffService.addLicensedstaff(licensedstaff);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteLicensedstaff(@PathVariable("id") int id) {
        licensedstaffService.removeLicensedstaff(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/{id}")
    public void updateLicensedstaff(@PathVariable("id") int id, @RequestBody LicensedstaffContract licensedstaff) {
        licensedstaffService.updateLicensedstaff(id, licensedstaff);
    }
}
