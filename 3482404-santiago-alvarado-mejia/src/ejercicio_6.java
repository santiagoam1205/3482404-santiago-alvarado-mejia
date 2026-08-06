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

        for (int i=0;i< votos.length;i++){
            if (votos[i].equals("A")){
                votosA++;
            }else if (votos[i].equals("B")){
                votosB++;
            }else if (votos[i].equals("C")){
                votosC++;
            }
        }

        String resultado="";

        resultado += "candidato A: " + votosA + "\n";
        resultado += "candidato B: " + votosB + "\n";
        resultado += "candidato C: " + votosC + "\n";


        if (votosA> votosB && votosA > votosC) {
            resultado += "Ganador: A";
        } else if (votosB > votosA && votosB > votosC) {
            resultado += "Ganador: B";
        } else if (votosC > votosA && votosC > votosB) {
            resultado += "Ganador: C";
        } else {
            resultado += "Hay un empate.";
        }

        JOptionPane.showMessageDialog(null, resultado);

    }
}
