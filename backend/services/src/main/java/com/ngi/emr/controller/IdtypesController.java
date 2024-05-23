package com.ngi.emr.controller;

import com.ngi.emr.contract.IdtypesContract;
import com.ngi.emr.service.IdtypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/idtypes")
public class IdtypesController {
    @Autowired
    private IdtypesService idtypesService;

    @RequestMapping(method = RequestMethod.GET)
    public List<IdtypesContract> getIdtypes() {
        return idtypesService.getIdtypes();
    }

    @RequestMapping(method=RequestMethod.POST)
    public void addIdtype(@RequestBody IdtypesContract idtype) {
        idtypesService.addIdtype(idtype);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/{id}")
    public void removeIdtype(@PathVariable("id") int id) {
        idtypesService.removeIdtype(id);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/{id}")
    public void updateIdtype(@PathVariable("id") int id, @RequestBody IdtypesContract idtype) {
        idtypesService.updateIdtype(id, idtype);
    }
}
