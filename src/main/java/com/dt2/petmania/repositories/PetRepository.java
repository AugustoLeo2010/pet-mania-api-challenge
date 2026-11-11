
package com.dt2.petmania.repositories;

import com.dt2.petmania.entities.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
}

