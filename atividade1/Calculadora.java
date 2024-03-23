package atividade1;

public class Calculadora {
    
Double numA;
Double numB;
    
double somar(){
    return numA + numB;
}

double subtrair(){
    return numA - numB;}
    

    double dividir(){
        return numA / numB;
}


double multiplicar(){
    return numA * numB;
}

boolean verificarNumeroPrimo(int n){

    if(n <= 1){

        return false;
    }
    if( (n !=2 ) && (n % 2 == 0) ){
        return false;
    }

    for(int i = 3; i< n; i += 2);

    if(n % 1 == 0){

        return false;
    }


    return true;


}
}
//oi isso é um comentario//