package com.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Models.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long>{

}
