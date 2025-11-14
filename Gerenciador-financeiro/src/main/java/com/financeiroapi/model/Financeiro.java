package com.financeiroapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "financeiro")
public class Financeiro {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String tipo; 
	private String categoria;
	private Double valor;
	private String data;
	private String descricao;
	private String forma_pagamento;
	
	
	public Financeiro(){
		
	}
	
	public Financeiro(long id, String tipo, String categoria, Double valor,String data, String descricao, String forma_pagamento ){
		this.setId(id);
		this.setTipo(tipo);
		this.setCategoria(categoria);
		this.setData(data);
		this.setValor(valor);
		this.setDescricao(descricao);
		this.setForma_pagamento(forma_pagamento);
	}



	public String getForma_pagamento() {
		return forma_pagamento;
	}



	public void setForma_pagamento(String forma_pagamento) {
		this.forma_pagamento = forma_pagamento;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public String getData() {
		return data;
	}



	public void setData(String data) {
		this.data = data;
	}



	public Double getValor() {
		return valor;
	}



	public void setValor(Double valor) {
		this.valor = valor;
	}



	public String getCategoria() {
		return categoria;
	}



	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}
	
	
	
}
