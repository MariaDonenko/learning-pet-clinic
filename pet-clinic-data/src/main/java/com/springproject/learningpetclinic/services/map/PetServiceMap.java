package com.springproject.learningpetclinic.services.map;

import com.springproject.learningpetclinic.model.Pet;
import com.springproject.learningpetclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
@Override
public Set<Pet> findAll() {
        return super.findAll();
        }

@Override
public void deleteById(Long id) {
        super.deleteById(id);
        }

@Override
public void delete(Pet pet) {
        super.delete(pet);
        }

@Override
public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
        }

@Override
public Pet findById(Long id) {
        return super.findById(id);
        }

}
