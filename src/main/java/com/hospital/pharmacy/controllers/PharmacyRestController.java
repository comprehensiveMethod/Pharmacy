package com.hospital.pharmacy.controllers;

import com.hospital.pharmacy.models.Medicine;
import com.hospital.pharmacy.services.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/medicine")
public class PharmacyRestController {
    private final MedicineService medicineService;

    @Autowired
    public PharmacyRestController(MedicineService medicineService){
        this.medicineService = medicineService;
    }
    @GetMapping("/{name}")
    public ResponseEntity<Medicine> getMedicine(@PathVariable(name = "name") String name){
        try {
            final Medicine medicine = medicineService.getByName(name);
            return new ResponseEntity<>(medicine, HttpStatus.OK);
        }catch(IllegalArgumentException iae){
            return new ResponseEntity<>( HttpStatus.NOT_FOUND);
        }
    }


}
