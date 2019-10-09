package com.secg.vet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.secg.vet.domain.Medicine;
import com.secg.vet.repository.MedicineRepository;

public class MedicineServiceImpl implements MedicineService {

	@Autowired
	MedicineRepository mr;
	
	@Override
	public List<Medicine> getAllMedicines() {
		return mr.findAll();
	}

	@Override
	public Medicine getMedicinaById(Integer id) {
		return mr.getOne(id);
	}

	

}
