
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.operations;

/**
 *
 * @author alfonso && zofia
 */
public class Aritmetica {

    //Metodo encargado de sumar los valores de entrada.
    public double suma(double primerNumero, double segundoNumero) {
        return primerNumero + segundoNumero;
    }

    public double resta(double primerNumero, double segundoNumero) {
        return primerNumero - segundoNumero;
    }

    public double multiplicacion(double primerNumero, double segundoNumero) {
        return primerNumero * segundoNumero;
    }

    public double division(double dividendo, double divisor) {
        return dividendo / divisor;
    }

    public int residuo(int numerador, int denominador) {
        return (numerador % denominador);
    }

    public double potencia(double base, double exponente) {
        double potencia = Math.pow(base, exponente);
        return potencia;
    }

    public double raiz(double primerNumero) {
        double raiz = Math.sqrt(primerNumero);
        return  raiz;
    }
}
