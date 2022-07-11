/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoiii_testes_esw;

import java.util.ArrayList;

/**
 *
 * @author Luan
 */
public class GerenciaConcessionaria {

    public GerenciaConcessionaria() {
    }

    private ArrayList<Carro> carrosAVenda = new ArrayList<Carro>();
    private ArrayList<Carro> carrosIndisponiveis = new ArrayList<Carro>();

    public ArrayList<Carro> getCarrosAVenda() {
        return carrosAVenda;
    }

    public void setCarrosAVenda(ArrayList<Carro> carrosAVenda) {
        this.carrosAVenda = carrosAVenda;
    }

    public ArrayList<Carro> getCarrosIndisponiveis() {
        return carrosIndisponiveis;
    }

    public void setCarrosIndisponiveis(ArrayList<Carro> carrosIndisponiveis) {
        this.carrosIndisponiveis = carrosIndisponiveis;
    }

    public void AdicionarCarroNoInventario(Carro carro) {
        if (carro.isaVenda()) {
            this.carrosAVenda.add(carro);
        } else {
            this.carrosIndisponiveis.add(carro);
        }
    }

    public Carro PuxarDadosCarro(String placa) {
        Carro carroEncontrado = null;
        for (Carro checarAVenda : carrosAVenda) {
            if (checarAVenda.getPlaca().equals(placa)) {
                checarAVenda.toString();
                carroEncontrado = checarAVenda;
                return carroEncontrado;
            }
        }

        for (Carro checarIndisponiveis : carrosIndisponiveis) {
            if (checarIndisponiveis.getPlaca().equals(placa)) {
                checarIndisponiveis.toString();
                carroEncontrado = checarIndisponiveis;
                return carroEncontrado;
            }
        }

        return carroEncontrado;
    }

    public void ListarTodosCarrosDoInventario() {
        System.out.println("Carros a Venda: \n");
        for (Carro checarAVenda : carrosAVenda) {
            checarAVenda.listarCarro();
        }

        System.out.println("Carros Indisponiveis: \n");
        for (Carro checarIndisponiveis : carrosIndisponiveis) {
            checarIndisponiveis.listarCarro();
        }
    }

    public void RemoverCarroDoInventario(String placa) {
        for (Carro checarAVenda : carrosAVenda) {
            if (checarAVenda.getPlaca().equals(placa)) {
                this.carrosAVenda.remove(checarAVenda);
            }
        }

        for (Carro checarIndisponiveis : carrosIndisponiveis) {
            if (checarIndisponiveis.getPlaca().equals(placa)) {
                this.carrosIndisponiveis.remove(checarIndisponiveis);
            }
        }
    }

    public void LimparListas() {
        carrosAVenda.clear();
        carrosIndisponiveis.clear();
    }
}
