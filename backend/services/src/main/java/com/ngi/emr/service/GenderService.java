package com.ngi.emr.service;

import com.ngi.emr.contract.GenderContract;
import com.ngi.emr.entity.Genders;
import com.ngi.emr.repo.GendersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GenderService {
    @Autowired
    private GendersRepo repo;

    public void addGender(GenderContract genderContract) {
        Genders g = new Genders();
        g.setName(genderContract.getName());
        g.setDescription(genderContract.getDescription());
    }

    public void removeGender(int genderId) {
        Optional<Genders> g = repo.findById(genderId);
        if (!g.isEmpty()) {
            repo.delete(g.get());
        }
    }

    public void updateGender(int genderId, GenderContract genderContract) {
        Optional<Genders> g = repo.findById(genderId);
        if (!g.isEmpty()) {
            g.get().setName(genderContract.getName());
            g.get().setDescription(genderContract.getDescription());
            repo.save(g.get());
        }
    }

    public List<GenderContract> getGenders() {
        List<GenderContract> genders = new ArrayList<>();
        for (Genders g : repo.findAll()) {
            genders.add(new GenderContract(g.getId(), g.getName(), g.getDescription()));
        }
        return genders;
    }
}
