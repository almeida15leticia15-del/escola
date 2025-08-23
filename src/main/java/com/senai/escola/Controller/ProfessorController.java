package com.senai.escola.Controller;

import com.senai.escola.Models.Professor;
import com.senai.escola.Service.ProfessorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/professor")
public class ProfessorController {
    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }


    @GetMapping
    public List<Professor> buscarProfessor(){
        return professorService.buscarTodosProfessor();
    }


    @PostMapping
    public Professor salvarProfessor(@RequestBody Professor professor){
        return professorService.salvarNovoProfessor(professor);
    }


   
    @GetMapping("/{id}")
    public Professor buscarprofessorId(@PathVariable Long id){
        return professorService.buscarProfessorId(id);

    }


    
    @DeleteMapping("/{id}")
    public void excluirProfessor(@PathVariable Long id){
        professorService.deletarProfessor(id);
    }
}
