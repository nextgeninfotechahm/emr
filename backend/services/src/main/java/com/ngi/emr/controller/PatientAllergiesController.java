package com.ngi.emr.controller;

import com.ngi.emr.contract.PatientAllergyContract;
import com.ngi.emr.contract.PatienthealthconditionContract;
import com.ngi.emr.service.PatientAllergyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patientAllergies")
public class PatientAllergiesController {
    @Autowired
    private PatientAllergyService patientAllergyService;
    @RequestMapping(method= RequestMethod.GET)
    public List<PatientAllergyContract> getPatientAllergies() {return patientAllergyService.getPatientAllergies(); }

    @RequestMapping(method= RequestMethod.POST)
    public void addPatientAllergy(@RequestBody PatientAllergyContract patientAllergy) {
        patientAllergyService.addPatientAllergy(patientAllergy);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/{id}")
    public void deletePatientAllergy(@PathVariable("id") int id) {patientAllergyService.removePatientAllergy(id);}

    @RequestMapping(method= RequestMethod.PUT, value="/{id}")
    public void updatePatientAllergy(@PathVariable("id") int id, @RequestBody PatientAllergyContract patientAllergy) {
        patientAllergyService.updatePatientAllergy(id,patientAllergy);
    }
}
