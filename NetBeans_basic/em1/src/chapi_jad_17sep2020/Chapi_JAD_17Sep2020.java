//ALEJANDRO CHAPI
package chapi_jad_17sep2020;

import java.util.Scanner;

public class Chapi_JAD_17Sep2020 {
  

    //LIMPIAR MATRIZ
    static void LimpiarMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = " ";
            }
        }
    }
    //LLENAR
    static void LlenarTriangulo(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[j][i] = "*";
            }
        }
    }
    //IMPRIMIR MATRIZ
    static void ImprimirMatriz(String[][] matriz) {
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
    }
    //LLENAR MATRIZ 2
    static void Llenarmatriz2(String[][] matriz) {
        int z = 1;
        for (int i = 0; i < matriz.length; i++) {
            z++;
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = "*";
            }
            int a;
            a = (matriz[i].length) - z;
            for (int j = 0; j <= a; j++) {
                matriz[i][j] = " ";
            }
        }
    }

 
    //LIMPIAR MATRIZ2
      static void Limpiarmatriz2(String[][] matriz) {
        for (String[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[j] = " ";
            }
        }
    }

    static void Imprimirmatriz2(String[][] matriz) {
        for (String[] matriz1 : matriz) {
            for (String matriz11 : matriz1) {
                System.out.print("[" + matriz11 + "]");
            }
            System.out.println("");
        }

 

    }
    static void Tercero(int a, int aux) {

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ((i == j) || ((i + j) == aux)) {
                    System.out.print("[" + "*" + "]");
                } else {
                    System.out.print("[" + " " + "]");
                }

            }
            System.out.println();
        }
        

    }


    public static void main(String[] args) {
        int valor, a;
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el valor de la matriz nxn: ");
        valor = in.nextInt();

        int b = valor % 2;

        if (valor == 0 || b == 0 || valor < 9) {
            System.out.println("El valor ingresado debe ser diferente de cero, mayor que 9 y debe ser un número impar: ");
        } else {
            String[][] matrizDatos;
            matrizDatos = new String[valor][valor];
            //EJERCICIO
            System.out.println("SEGUNDO EJERCICIO");
            LimpiarMatriz(matrizDatos);
            LlenarTriangulo(matrizDatos);
            ImprimirMatriz(matrizDatos);
            System.out.println("*********");
            //EJERCICIO
            System.out.println("PRIMER EJERCICIO");
               Limpiarmatriz2(matrizDatos);
            Llenarmatriz2(matrizDatos);
            Imprimirmatriz2(matrizDatos);


            //TERCER EJERCICIO
            System.out.println("************");
            System.out.println("TERCER EJERCICIO");

            a = matrizDatos.length;
            int aux = (a - 1);
            Tercero(a, aux);

        }


    }

}
