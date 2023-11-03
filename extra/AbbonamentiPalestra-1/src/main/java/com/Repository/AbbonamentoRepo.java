package com.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Classi.Abbonamento;

@Repository
public interface AbbonamentoRepo extends CrudRepository<Abbonamento, Long>{

}
