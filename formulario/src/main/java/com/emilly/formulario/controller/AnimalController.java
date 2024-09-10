package com.emilly.formulario.controller;

import com.emilly.formulario.modulos.Animal;
import com.emilly.formulario.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("animal")
public class AnimalController {
    @Autowired
    private AnimalService animalService;

    @PostMapping
    public ResponseEntity<Animal> cadastrarFormulario(@RequestBody Animal animal) {
        return ResponseEntity.ok(animalService.cadastrarFormulario(animal));
    }

    @GetMapping
    public ResponseEntity<List<Animal>> findAll() {
        return ResponseEntity.ok(animalService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Animal> findById(@PathVariable Long id) {
        return ResponseEntity.ok(animalService.findById(id));
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        animalService.delete(id);
    }

}
