import java.util.Scanner;

class Main {
  // Faça um Programa que converta metros para centímetros.
  public static void main(String[] args) {

    // declaração das variáveis 
    Scanner input = new Scanner(System.in);double nresult; 
    double nmetro;
    double ncent;

    // primeira mensagem
    String textoUm = "Informe um valor em metros (m) ";
    System.out.print(textoUm);
    nmetro = input.nextDouble();
    ncent = 100;
    // fazer o calculo de conversao de medidas m x cm
    
    nresult = (nmetro * ncent);

    // mostrar o resultado da convesao
    System.out.println("O Valor digitado em centimetros equivale a: " + nresult);

    input.close();
  }
}





