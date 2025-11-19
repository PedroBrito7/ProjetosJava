package devpedro.marotona_java;

public class ConditionalsStructure3 {
    public static void main(String[] args) {
        // doar se salario > 5000
        double salario = 7000;
        String mensagemDoar = "Eu vou doar 500 R$";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter! ";
        // (condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
