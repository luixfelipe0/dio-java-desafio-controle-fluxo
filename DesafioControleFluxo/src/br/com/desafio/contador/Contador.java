package br.com.desafio.contador;

import br.com.desafio.exception.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        //inicializando o scanner
        Scanner leitura = new Scanner(System.in);

        //Solicitando os números para o usuário
        System.out.println("Digite o primeiro parâmetro: ");
        int primeiroParametro = leitura.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int segundoParametro = leitura.nextInt();

        //Tentando fazer a contagem, e lançando a exceção caso não seja possível
        try {
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O primeiro parâmetro deve ser menor que o segundo parâmetro.");
        }
    }

    private static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {

        //Validando se o primeiro parâmetro é maior do que o segundo
        if (primeiroParametro > segundoParametro) {
            throw new ParametrosInvalidosException();
        }
        //Realizando a iteração com o for com base no diferença entre o primeiro e o segundo parâmetro
        int contagem = segundoParametro - primeiroParametro;
        for (int contador = 1; contador <= contagem; contador++) {
            System.out.println("Imprimindo o número " + contador + "...");
        }

    }

}
