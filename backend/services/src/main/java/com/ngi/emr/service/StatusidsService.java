package com.ngi.emr.service;

import com.ngi.emr.contract.StatusidContract;
import com.ngi.emr.entity.Statusids;
import com.ngi.emr.repo.StatusidsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StatusidsService {
    @Autowired
    private StatusidsRepo repo;

    public void addStatusid(StatusidContract sidc) {
        Statusids sid = new Statusids();
        sid.setName(sidc.getName());
        sid.setDescription(sidc.getDescription());
        repo.save(sid);
    }

    public void removeStatusid(int id) {
        Optional<Statusids> sid = repo.findById(id);
        if (!sid.isEmpty()) {
            repo.delete(sid.get());
        }
    }

    public void updateStatusid(int id, StatusidContract sidc) {
        Optional<Statusids> sid = repo.findById(id);
        if (!sid.isEmpty()) {
            sid.get().setDescription(sidc.getDescription());
            sid.get().setName(sidc.getName());
            repo.save(sid.get());
        }
    }

    public List<StatusidContract> getStatusids(){
        List<StatusidContract> statusids = new ArrayList<>();
        for(Statusids s : repo.findAll()){
            statusids.add(new StatusidContract(s.getId(), s.getName(), s.getDescription()));
        }
        return statusids;
    }
}
