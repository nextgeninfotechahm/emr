package com.ngi.emr.repo;

import com.ngi.emr.entity.Races;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RacesRepo extends JpaRepository<Races, Integer>, JpaSpecificationExecutor<Races> {

}