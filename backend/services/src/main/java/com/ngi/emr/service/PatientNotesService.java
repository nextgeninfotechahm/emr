package com.ngi.emr.service;

import com.ngi.emr.contract.PatientnotesContract;
import com.ngi.emr.entity.Patientnotes;
import com.ngi.emr.repo.PatientnotesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PatientNotesService {
    @Autowired
    private PatientnotesRepo repo;

    public void addPatientNotes(PatientnotesContract pnContract)
    {
        Patientnotes pn = new Patientnotes();
        pn.setPatientId(pnContract.getPatientId());
        pn.setNote(pnContract.getNote());
        pn.setModifiedDate((Date) pnContract.getModifiedDate());
        pn.setAddedBy(pnContract.getAddedBy());
    }

    public void removePatientNotes(int patientNotesId)
    {
        Optional<Patientnotes> pnotes = repo.findById(patientNotesId);
        if(!pnotes.isEmpty())
        {
            repo.delete(pnotes.get());
        }
    }

    public void updatePatientnotes(int patientNotesId, PatientnotesContract pnContract)
    {
        Optional<Patientnotes> pnotes = repo.findById(patientNotesId);
        if(!pnotes.isEmpty())
        {
            pnotes.get().setPatientId(pnContract.getPatientId());
            pnotes.get().setNote(pnContract.getNote());
            pnotes.get().setModifiedDate((Date) pnContract.getModifiedDate());
            pnotes.get().setAddedBy(pnContract.getAddedBy());
            repo.save(pnotes.get());
        }
    }

    public List<PatientnotesContract> getPatientNotes()
    {
        List<PatientnotesContract> pnotes = new ArrayList<>();
        for(Patientnotes p : repo.findAll())
        {
            pnotes.add(new PatientnotesContract(p.getId(), p.getPatientId(), p.getNote(),
                    p.getModifiedDate(), p.getAddedBy()));
        }
        return pnotes;
    }
}
