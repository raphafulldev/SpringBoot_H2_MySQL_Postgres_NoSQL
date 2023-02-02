package com.aula.restapi.controller;

import com.aula.restapi.database.RepositorioContato;
import com.aula.restapi.entidade.Contato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contato")
public class ContatoREST {

    @Autowired
    private RepositorioContato repositorio;


    @GetMapping
    private List<Contato> listar() {
        return repositorio.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Contato contato) {
        repositorio.save(contato);
    }

    @PutMapping
    public void alterar(@RequestBody Contato contato) {
        if (contato.getId() > 0) {
            repositorio.save(contato);
        }
    }

    @DeleteMapping
    public void excluir(@RequestBody Contato contato) {
        repositorio.delete(contato);
    }

}
