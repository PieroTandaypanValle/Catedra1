package ventana;

import java.util.*;

public class principal {
    public static void imprimir_menu() {
        System.out.println("\n\t<<Menu>>");
        System.out.println("0.- Salir del Programa");
        System.out.println("1.- Ingresar Paciente");
        System.out.println("2.- Realizar Formulario");
        System.out.println("3.- Actualizar Formulario");
        System.out.println("4.- Guardar");
    }

    public static void main(String[] args) {
        /*
         * ventana v1 = new ventana();
         * v1.setVisible(true); // Hacemos visible la ventana
         */
        Scanner Sc = new Scanner(System.in);
        boolean salir_menu = true;
        do {
            imprimir_menu();
            System.out.print("\nSeleccione una de las opciones del menu: ");
            int opcion = Sc.nextInt();
            switch (opcion) {
                case 0:
                    salir_menu = false;
                    break;
                case 1:
                    System.out.println("\t <Igresar Paciente>");
                    break;
                case 2:
                    System.out.println("\t <Realizar Formulario>");
                    break;
                case 3:
                    System.out.println("\t <Actualizar Formulario>");
                    break;
                case 4:
                    System.out.println("\t <Guardar>");
                    break;
                default:
                    System.out.println("Error, opción fuera de rango");
            }
        } while (salir_menu);
        System.out.println("\nAcabas de salir del programa\n");
        Sc.close();
    }
}