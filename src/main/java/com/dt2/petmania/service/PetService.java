package com.dt2.petmania.service;

import com.dt2.petmania.entity.Pet;
import com.dt2.petmania.repositories.PetRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetService {

    public final PetRepository repository;

    public PetService(PetRepository repository) {
        this.repository = repository;
    }
    public List<Pet> buscarTodos(){
        return repository.findAll();
    }
    public void criarPet(Pet p){
        List<Pet> pet = new ArrayList<>();
        repository.save(p);
    }

}
