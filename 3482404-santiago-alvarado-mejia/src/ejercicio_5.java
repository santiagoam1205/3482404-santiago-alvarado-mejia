import javax.swing.*;

public class ejercicio_5 {
    public static void main(String[] args) {

        int n= Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos numeros va ingresar"));
        int [] numeros = new int[n];

        for (int i= 0; i < numeros.length; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero" + (i + 1) + ": "));
        }
    }
}
