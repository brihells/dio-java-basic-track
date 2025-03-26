public class OperadoresIntro {
    public static void main(String[] args) {
       //Estudo sobre alguns tipos de operadores e suas funcoes dentro de um programa java
       // Nota **Pensar em operadores como "acoes" que podemos fazer com variaveis (somar comparar etc..)
      //Operadores Logicos irao combinar condicoes

      String user = "admin";
      String password = "1234";
      boolean correctUser = user.equals("admin"); // Compara Strings
      boolean correctPassword = password.equals("1234"); 
      boolean wrongPassword = password.equals("5678");

      // Pode logar (user And password correct?)
      boolean canLogIn = correctUser && correctPassword ;
      System.out.println("Guaranteed Access? " + canLogIn); //false

    }
}
