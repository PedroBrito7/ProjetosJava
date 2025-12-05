package javacore.Oexception.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        recursividade();
    }
    public static recursividade(){
        recursividade();
    }
}
