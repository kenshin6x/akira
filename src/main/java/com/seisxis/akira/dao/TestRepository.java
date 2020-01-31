package com.seisxis.akira.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seisxis.akira.model.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, Long> {

}