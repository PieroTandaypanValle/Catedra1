package Registro;

import java.util.Scanner;

public class Menu {
    public static void imprimir_menu() {
        System.out.println("\n\tMenu: ");
        System.out.println("0.-Salir: ");
        System.out.println("1.-Registrar Medicals: ");
        System.out.println("2.-Registrar Pacients: ");
        System.out.println("3.-Registrar Questions: ");
        System.out.println("4.-Registrar Answers: ");
        System.out.println("5.-Registrar Tests: ");
        System.out.println("6.-Registrar Results: ");
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
                    RegistroMedical ven = new RegistroMedical();
                    ven.setVisible(true);
                    ven.setLocationRelativeTo(null);
                    break;
                case 2:
                    RegistroPacients ven2 = new RegistroPacients();
                    ven2.setVisible(true);
                    ven2.setLocationRelativeTo(null);
                    break;
                case 3:
                    RegistroQuestions ven3 = new RegistroQuestions();
                    ven3.setVisible(true);
                    ven3.setLocationRelativeTo(null);
                    break;
                case 4:
                    RegistroAnswers ven4 = new RegistroAnswers();
                    ven4.setVisible(true);
                    ven4.setLocationRelativeTo(null);
                    break;
                case 5:
                    RegistroTests ven5 = new RegistroTests();
                    ven5.setVisible(true);
                    ven5.setLocationRelativeTo(null);
                    break;
                case 6:
                    RegistroResults ven6 = new RegistroResults();
                    ven6.setVisible(true);
                    ven6.setLocationRelativeTo(null);
                    break;    
                    
                default:
                    System.out.println("Error, opción fuera de rango");
            }
        } while (salir_menu);
        System.out.println("\nAcabas de salir del programa\n");
        Sc.close();
    }
}