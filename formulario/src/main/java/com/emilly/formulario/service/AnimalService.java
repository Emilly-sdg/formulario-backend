package com.emilly.formulario.service;

import com.emilly.formulario.modulos.Animal;
import com.emilly.formulario.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public Animal cadastrarFormulario(Animal animal) {
        try {
            return animalRepository.save(animal);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao cadastrar o animal.", e);
        }

    }

    public List<Animal> findAll() {
        return animalRepository.findAll();
    }

    public Animal findById(Long id) {
        return animalRepository.findById(id).orElseThrow();
    }

    public void delete(Long id) {
        try {
            animalRepository.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao deletar o animal.", e);
        }

    }

}
