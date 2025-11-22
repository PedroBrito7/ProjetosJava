package javacore.introducao.classes.metodos.dominio;

public class Calculadora {
    public void somaTwoNumbers(){
        System.out.println(10+10);
    }
    public void substraiTwoNumbers(){
        System.out.println(123-45);
    }
    public void multiplicaTwoNumbers(int num, int num2){
        System.out.println(num * num2);
    }
    public double divideDoisNumeros (double num1, double num2){
        if(num2 == 0){
            return 0;
        }
        return num1/num2;
    }
}
