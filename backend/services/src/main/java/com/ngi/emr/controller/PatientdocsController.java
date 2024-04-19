package com.ngi.emr.controller;

import com.ngi.emr.contract.PatientAllergyContract;
import com.ngi.emr.contract.PatientdocsContract;
import com.ngi.emr.service.PatientDocsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patientdocs")
public class PatientdocsController {
    @Autowired
    private PatientDocsService patientDocsService;
    @RequestMapping(method= RequestMethod.GET)
    public List<PatientdocsContract> getPatientDocs() {return patientDocsService.getPatientDocs(); }

    @RequestMapping(method= RequestMethod.POST)
    public void addPatientDocs(@RequestBody PatientdocsContract patientDoc) {
        patientDocsService.addPatientDoc(patientDoc);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/{id}")
    public void deletePatientDoc(@PathVariable("id") int id) {patientDocsService.removePatientDoc(id);}

    @RequestMapping(method= RequestMethod.PUT, value="/{id}")
    public void updatePatientDoc(@PathVariable("id") int id, @RequestBody PatientdocsContract patientDoc) {
        patientDocsService.updatePatientDoc(id,patientDoc);
    }
}
