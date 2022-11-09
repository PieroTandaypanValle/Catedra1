/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registro;
import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args){
        Scanner e=new Scanner(System.in);
        int r;
        System.out.println("Menu: ");
        System.out.println("1.-Registrar Users: ");
        System.out.println("2.-Registrar Pacients: ");
        System.out.println("3.-Salir: ");
        r=e.nextInt();
        switch(r){
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
            case 3:
                break;    
        }
    }
    
}
