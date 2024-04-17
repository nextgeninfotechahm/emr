package com.ngi.emr.repo;

import com.ngi.emr.entity.Patienthealthcondition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PatienthealthconditionRepo extends JpaRepository<Patienthealthcondition, Integer>, JpaSpecificationExecutor<Patienthealthcondition> {

}