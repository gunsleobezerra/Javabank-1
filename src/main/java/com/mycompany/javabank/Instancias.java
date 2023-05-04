/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javabank;

import java.util.ArrayList;
import java.util.List;


public class Instancias {
    private Models model;
    Instancias(){
         this.model = new Models();
        
        model.listaBanco.add(new Banco(1, "JavaBank"));
        model.listaBanco.add(new Banco(2, "Banco Atlas"));
        model.listaBanco.add(new Banco(3, "Fenix Financeiro"));
        model.listaBanco.add(new Banco(4, "Prestige Investimentos"));

        model.listaCliente.add(new Cliente("Arnaldo Sacomani", "54.986.782-89", 9632, 78963214));
        model.listaCliente.add(new Cliente("Jorge Ben", "98.741.951-27", 1234, 12345678));
        model.listaCliente.add(new Cliente("John McCarthy", "57.563.951-19", 5637, 78932165));
        model.listaCliente.add(new Cliente("Ada Lovelace", "85.325.859-32", 6295, 84951623));
        model.listaCliente.add(new Cliente("Alan Turing", "12.988.556-78", 7562, 26159483));
        model.listaCliente.add(new Cliente("Orlando de Andrade Figueiredo", "96.556.001-51", 4859, 32654898));

        model.listaConta.add(new Conta(1, 1, "Conta Corrente", 30000.00, 2000.00));
        model.listaConta.add(new Conta(2, 1, "Conta Corrente", 900.00, 1500.00));
        model.listaConta.add(new Conta(3, 1, "Conta Corrente", 300000.00, 20000.00));
        model.listaConta.add(new Conta(4, 1, "Conta Corrente", 500000.00, 13000.00));
        model.listaConta.add(new Conta(5, 1, "Conta Corrente", 1500.00, 1000.00));
        model.listaConta.add(new Conta(6, 1, "Conta Corrente", 3000.00, 1200.00));
        model.listaConta.add(new Conta(6, 1, "Conta Poupanca", 7000.00, 7000.00));
        model.listaConta.add(new Conta(6, 1, "Conta Pupanca", 0.00, 0.00));

        model.listaTransacao.add(new Transacao("2023-01-21", "13:31:02", 3, 2, 100.00, "Transferencia"));
        model.listaTransacao.add(new Transacao("2023-02-01", "08:11:23", 1, 1, 200.30, "Saque"));
        model.listaTransacao.add(new Transacao("2023-03-01", "10:31:02", 3, 3, 200.00, "Deposito"));
        model.listaTransacao.add(new Transacao("2023-04-25", "18:01:33", 2, 5, 50.00, "Transferencia"));
        model.listaTransacao.add(new Transacao("2023-04-30", "12:54:18", 7, 6, 2.50, "Transferencia"));
        model.listaTransacao.add(new Transacao("2023-05-01", "20:02:49", 3, 5, 59.35, "Transferencia"));
        
        //model.listaConta.get(6).GerarExtrato(model, "2023-01-01", "2023-05-01");

        /*
        model.listaConta.forEach((t) -> {
            System.out.println(model.listaConta.indexOf(t)+" - "+t.getClienteID());
        });
        
        for(int i = 0; i< model.listaTransacao.size(); i++){
            System.out.println(model.listaTransacao.get(i).toString(model)+"\n\n");
        }
        System.out.println(trans.toString());
        
        System.out.println(cli.getID() + " " + cli.getNome());
        System.out.println(conta1.getSaldo() + " " + conta1.getLimiteSaque());
        if (cli.Sacar(conta1, 2000.01)){
            System.out.println(conta1.getSaldo());
        } else {
            System.out.println("Saque negado.");
        }*/
    }

    public Conta getConta(int id, int banco){
        
        for(int i = 0; i< model.listaConta.size(); i++){
            if(model.listaConta.get(i).getClienteID() == id && model.listaConta.get(i).getBancoID() == banco){
                return model.listaConta.get(i);
            }
        }
        return null;
    }

    public Models getModel(){
        return this.model;
    }

    public Conta getConta(int id, int banco, String tipo){
        
        for(int i = 0; i< model.listaConta.size(); i++){
            if(model.listaConta.get(i).getClienteID() == id && model.listaConta.get(i).getBancoID() == banco && model.listaConta.get(i).getTipo() == tipo){
                return model.listaConta.get(i);
            }
        }
        return null;
    }

    public Cliente getCliente(int id){
        
        for(int i = 0; i< model.listaCliente.size(); i++){
            if(model.listaCliente.get(i).getID() == id){
                return model.listaCliente.get(i);
            }
        }
        return null;
    }

    public Banco getBanco(int id){
        
        for(int i = 0; i< model.listaBanco.size(); i++){
            if(model.listaBanco.get(i).getID() == id){
                return model.listaBanco.get(i);
            }
        }
        return null;
    }

    public Banco getBancobyName(String nome){
        
        for(int i = 0; i< model.listaBanco.size(); i++){
            if(model.listaBanco.get(i).getNome()== nome){
                return model.listaBanco.get(i);
            }
        }
        return null;
    }

    public List<Transacao> getTransacoes(int id, int banco){
        ArrayList<Transacao> transacoes = new ArrayList<Transacao>();
        for(Transacao t : model.listaTransacao){
            if(t.getDe() == id){
                transacoes.add(t);
            }
        }
        return transacoes;
    }


}
