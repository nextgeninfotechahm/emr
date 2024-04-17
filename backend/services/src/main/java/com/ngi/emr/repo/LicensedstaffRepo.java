package com.ngi.emr.repo;

import com.ngi.emr.entity.Licensedstaff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LicensedstaffRepo extends JpaRepository<Licensedstaff, Integer>, JpaSpecificationExecutor<Licensedstaff> {

}