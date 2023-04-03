package lab2 ;
import java.util.Scanner;

public class controleTemperature {
    public static void main(String[] args) {
        final int MAX_TEMP = 7;
        float temperature;
        float sommeTemp = 0;
        float moyenneTemp;
        try (Scanner sc = new Scanner(System.in)) {
            for (int nombreTemperature = 0; nombreTemperature < MAX_TEMP; nombreTemperature++) {
                System.out.println("Veuillez saisire une température");
                temperature = sc.nextFloat();
                sommeTemp += temperature;
            }
        }
        moyenneTemp = sommeTemp / MAX_TEMP;
        System.out.println("La moyenne des températures est " + moyenneTemp);
    }
}
