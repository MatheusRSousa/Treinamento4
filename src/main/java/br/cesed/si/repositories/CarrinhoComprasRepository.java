package br.cesed.si.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.cesed.si.models.CarrinhoCompras;

@Repository
public interface CarrinhoComprasRepository extends JpaRepository<CarrinhoCompras, Long>{

}
