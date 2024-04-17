package com.ngi.emr.repo;

import com.ngi.emr.entity.Patientinsurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PatientinsuranceRepo extends JpaRepository<Patientinsurance, Integer>, JpaSpecificationExecutor<Patientinsurance> {

}