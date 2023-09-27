package com.senai.Enzo.entities;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_cliente")
public class Cliente {
		
		//atributos fa classe
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(name = "nome")
		private Long idcCliente;
		
		@Column(name = "preco")
		private Long nCliente;
		
		@Column(name = "fone")
		private String fone;
		
		//métodos da classe
		
		public Long getId() {
			return id;
		}
		
		public Long getName() {
			return nCliente;
		}
		
		public String getPrice() {
			return fone;
		}
		
		public void setId(Long id) {
			this.id = id;
		}
		
		public void setName(Long nCliente) {
			this.nCliente = nCliente;
		}
		
		public void setPrice(String fone) {
			this.fone = fone;
		}
}
