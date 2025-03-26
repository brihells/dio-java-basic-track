public class OperadoresIntro {
    public static void main(String[] args) {
       //Estudo sobre alguns tipos de operadores e suas funcoes dentro de um programa java
       // Nota **Pensar em operadores como "acoes" que podemos fazer com variaveis (somar comparar etc..)
       // comecarei com uma calculadora simples
       int a = 15;
       int b = 4; 

       //calcular e imprimir
       System.out.println("Soma: " + (a + b));      //resultado esperado 19
       System.out.println("Subtração: " + (a - b)); //resultado esperado 11
       System.out.println("Multiplicação: " + (a * b)); //resultado esperado 60
       System.out.println("Divisão: " + ((double)a / b)); // necessario utilizar double para numeros "quebrados"
       System.out.println("Resto: " + (a % b)); //resultado esperado 3

    }
}
