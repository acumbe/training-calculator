package com.bootcamp.automation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        double suma =  sumar(3,3);
        double restar =  restar(15,5);
        System.out.println("La suma es:" + suma);
        System.out.println("La resta es" + restar);
    }

    public static double sumar(double num1, double num2){
        double suma = num1+num2;
        return suma;
    }

    public static double restar(double num1, double num2){
        double resta = num1-num2;
        return resta;
    }

}
