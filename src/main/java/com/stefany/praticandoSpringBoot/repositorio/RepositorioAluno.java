package com.stefany.praticandoSpringBoot.repositorio;

import com.stefany.praticandoSpringBoot.entidade.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioAluno extends JpaRepository <Aluno,Long>{
}
