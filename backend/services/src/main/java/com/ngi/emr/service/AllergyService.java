package com.ngi.emr.service;

import com.ngi.emr.contract.AllergyContract;
import com.ngi.emr.entity.Allergies;
import com.ngi.emr.repo.AllergiesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AllergyService {
    @Autowired
    private AllergiesRepo repo;

    public void addAllergy(AllergyContract allergyContract)
    {
        Allergies a = new Allergies();
        a.setName(allergyContract.getName());
        a.setDescription(allergyContract.getDescription());
        a.setICDCode(allergyContract.getICDCode());
        a.setSnowmedRef(allergyContract.getSnowmedRef());
    }

    public void removeAllergy(int allergyId)
    {
        Optional<Allergies> a = repo.findById(allergyId);
        if(!a.isEmpty())
        {
            repo.delete(a.get());
        }
    }

    public void updateAllergy(int allergyId, AllergyContract allergyContract) {
        Optional<Allergies> a = repo.findById(allergyId);
        if(!a.isEmpty()) {
            a.get().setName(allergyContract.getName());
            a.get().setDescription(allergyContract.getDescription());
            a.get().setICDCode(allergyContract.getICDCode());
            a.get().setSnowmedRef(allergyContract.getSnowmedRef());
        }
    }

    public List<AllergyContract> getAllergies() {
        List<AllergyContract> allergies = new ArrayList<>();
        for (Allergies a : repo.findAll()) {
            allergies.add(new AllergyContract(a.getId(), a.getName(), a.getDescription(), a.getICDCode(),
                    a.getSnowmedRef()));
        }
        return allergies;
    }
}
