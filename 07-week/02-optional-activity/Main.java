import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el tamaño del vector: ");
            int count = scanner.nextInt();

            int[] vectorA = new int[count];
            int[] vectorB = new int[count];
            int[] vectorSuma = new int[count];
            int[] vectorResta = new int[count];

            // Llenar vectores y operaciones en un solo ciclo
            for (int i = 0; i < count; i++) {
                vectorA[i] = i + 1;
                vectorB[i] = vectorA[i] * 2;

                vectorSuma[i] = vectorA[i] + vectorB[i];
                vectorResta[i] = vectorA[i] - vectorB[i];
            }

            // Mostrar Vector A
            System.out.println("\nVector A:");
            for (int i = 0; i < count; i++) {
                System.out.print(vectorA[i] + " ");
            }

            // Mostrar Vector B
            System.out.println("\n\nVector B:");
            for (int i = 0; i < count; i++) {
                System.out.print(vectorB[i] + " ");
            }

            // Mostrar SUMA
            System.out.println("\n\nVector Suma (A + B):");
            for (int i = 0; i < count; i++) {
                System.out.print(vectorSuma[i] + " ");
            }

            // Mostrar RESTA
            System.out.println("\n\nVector Resta (A - B):");
            for (int i = 0; i < count; i++) {
                System.out.print(vectorResta[i] + " ");
            }
        } finally {
            scanner.close();
        }
    }
}