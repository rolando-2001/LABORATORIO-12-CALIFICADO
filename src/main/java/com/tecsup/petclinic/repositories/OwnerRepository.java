package com.tecsup.petclinic.repositories;

import com.tecsup.petclinic.entities.Owner;
import com.tecsup.petclinic.entities.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OwnerRepository extends JpaRepository<Owner,Integer> {
    List<Owner> findByName(String name);

    List<Owner> findByTypeId(int typeId);

    // Fetch  by ownerId
    List<Owner> findByOwnerId(int ownerId);

    @Override
    List<Owner> findAll();


}
