package com.example.mstravel.service.impl;
import com.example.mstravel.entity.Terminal;
import com.example.mstravel.repository.TerminalRepository;
import com.example.mstravel.service.TerminalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TerminalServiceImpl implements TerminalService {
    @Autowired
    private TerminalRepository terminalRepository;

    @Override
    public List<Terminal> list() {
        return terminalRepository.findAll();
    }

    @Override
    public Optional<Terminal> findById(Integer id) {
        return terminalRepository.findById(id);
    }

    @Override
    public Terminal save(Terminal terminal) {
        return terminalRepository.save(terminal);
    }

    @Override
    public Terminal update(Terminal terminal) {
        return terminalRepository.save(terminal);
    }

    @Override
    public void delete(Integer id) {
        terminalRepository.deleteById(id);
    }
}