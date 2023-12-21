package com.iesam.huellas.pets.data;

import com.iesam.huellas.pets.domain.Pet;
import com.iesam.huellas.pets.domain.PetRepository;

import java.util.ArrayList;

public class PetDataRepository implements PetRepository {


    @Override
    public ArrayList<Pet> obtainPets() {
       ArrayList<Pet>pets = new ArrayList<>();
       pets.add(new Pet(1, "gatunia", "juguetona", "blaaco", "egipcia", "01-01-2022", "hembra", true ));
       pets.add(new Pet(2, "michi", "agresivo", "negro", "bellaco", "02-03-2022", "macho", false));
       return pets ;
    }
}
