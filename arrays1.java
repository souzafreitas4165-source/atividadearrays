import java.util.Scanner;
public class arrays1 {
    public static void main(String[] args) {
        Scanner pa = new Scanner(System.in);

        double[] notas = new double[10];
        double maiorNota = 0;

        for (int i = 0; i < notas.length; i++){
            System.out.println("digite as notas dos alunos: " + (i + 1));
            notas[i] = pa.nextDouble();
            
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
        }
        }
    
        System.out.println("Maior nota foi: " + maiorNota);
        
    }
}