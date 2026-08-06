import javax.swing.*;

public class ejercicio_5 {
    public static void main(String[] args) {

        int n= Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos numeros va ingresar"));
        int [] numeros = new int[n];

        for (int i= 0; i < numeros.length; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero" + (i + 1) + ": "));
        }
        int buscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que desea buscar: "));

        boolean encontrado = false;
        String mensaje ="";

        for (int i = 0; i< numeros.length; i++) {
            if (numeros[i] == buscar) {
                encontrado = true;
                mensaje += "Encontrado en la posicion: " + i + "\n";
            }

        }
        if (encontrado){
            JOptionPane.showMessageDialog(null,mensaje);
        }else {
            JOptionPane.showMessageDialog(null,"el numero no fue encontrado.");
        }
    }
}
