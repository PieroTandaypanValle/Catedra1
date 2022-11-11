package Registro;

import java.util.Scanner;

public class Menu {
    public static void imprimir_menu() {
        System.out.println("\n\tMenu: ");
        System.out.println("0.-Salir: ");
        System.out.println("1.-Registrar Users: ");
        System.out.println("2.-Registrar Pacients: ");
    }

    public static void main(String[] args) {
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
                    RegistroUsers ven = new RegistroUsers();
                    ven.setVisible(true);
                    ven.setLocationRelativeTo(null);
                    break;
                case 2:
                    RegistroPacients ven2 = new RegistroPacients();
                    ven2.setVisible(true);
                    ven2.setLocationRelativeTo(null);
                    break;
                default:
                    System.out.println("Error, opción fuera de rango");
            }
        } while (salir_menu);
        System.out.println("\nAcabas de salir del programa\n");
        Sc.close();
    }
}