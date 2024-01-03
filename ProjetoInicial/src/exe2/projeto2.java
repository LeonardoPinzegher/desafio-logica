package exe2;
import java.util.Scanner;

public class projeto2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        part(147, 65);
    }

    static void part(int x, int y) {
        int result = x - y;
        System.out.println("Resultado: " + result);

        if (result < 10) {
            System.out.println("Você é Ferro");
        } else if (result >= 11 && result <= 20) {
            System.out.println("Você é Bronze");
        } else if (result >= 21 && result <= 50) {
            System.out.println("Você é Prata");
        } else if (result >= 51 && result <= 80) {
            System.out.println("Você é Ouro");
        } else if (result >= 81 && result <= 90) {
            System.out.println("Você é Diamante");
        } else if (result >= 91 && result <= 100) {
            System.out.println("Você é Lendario");
        } else {
            System.out.println("Você é Imortal");
        }
    }
}
