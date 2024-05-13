package com.ngi.emr.controller;

import com.ngi.emr.contract.RoleContract;
import com.ngi.emr.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RolesController {
    @Autowired
    private RolesService rolesService;

    @RequestMapping(method = RequestMethod.GET)
    public List<RoleContract> getRoles(){
        return rolesService.getRoles();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addRole(@RequestBody RoleContract role){
        rolesService.addRole(role);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/{id}")
    public void removeRole(@PathVariable int id){
        rolesService.removeRole(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/{id}")
    public void updateRole(@PathVariable int id, @RequestBody RoleContract role){
        rolesService.updateRole(id, role);
    }
}
