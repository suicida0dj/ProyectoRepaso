import java.util.Scanner;

public class Input {
    public static String getString(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
    public static char getChar(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine().charAt(0);
    }
    public static int getInteger(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        while (!sc.hasNextInt()) {
            System.out.println("Error. Tienes que introducir un numero entero.");
            sc.next();
        }
        return sc.nextInt();
    }
    public static int getInteger(){
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("Error. Tienes que introducir un numero entero.");
            sc.next();
        }
        return sc.nextInt();
    }


    public static int getConfirmacion(String message){

    //    System.out.print("\033[H\033[2J");

        System.out.print("has seleccionado: "+ message + ". Presiona 1 para continuar, 2 para volver.");
        Scanner sc = new Scanner(System.in);
        int num = getInteger();
        while(num!=1 && num!=2) {
            System.out.println("Error. Tienes que introducir un numero entre 1 y 2.");
            num = sc.nextInt();
        }
        return num;
    }

}