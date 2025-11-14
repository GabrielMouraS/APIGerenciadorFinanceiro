package com.financeiroapi.controller;
import com.financeiroapi.model.Financeiro;
import com.financeiroapi.service.FinanceiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*; 
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/financeiro")

public class FinanceiroController {
	
	@Autowired
	private FinanceiroService financeiroService;
	
	@GetMapping
	public List<Financeiro> listarTodos() {
		return financeiroService.listarTodos();
	}
	
	@PostMapping
	public Financeiro salvar(@RequestBody Financeiro financeiro) {
		return financeiroService.salvar(financeiro);
	}
	
	@PutMapping("/{id}")
	public Financeiro atualizar(@PathVariable Long id, @RequestBody Financeiro 
			financeiro) {  
			  return financeiroService.atualizar(id, financeiro); 
			  } 
	
	@DeleteMapping("/{id}")  
	 public void deletar(@PathVariable Long id) {  
	  financeiroService.deletar(id);  
	  }
	
	@GetMapping("/{id}") 
	 public Optional<Financeiro> findById(@PathVariable Long id) { 
	  return financeiroService.findById(id); 
	  } 
	
	
}
