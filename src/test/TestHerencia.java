
package test;

import domain.Cliente;
import domain.Empleado;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado ("Horacio", 3450.47);
        System.out.println("empleado1 = " + empleado1);
        
        Cliente cliente1 = new Cliente (false, "Joselo", 'M', 18, "Ambato");
        System.out.println("cliente1 = " + cliente1);
    }
}
