package com.ngi.emr.service;

import com.ngi.emr.contract.LicensedstaffContract;
import com.ngi.emr.entity.Licensedstaff;
import com.ngi.emr.repo.LicensedstaffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LicensedstaffService {
    @Autowired
    private LicensedstaffRepo repo;

    public void addLicensedstaff(LicensedstaffContract lsc) {
        Licensedstaff ls=new Licensedstaff();
        ls.setStaffId(lsc.getStaffId());
        ls.setLicenseId(lsc.getLicenseId());
        ls.setLicenseState(lsc.getLicenseState());
        ls.setStartDate(lsc.getStartDate());
        ls.setEndDate(lsc.getEndDate());
        ls.setActive(lsc.getActive());
        ls.setInclusions(lsc.getInclusions());
        ls.setExclusions(lsc.getExclusions());
        ls.setCanPrescribe(lsc.getCanPrescribe());
        ls.setCanDiagnose(lsc.getCanDiagnose());
        repo.save(ls);
    }

    public void removeLicensedstaff(int lsId) {
        Optional<Licensedstaff> ls=repo.findById(lsId);
        if(!ls.isEmpty()) {
            repo.delete(ls.get());
        }
    }

    public void updateLicensedstaff(int lsId, LicensedstaffContract lsc) {
        Optional<Licensedstaff> ls=repo.findById(lsId);
        if(!ls.isEmpty()) {
            ls.get().setStaffId(lsc.getStaffId());
            ls.get().setLicenseId(lsc.getLicenseId());
            ls.get().setLicenseState(lsc.getLicenseState());
            ls.get().setStartDate(lsc.getStartDate());
            ls.get().setEndDate(lsc.getEndDate());
            ls.get().setActive(lsc.getActive());
            ls.get().setInclusions(lsc.getInclusions());
            ls.get().setExclusions(lsc.getExclusions());
            ls.get().setCanPrescribe(lsc.getCanPrescribe());
            ls.get().setCanDiagnose(lsc.getCanDiagnose());
            repo.save(ls.get());
        }
    }

    public List<LicensedstaffContract> getLicensedstaff() {
        List<LicensedstaffContract> licensedStaff = new ArrayList<>();
        for(Licensedstaff ls:repo.findAll()) {
            licensedStaff.add(new LicensedstaffContract(ls.getId(), ls.getStaffId(), ls.getLicenseId(), ls.getLicenseState(),
                    ls.getStartDate(), ls.getEndDate(), ls.getActive(), ls.getInclusions(), ls.getExclusions(),
                    ls.getCanPrescribe(), ls.getCanDiagnose()));
        }
        return licensedStaff;
    }
}
