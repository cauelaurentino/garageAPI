package br.gm.caue.garageAPI.services;


import br.gm.caue.garageAPI.entities.Veiculo;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.gm.caue.garageAPI.repositories.VeiculoRepository;

/**
 *
 * @author digma
 */
@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository repository;

    // Retorna todos como DTO (informações básicas)
    public List<Veiculo> findAll() {
        List<Veiculo> listaVeiculos = repository.findAll();
        return listaVeiculos;
    }

    // Retorna um veículo completo por ID
    public Optional<Veiculo> findById(Long id) {
        return repository.findById(id);
    }

    // Filtra por cor, retorna DTO
    public List<Veiculo> findByColor(String cor) {
        List<Veiculo> listaVeiculos = repository.findByCor(cor);
        return listaVeiculos;
    }

    // Filtra por ano, retorna DTO
    public List<Veiculo> findByYear(Integer ano) {
        List<Veiculo> listaVeiculos = repository.findByAno(ano);
        return listaVeiculos;
    }
}