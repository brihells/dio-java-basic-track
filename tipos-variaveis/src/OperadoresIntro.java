public class OperadoresIntro {
    public static void main(String[] args) {
       //Estudo sobre alguns tipos de operadores e suas funcoes dentro de um programa java
       // Nota **Pensar em operadores como "acoes" que podemos fazer com variaveis (somar comparar etc..)
      //Operadores de comparacao (retornar true or false)
      int idade = 18;
      boolean temCarteira = true;

      // Pode dirigir? (idade >= 18 E temCarteira)
      boolean podeDirigir = (idade >= 18) && temCarteira;
      System.out.println("Pode dirigir? " + podeDirigir); // true

      // É menor de idade ou não tem carteira?
      boolean precisaDeAutorizacao = (idade < 18) || !temCarteira;
      System.out.println("Precisa de autorização? " + precisaDeAutorizacao); 
        
    }
}
