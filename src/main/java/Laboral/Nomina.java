/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboral;

/**
 *
 * @author t0x1cx
 */
public class Nomina {

    private static final int SUELDO_BASE[] = {50000, 70000, 90000, 110000, 130000, 150000, 170000, 190000, 210000, 230000};

    public int sueldo(Empleado ep) {

        int sueldo = SUELDO_BASE[ep.getCategoria() - 1] + 5000 * ep.anyos;

        return sueldo;
    }
    
    

}
