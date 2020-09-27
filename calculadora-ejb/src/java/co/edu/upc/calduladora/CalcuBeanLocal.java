/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.upc.calduladora;

import javax.ejb.Local;

/**
 *
 * @author HOGAR
 */
@Local
public interface CalcuBeanLocal {
    Integer suma(int valor1, int valor2);
    Integer resta(int valor1, int valor2);
    Integer multiplicacion(int valor1, int valor2);
    Integer divicion(int valor1, int valor2);
    Integer modulo(int valor1, int valor2);
}
