public class OperadoresIntro {
    public static void main(String[] args) {
       //Estudo sobre alguns tipos de operadores e suas funcoes dentro de um programa java
       // Nota **Pensar em operadores como "acoes" que podemos fazer com variaveis (somar comparar etc..)
      //Proximo exercico operador de atribuicao | contador
      int saldo = 100;

      saldo += 50; //depositar 50
      System.out.println("Saldo após deposito: " + saldo); //150

      saldo -= 30; // sacar 30
      System.out.println("Saldo após saque: " + saldo); // 120

      saldo *= 2; // dobrar o saldo
      System.out.println("Saldo após dobrado: " + saldo); // 240
    
      saldo *= 1.10; // 10% de juros
      System.out.println("Saldo após 10% de juros: " + saldo); //264 (240 + 10%)
        
    }
}
