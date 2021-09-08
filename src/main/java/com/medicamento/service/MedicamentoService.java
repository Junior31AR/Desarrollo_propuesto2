package com.medicamento.service;

import java.util.List;

import com.medicamento.entity.Medicamento;

public interface MedicamentoService {

	public List<Medicamento>listaMedicamento();
	
	public List<Medicamento>listaPorNombre(String nombre);
	
	public List<Medicamento>buscarPorStock(int stock);
	
}
