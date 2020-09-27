/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.upc.calduladora;

import javax.ejb.Stateless;

@Stateless
public class CalcuBean implements CalcuBeanLocal {

    @Override
    public Integer suma(int valor1, int valor2) {
        return valor1 + valor2;
    }
    public Integer resta(int valor1, int valor2) {
        return valor1 - valor2;
    }
    public Integer multiplicacion(int valor1, int valor2) {
        return valor1 * valor2;
    }
    public Integer divicion(int valor1, int valor2) {
        return valor1 / valor2;
    }
    public Integer modulo(int valor1, int valor2) {
        return valor1 % valor2;
    }
}
