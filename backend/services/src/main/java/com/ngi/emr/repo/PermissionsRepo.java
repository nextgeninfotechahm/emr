package com.ngi.emr.repo;

import com.ngi.emr.entity.Permissions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PermissionsRepo extends JpaRepository<Permissions, Integer>, JpaSpecificationExecutor<Permissions> {

}