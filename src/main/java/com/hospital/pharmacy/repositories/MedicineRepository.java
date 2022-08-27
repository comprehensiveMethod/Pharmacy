package com.hospital.pharmacy.repositories;

import com.hospital.pharmacy.models.Medicine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MedicineRepository extends CrudRepository<Medicine, Long> {
    Optional<Medicine> findMedicineByName(String name);
    List<Medicine> findMedicinesByEffectsContaining(String effect);
}
