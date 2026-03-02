/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gm.caue.garageAPI.DTO;

import br.gm.caue.garageAPI.entities.Veiculo;

/**
 *
 * @author digma
 */
public class VeiculoDTO {

    private Long id;
    private String nome;
    private String marca;
    private String modelo;
    private String cor;
    private Integer ano;
    private Double km;
    private String linkImagem;

    // Construtor a partir da entidade
    public VeiculoDTO(Veiculo v) {
        this.id = v.getId();
        this.nome = v.getNome();
        this.marca = v.getMarca();
        this.modelo = v.getModelo();
        this.cor = v.getCor();
        this.ano = v.getAno();
        this.km = v.getKm();
        this.linkImagem = v.getLinkImagem();
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public Integer getAno() {
        return ano;
    }

    public Double getKm() {
        return km;
    }

    public String getLinkImagem() {
        return linkImagem;
    }
}
