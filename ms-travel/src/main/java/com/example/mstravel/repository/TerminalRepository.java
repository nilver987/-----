package com.example.mstravel.repository;
import com.example.mstravel.entity.Terminal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TerminalRepository extends JpaRepository<Terminal, Integer> {
    List<Terminal> findByNombre(String nombre);
}