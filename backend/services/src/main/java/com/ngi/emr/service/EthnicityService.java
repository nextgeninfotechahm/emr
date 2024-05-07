package com.ngi.emr.service;

import com.ngi.emr.contract.EthnicityContract;
import com.ngi.emr.entity.Ethnicities;
import com.ngi.emr.repo.EthnicitiesRepo;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
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
    public List<EthnicityContract> getEthnicities(String query){
        List<EthnicityContract> ethinicities=new ArrayList<>();
        List<Ethnicities> result;
        if(query==null || query.trim().length()==0){
            result=repo.findAll();
        }else{
            Specification<Ethnicities> spec=
                (root,cquery,criteriaBuilder)->
                criteriaBuilder.like(
                        root.get("name"),"%"+query+"%"
                        );

            
            result=repo.findAll(spec);
        }
        for(Ethnicities e:result){
            ethinicities.add(new EthnicityContract(e.getId(),e.getName(),e.getDescription()));
        }

        return ethinicities;
    }

    public long getCount(){
        return repo.count();
    }
}
