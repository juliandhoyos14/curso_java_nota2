package Matriz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CrudMatrices {

    public static void main(String[] args) {
        //Columna 0 = Numero de identificacion
        //Columna 1 = Tipo de Identificacion
        //Columna 2 = Nombres
        //Columna 3 = Apellidos
        //Columba 4 = Edad
        /*
        * Hacer un CRUD con una matriz donde pueda manipular la información de N personas.
        * La cantidad de personas será digitada por el usuario. Las personas tendrán:
        * número de identificación, tipo de identificación, nombre, apellidos y edad.
        * CRUD: Create, Read, Update and Delete
        * Para consultar puede ser por el número de identificación o mostrar todas las personas.
        * */

        Scanner sc = new Scanner(System.in);
        int opcion;
        int cantidadPersonas = 0;
        int rows = 0;
        int columns = 0;
        boolean salir = false;
        boolean ingresoCantidad = false;
        boolean arrayLleno = false;
        boolean borrarPersona;
        boolean personaConsultada;
        boolean personaActualizar;
        String arrayPersonas[][] = null;
        String dniPersonaBorrar = null;
        String dniPersonaActualizar = null;
        String dniPersonaConsultar = null;


        while (!salir) {

            System.out.println("1. Ingresar cantidad de personas");
            System.out.println("2. Ingresar una persona");
            System.out.println("3. Borrar una persona");
            System.out.println("4. Actualizar una persona");
            System.out.println("5. Consultar una persona");
            System.out.println("6. Imprimir todos los registros");
            System.out.println("7. Salir");

            try {

                System.out.println("Digita una de las opciones");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        if (!ingresoCantidad) {
                            System.out.println("Cual es la cantidad de personas que puede manipular");
                            cantidadPersonas = sc.nextInt();
                            rows = cantidadPersonas;
                            columns = 5;
                            arrayPersonas = new String[rows][columns];
                            for (int i = 0; i < rows; i++) {
                                for (int j = 0; j < columns; j++) {
                                    arrayPersonas[i][j] = null;
                                }
                            }
                            ingresoCantidad = true;
                        } else {
                            System.out.println("La cantidad de personas ya fue definida = " + cantidadPersonas);
                        }
                        break;
                    case 2:
                        if (arrayPersonas != null) {
                            int rowIngresar = 0;
                            arrayLleno = true;
                            for (int i = 0; i < rows; i++) {
                                if(arrayPersonas[i][0] == null) {
                                    arrayLleno = false;
                                    rowIngresar = i;
                                    break;
                                }
                            }
                            if (!arrayLleno) {
                                System.out.println("Ingrese el numero de Identificacion");
                                arrayPersonas[rowIngresar][0] = new String(sc.next());
                                System.out.println("Ingrese el tipo de identificacion");
                                arrayPersonas[rowIngresar][1] = new String(sc.next());
                                System.out.println("Ingrese los nombres");
                                arrayPersonas[rowIngresar][2] = new String(sc.next());
                                System.out.println("Ingrese los apellidos");
                                arrayPersonas[rowIngresar][3] = new String(sc.next());
                                System.out.println("Ingrese la edad");
                                arrayPersonas[rowIngresar][4] = new String(sc.next());
                            } else {
                                System.out.println("No puede ingresar más personas, la matriz se encuentra llena");
                            }
                        } else {
                            System.out.println("Primero debe ingresar la cantidad de personas para inicializar la matriz");
                        }
                        break;
                    case 3:
                        if (arrayPersonas != null) {
                            System.out.println("Ingrese el numero de Identificacion de la persona a borrar");
                            dniPersonaBorrar = new String(sc.next());
                            int rowBorrar = 0;
                            borrarPersona = false;
                            for (int i = 0; i < rows; i++) {
                                if(arrayPersonas[i][0] != null && arrayPersonas[i][0].equals(dniPersonaBorrar)) {
                                    rowBorrar = i;
                                    borrarPersona = true;
                                    break;
                                }
                            }
                            if (borrarPersona) {
                                arrayPersonas[rowBorrar][0] = null;
                                arrayPersonas[rowBorrar][1] = null;
                                arrayPersonas[rowBorrar][2] = null;
                                arrayPersonas[rowBorrar][3] = null;
                                arrayPersonas[rowBorrar][4] = null;
                                System.out.println("Se elimino la persona con documento " + dniPersonaBorrar);
                            } else {
                                System.out.println("No se encontro ninguna persona para borrar con el documento " + dniPersonaBorrar);
                            }
                        } else {
                            System.out.println("Primero debe ingresar la cantidad de personas para inicializar la matriz");
                        }
                        break;
                    case 4:
                        if (arrayPersonas != null) {
                            System.out.println("Ingrese el numero de Identificacion de la persona a actualizar");
                            dniPersonaActualizar = new String(sc.next());
                            int rowActualizar = 0;
                            personaActualizar = false;
                            for (int i = 0; i < rows; i++) {
                                if(arrayPersonas[i][0] != null && arrayPersonas[i][0].equals(dniPersonaConsultar)) {
                                    rowActualizar = i;
                                    personaActualizar = true;
                                    break;
                                }
                            }
                            if (personaActualizar) {
                                System.out.println("Datos de la persona a actualizar");
                                System.out.print("------------------------------");
                                System.out.println("\n");
                                System.out.println("Numero de identificacion: " + arrayPersonas[rowActualizar][0]);
                                System.out.println("Tipo de Identificacion: " + arrayPersonas[rowActualizar][1]);
                                System.out.println("Nombres: " + arrayPersonas[rowActualizar][2]);
                                System.out.println("Apellidos: " + arrayPersonas[rowActualizar][3]);
                                System.out.println("Edad: " + arrayPersonas[rowActualizar][4]);

                                System.out.println("Ingrese el nuevo numero de Identificacion");
                                arrayPersonas[rowActualizar][0] = new String(sc.next());
                                System.out.println("Ingrese el nuevo tipo de identificacion");
                                arrayPersonas[rowActualizar][1] = new String(sc.next());
                                System.out.println("Ingrese los nuevos nombres");
                                arrayPersonas[rowActualizar][2] = new String(sc.next());
                                System.out.println("Ingrese los nuevos apellidos");
                                arrayPersonas[rowActualizar][3] = new String(sc.next());
                                System.out.println("Ingrese la nueva edad");
                                arrayPersonas[rowActualizar][4] = new String(sc.next());
                                System.out.println("Persona actualizada exitosamente");
                            } else {
                                System.out.println("No se encontro ninguna persona con el documento " + dniPersonaActualizar + "para actualizar");
                            }
                        } else {
                            System.out.println("Primero debe ingresar la cantidad de personas para inicializar la matriz");
                        }
                        break;
                    case 5:
                        if (arrayPersonas != null) {
                            System.out.println("Ingrese el numero de Identificacion de la persona a consultar");
                            dniPersonaConsultar = new String(sc.next());
                            int rowConsultar = 0;
                            personaConsultada = false;
                            for (int i = 0; i < rows; i++) {
                                if(arrayPersonas[i][0] != null && arrayPersonas[i][0].equals(dniPersonaConsultar)) {
                                    rowConsultar = i;
                                    personaConsultada = true;
                                    break;
                                }
                            }
                            if (personaConsultada) {
                                System.out.println("Datos de la persona consultada");
                                System.out.print("------------------------------");
                                System.out.println("\n");
                                System.out.println("Numero de identificacion: " + arrayPersonas[rowConsultar][0]);
                                System.out.println("Tipo de Identificacion: " + arrayPersonas[rowConsultar][1]);
                                System.out.println("Nombres: " + arrayPersonas[rowConsultar][2]);
                                System.out.println("Apellidos: " + arrayPersonas[rowConsultar][3]);
                                System.out.println("Edad: " + arrayPersonas[rowConsultar][4]);
                            } else {
                                System.out.println("No se encontro ninguna persona con el documento " + dniPersonaConsultar);
                            }
                        } else {
                            System.out.println("Primero debe ingresar la cantidad de personas para inicializar la matriz");
                        }
                        break;
                    case 6:
                        if (arrayPersonas != null) {
                            System.out.println("NroID\t|\tTipoID\t|\tNombres\t|\tApellidos\t|\tEdad\t|");
                            System.out.print("-----\t|\t------\t|\t-------\t|\t---------\t|\t----\t|");
                            System.out.println("\n");
                            for (int i = 0; i < rows; i++) {
                                for (int j = 0; j < columns; j++) {
                                    System.out.print(arrayPersonas[i][j] + "\t|\t");
                                }
                                System.out.println("\n");
                            }
                        } else {
                            System.out.println("Primero debe ingresar la cantidad de personas para inicializar la matriz");
                        }
                        break;
                    case 7:
                        salir = true;
                        break;
                    default:
                        System.out.println("La opcion es solo numeros entre 1 y 7");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingresaste un valor errado, vuelve a intentar");
                sc.next();
            }
        }
    }
}
