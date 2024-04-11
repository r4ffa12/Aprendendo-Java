package edu.rafael.primeirasemana;
public class MinhaClasse {

public static void main(String [] args) {

    String primeiroNome = "Rafael";
    String segundoNome = "Braulio";

    String nomeCompleto = NomeCompleto (primeiroNome, segundoNome);

    System.out.println(nomeCompleto);

}

public static String NomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
}

}
