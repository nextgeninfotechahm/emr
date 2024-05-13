package com.ngi.emr.service;

import com.ngi.emr.contract.RoleContract;
import com.ngi.emr.entity.Roles;
import com.ngi.emr.repo.RolesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RolesService {
    @Autowired
    private RolesRepo repo;

    public void addRole(RoleContract rc) {
        Roles r = new Roles();
        r.setName(rc.getName());
        r.setDescription(rc.getDescription());
        r.setActive(rc.getActive());
        repo.save(r);
    }

    public void removeRole(int roleId) {
        Optional<Roles> r = repo.findById(roleId);
        if(!r.isEmpty()) {
            repo.delete(r.get());
        }
    }

    public void updateRole(int roleId, RoleContract rc) {
        Optional<Roles> r = repo.findById(roleId);
        if(!r.isEmpty()) {
            r.get().setName(rc.getName());
            r.get().setDescription(rc.getDescription());
            r.get().setActive(rc.getActive());
            repo.save(r.get());
        }
    }

    public List<RoleContract> getRoles() {
        List<RoleContract> roles = new ArrayList<>();
        for(Roles r : repo.findAll()) {
            roles.add(new RoleContract(r.getId(), r.getName(), r.getDescription(), r.getActive()));
        }
        return roles;
    }
}
