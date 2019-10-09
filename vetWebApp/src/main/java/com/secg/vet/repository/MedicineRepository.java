package com.secg.vet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.secg.vet.domain.Medicine;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Integer> {

}
