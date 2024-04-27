package atividade1;

public class Main {
    
    public static void main(String[] args) {
    
        Calculadora calc = new Calculadora();
        calc.numA = 5.0;
        calc.numB = 9.0;
        System.out.println("Soma: " + calc.somar());
        System.out.println("Subtrair: " + calc.subtrair());
        System.out.println("multiplicar: " + calc.multiplicar());
        System.out.println("Dividir: " + calc.dividir());
        System.out.println("0" + calc.verificarNumeroPrimo(0));
        System.out.println("1" + calc.verificarNumeroPrimo(1));
        System.out.println("2" + calc.verificarNumeroPrimo(2));
        System.out.println("3" + calc.verificarNumeroPrimo(3));
        System.out.println("7" + calc.verificarNumeroPrimo(7));
        System.out.println("83" + calc.verificarNumeroPrimo(83));
        System.out.println("100" + calc.verificarNumeroPrimo(100));
        System.out.println("911" + calc.verificarNumeroPrimo(911));
        System.out.println("1044729" + calc.verificarNumeroPrimo(1044729));
        System.out.println("14348907" + calc.verificarNumeroPrimo(14348907));
        
        
    }
}
