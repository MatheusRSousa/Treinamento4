package br.cesed.si.repositories;


import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import br.cesed.si.models.Vendedor;

@Repository
public interface VendedorRepository extends JpaRepository<Vendedor, Long>{

	Vendedor findByNome(String nome);
	boolean existsByNome(String nome);
	
	@Query(value = "select * from Vendedor where vendedor_nome like :nome%", nativeQuery = true)
	List<Vendedor> buscaPorNome(@Param("nome") String nome);
	
	@Query(value = "select * from vendedor where vendedor_cpf like :cpf%",nativeQuery = true)
	List<Vendedor> buscaPorCpf(@Param("cpf") String cpf);
}
