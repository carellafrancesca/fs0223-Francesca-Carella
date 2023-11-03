package com.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.Classi.Abbonato;

@Repository
public interface AbbonatoRepo extends CrudRepository<Abbonato, Long>{

}
