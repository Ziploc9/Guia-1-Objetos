package com.company;
import Classes.*;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Rectangulo rectangulo = new Rectangulo( 1.0, 1.0);

        /**--Ej 1--**/
        /*
            System.out.println("Alto: "+rectangulo.getAlto()+" Ancho: "+rectangulo.getAncho());
            System.out.println("Area: "+rectangulo.calcularArea()+" Perimetro: "+rectangulo.calcularPer());
            modificarRectangulo(scan,rectangulo);
            System.out.println("Area: "+rectangulo.calcularArea()+" Perimetro: "+rectangulo.calcularPer());
            verificarRectangulo(rectangulo);
         */

        /**--Ej 2--**/

        /*

            Empleado empleado = new Empleado( "23456345", "Carlos", "Gutierrez", 25000);
            Empleado empleado1 = new Empleado("34234123", "Ana", "Sanchez", 27500);

            empleado.mostrarEmpleado();
            empleado1.mostrarEmpleado();

            System.out.println(empleado.getNombre()+" "+empleado.getApellido()+" genera por el aumento $"+empleado.salarioAnual(empleado.aumentoSalario(15))+" Anual");
         */

        /**--Ej 3--**/
    /*
        Venta venta = new Venta("149", "Laptop azul y rosa 950 de ram", 5, 95230);
        venta.verItem();
     */

        /**--Ej 4--**/

        Banco banco = new Banco("Nacion","204935", "UTN",15000);
        int option=0;

        while(option !=9) {
            menu();
            System.out.println("Ingrese opcion: ");
            option = scan.nextInt();
            switch (option) {


                case 1:
                    System.out.println("Ingresa la plata wachin: ");
                    deposito(scan, banco);
                    break;
                case 2:
                    System.out.println("Saca dinero: ");
                    credito(scan, banco);
                    break;
                case 3:
                    banco.mostrarCuenta();
                    break;

                case 4:
                    option = 9;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }
    }

    public static void modificarRectangulo(Scanner scan, Rectangulo rec){
        rec.setAncho(scan.nextDouble());
        rec.setAlto(scan.nextDouble());
    }
    public  static void verificarRectangulo(Rectangulo rec){
        int bool = rec.verification();

        if (bool != 1) {
            System.out.println("Modificaste el valor Chinwerwencha");
        }else {
            System.out.println("Muy bien, Ancho: " + rec.getAncho() + " Alto: " + rec.getAlto());
        }
    }

    public static void menu(){
        System.out.println("1. Depositar dinero en cuenta");
        System.out.println("2. Saca dinero negro");
        System.out.println("3. Ver dinero en cuenta");
        System.out.println("4. Salir");
    }

    public static double deposito(Scanner scan, Banco banco){
        double cuenta = banco.credito(scan.nextDouble());
        return cuenta;
    }
    public static void credito(Scanner scan, Banco banco){

        double monto = banco.debito(scan.nextDouble());
        if ( monto< 0){
            System.out.println("Fondos insuficientes.");

        }else{
            System.out.println("Exito al extraer dinero de su cuenta.");
        }
    }


}
