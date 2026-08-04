import javax.swing.*;

public class ejercicio_2 {
    public static void main(String[] args) {

        int n= Integer.parseInt(JOptionPane.showInputDialog("cuantos estudiantes hay"));
        double [] notas= new double[n];
        double suma= 0;
        double promedio;

        for (int i=0; i<n;++i){
           notas[i]=Double.parseDouble(JOptionPane.showInputDialog("ingrese la nota del estudiante " + (i+1) + " (0.0 a 5.0)"));
           suma += notas[i];
        }
        promedio= suma/n;
        if (promedio>3.0){
            JOptionPane.showMessageDialog(null,"promedio del curso " + promedio + "\nEstado Reprobado");
        }else {
            JOptionPane.showMessageDialog(null,"Promedio del curso " + promedio + "\nEstado Aprobado");
        }
    }
}
