package com.ngi.emr.repo;

import com.ngi.emr.entity.Patientnotes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PatientnotesRepo extends JpaRepository<Patientnotes, Integer>, JpaSpecificationExecutor<Patientnotes> {

}