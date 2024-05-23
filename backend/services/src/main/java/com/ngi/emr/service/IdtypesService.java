package com.ngi.emr.service;

import com.ngi.emr.contract.IdtypesContract;
import com.ngi.emr.entity.Idtypes;
import com.ngi.emr.repo.IdtypesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class IdtypesService {
    @Autowired
    private IdtypesRepo repo;

    public void addIdtype(IdtypesContract idtc) {
        Idtypes idtypes = new Idtypes();
        idtypes.setName(idtc.getName());
        idtypes.setDescription(idtc.getDescription());
        idtypes.setFolderPath(idtc.getFolderPath());
        repo.save(idtypes);
    }

    public void removeIdtype(int id) {
        Optional<Idtypes> idtypes = repo.findById(id);
        if(!idtypes.isEmpty()) {
            repo.delete(idtypes.get());
        }
    }

    public void updateIdtype(int id, IdtypesContract idtc) {
        Optional<Idtypes> idtypes = repo.findById(id);
        if(!idtypes.isEmpty()) {
            idtypes.get().setName(idtc.getName());
            idtypes.get().setDescription(idtc.getDescription());
            idtypes.get().setFolderPath(idtc.getFolderPath());
            repo.save(idtypes.get());
        }
    }

    public List<IdtypesContract> getIdtypes(){
        List<IdtypesContract> idtcs = new ArrayList<>();
        for(Idtypes idtypes : repo.findAll()) {
            idtcs.add(new IdtypesContract(idtypes.getId(), idtypes.getName(), idtypes.getDescription(),
                    idtypes.getFolderPath()));
        }
        return idtcs;
    }
}
