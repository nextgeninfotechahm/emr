package com.ngi.emr.service;

import com.ngi.emr.contract.PatienthealthconditionContract;
import com.ngi.emr.entity.Patienthealthcondition;
import com.ngi.emr.repo.PatienthealthconditionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PatienthealthconditionService {
    @Autowired
    private PatienthealthconditionRepo repo;
    public void addPatienthealthcondition(PatienthealthconditionContract patienthealthconditionContract)
    {
        Patienthealthcondition phc = new Patienthealthcondition();
        phc.setPatientId(patienthealthconditionContract.getPatientId());
        phc.setConditionId(patienthealthconditionContract.getConditionId());
        phc.setStatus(patienthealthconditionContract.getStatus());
        phc.setStartDate((Date) patienthealthconditionContract.getStartDate());
        phc.setEndDate((Date) patienthealthconditionContract.getEndDate());
        phc.setVerified(patienthealthconditionContract.getVerified());
        phc.setVerifiedBy(patienthealthconditionContract.getVerifiedBy());
        phc.setVerifiedDate((Date) patienthealthconditionContract.getVerifiedDate());
    }

    public void removePatienthealthcondition(int patienthealthconditionId)
    {
        Optional<Patienthealthcondition> phc = repo.findById(patienthealthconditionId);
        if(!phc.isEmpty())
        {
            repo.deleteById(patienthealthconditionId);
        }
    }

    public void updatePatienthealthcondition(int patienthealthconditionId, PatienthealthconditionContract pc)
    {
        Optional<Patienthealthcondition> phc = repo.findById(patienthealthconditionId);
        if(!phc.isEmpty()) {
            phc.get().setPatientId(pc.getPatientId());
            phc.get().setConditionId(pc.getConditionId());
            phc.get().setStatus(pc.getStatus());
            phc.get().setStartDate((Date) pc.getStartDate());
            phc.get().setEndDate((Date) pc.getEndDate());
            phc.get().setVerified(pc.getVerified());
            phc.get().setVerifiedBy(pc.getVerifiedBy());
            phc.get().setVerifiedDate((Date) pc.getVerifiedDate());
        }
    }

    public List<PatienthealthconditionContract> getphcs()
    {
        List<PatienthealthconditionContract> phcs = new ArrayList<>();
        for (Patienthealthcondition phc : repo.findAll())
        {
            phcs.add(new PatienthealthconditionContract(phc.getId(), phc.getPatientId(), phc.getConditionId(), phc.getStatus(),
                    phc.getStartDate(), phc.getEndDate(), phc.getVerified(), phc.getVerifiedBy(), phc.getVerifiedDate()));
        }
        return phcs;
    }
}