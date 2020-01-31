package com.seisxis.akira.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.seisxis.akira.model.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, Long> {

	@Query("SELECT t FROM Test t WHERE LOWER(t.name) = LOWER(:name)")
	public Test findByName(String name);
}