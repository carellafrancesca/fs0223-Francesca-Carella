package com.AbbonamentiPalestra.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AbbonamentiPalestra.Class.Abbonamenti;

@Repository
public interface AbbonamentiRepo extends CrudRepository<Abbonamenti, Long>{

}
