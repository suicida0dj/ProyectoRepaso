public class Menu {

     public static void menuInicial(){

         int numMenu, numConfirmacion;

     //    System.out.print("\\033[H\\033[2J");
         Screen.wellcomeMessage();

         do {
             numMenu = Input.getInteger("""
                     Selecciona una de las siguientes opciones\s
                     1.Tipos basicos y operadores en Java\s
                     2.\s
                     3.\s
                     """);


             switch (numMenu){
                 case 1:
                        numConfirmacion=Input.getConfirmacion("Tipos basicos y operadores en Java");
                        if (numConfirmacion==1){
                            menuTiposBasicos();
                            break;
                        }else{
                            break;
                        }
                 case 2:
             }
         }while(numMenu !=0);

     }

     public static void menuTiposBasicos(){
         int numMenu;

     //    System.out.print("\\033[H\\033[2J");
         Screen.showText("");
     }
}
