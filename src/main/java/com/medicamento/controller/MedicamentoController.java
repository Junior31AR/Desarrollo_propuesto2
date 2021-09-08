package com.medicamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.medicamento.entity.Medicamento;
import com.medicamento.service.MedicamentoService;

@RestController
@RequestMapping("/actividad/medicamento")
public class MedicamentoController {

	@Autowired
	private MedicamentoService service;
	
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Medicamento>>listarMedicamento(){
		List<Medicamento>lista = service.listaMedicamento();
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("/nombre/{param_nombre}")
	@ResponseBody
	public ResponseEntity<List<Medicamento>>listaPorNombre(@PathVariable("param_nombre")String nombre){
		List<Medicamento>lista= service.listaPorNombre(nombre);
		if(org.springframework.util.CollectionUtils.isEmpty(lista)) {
			return ResponseEntity.badRequest().build();
		}else {
			return ResponseEntity.ok(lista);
		}
	}
	
	@GetMapping("/stock/{param_stock}")
	@ResponseBody
	public ResponseEntity<List<Medicamento>>buscarPorStock(@PathVariable("param_stock")int stock){
		List<Medicamento>lista = service.buscarPorStock(stock);
		if (org.springframework.util.CollectionUtils.isEmpty(lista)) {
			return ResponseEntity.badRequest().build();
		}else {
			return ResponseEntity.ok(lista);
		}
	}
	
}
