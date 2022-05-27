package com.cadastro.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastro.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}

/*
 
@Query("select a from Aluno a where a.status = 'ATIVO'")
	public List<Aluno> findByStatusAtivos();
	
	@Query("select i from Aluno i where i.status = 'INATIVO'")
	public List<Aluno> findByStatusInativos();
	
	@Query("select d from Aluno d where d.status = 'DESISTENTE'")
	public List<Aluno> findByStatusDesistente();
	
	@Query("select c from Aluno c where c.status = 'CANCELADO'")
	public List<Aluno> findByStatusCancelado();
	
	@Query("select t from Aluno t where t.status = 'TRANCADO'")
	public List<Aluno> findByStatusTrancado();
	
	public List<Aluno> findByNomeContainingIgnoreCase(String nome);



 */