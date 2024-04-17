package com.ngi.emr.repo;

import com.ngi.emr.entity.Patientdocs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PatientdocsRepo extends JpaRepository<Patientdocs, Integer>, JpaSpecificationExecutor<Patientdocs> {

}