package com.exemplo.jogovelha.repository;

import com.exemplo.jogovelha.model.Partida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartidaRepository extends JpaRepository<Partida, Long> {
}
