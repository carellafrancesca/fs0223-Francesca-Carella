package com.A_Spring_Security.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.A_Spring_Security.security.entity.ERole;
import com.A_Spring_Security.security.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
	Optional<Role> findByRoleName(ERole roleName);

}
