package com.ngi.emr.service;

import com.ngi.emr.contract.RolepermissionContract;
import com.ngi.emr.entity.Rolepermissions;
import com.ngi.emr.repo.RolepermissionsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RolepermissionService {
    @Autowired
    private RolepermissionsRepo repo;

    public void addRolepermission(RolepermissionContract rpc) {
        Rolepermissions r = new Rolepermissions();
        r.setRoleId(rpc.getRoleId());
        r.setPermissionId(rpc.getPermissionId());
        r.setActive(rpc.getActive());
        repo.save(r);
    }

    public void removeRolepermission(int rpId) {
        Optional<Rolepermissions> rp = repo.findById(rpId);
        if (!rp.isEmpty()) {
            repo.delete(rp.get());
        }
    }

    public void updateRolepermission(int rpId, RolepermissionContract rpc) {
        Optional<Rolepermissions> rp = repo.findById(rpId);
        if (!rp.isEmpty()) {
            rp.get().setPermissionId(rpc.getPermissionId());
            rp.get().setRoleId(rpc.getRoleId());
            rp.get().setActive(rpc.getActive());
            repo.save(rp.get());
        }
    }

    public List<RolepermissionContract> getRolepermissions() {
        List<RolepermissionContract> rpcs = new ArrayList<>();
        for(Rolepermissions r : repo.findAll()) {
            rpcs.add(new RolepermissionContract(r.getId(), r.getRoleId(), r.getPermissionId(), r.getActive()));
        }
        return rpcs;
    }
}
