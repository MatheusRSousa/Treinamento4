package br.cesed.si.repositories;



import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.cesed.si.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	Long findById(String nome);
	boolean existsByNome(String nome);
	
	@Query(value = "select * from produto where produto_nome like :nome%", nativeQuery = true)
	List<Produto> buscaPorNome(@Param("nome") String nome); 
}
