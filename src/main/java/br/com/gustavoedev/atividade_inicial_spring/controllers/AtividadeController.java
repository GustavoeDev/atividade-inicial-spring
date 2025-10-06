package br.com.gustavoedev.atividade_inicial_spring.controllers;

import br.com.gustavoedev.atividade_inicial_spring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AtividadeController {

    @GetMapping("/hello")
    public ResponseEntity<String> name() {
        return ResponseEntity.ok("Bem-vindo!");
    }

    @PostMapping("/name")
    public ResponseEntity<String> nomeAluno(@RequestBody User aluno) {
        return ResponseEntity.ok().body("Olá, " + aluno.getName() + "!");
    }

}
