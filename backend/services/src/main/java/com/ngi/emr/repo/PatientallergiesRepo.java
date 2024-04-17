package com.ngi.emr.repo;

import com.ngi.emr.entity.Patientallergies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PatientallergiesRepo extends JpaRepository<Patientallergies, Integer>, JpaSpecificationExecutor<Patientallergies> {

}