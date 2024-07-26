/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author David Barreda
 */
public class Lab2 {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner lea = new Scanner(System.in);

        while (true) {
            System.out.println("---Menu---");
            System.out.println("Seleccione una opción:");
            System.out.println("1 Cadena");
            System.out.println("2 Notas");
            System.out.println("3 Clases");
            System.out.println("4 Salir");

            int opcion = lea.nextInt();

            if ( opcion == 1){
                int contador = 0, numeroletras = 0, conteomaximo = 0;
                char conteo = 0, caractermasrepetido = 0;

                System.out.println("Ingrese la cadena de caracteres: ");
                lea.nextLine();
                String input = lea.nextLine();

                numeroletras = input.length();

                while (conteo < 256) {
                    int conteo1 = 0;
                    int contadorcaracter = 0;

                    while (contadorcaracter < numeroletras) {
                        if (input.charAt(contadorcaracter) == conteo) {
                            conteo1++;
                        }
                        contadorcaracter++;
                    }
                    if (conteo1 > conteomaximo) {
                        conteomaximo = conteo1;
                        caractermasrepetido = conteo;
                    }
                    conteo++;
                }

                System.out.println("El caracter que mas se repite es: " + caractermasrepetido);
                System.out.println("Numero de veces que se repite: " + conteomaximo);

            } else if (opcion == 2) {
                
                int contador = 0;
                int nota1 = 0;
                int notamenor = 101;
                int notamayor = -1;
                double notas = 0;
                double promedio = 0;
        
                System.out.println("Ingrese la cantidad de notas: ");
                int cantidadNotas = lea.nextInt();

                while (contador < cantidadNotas) {
                    System.out.println("Ingrese la nota " + (contador + 1) + " (0 a 100):");
                    nota1 = lea.nextInt();
            
                    while (nota1 < 0 || nota1 > 100) {
                        System.out.println("Nota inválida. Ingrese nuevamente la nota " + (contador + 1) + " (0 a 100):");
                        nota1 = lea.nextInt();
                    }
            
                notas += nota1;
                if (nota1 > notamayor) {
                    notamayor = nota1;
                }
                if (nota1 < notamenor) {
                    notamenor = nota1;
                }
            
                contador++;
        }
        
                promedio = notas / cantidadNotas;

                System.out.printf("Promedio de las notas: %.2f%n", promedio);
                System.out.println("Nota mayor: " + notamayor);
                System.out.println("Nota menor: " + notamenor);
              
                
            } else if (opcion == 3) {
                
                
                //clases 
                System.out.println("Ingrese la fecha en formato (dia,DD/MM)");
                String fecha = lea.next();
                
                if (fecha.length() < 8 || fecha.charAt(2) != ',' || fecha.charAt(3) != ' ') {
                    System.out.println("Error: formato de fecha inválido.");
                    return;
                }
                
                String diaDeLaSemana = fecha.substring(0, 2);
                String parteDeFecha = fecha.substring(4);  
                
                if (!diaDeLaSemana.equals("lu") && !diaDeLaSemana.equals("ma") &&
                    !diaDeLaSemana.equals("mi") && !diaDeLaSemana.equals("ju") &&
                    !diaDeLaSemana.equals("vi")) {
                    System.out.println("Error: día de la semana inválido.");
                    return;
                }
                
                if (parteDeFecha.length() != 5 || parteDeFecha.charAt(2) != '/') {
                        System.out.println("Error: formato de fecha inválido.");
                        return;
                }
                
                String diaStr = parteDeFecha.substring(0, 2);
                String mesStr = parteDeFecha.substring(3, 5);
                
                boolean esDiaValido = esNumero(diaStr);
                boolean esMesValido = esNumero(mesStr);
                
                
                if (!esDiaValido || !esMesValido) {
                    System.out.println("Error: fecha inválida.");
                    return;
                }
              
                
                int dia = convertirASNumero(diaStr);
                int mes = convertirASNumero(mesStr);
                
                if (dia < 1 || dia > 31 || mes < 1 || mes > 12) {
                    System.out.println("Error: fecha inválida.");
                    return;

                
                
                
            } else if (opcion == 4) {
               
                System.out.println("Saliendo");
                break;

            } else {
               
                System.out.println("Opcion invalida");
            }
        }

        lea.close(); 
    }
} 
    
