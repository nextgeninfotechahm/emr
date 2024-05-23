package com.ngi.emr.controller;

import com.ngi.emr.contract.PermissionContract;
import com.ngi.emr.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/permissions")
public class PermissionsController {
    @Autowired
    private PermissionService permissionService;

    @RequestMapping(method= RequestMethod.GET)
    public List<PermissionContract> getPermissions() {
        return permissionService.getPermissions();
    }

    @RequestMapping(method=RequestMethod.POST)
    public void addPermission(@RequestBody PermissionContract permission) {
        permissionService.addPermission(permission);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/{id}")
    public void removePermission(@PathVariable("id") int id) {
        permissionService.removePermission(id);
    }

    public void updatePermission(@PathVariable("id") int id, @RequestBody PermissionContract permission) {
        permissionService.updatePermission(id, permission);
    }
}
