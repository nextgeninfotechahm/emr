package com.ngi.emr.service;

import com.ngi.emr.contract.PermissionContract;
import com.ngi.emr.entity.Permissions;
import com.ngi.emr.repo.PermissionsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PermissionService {
    @Autowired
    private PermissionsRepo repo;

    public void addPermission(PermissionContract permissionContract) {
        Permissions p = new Permissions();
        p.setName(permissionContract.getName());
        p.setDescription(permissionContract.getDescription());
        p.setActive(permissionContract.getActive());
        repo.save(p);
    }

    public void removePermission(int permissionId) {
        Optional<Permissions> p = repo.findById(permissionId);
        if(!p.isEmpty()) {
            repo.delete(p.get());
        }
    }

    public void updatePermission(int permissionId, PermissionContract permissionContract) {
        Optional<Permissions> p = repo.findById(permissionId);
        if(!p.isEmpty()) {
            p.get().setName(permissionContract.getName());
            p.get().setDescription(permissionContract.getDescription());
            p.get().setActive(permissionContract.getActive());
            repo.save(p.get());
        }
    }

    public List<PermissionContract> getPermissions() {
        List<PermissionContract> permissions = new ArrayList<>();
        for (Permissions p : repo.findAll()) {
            permissions.add(new PermissionContract(p.getId(), p.getName(), p.getDescription(), p.getActive()));
        }
        return permissions;
    }
}
