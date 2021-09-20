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
public class CalculaNóminas {

//    Crear la clase CalculaNominas con un programa principal que:
//4.1. Cree el empleado: “James Cosling”, dni=32000032G, sexo=’M’, categoría=4,
//años=7
//4.2. Cree el empleado: “Ada Lovelace”, dni=32000031R, sexo=’F’
//4.3. Declare un método privado escribe que reciba los valores de los dos
//empleados e imprima sus atributos y el sueldo que cada uno gana.
//4.4. Haga una llamada en el programa principal a ese método.
//4.5. Incremente los años trabajados del segundo empleado y haga que la categoría
//del primero sea 9.
//4.6. Imprima de nuevo ambos empleados y su sueldo.
    public static void main(String[] args) {
        System.out.println("\n");
        try {
            Empleado E2 = new Empleado(4, 7, "James Cosling", "32000032G", 'M');
            Empleado E1 = new Empleado("Ada Lovelace", "32000031R", 'F');
            escribe(E1, E2);
            E2.incrAnyo();
            E2.incrAnyo();
            E1.setCategoria(9);
            escribe(E1, E2);
            
        } catch (DatosNoCorrectosException e) {
            System.out.println(e);
        }
            

       

    }

    private static void escribe(Empleado E1, Empleado E2) {
        Nomina n = new Nomina();
        E1.imprime();
        System.out.println("SUELDO: " + n.sueldo(E1));
        E2.imprime();
        System.out.println("SUELDO: " + n.sueldo(E2));

    }

}
