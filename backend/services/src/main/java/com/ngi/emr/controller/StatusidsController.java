package com.ngi.emr.controller;

import com.ngi.emr.contract.StatusidContract;
import com.ngi.emr.service.StatusidsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/statusids")
public class StatusidsController {
    @Autowired
    private StatusidsService statusidsService;

    @RequestMapping(method = RequestMethod.GET)
    public List<StatusidContract> getStatusids() {
        return statusidsService.getStatusids();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addStatusid(@RequestBody StatusidContract statusid) {
        statusidsService.addStatusid(statusid);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void removeStatusid(@PathVariable("id") int id) {
        statusidsService.removeStatusid(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/{id}")
    public void updateStatusid(@PathVariable("id") int id, @RequestBody StatusidContract statusid)
    {
        statusidsService.updateStatusid(id, statusid);
    }
}
