package com.example.ms_terminal.service;
import com.example.ms_terminal.entity.Terminal;

import java.util.List;
import java.util.Optional;

public interface TerminalService {
    List<Terminal> list();
    Optional<Terminal> findById(Integer id);
    Terminal save(Terminal terminal);
    Terminal update(Terminal terminal);
    void delete(Integer id);
}
