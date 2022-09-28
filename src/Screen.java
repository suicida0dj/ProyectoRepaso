public class Screen {



    public static void showText(String message){
        System.out.println(message);
    }

    public static void wellcomeMessage(){

        for (int i = 0 ; i <12 ; i ++){
            for (int j = 0 ; j < 44; j++){
                if(i==0 && j == 0){
                    System.out.print("╔");
                }else if(i==0 && j==43) {
                    System.out.print("╗");
                }else if(i==11 && j == 0){
                    System.out.print("╚");
                }else if(i==11 && j==43){
                    System.out.print("╝");
                } else if ((i==0 || i==11)) {
                    System.out.print("═");
                } else if(j==0 || j==43) {
                    System.out.print("║");
                }else if(i==4 && j==12) {
                    System.out.print("Bienvenido al programa de repaso para Java");
                }else if(i==4){
                    System.out.print("");
                }else if(i==5 && j==12) {
                    System.out.print("         Programa creado por Ximo         ");
                }else if(i==5){
                    System.out.print("");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
