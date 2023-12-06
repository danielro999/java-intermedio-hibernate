package menu;

import static consultas.Consultas.*;

import java.util.Scanner;

public class Menu {
    public static void menuPrincipal (){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Eligir opcion: \n" +
                    "1 - Ver liga \n" +
                    "2 - Insertar equipo \n" +
                    "3 - Enfrentar dos equipos \n" +
                    "4 - Eliminar equipo \n" +
                    "5 - salir del programa");
            opcion = sc.nextInt();
            switch (opcion){
                case 1 :
                    imprimirEquipos();
                    break;
                case 2:
                    ingresarEquipo();
                    break;
                case 3:
                    enfretarEquipos();
                    break;
                case 4:
                    eliminarEquipo();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("elegir una de las opciones entre el 1 y el 5");
                    break;
            }
        }while (opcion != 5);{
            System.out.println("Fin");

        }
    }
}
