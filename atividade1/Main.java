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
        System.out.println("4" + calc.verificarNumeroPrimo(4));
    
    
    
    
    }
}
