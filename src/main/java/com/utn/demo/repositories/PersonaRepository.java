package com.utn.demo.repositories;

import com.utn.demo.entities.Domicilio;
import com.utn.demo.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {

    /*Anotación Método de Query
    Page<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido, Pageable pageable);
    */
    //boolean existsByDni(int dni);

    //---------------------------------------------------------------------------------------------------------------
    /*Anotación JPQL parámetros indexados

    @Query(value = "SELECT p FROM Personas p WHERE p.nombre LIKE '%?1%' OR p.apellido LIKE '%?1%' ")
    Page<Persona> search(String filtro, Pageable pageable);
    */

    //---------------------------------------------------------------------------------------------------------------

    /*Anotación JPQL parámetros nombrados

    @Query(value = "SELECT p FROM Personas p WHERE p.nombre LIKE '%:filtro%' OR p.apellido LIKE '%:filtro%' ")
    Page<Persona> search(@Param("filtro") String filtro, Pageable pageable);
    */

    //---------------------------------------------------------------------------------------------------------------

    //Anotación con Query nativo

    @Query(
            value = "SELECT * FROM persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%",
            countQuery = "SELECT count(*) FROM persona",
            nativeQuery = true
    )
    Page<Persona> searchNativo(@Param("filtro") String filtro, Pageable pageable);



}
