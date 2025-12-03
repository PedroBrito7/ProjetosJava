package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Tomate;
import javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Nuc10i7 ", 1100);
        Tomate tomate = new Tomate("Tomate cereja ", 10);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("------------");
        CalculadoraImposto.calcularImposto(tomate);



    }
}
