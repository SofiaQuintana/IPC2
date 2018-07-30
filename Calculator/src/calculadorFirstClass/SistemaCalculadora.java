/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorFirstClass;

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
                case "+":
                    if (valor2.equalsIgnoreCase("")) {valor2 = "0";}
                    return "" + aritmetica.suma(Double.parseDouble(valor1), Double.parseDouble(valor2));
                case "-":
                    return "" + aritmetica.resta(Double.parseDouble(valor1), Double.parseDouble(valor2));
                case "*":
                    return "" + aritmetica.multiplicacion(Double.parseDouble(valor1), Double.parseDouble(valor2));
                case "/":
                    return "" + aritmetica.division(Double.parseDouble(valor1), Double.parseDouble(valor2));
                case "%":
                    return "" + aritmetica.residuo(Integer.parseInt(valor1), Integer.parseInt(valor2));
                case "^":
                    return "" + aritmetica.potencia(Double.parseDouble(valor1), Double.parseDouble(valor2));
                case "#":
                    return "" + aritmetica.raiz(Double.parseDouble(valor1));
                case "C":
                    return "" + discreteCalc.combination(Integer.parseInt(valor1), Integer.parseInt(valor2));
                case "P":
                    return "" + discreteCalc.permutacion(Integer.parseInt(valor1), Integer.parseInt(valor2));
                case "!":
                    return "" + discreteCalc.factorial(Integer.parseInt(valor1));
            }     
        return "";
    }

}
