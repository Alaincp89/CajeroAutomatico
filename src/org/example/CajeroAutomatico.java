package org.example;

import java.util.Scanner;

public class CajeroAutomatico {

    static int saldo = 300000, retirar, depositar;
    static Scanner s = new Scanner(System.in);

    public static void main (String[] args){
        int opciones;
        do {
            opciones = menu();
            switch (opciones){
                case 1:
                    consultarSaldo();
                    break;
                    case 2:
                        retirarSaldo();
                        break;
                            case 3:
                                depositarSaldo();
                                break;
                                    default:
                                        salir();
            }
        }while (opciones !=4);
    }
    public static int menu(){
        int opciones = 0;
        System.out.println("Bienvenido al Cajero Automatico");
        System.out.println("-------------------------------------");
        System.out.println("Presione 1 para consultar saldo");
        System.out.println("Presione 2 para retirar saldo");
        System.out.println("Presione 3 para depositar saldo");
        System.out.println("Presione 4 para salir del Menu");
        System.out.println("-------------------------------------");
        System.out.println("Por favor seleccione la operacion a realizar: ");
        opciones = s.nextInt();

        return opciones;
    }

    public static void consultarSaldo(){

        System.out.println("Saldo: $"+saldo);
        System.out.println("*********************");

    }

    public static void retirarSaldo(){
        System.out.println("\nIngrese la cantidad de dinero que desea retirar: $");
        retirar = s.nextInt();
        if(saldo>=retirar){
            saldo = saldo - retirar;
            System.out.println("\nTransaccion Exitosa");
        }else{
            System.out.println("\nFondos Insuficientes");
        }
        System.out.println("*********************");
    }

    public static void depositarSaldo(){

        System.out.println("\nIngrese la cantidad que desea depositar");
        depositar = s.nextInt();
        saldo = saldo + depositar;

        System.out.println("\nTransaccion Exitosa");
        System.out.println("*********************");
    }

    public static void salir(){

        System.out.println("Gracias po su visita");

        System.exit(0);
    }
}
