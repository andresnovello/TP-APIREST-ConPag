package com.utn.demo.services;

import com.utn.demo.entities.Libro;
import com.utn.demo.repositories.AutorRepository;
import com.utn.demo.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro,Long> implements LibroService {
    @Autowired
    private AutorRepository autorRepository;

    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository) {
        super(baseRepository);
    }
}
