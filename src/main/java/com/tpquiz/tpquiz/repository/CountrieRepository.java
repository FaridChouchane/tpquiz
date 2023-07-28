package com.tpquiz.tpquiz.repository;

import java.util.Set;
import com.tpquiz.tpquiz.entity.Countrie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountrieRepository extends JpaRepository<Countrie, Integer> {
	@Query(value = "SELECT * FROM countries ORDER BY RAND() LIMIT 4", nativeQuery = true)
	Set<Countrie> getRandomCountries();
}