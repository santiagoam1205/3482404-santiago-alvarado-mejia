import javax.swing.*;

public class ejercicio_4 {
    public static void main(String[] args) {

        int n= Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas temperaturas vas a registrar"));
        int [] temperaturas= new int[n];

        for (int i=0; i<n; ++i){
            temperaturas [i]= Integer.parseInt(JOptionPane.showInputDialog("ingrese la temperatura " + (i + 1) + ": "));

        }

        String resultado="";

        for (int i=0; i < temperaturas.length; i++){
            if (temperaturas[i]<10){
                resultado += temperaturas [i] + "°C - frio\n";
            } else if (temperaturas[i] <= 25){
                resultado += temperaturas[i] + "°C - templado\n";
            }else {
                resultado += temperaturas[i] + "°C - templado\n";
            }
        }
    }
}
