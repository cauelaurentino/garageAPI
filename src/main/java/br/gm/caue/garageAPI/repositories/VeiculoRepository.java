package br.gm.caue.garageAPI.repositories;

import br.gm.caue.garageAPI.entities.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

    List<Veiculo> findByCor(String cor);

    List<Veiculo> findByAno(Integer ano);
}