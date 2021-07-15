package Semana6;

/**
 * Nombre del programa: 
 * Descripcion: Una empresa de teléfonos quiere calcular el valor total de la llamada de cada uno de sus N clientes,  de la siguiente forma:
    - Toda llamada que dure hasta 3 minutos y sea de clase A, cuesta ¢300.
    - Cada minuto adicional de llamadas de clase A, a partir de los primeros 3 cuesta ¢150.
    - Si la llamada es de clase B, cuesta ¢400 por minuto, no importa su duración.
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ejp7w6 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{ 
        double valorTotalLlamada=0;
        int clientes;
        double totalGeneral=0;

        int minutos;
        int clase;
        int countMinutosExtras=0;
        int clientePagoMas=0;

        escribir.println("Digite la cantidad de clientes por analizar:");
        clientes = Integer.parseInt(leer.readLine());

        for(int count=1; count<=clientes; count++){
            escribir.println("Digite 1 si el cliente es Clase Básica o 2 si es Clase Preferencial:");
            clase = Integer.parseInt(leer.readLine());

            escribir.println("Digite los minutos consumidos de la llamada:");
            minutos = Integer.parseInt(leer.readLine());

            if(minutos<=5 && clase == 1){
                valorTotalLlamada = 500;
            } else if (minutos>8){
                for(int countM=5; countM<=minutos; countM++){
                    countMinutosExtras++;
                }
                valorTotalLlamada = 500 + (countMinutosExtras*250);
            } else if (clase == 2){
                valorTotalLlamada = minutos*400;
            }

            escribir.println("El valor total de la llamada es de " +valorTotalLlamada+ " colones");
            
            totalGeneral= totalGeneral+valorTotalLlamada;

            if (valorTotalLlamada>clientePagoMas){
                clientePagoMas = count;
            }
        }

        escribir.println("El total general de totas las llamadas es de " +totalGeneral);
        escribir.println("El cliente que pago mas es el " + clientePagoMas);
        
    }    
}