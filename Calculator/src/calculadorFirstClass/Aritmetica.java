
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorFirstClass;

/**
 *
 * @author alfonso
 */
public class Aritmetica {

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

    public double residuo(double numerador, double denominador) {
        return (numerador % denominador);
    }

    public int potencia() {
        return 0;
    }

    public double raiz(double primerNumero) {
        double raiz = Math.sqrt(primerNumero);
        return  raiz;
    }
}
