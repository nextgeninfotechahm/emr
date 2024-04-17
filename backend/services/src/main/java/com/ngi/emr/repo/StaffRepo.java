package com.ngi.emr.repo;

import com.ngi.emr.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StaffRepo extends JpaRepository<Staff, Integer>, JpaSpecificationExecutor<Staff> {

}