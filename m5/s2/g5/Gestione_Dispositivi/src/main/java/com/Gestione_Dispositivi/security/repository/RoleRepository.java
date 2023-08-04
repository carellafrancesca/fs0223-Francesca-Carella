package com.Gestione_Dispositivi.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Gestione_Dispositivi.security.entity.ERole;
import com.Gestione_Dispositivi.security.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
	Optional<Role> findByRoleName(ERole roleName);

}
