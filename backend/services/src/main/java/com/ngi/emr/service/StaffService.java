package com.ngi.emr.service;

import com.ngi.emr.contract.StaffContract;
import com.ngi.emr.entity.Staff;
import com.ngi.emr.repo.StaffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StaffService {
    @Autowired
    private StaffRepo repo;

    public void addStaff(StaffContract sc) {
        Staff s = new Staff();
        s.setStaffId(sc.getStaffId());
        s.setFname(sc.getFname());
        s.setLname(sc.getLname());
        s.setJobId(sc.getJobId());
        s.setStatus(sc.getStatus());
        s.setStartDate(sc.getStartDate());
        s.setEndDate(sc.getEndDate());
        s.setUserid(sc.getUserId());
        s.setLicensed(sc.getLicensed());
        repo.save(s);
    }

    public void removeStaff(int id) {
        Optional<Staff> staff = repo.findById(id);
        if(!staff.isEmpty()) {
            repo.delete(staff.get());
        }
    }

    public void updateStaff(int id, StaffContract sc) {
        Optional<Staff> staff = repo.findById(id);
        if(!staff.isEmpty()) {
            staff.get().setStaffId(sc.getStaffId());
            staff.get().setFname(sc.getFname());
            staff.get().setLname(sc.getLname());
            staff.get().setJobId(sc.getJobId());
            staff.get().setStatus(sc.getStatus());
            staff.get().setStartDate(sc.getStartDate());
            staff.get().setEndDate(sc.getEndDate());
            staff.get().setUserid(sc.getUserId());
            staff.get().setLicensed(sc.getLicensed());
            repo.save(staff.get());
        }
    }

    public List<StaffContract> getAllStaff()
    {
        List<StaffContract> staff = new ArrayList<>();
        for(Staff s : repo.findAll()) {
            staff.add(new StaffContract(s.getId(), s.getStaffId(), s.getFname(), s.getLname(), s.getJobId(),
                    s.getStatus(), s.getStartDate(), s.getEndDate(), s.getUserid(), s.getLicensed()));
        }
        return staff;
    }
}
