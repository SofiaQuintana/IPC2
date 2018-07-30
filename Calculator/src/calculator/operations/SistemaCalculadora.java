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
public class SistemaCalculadora {
    CalculosDiscretos discreteCalc = new CalculosDiscretos();
    Aritmetica aritmetica = new Aritmetica();

    public String operar(String signo, String valor1, String valor2) throws Exception{
        System.out.println(valor1);
        System.out.println(valor2);

            System.out.println(signo + " " + valor1 + " " + valor2);
            switch (signo) {
                case "+": //Suma.
                    if (valor2.equalsIgnoreCase("")) {valor2 = "0";}
                    return "" + aritmetica.suma(Double.parseDouble(valor1), Double.parseDouble(valor2));
                case "-": //Resta.
                    return "" + aritmetica.resta(Double.parseDouble(valor1), Double.parseDouble(valor2));
                case "*": //Multiplicacion.
                    return "" + aritmetica.multiplicacion(Double.parseDouble(valor1), Double.parseDouble(valor2));
                case "/": //Division.
                    return "" + aritmetica.division(Double.parseDouble(valor1), Double.parseDouble(valor2));
                case "%": //Residuo.
                    return "" + aritmetica.residuo(Integer.parseInt(valor1), Integer.parseInt(valor2));
                case "^": //Potencia.
                    return "" + aritmetica.potencia(Double.parseDouble(valor1), Double.parseDouble(valor2));
                case "#": //Raiz.
                    return "" + aritmetica.raiz(Double.parseDouble(valor1));
                case "C": //Combinacion.
                    return "" + discreteCalc.combination(Integer.parseInt(valor1), Integer.parseInt(valor2));
                case "P": //Permutacion.
                    return "" + discreteCalc.permutation(Integer.parseInt(valor1), Integer.parseInt(valor2));
                case "!": //Factorial.
                    return "" + discreteCalc.factorial(Integer.parseInt(valor1));
                default: //Default, en caso de que no se cumpla ninguno de los casos anteriores.
                    return "";
            }     
    }

}
