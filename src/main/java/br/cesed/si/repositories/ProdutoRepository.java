package br.cesed.si.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import br.cesed.si.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	Long findById(String nome);
	boolean existsByNome(String nome);
}
