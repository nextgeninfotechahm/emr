package com.ngi.emr.repo;

import com.ngi.emr.entity.Ethnicities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface EthnicitiesRepo extends JpaRepository<Ethnicities, Integer>, JpaSpecificationExecutor<Ethnicities> {

}