package com.stefany.praticandoSpringBoot.controle;

import com.stefany.praticandoSpringBoot.entidade.Aluno;
import com.stefany.praticandoSpringBoot.repositorio.RepositorioAluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")

public class AlunoControle {
    @Autowired
    private RepositorioAluno repositorioAluno;

    @GetMapping
    public List<Aluno> listar(){
        return repositorioAluno.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Aluno aluno){
        repositorioAluno.save(aluno);
    }

    @PutMapping
    public void alterar(@RequestBody Aluno aluno){
        if(aluno.getId()>0){
            repositorioAluno.save(aluno);
        }
    }
    @DeleteMapping
    public void deletar(@RequestBody Aluno aluno){
            repositorioAluno.delete(aluno);
    }
}
