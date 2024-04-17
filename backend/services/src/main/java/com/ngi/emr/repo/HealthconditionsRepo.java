package com.ngi.emr.repo;

import com.ngi.emr.entity.Healthconditions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface HealthconditionsRepo extends JpaRepository<Healthconditions, Integer>, JpaSpecificationExecutor<Healthconditions> {

}