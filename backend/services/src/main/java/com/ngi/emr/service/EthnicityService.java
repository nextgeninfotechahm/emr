package com.ngi.emr.service;

import com.ngi.emr.contract.EthnicityContract;
import com.ngi.emr.entity.Ethnicities;
import com.ngi.emr.repo.EthnicitiesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EthnicityService {
    @Autowired
    private EthnicitiesRepo repo;
    public void addEthnicity(EthnicityContract
                                     ethnicityContract){
        Ethnicities e= new Ethnicities();
        e.setDescription(ethnicityContract.getDescription());
        e.setName(ethnicityContract.getName());
        repo.save(e);
    }
    public void removeEthnicity(int ethnicityId){
        Optional<Ethnicities> e=repo.findById(ethnicityId);
        if(!e.isEmpty()){
            repo.delete(e.get());
        }

    }
    public void updateEthnicity(int ethnicityId,EthnicityContract ethnicityContract){
        Optional<Ethnicities> e=repo.findById(ethnicityId);
        if(!e.isEmpty()){
            e.get().setName(ethnicityContract.getName());
            e.get().setDescription(ethnicityContract.getDescription());
            repo.save(e.get());
        }

    }
    public List<EthnicityContract> getEthnicities(){
        List<EthnicityContract> ethinicities=new ArrayList<>();
        for(Ethnicities e:repo.findAll()){
            ethinicities.add(new EthnicityContract(e.getId(),e.getName(),e.getDescription()));
        }
        return ethinicities;
    }
}
