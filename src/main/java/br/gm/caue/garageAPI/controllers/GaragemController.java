package br.gm.caue.garageAPI.controllers;

import br.gm.caue.garageAPI.DTO.VeiculoDTO;
import br.gm.caue.garageAPI.entities.Veiculo;
import br.gm.caue.garageAPI.services.VeiculoService;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class GaragemController {

    @Autowired
    private VeiculoService service;

    @GetMapping("/forsale")
    public ResponseEntity<List<VeiculoDTO>> findAll() {
        List<VeiculoDTO> list = service.findAll()
                .stream()
                .map(VeiculoDTO::new)
                .collect(Collectors.toList());
        return ResponseEntity.ok(list);
    }

    @GetMapping("/forsale/{id}")
    public ResponseEntity<Veiculo> findById(@PathVariable Long id) {
        Optional<Veiculo> result = service.findById(id);
        return result.map(ResponseEntity::ok)
                     .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/color/{cor}")
    public ResponseEntity<List<VeiculoDTO>> findByColor(@PathVariable String cor) {
        List<VeiculoDTO> list = service.findByColor(cor)
                .stream()
                .map(VeiculoDTO::new)
                .collect(Collectors.toList());
        return ResponseEntity.ok(list);
    }

    @GetMapping("/year/{ano}")
    public ResponseEntity<List<VeiculoDTO>> findByYear(@PathVariable Integer ano) {
        List<VeiculoDTO> list = service.findByYear(ano)
                .stream()
                .map(VeiculoDTO::new)
                .collect(Collectors.toList());
        return ResponseEntity.ok(list);
    }
}