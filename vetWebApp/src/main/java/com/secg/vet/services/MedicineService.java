package com.secg.vet.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.secg.vet.domain.Medicine;

@Service
public interface MedicineService {
	
	public List<Medicine> getAllMedicines();
	public Medicine getMedicinaById(Integer id);
	
}
