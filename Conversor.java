import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Conversor {

    HashMap<String, Double> conversor= new HashMap<String, Double>();
    Scanner readNumbers = new Scanner(System.in);
    Scanner readText = new Scanner(System.in);


    public void introduceDivisa(){
        System.out.println("");
        String divisa="";
        double cambio;
        System.out.println("Por favor, escribe la divisa: ");
        divisa = readText.nextLine();
        System.out.println("A continuación, escriba su valor respecto al euro: ");
        cambio = readNumbers.nextDouble();
        conversor.put(divisa, cambio);
    }

    public void modificaDivisa(){
        String entradaDivisa="";
        double nuevoCambio;
        muestraDivisa();
        System.out.println("");
        System.out.println("Por favor, introduce la divisa que quieres modificar");
        entradaDivisa=readText.nextLine();
        if (conversor.containsKey(entradaDivisa)){
            System.out.println("Por favor, introduce el nuevo cambio: ");
            nuevoCambio=readNumbers.nextDouble();
            conversor.remove(entradaDivisa);
            conversor.put(entradaDivisa, nuevoCambio);
        } else{
            System.out.println("La divisa introducida no se encuentra almacenada.");
        }
    }

    public void muestraDivisa(){
        System.out.println("");
        TreeMap<String, Double> ordenado = new TreeMap<String, Double>(conversor);
        for(Map.Entry<String, Double> entry: conversor.entrySet()){
            System.out.println("La divisa " + entry.getKey() + " tiene un valor de cambio frente al EUR de: " + entry.getValue() + " €.");
            System.out.println("");
        }
    }

    public void eliminaDivisa(){
        String eliminaDivisa;
        muestraDivisa();
        System.out.println("Por favor, elige la divisa que quieres eliminar.");
        eliminaDivisa=readText.nextLine();
        if (conversor.containsKey(eliminaDivisa)){
            conversor.remove(eliminaDivisa);
        } else{
            System.out.println("La divisa introducida no se encuentra almacenada.");
        }
    }

    public void convierteDivisa(){
        String nuevaDivisa;
        double nuevaCantidad;
        muestraDivisa();
        System.out.println("Por favor, elige la divisa a la que quieres cambiar: ");
        nuevaDivisa=readText.nextLine();
        if (conversor.containsKey(nuevaDivisa)){
        } else{
            System.out.println("La divisa introducida no se encuentra almacenada.");
        }
        System.out.println("¿Cuanto dinero quieres cambiar?");
        nuevaCantidad=readNumbers.nextDouble();
        System.out.println(nuevaCantidad + " € son : " + (nuevaCantidad*conversor.get(nuevaDivisa)) + " " + nuevaDivisa);
    }
}


