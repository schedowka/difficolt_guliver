import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("во сколько гулливер больше лилипутов: " );
        int k = scanner.nextInt();

        System.out.println("сколько слоев матрацев: " );
        int m = scanner.nextInt();

        int matras = (k*k)*m;
        System.out.println("сколько надо гулливеру: " + matras);

    }

}