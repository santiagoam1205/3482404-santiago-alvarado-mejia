import javax.swing.*;

public class ejercicio_6 {
    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos votos va a registrar?"));
        String [] votos= new String[n];
        int votosA=0;
        int votosB=0;
        int votosC=0;


        for (int i=0; i< votos.length;i++){
            votos[i] = JOptionPane.showInputDialog("Ingrese el voto " + (i + 1) + " (A, B o C)").toUpperCase();
        }

    }
}
