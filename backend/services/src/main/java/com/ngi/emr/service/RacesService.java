package com.ngi.emr.service;

import com.ngi.emr.contract.RaceContract;
import com.ngi.emr.entity.Races;
import com.ngi.emr.repo.RacesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RacesService {

    @Autowired
    private RacesRepo repo;

    public void addRace(RaceContract raceContract) {
        Races r = new Races();
        r.setName(raceContract.getName());
        r.setDescription(raceContract.getDescription());
        repo.save(r);
    }

    public void removeRace(int raceId) {
        Optional<Races> r = repo.findById(raceId);
        if (!r.isEmpty())
        {
            repo.delete(r.get());
        }
    }

    public void updateRace(RaceContract raceContract, int raceId) {
        Optional<Races> r = repo.findById(raceId);
        if(!r.isEmpty()) {
            r.get().setName(raceContract.getName());
            r.get().setDescription(raceContract.getDescription());
            repo.save(r.get());
        }
    }

    public List<RaceContract> getRaces() {
        List<RaceContract> races = new ArrayList<>();
        for (Races r : repo.findAll()) {
            races.add(new RaceContract(r.getId(), r.getName(), r.getDescription()));
        }
        return races;
    }
}
