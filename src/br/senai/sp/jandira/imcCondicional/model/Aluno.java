package br.senai.sp.jandira.imcCondicional.model;

import java.util.Scanner;

public class Aluno {

    String nome;
    String status;
    double altura;
    double peso;
    double imc;

    public void obterDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do aluno(a): ");
        nome = leitor.nextLine();

        System.out.println("Agora digite a altura (em metros): ");
        altura = leitor.nextDouble();

        System.out.println("Pra finalizar, digite o peso do aluno(a) (em kg): ");
        peso = leitor.nextDouble();

        calcularImc();
    }

    public void calcularImc(){
        double alturaAoQuadrado = altura * altura;

        imc = peso / alturaAoQuadrado;

classificacaoCondicional();

    }

    public void classificacaoCondicional(){
        if (imc <= 18.5) {
            status = "Abaixo do peso";
        } else if (imc <= 24.9) {
            status = "Peso ideal (Muito bem)";
        } else if (imc <= 29.9) {
            status = "Levemente acima do peso";
        } else if (imc <= 34.9) {
            status = "Obesidade grau I";
        } else if (imc <= 39.9) {
            status = "Obesidade grau II (severa)";
        } else {
            status = "Obesidade grau III";
        }

        exibirResultado();
    }

    public void exibirResultado(){

        String imcDecimal = String.format("%.2f", imc);

        System.out.println("---------------------------------");
        System.out.println("*** RESULTADO ***");
        System.out.println("---------------------------------");
        System.out.println("O aluno(a) se chama: " + nome);
        System.out.println("A altura do aluno (em metros) é: " + altura);
        System.out.println("O peso do aluno (em kg) é: " + peso);
        System.out.println("imc Calculado: " + imcDecimal);
        System.out.println("Status: " + status);
        System.out.println("---------------------------------");
    }
}
