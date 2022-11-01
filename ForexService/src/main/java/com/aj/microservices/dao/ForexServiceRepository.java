package com.aj.microservices.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aj.microservices.model.CurrencyFactor;

@Repository
public interface ForexServiceRepository extends JpaRepository<CurrencyFactor, Long> {

	CurrencyFactor findByFrom(String from);

}
