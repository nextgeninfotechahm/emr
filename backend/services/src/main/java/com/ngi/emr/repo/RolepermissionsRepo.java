package com.ngi.emr.repo;

import com.ngi.emr.entity.Rolepermissions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RolepermissionsRepo extends JpaRepository<Rolepermissions, Integer>, JpaSpecificationExecutor<Rolepermissions> {

}