package com.ngi.emr.controller;

import com.ngi.emr.contract.RaceContract;
import com.ngi.emr.service.RacesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/races")
public class RacesController {
    @Autowired
    private RacesService racesService;

    @RequestMapping(method= RequestMethod.GET)
    public List<RaceContract> getRaces() {
        return racesService.getRaces();
    }

    @RequestMapping(method=RequestMethod.POST)
    public void addRace(@RequestBody RaceContract race) {
        racesService.addRace(race);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/{id}")
    public void deleteRace(@PathVariable int id) {
        racesService.removeRace(id);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/{id}")
    public void updateRace(@PathVariable int id, @RequestBody RaceContract race) {
        racesService.updateRace(race, id);
    }
}
