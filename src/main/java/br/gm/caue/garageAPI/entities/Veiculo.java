package br.gm.caue.garageAPI.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_veiculo")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String marca;
    private String modelo;
    private String cor;
    private Integer ano;
    private Double km;
    private String linkImagem;
    private String descricao;
    private String avarias;

    public Veiculo() {}

    public Veiculo(Long id, String nome, String marca, String modelo, String cor,
                  Integer ano, Double km, String linkImagem,
                  String descricao, String avarias) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.km = km;
        this.linkImagem = linkImagem;
        this.descricao = descricao;
        this.avarias = avarias;
    }

    // getters e setters

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

    public String getDescricao() {
        return descricao;
    }

    public String getAvarias() {
        return avarias;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public void setKm(Double km) {
        this.km = km;
    }

    public void setLinkImagem(String linkImagem) {
        this.linkImagem = linkImagem;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setAvarias(String avarias) {
        this.avarias = avarias;
    }
    
    
}