package com.dt2.petmania.controllers;

import com.dt2.petmania.entity.Pet;
import com.dt2.petmania.repositories.PetRepository;
import com.dt2.petmania.service.PetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pets")
public class PetController {

    private final PetService petService;

    public PetController( PetService petService) {
        this.petService = petService;
    }

    @GetMapping
    public List<Pet> mostrar(){
        return petService.buscarTodos();
    }
    @PostMapping
    public void criar(@RequestBody Pet p){
        petService.criarPet(p);
    }


}
