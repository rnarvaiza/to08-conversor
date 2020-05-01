import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
       muestraMenu menu = new muestraMenu();
       menu.muestraMenu();

    }
}

class muestraMenu extends Conversor{
    public void muestraMenu() throws InputMismatchException {
        Scanner s = new Scanner(System.in);
        boolean continuar=true;
        int opcion;

        do{
            System.out.println("");
            System.out.println("Conversor de divisas");
            System.out.println("");
            System.out.println("#1 Introduce divisa.");
            System.out.println("#2 Modifica divisa.");
            System.out.println("#3 Muestra divisa.");
            System.out.println("#4 Elimina divisa.");
            System.out.println("#5 Convierte divisa.");
            System.out.println("#6 Salir.");
            try {
                do{
                    System.out.println(" ");
                    System.out.println("Pulse para acción.");
                    opcion=s.nextInt();
                } while (opcion <1 || opcion > 6);

                switch (opcion){
                    case 1:
                        introduceDivisa();
                        break;

                    case 2:
                        modificaDivisa();
                        break;

                    case 3:
                        muestraDivisa();
                        break;

                    case 4:
                        eliminaDivisa();
                        break;

                    case 5:
                        convierteDivisa();
                        break;

                    case 6:
                        continuar=false;

                        break;
                }
            } catch (InputMismatchException e){
                System.out.println(e.getMessage());
                e.getStackTrace();
            }
        }while (continuar);
    }
}