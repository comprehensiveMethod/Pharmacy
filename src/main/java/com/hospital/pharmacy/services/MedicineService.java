package com.hospital.pharmacy.services;

import com.hospital.pharmacy.models.Medicine;
import com.hospital.pharmacy.repositories.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicineService {
    private final MedicineRepository medicineRepository;

    @Autowired
    public MedicineService(MedicineRepository medicineRepository){
        this.medicineRepository = medicineRepository;
    }

    public Medicine getByName(String name){
        Medicine medicine = medicineRepository.findMedicineByName(name).get();
        if(medicine==null) throw new IllegalArgumentException("No medicines with this name");
        else return medicine;
    }

}
