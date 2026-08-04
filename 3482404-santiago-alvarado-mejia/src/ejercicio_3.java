import javax.swing.*;

public class ejercicio_3 {
    public static void main(String[] args) {

        int n= Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos numeros va ingresar?"));
        int[] numeros= new int[n];
        int salchipapa= 24000;

        for (int i = 0; i <n; i++){
            numeros[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero " + (i +1) + ": "));
        }
        int mayor= numeros[0];
        int menor= numeros[0];

        for (int i=1; i< numeros.length; i++){
            if (numeros[i]> mayor){
                mayor=numeros[i];
            }
            if (numeros[i]<menor){
                menor=numeros[i];
            }
        }
        JOptionPane.showMessageDialog(null,"El numero mayor " + mayor + "\nEl numero menor " + menor);
    }
}
