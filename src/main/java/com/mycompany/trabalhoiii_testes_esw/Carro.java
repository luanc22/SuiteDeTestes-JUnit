/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoiii_testes_esw;

/**
 *
 * @author Luan
 */
public class Carro {
    private String placa;
    private String modelo;
    private String fabricante;
    private String cor;
    private String ano;
    private double preco;
    private boolean aVenda;

    public Carro(String placa, String modelo, String fabricante, String cor, String ano, double preco, boolean aVenda) {
        this.placa = placa;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.cor = cor;
        this.ano = ano;
        this.preco = preco;
        this.aVenda = aVenda;
    }
    
    public Carro(){}

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public boolean isaVenda() {
        return aVenda;
    }

    public void setaVenda(boolean aVenda) {
        this.aVenda = aVenda;
    }

    @Override
    public String toString() {
        
        String estaDisponivel = "";
        if(aVenda){
            estaDisponivel = "Carro a venda!";
        }
        else{
            estaDisponivel = "Carro indisponivel.";
        }
        
        String apresentaCarro = new StringBuilder()
                .append("Carro: " + fabricante + " " + modelo + ".\n")
                .append("Placa: " + placa + "\n")
                .append("Cor: " + cor + "\n")
                .append("Ano: " + ano + "\n")
                .append("A venda: " + estaDisponivel + "\n")
                .append("Preco: " + preco + "\n")
                .append("\n")
                .toString();
        return apresentaCarro;
    }
    
    public String listarCarro() {
        
        String apresentaListaCarro = new StringBuilder()
                .append("Carro: " + fabricante + " " + modelo + ".\n")
                .append("Placa: " + placa + "\n")
                .append("\n")
                .toString();
        return apresentaListaCarro;
    }
    
}
