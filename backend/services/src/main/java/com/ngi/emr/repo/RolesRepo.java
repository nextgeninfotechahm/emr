package com.ngi.emr.repo;

import com.ngi.emr.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RolesRepo extends JpaRepository<Roles, Integer>, JpaSpecificationExecutor<Roles> {

}