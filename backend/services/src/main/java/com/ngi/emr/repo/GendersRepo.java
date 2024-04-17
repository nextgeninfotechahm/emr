package com.ngi.emr.repo;

import com.ngi.emr.entity.Genders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface GendersRepo extends JpaRepository<Genders, Integer>, JpaSpecificationExecutor<Genders> {

}