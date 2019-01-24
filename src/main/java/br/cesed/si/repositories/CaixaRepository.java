package br.cesed.si.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.cesed.si.models.Caixa;

@Repository
public interface CaixaRepository extends JpaRepository<Caixa, Long>{

}
