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
public class GerenciaFuncionario {
    
    public GerenciaFuncionario() {
    }

    private ArrayList<Funcionario> funcionariosAtivos = new ArrayList<Funcionario>();
    private ArrayList<Funcionario> funcionariosDesativados = new ArrayList<Funcionario>();

    public ArrayList<Funcionario> getFuncionariosAtivos() {
        return funcionariosAtivos;
    }

    public void setFuncionariosAtivos(ArrayList<Funcionario> funcionariosAtivos) {
        this.funcionariosAtivos = funcionariosAtivos;
    }

    public ArrayList<Funcionario> getFuncionariosDesativados() {
        return funcionariosDesativados;
    }

    public void setFuncionariosDesativados(ArrayList<Funcionario> funcionariosDesativados) {
        this.funcionariosDesativados = funcionariosDesativados;
    }

    public void AdicionarFuncionarioNoSistema(Funcionario funcionario) {
        this.funcionariosAtivos.add(funcionario);
    }

    public Funcionario PuxarDadosFuncionario(String cpf) {
        Funcionario funcionarioEncontrado = null;
        
        for (Funcionario funcionarioAtivo : funcionariosAtivos) {
            if (funcionarioAtivo.getCpf().equals(cpf)) {
                funcionarioAtivo.toString();
                funcionarioEncontrado = funcionarioAtivo;
                return funcionarioEncontrado;
            }
        }
        
        for (Funcionario funcionarioDesativado : funcionariosDesativados) {
            if (funcionarioDesativado.getCpf().equals(cpf)) {
                funcionarioDesativado.toString();
                funcionarioEncontrado = funcionarioDesativado;
                return funcionarioEncontrado;
            }
        }

        return funcionarioEncontrado;
    }

    public void listarTodosFuncionariosDoSistema() {
        System.out.println("Funcionarios em operação: \n");
        for (Funcionario funcionarioAtivo : funcionariosAtivos) {
            funcionarioAtivo.listarFuncionario();
        }

        System.out.println("Funcionarios desativados: \n");
        for (Funcionario funcionarioDesativado : funcionariosDesativados) {
            funcionarioDesativado.listarFuncionario();
        }
    }
    
    public void DesativarFuncionario(String cpf) {

        for (Funcionario funcionario : funcionariosAtivos) {
            if (funcionario.getCpf().equals(cpf)) {
                this.funcionariosDesativados.add(funcionario);
                this.funcionariosAtivos.remove(funcionario);
            }
        } 
    }
    
    public void AtivarFuncionario(String cpf) {

        for (Funcionario funcionario : funcionariosAtivos) {
            if (funcionario.getCpf().equals(cpf)) {
                this.funcionariosDesativados.remove(funcionario);
                this.funcionariosAtivos.add(funcionario);
            }
        } 
    }
    
    public void RemoverFuncionarioDoSistema(String cpf) {

        for (Funcionario funcionarioAtivo : funcionariosAtivos) {
            if (funcionarioAtivo.getCpf().equals(cpf)) {
                this.funcionariosAtivos.remove(funcionarioAtivo);
            }
        }
        
        for (Funcionario funcionarioDesativado : funcionariosDesativados) {
            if (funcionarioDesativado.getCpf().equals(cpf)) {
                this.funcionariosDesativados.remove(funcionarioDesativado);
            }
        }
    }

    public void LimparListas() {
        funcionariosAtivos.clear();
        funcionariosDesativados.clear();
    }
}
