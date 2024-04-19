package com.ngi.emr.service;

import com.ngi.emr.contract.PatientAllergyContract;
import com.ngi.emr.contract.PatienthealthconditionContract;
import com.ngi.emr.entity.Patientallergies;
import com.ngi.emr.entity.Patienthealthcondition;
import com.ngi.emr.repo.PatientallergiesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PatientAllergyService {
    @Autowired
    private PatientallergiesRepo repo;
    public void addPatientAllergy(PatientAllergyContract patientAllergyContract) {
        Patientallergies allergy = new Patientallergies();
        allergy.setPatientId(patientAllergyContract.getPatientId());
        allergy.setAllergyId(patientAllergyContract.getAllergyId());
        allergy.setStatus(patientAllergyContract.getStatus());
        allergy.setStartDate((Date) patientAllergyContract.getStartDate());
        allergy.setEndDate((Date) patientAllergyContract.getEndDate());
        allergy.setVerified(patientAllergyContract.getVerified());
        allergy.setVerifiedBy(patientAllergyContract.getVerifiedBy());
        allergy.setVerifiedDate((Date) patientAllergyContract.getVerifiedDate());
    }

    public void removePatientAllergy(int patientAllergyId)
    {
        Optional<Patientallergies> pa = repo.findById(patientAllergyId);
        if(!pa.isEmpty())
        {
            repo.deleteById(patientAllergyId);
        }
    }

    public void updatePatientAllergy(int patientAllergyId, PatientAllergyContract pac)
    {
        Optional<Patientallergies> pa = repo.findById(patientAllergyId);
        if(!pa.isEmpty()) {
            pa.get().setPatientId(pac.getPatientId());
            pa.get().setAllergyId(pac.getAllergyId());
            pa.get().setStatus(pac.getStatus());
            pa.get().setStartDate((Date) pac.getStartDate());
            pa.get().setEndDate((Date) pac.getEndDate());
            pa.get().setVerified(pac.getVerified());
            pa.get().setVerifiedBy(pac.getVerifiedBy());
            pa.get().setVerifiedDate((Date) pac.getVerifiedDate());
        }
    }

    public List<PatientAllergyContract> getPatientAllergies()
    {
        List<PatientAllergyContract> pas = new ArrayList<>();
        for (Patientallergies pa : repo.findAll())
        {
            pas.add(new PatientAllergyContract(pa.getId(), pa.getPatientId(), pa.getAllergyId(), pa.getStatus(),
                    pa.getStartDate(), pa.getEndDate(), pa.getVerified(), pa.getVerifiedBy(), pa.getVerifiedDate()));
        }
        return pas;
    }
}
