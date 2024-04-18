package com.ngi.emr.controller;

import com.ngi.emr.contract.PatientContract;
import com.ngi.emr.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {
    @Autowired
    private PatientService patientService;
    @RequestMapping(method= RequestMethod.GET)
    public List<PatientContract> getAllPatients()
    {
        return patientService.getPatients();
    }

    @RequestMapping(method=RequestMethod.POST)
    public void addPatient(@RequestBody PatientContract patient)
    {
        patientService.addPatient(patient);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/{id}")
    public void deletePatient(@PathVariable("id") int id)
    {
        patientService.removePatient(id);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/{id}")
    public void updatePatient(@PathVariable("id") int id, @RequestBody PatientContract patient)
    {
        patientService.updatePatient(id,patient);
    }
}
