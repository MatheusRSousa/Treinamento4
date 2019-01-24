package br.cesed.si.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.cesed.si.models.Vendedor;

@Repository
public interface VendedorRepository extends JpaRepository<Vendedor, Long>{

}
