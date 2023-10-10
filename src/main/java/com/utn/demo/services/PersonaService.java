package com.utn.demo.services;

import com.utn.demo.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonaService extends BaseService<Persona,Long>{

    Page<Persona> search(String filtro, Pageable pageable) throws Exception;

}
