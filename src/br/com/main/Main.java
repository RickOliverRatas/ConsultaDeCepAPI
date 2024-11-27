package br.com.main;

import br.com.modelos.ConsultaCep;
import br.com.modelos.Endereco;
import br.com.modelos.GeradorDeArquivos;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite um numero de CEP para consulta");
        var cep = leitura.nextLine();

        try {
            Endereco novoEndereco = consultaCep.buscaEndereco("01001000");
            System.out.println(novoEndereco);
            GeradorDeArquivos gerador = new GeradorDeArquivos();
            gerador.salvaJson(novoEndereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }



    }
}