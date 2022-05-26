package com.cadastro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto {

	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long idProduto;

//		@NotBlank(message = "O campo nome do produto não pode ser vazio.")
		private String nomeProduto;
		
//      @NotBlank(message = "O campo quantidade do produto não pode ser vazio.")
		private String quantProduto;
		
//		@NotBlank(message = "O campo volume do produto não pode ser vazio.")
		private String volProduto;
		
//		@NotBlank(message = "O campo preço do produto não pode ser vazio.")
		private String precoProduto;
		
//		@NotBlank(message = "O campo data de entrada não pode ser vazio.")
		private String entradaProduto;

		
		public Produto() {
			
		}


		public Produto(Long idProduto, String nomeProduto, String quantProduto, String volProduto, String precoProduto,
				String entradaProduto) {
			super();
			this.idProduto = idProduto;
			this.nomeProduto = nomeProduto;
			this.quantProduto = quantProduto;
			this.volProduto = volProduto;
			this.precoProduto = precoProduto;
			this.entradaProduto = entradaProduto;
		}


		public Long getIdProduto() {
			return idProduto;
		}


		public void setIdProduto(Long idProduto) {
			this.idProduto = idProduto;
		}


		public String getNomeProduto() {
			return nomeProduto;
		}


		public void setNomeProduto(String nomeProduto) {
			this.nomeProduto = nomeProduto;
		}


		public String getQuantProduto() {
			return quantProduto;
		}


		public void setQuantProduto(String quantProduto) {
			this.quantProduto = quantProduto;
		}


		public String getVolProduto() {
			return volProduto;
		}


		public void setVolProduto(String volProduto) {
			this.volProduto = volProduto;
		}


		public String getPrecoProduto() {
			return precoProduto;
		}


		public void setPrecoProduto(String precoProduto) {
			this.precoProduto = precoProduto;
		}


		public String getEntradaProduto() {
			return entradaProduto;
		}


		public void setEntradaProduto(String entradaProduto) {
			this.entradaProduto = entradaProduto;
		}

	
		
	
		
}
