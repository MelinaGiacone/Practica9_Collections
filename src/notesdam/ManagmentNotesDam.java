package notesdam;

import java.util.Scanner;

public class ManagmentNotesDam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NotesDam managment = new NotesDam();

        while (true) {
            System.out.println("Menú de opciones:");
            System.out.println("1. Introducir notas");
            System.out.println("2. Calcular suma de notas");
            System.out.println("3. Calcular media");
            System.out.println("4. Salir");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    while (true) {
                        System.out.println("Introduce las notas de los alumnos ( introduce -1 para finalizar) :");
                        double nota = sc.nextDouble();
                        if (nota == -1) {
                            break;
                        }
                        managment.introdueixValors(nota);
                    }
                    break;
                case 2:
                    System.out.println("La suma de las notas con iterator : " + managment.sumaValorsConIterator());
                    System.out.println("La suma de las notas sin iterator : " + managment.sumaValorsSenseIterator());
                    break;
                case 3:
                    System.out.println("La nota media es de: " + String.format("%.2f", managment.calcularMedia()));
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción correcta.");
            }
        }
    }
}
