package com.ngi.emr.controller;

import com.ngi.emr.contract.PatientinsuranceContract;
import com.ngi.emr.service.PatientInsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patientinsurance")
public class PatientInsuranceController {
    @Autowired
    private PatientInsuranceService patientInsuranceService;
    @RequestMapping(method= RequestMethod.GET)
    public List<PatientinsuranceContract> getPatientInsurances() {return patientInsuranceService.getPatientInsurances(); }

    @RequestMapping(method= RequestMethod.POST)
    public void addPatientInsurance(@RequestBody PatientinsuranceContract patientInsurance) {
        patientInsuranceService.addPatientInsurance(patientInsurance);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/{id}")
    public void deletePatientInsurance(@PathVariable("id") int id) {patientInsuranceService.removePatientInsurance(id);}

    @RequestMapping(method= RequestMethod.PUT, value="/{id}")
    public void updatePatientInsurance(@PathVariable("id") int id, @RequestBody PatientinsuranceContract patientInsurance) {
        patientInsuranceService.updatePatientInsurance(id, patientInsurance);
    }
}
