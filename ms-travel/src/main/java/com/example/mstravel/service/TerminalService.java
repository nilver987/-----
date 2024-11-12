package com.example.mstravel.service;

import com.example.mstravel.entity.Terminal;

import java.util.List;
import java.util.Optional;

public interface TerminalService {
    List<Terminal> list();
    Optional<Terminal> findById(Integer id);
    Terminal save(Terminal terminal);
    Terminal update(Terminal terminal);
    void delete(Integer id);
}