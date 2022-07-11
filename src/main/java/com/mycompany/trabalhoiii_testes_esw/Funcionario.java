/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoiii_testes_esw;

/**
 *
 * @author Luan
 */
public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private boolean admin;

    public Funcionario(String nome, String cpf, double salario, boolean admin) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.admin = admin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        
        String funcionarioAdmin = "";
        if(admin){
            funcionarioAdmin = "Usuario com permissões administrativas.";
        }
        else{
            funcionarioAdmin = "Usuario sem permissões administrativas.";
        }
        
        String apresentaFuncionario = new StringBuilder()
                .append("Nome: " + nome + ".\n")
                .append("CPF: " + cpf + "\n")
                .append("Salario: " + salario + "\n")
                .append("Admin: " + funcionarioAdmin + "\n")
                .toString();
        return apresentaFuncionario;
    }
    
    public String listarFuncionario() {
        
        String apresentaListaFuncionario = new StringBuilder()
                .append("Nome: " + nome + ".\n")
                .append("CPF: " + cpf + "\n")
                .append("\n")
                .toString();
        return apresentaListaFuncionario;
    }
}
