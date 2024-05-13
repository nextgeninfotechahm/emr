package com.ngi.emr.controller;

import com.ngi.emr.contract.PatientnotesContract;
import com.ngi.emr.service.PatientNotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patientnotes")
public class PatientNotesController {
    @Autowired
    private PatientNotesService patientNotesService;
    @RequestMapping(method= RequestMethod.GET)
    public List<PatientnotesContract> getPatientDocs() {return patientNotesService.getPatientNotes(); }

    @RequestMapping(method= RequestMethod.POST)
    public void addPatientNotes(@RequestBody PatientnotesContract patientNotes) {
        patientNotesService.addPatientNotes(patientNotes);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/{id}")
    public void deletePatientNote(@PathVariable("id") int id) {patientNotesService.removePatientNotes(id);}

    @RequestMapping(method= RequestMethod.PUT, value="/{id}")
    public void updatePatientNote(@PathVariable("id") int id, @RequestBody PatientnotesContract patientNotes) {
        patientNotesService.updatePatientnotes(id,patientNotes);
    }
}
