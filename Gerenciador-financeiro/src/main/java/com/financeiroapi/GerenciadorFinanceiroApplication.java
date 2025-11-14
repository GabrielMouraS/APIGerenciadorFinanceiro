package com.financeiroapi; 
import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication; 
import io.swagger.v3.oas.annotations.OpenAPIDefinition; 
import io.swagger.v3.oas.annotations.info.Info; 
	
@OpenAPIDefinition( 
info = @Info( 
title = "API de Gerenciamento Financeiro", 
version = "1.0", 
description = "documentação API " ) )

@SpringBootApplication 

public class GerenciadorFinanceiroApplication { 
		public static void main(String[] args) { 
			SpringApplication.run(GerenciadorFinanceiroApplication.class, args); 
		
		} 
} 
