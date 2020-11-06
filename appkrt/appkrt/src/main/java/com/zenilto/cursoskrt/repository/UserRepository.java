package com.zenilto.cursoskroton.repository;

import com.zenilto.cursoskroton.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Usuario, Long> {
}
