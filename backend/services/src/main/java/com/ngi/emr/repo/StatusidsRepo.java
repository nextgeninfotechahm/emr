package com.ngi.emr.repo;

import com.ngi.emr.entity.Statusids;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StatusidsRepo extends JpaRepository<Statusids, Integer>, JpaSpecificationExecutor<Statusids> {

}