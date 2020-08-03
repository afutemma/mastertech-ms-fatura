package com.mastertech.Fatura.repository;

import com.mastertech.Fatura.model.Fatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaturaRepository extends JpaRepository<Fatura, Integer>  {
}
