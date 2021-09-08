package com.medicamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicamento.entity.Medicamento;
import com.medicamento.repository.MedicamentoRepository;

@Service
public class MedicamentoServiceImplement implements MedicamentoService {

	@Autowired
	private MedicamentoRepository repo;
	
	@Override
	public List<Medicamento> listaMedicamento() {
		return repo.findAll();
	}

	@Override
	public List<Medicamento> listaPorNombre(String nombre) {
		return repo.findByNombreContaining(nombre);
	}

	@Override
	public List<Medicamento> buscarPorStock(int stock) {
		// TODO Auto-generated method stub
		return repo.findByStock(stock);
	}

	

	

}
