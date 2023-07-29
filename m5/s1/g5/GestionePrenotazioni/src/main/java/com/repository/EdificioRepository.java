package com.repository;

import org.springframework.stereotype.Repository;
import com.Classi.Edificio;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface EdificioRepository extends CrudRepository<Edificio, Long>{

}
