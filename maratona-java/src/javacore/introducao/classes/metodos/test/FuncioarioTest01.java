package javacore.introducao.classes.metodos.test;

import javacore.introducao.classes.metodos.dominio.Funcionario;

public class FuncioarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.name="Sanji";
        funcionario.age=23;
        // funcionario.wages= new double []{1200, 987.32, 2000};
        funcionario.printDatas();

    }
}
