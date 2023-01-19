package com.api.pikachu.repository;

import com.api.pikachu.domain.Pikachu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PikachuRepo extends JpaRepository<Pikachu, Long> {
}
