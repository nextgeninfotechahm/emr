package com.ngi.emr.repo;

import com.ngi.emr.entity.Patients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PatientsRepo extends JpaRepository<Patients, Integer>, JpaSpecificationExecutor<Patients> {
}
