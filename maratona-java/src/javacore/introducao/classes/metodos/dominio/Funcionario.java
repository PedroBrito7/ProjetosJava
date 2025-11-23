package javacore.introducao.classes.metodos.dominio;

public class Funcionario {
    public String name;
    public int age;
    public double [] wages;

    public void printDatas(){
        System.out.println("##############");
        System.out.println(this.name);
        System.out.println(this.age);
        if(wages ==null) {
            return;
        }
            for (double wage : wages) {
                System.out.println(wage + " ");
            }
      mediaWage();

    }
    public void mediaWage(){
        double media =0;
        if (wages ==null){
            return;
        }
            for (double wage : wages) {
                media += wage;
            }
            media /= wages.length;



        System.out.println("Media salarial:" +media);
    }
}
