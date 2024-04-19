package com.ngi.emr.service;

import com.ngi.emr.contract.PatientdocsContract;
import com.ngi.emr.entity.Patientdocs;
import com.ngi.emr.repo.PatientdocsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PatientDocsService {
    @Autowired
    private PatientdocsRepo repo;

    public void addPatientDoc(PatientdocsContract pdc) {
        Patientdocs pdocs = new Patientdocs();
        pdocs.setPatientId(pdc.getPatientId());
        pdocs.setDocType(pdc.getDocType());
        pdocs.setDocPath(pdc.getDocPath());
        pdocs.setComments(pdc.getComments());
    }

    public void removePatientDoc(int patientDocId) {
        Optional<Patientdocs> pdocs = repo.findById(patientDocId);
        if(!pdocs.isEmpty())
        {
            repo.deleteById(patientDocId);
        }
    }

    public void updatePatientDoc(int patientDocId, PatientdocsContract pdc) {
        Optional<Patientdocs> pdocs = repo.findById(patientDocId);
        if(!pdocs.isEmpty())
        {
            pdocs.get().setPatientId(pdc.getPatientId());
            pdocs.get().setDocType(pdc.getDocType());
            pdocs.get().setDocPath(pdc.getDocPath());
            pdocs.get().setComments(pdc.getComments());
        }
    }

    public List<PatientdocsContract> getPatientDocs() {
        List<PatientdocsContract> pdocContracts = new ArrayList<>();
        for (Patientdocs pdoc : repo.findAll()) {
            pdocContracts.add(new PatientdocsContract(pdoc.getId(), pdoc.getPatientId(), pdoc.getDocType(), pdoc.getDocPath(),
                    pdoc.getComments()));
        }
        return pdocContracts;
    }
}
