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
public class CalculosDiscretos {
    
    //Metodo encargado de calcular el factorial del numero de entrada.
    public int factorial(int number) {
        int factor = 1;
        for (int i = 1; i <= number; i++) {
            factor = factor * i;
        }
        return factor;
    }
    
    public int permutation(int numberN, int numberR) {
        int result = factorial(numberN) / factorial(numberN - numberR);
        return result ;
    }
    
    public int combination(int numberN, int numberR) {
        int result = factorial(numberN) / (factorial(numberN - numberR) * factorial(numberR));
        return result;
    }
}
