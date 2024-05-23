package com.ngi.emr.service;

import com.ngi.emr.contract.HealthconditionContract;
import com.ngi.emr.entity.Healthconditions;
import com.ngi.emr.repo.HealthconditionsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class HealthconditionsService {
    @Autowired
    private HealthconditionsRepo repo;

    public void addHealthcondition(HealthconditionContract hcc) {
        Healthconditions hc = new Healthconditions();
        hc.setName(hcc.getName());
        hc.setDescription(hcc.getDescription());
        hc.setStatus(hcc.getStatus());
        hc.setICDCode(hcc.getICDCode());
        hc.setSnowmedRef(hcc.getSnowmedRef());
        repo.save(hc);
    }

    public void removeHealthcondition(int hcId){
        Optional<Healthconditions> hc = repo.findById(hcId);
        if(!hc.isEmpty()) {
            repo.delete(hc.get());
        }
    }

    public void updateHealthcondition(int hcId, HealthconditionContract hcc) {
        Optional<Healthconditions> hc = repo.findById(hcId);
        if(!hc.isEmpty()) {
            hc.get().setName(hcc.getName());
            hc.get().setDescription(hcc.getDescription());
            hc.get().setStatus(hcc.getStatus());
            hc.get().setICDCode(hcc.getICDCode());
            hc.get().setSnowmedRef(hcc.getSnowmedRef());
            repo.save(hc.get());
        }
    }

    public List<HealthconditionContract> getHealthconditions(){
        List<HealthconditionContract> hccs = new ArrayList<>();
        for(Healthconditions hc : repo.findAll()) {
            hccs.add(new HealthconditionContract(hc.getId(), hc.getName(), hc.getDescription(),
                    hc.getStatus(), hc.getICDCode(), hc.getSnowmedRef()));
        }
        return hccs;
    }
}
