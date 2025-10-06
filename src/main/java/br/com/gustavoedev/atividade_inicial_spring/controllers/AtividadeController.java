package br.com.gustavoedev.atividade_inicial_spring.controllers;

import br.com.gustavoedev.atividade_inicial_spring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/")
public class AtividadeController {

    @GetMapping("/hello")
    public ResponseEntity<Map<String, String>> name() {
        return ResponseEntity.ok().body(Map.of("message", "Hello World!"));
    }

    @PostMapping("/name")
    public ResponseEntity<Map<String, String>> nomeAluno(@RequestBody User user) {
        return ResponseEntity.ok().body(Map.of("message", "Olá, " + user.getName() + "!"));
    }

}
