package com.ngi.emr.repo;

import com.ngi.emr.entity.Idtypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IdtypesRepo extends JpaRepository<Idtypes, Integer>, JpaSpecificationExecutor<Idtypes> {

}