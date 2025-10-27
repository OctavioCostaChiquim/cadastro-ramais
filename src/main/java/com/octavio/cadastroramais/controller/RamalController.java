package com.octavio.cadastroramais.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.octavio.cadastroramais.model.Ramal;
import com.octavio.cadastroramais.repository.RamalRepository;

@RestController
@RequestMapping("/ramais")
public class RamalController {

    @Autowired
    private RamalRepository repo;

    @PostMapping
    public Ramal addRamal(@RequestBody Ramal r) {
        return repo.save(r);
    }

    @GetMapping
    public List<Ramal> getRamais() {
        return repo.findAll();
    }

    @PutMapping("/{id}")
    public Ramal updateRamal(@PathVariable Long id, @RequestBody Ramal dados) {
        Ramal r = repo.findById(id).orElseThrow();
        r.setNome(dados.getNome());
        r.setNumero(dados.getNumero());
        r.setSetor(dados.getSetor());
        return repo.save(r);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }


@GetMapping("/{id}")
public Ramal getRamal(@PathVariable Long id) {
  return repo.findById(id).orElseThrow();
}
}
