package ejercicioderepaso;

import java.util.Scanner;

public class Pantalla {

    Scanner teclado = new Scanner(System.in);

    public static void menuPajarito(){
        System.out.println("************Pajarito***********");
        System.out.println("1.- Pone pajarito");
        System.out.println("2.- Quitar pajarito");
        System.out.println("3.- Mostar datos");
        System.out.println("4.- FIN");
    }
    public static int opcion(){
        Scanner teclado=new Scanner(System.in);
        int op;
        System.out.println("Dame una opcion");
        op=teclado.nextInt();
        return op;
    }

    public void muestraAscii() {
        for (int x = 21; x < 255; x++) {
            System.out.println("El codigo ASCII de " + x + " es " + (char) x);
        }
    }
     public static void mensaje(String mensaje) {
        //Muestra por pantalla la cadena de mensaje
        System.out.print(mensaje);
    }

    public static String pideString(String mensaje) {
        Scanner teclado=new Scanner (System.in);
        String cadena;
        System.out.print(mensaje);
        cadena = teclado.nextLine();
        return cadena;
    }
    public static double pideDouble(String mensaje){
        Scanner teclado=new Scanner(System.in);
        double plus;
        System.out.println(mensaje);
        plus = teclado.nextDouble();
        return plus;
    }
    
//Al ser un metodo static ya no tenemos que crear un objeto para poder usarlo.

    public static int pideEntero(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        int entero;
        System.out.print(mensaje);
        entero = teclado.nextInt();
        return entero;
    }

    public static int pideEnteroPositivo(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        int enteroPositivo;
        System.out.println(mensaje);
        enteroPositivo = teclado.nextInt();
        while (enteroPositivo <= 0) {
            System.out.println("Numero incorecto, introducelo de nuevo");
            enteroPositivo = teclado.nextInt();
        }
        return enteroPositivo;

    }

    public static int pideEnteroPositivo1(String mensajeCorrecto, String mensajeError) {
        int enteroPositivo;
        enteroPositivo = pideEntero(mensajeCorrecto);
        while (enteroPositivo < 0) {
            enteroPositivo = pideEntero(mensajeError);
        }
        return enteroPositivo;

    }

//    public static String pideCadena(String mensaje) {
//        String cadena;
//        System.out.println(mensaje);
//        Scanner teclado = new Scanner(System.in);
//        cadena = teclado.nextLine();
//        return cadena;
//
//    }

    public static int pideEnteroConLimites(int limMax, int limMin, String mensajeCorrecto, String mensajeError) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println(mensajeCorrecto);
        numero = teclado.nextInt();
        while (numero < limMin || numero > limMax) {
            System.out.println(mensajeError);
            numero = teclado.nextInt();
        }
        return numero;
    }

}
