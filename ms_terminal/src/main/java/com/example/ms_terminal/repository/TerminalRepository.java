package com.example.ms_terminal.repository;
import com.example.ms_terminal.entity.Terminal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TerminalRepository extends JpaRepository<Terminal, Integer> {
    List<Terminal> findByNombre(String nombre);
}