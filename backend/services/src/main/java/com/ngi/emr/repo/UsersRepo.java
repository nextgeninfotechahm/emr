package com.ngi.emr.repo;

import com.ngi.emr.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UsersRepo extends JpaRepository<Users, Integer>, JpaSpecificationExecutor<Users> {

}