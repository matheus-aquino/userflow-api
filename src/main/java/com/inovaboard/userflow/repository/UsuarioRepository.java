package com.inovaboard.userflow.repository;

import com.inovaboard.userflow.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    //JpaRepository já fornece métodos prontos como salvar [save(Usuario)], buscar todos [findAll()], buscar pelo id [findById(id)], etc.
}
