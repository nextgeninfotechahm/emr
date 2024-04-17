package com.ngi.emr.repo;

import com.ngi.emr.entity.Allergies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AllergiesRepo extends JpaRepository<Allergies, Integer>, JpaSpecificationExecutor<Allergies> {

}