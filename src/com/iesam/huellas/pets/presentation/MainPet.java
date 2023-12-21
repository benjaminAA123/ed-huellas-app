package com.iesam.huellas.pets.presentation;

import com.iesam.huellas.pets.data.PetDataRepository;
import com.iesam.huellas.pets.domain.GetPetsUseCase;
import com.iesam.huellas.pets.domain.Pet;

import java.util.ArrayList;

public class MainPet {



        /**
         * mostrar un listado de mascotas
         */
        static void printPets(){
            GetPetsUseCase petsUseCase =new GetPetsUseCase(new PetDataRepository());

            ArrayList<Pet> pets = petsUseCase.execute();

             //imprimir cada una de las mascotas
            System.out.println(pets.toString());
        }




}
