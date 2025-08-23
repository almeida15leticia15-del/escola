package com.senai.escola.Service;

import com.senai.escola.Interface.AlunoRepository;
import com.senai.escola.Interface.ProfessorRepository;
import com.senai.escola.Models.Professor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {
    private final ProfessorRepository repository;

    public ProfessorService(AlunoRepository repository) {
        this.repository = repository;
    }


    public List<Professor> buscarTodosProfessor(){
        return  repository.findAll();
    }

    public Professor salvarNovoProfessor(Professor aluno){
        return repository.save(aluno);
    }

    public Professor buscarProfessorId(Long id){
        return repository.findById(id).orElse(null);
    }

    public void deletarProfessor(Long id){
        repository.deleteById(id);
    }
}
