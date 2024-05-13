package com.ngi.emr.service;

import com.ngi.emr.contract.FacilityContract;
import com.ngi.emr.entity.Facility;
import com.ngi.emr.repo.FacilityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FacilityService {
    @Autowired
    private FacilityRepo repo;

    public void addFacility(FacilityContract fContract) {
        Facility f = new Facility();
        f.setName(fContract.getName());
        f.setStreet(fContract.getStreet());
        f.setAddress2(fContract.getAddress2());
        f.setCity(fContract.getCity());
        f.setState(fContract.getState());
        f.setZipCode(fContract.getZipCode());
        f.setLogoRef(fContract.getLogoRef());
        repo.save(f);
    }

    public void removeFacility(int facilityId) {
        Optional<Facility> f = repo.findById(facilityId);
        if (!f.isEmpty()) {
            repo.delete(f.get());
        }
    }

    public void updateFacility(int facilityId, FacilityContract fContract) {
        Optional<Facility> f = repo.findById(facilityId);
        if (!f.isEmpty()) {
            f.get().setName(fContract.getName());
            f.get().setStreet(fContract.getStreet());
            f.get().setAddress2(fContract.getAddress2());
            f.get().setCity(fContract.getCity());
            f.get().setState(fContract.getState());
            f.get().setZipCode(fContract.getZipCode());
            f.get().setLogoRef(fContract.getLogoRef());
            repo.save(f.get());
        }
    }

    public List<FacilityContract> getFacilities() {
        List<FacilityContract> facilities = new ArrayList<>();
        for (Facility f : repo.findAll()) {
            facilities.add(new FacilityContract(f.getId(), f.getName(), f.getStreet(), f.getAddress2(),
                    f.getCity(), f.getState(), f.getZipCode(), f.getLogoRef()));
        }
        return facilities;
    }

}
