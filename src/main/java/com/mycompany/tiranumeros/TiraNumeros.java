/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tiranumeros;

import java.time.LocalDate;

/**
 *
 * @author relic
 */
public class TiraNumeros {

    public static void main(String[] args) {
        int numeroInicio = 5;
        int numeroFin = 14;

        boolean imprimirPares = LocalDate.now().getDayOfMonth() % 2 == 0;

        while (numeroInicio <= numeroFin) {
            boolean numeroInicioEsPar = numeroInicio % 2 == 0;
            if (imprimirPares == true && numeroInicioEsPar == true) {
                System.out.println(numeroInicio);
            }
            if (imprimirPares == false && numeroInicioEsPar == false) {
                System.out.println(numeroInicio);
            }
            numeroInicio = numeroInicio + 1;
        }
    }
}
