/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_201700648;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Marthinn Chew
 */
public class Practica1_201700648 { //https://github.com/MarthinnChew/Practica-1               

    public static void main(String[] args) {  
        int opcion = 0;
        int matrizBodegas[][]= new int[5][6];  // matriz[filas j]x[columnas i] 
        for(int j=0; j < 5; j++){               //llena de izquierda a derecha de fila en fila
           for(int i=0; i < 6; i++){
                                                // BODEGA 1-------
              matrizBodegas[0][0] = 20;//PRODUCTO 1 P1_B1
              matrizBodegas[1][0] = 20;//PRODUCTO 2 P2_B1
              matrizBodegas[2][0] = 20;//PRODUCTO 3 P3_B1
              matrizBodegas[3][0] = 20;//PRODUCTO 4 P4_B1
              matrizBodegas[4][0] = 20;//PRODUCTO 5 P5_B1

                                                // BODEGA 2-------
              matrizBodegas[0][1] = 20;//PRODUCTO 1 P1_B2
              matrizBodegas[1][1] = 20;//PRODUCTO 2 P2_B2
              matrizBodegas[2][1] = 20;//PRODUCTO 3 P3_B2
              matrizBodegas[3][1] = 20;//PRODUCTO 4 P4_B2
              matrizBodegas[4][1] = 20;//PRODUCTO 5 P5_B2
                                                // BODEGA 3-------
              matrizBodegas[0][2] = 20;//PRODUCTO 1 P1_B3
              matrizBodegas[1][2] = 20;//PRODUCTO 2 P2_B3
              matrizBodegas[2][2] = 20;//PRODUCTO 3 P3_B3
              matrizBodegas[3][2] = 20;//PRODUCTO 4 P4_B3
              matrizBodegas[4][2] = 20;//PRODUCTO 5 P5_B3
                                                // BODEGA 4-------
              matrizBodegas[0][3] = 20;//PRODUCTO 1 P1_B4
              matrizBodegas[1][3] = 20;//PRODUCTO 2 P2_B4
              matrizBodegas[2][3] = 20;//PRODUCTO 3 P3_B4
              matrizBodegas[3][3] = 20;//PRODUCTO 4 P4_B4
              matrizBodegas[4][3] = 20;//PRODUCTO 5 P5_B4
                                                // BODEGA 5-------
              matrizBodegas[0][4] = 20;//PRODUCTO 1 P1_B5
              matrizBodegas[1][4] = 20;//PRODUCTO 2 P2_B5
              matrizBodegas[2][4] = 20;//PRODUCTO 3 P3_B5
              matrizBodegas[3][4] = 20;//PRODUCTO 4 P4_B5
              matrizBodegas[4][4] = 20;//PRODUCTO 5 P5_B5
                                               // BODEGA 6-------
              matrizBodegas[0][5] = 20;//PRODUCTO 1 P1_B6
              matrizBodegas[1][5] = 20;//PRODUCTO 2 P2_B6
              matrizBodegas[2][5] = 20;//PRODUCTO 3 P3_B6
              matrizBodegas[3][5] = 20;//PRODUCTO 4 P4_B6
              matrizBodegas[4][5] = 20;//PRODUCTO 5 P5_B6

   
                                            }//FOR MATRIZ
                                     }//FOR MATRIZ
        Scanner entrada = new Scanner(System.in);
        
        int Numero = 0;
        while (Numero==0) {
        System.out.println("******Menu Principal: Sistema Control de Bodegas:*******");
        System.out.println("__________________________________________________________________________________________________________________________");
        System.out.println("1. Datos de prueba");
        System.out.println("2. Traslados de bodega");
        System.out.println("3. Rebastecimiento");
        System.out.println("4. Salida de productos");
        System.out.println("5. Kardex");
        System.out.println("6. Reportes");
        System.out.println("7. Mostrar Bodega");
        System.out.println("8. Salir");
        System.out.println("__________________________________________________________________________________________________________________________");
        opcion = entrada.nextInt();
        
        
        try{
        switch(opcion){
            
            case 1:// MENU DATOS DE PRUEBA
                System.out.println("1. Ingresar parámetros");
                System.out.println("2. Limpiar Bodegas");
                System.out.println("3. Regresar");
                opcion = entrada.nextInt();
                
                
                break;//case 1 principal
            case 2:// MENU TRASLADOS DE BODEGA
                System.out.println("1. Verificar posibles traslados");
                System.out.println("2. Realizar traslado");
                System.out.println("3. Regresar");
                opcion = entrada.nextInt();
                
                break;//case 2 principal
            case 3:// MENU REBASTECIMIENTO
                System.out.println("1. Rebastecer Aumatizado");
                System.out.println("2. Rebastecer manual");
                System.out.println("3. Regresar");
                opcion = entrada.nextInt();
                
                break;//case 3 principal
            case 4:// MENU SALIDA DE PRODUCTOS
                System.out.println("1. Realizar pedido");
                System.out.println("2. Regresar");
                opcion = entrada.nextInt();
                
                break;//case 4 principal
            case 5:// NENU KARDEX
                break;//case 5 principal
            case 6:// MENU REPORTES
                break;//case 6 principal
            case 7:// MENU MOSTRAR BODEGA
                break;//case 7 principal
            case 8:// SALIR
            default: Numero =0;
                break;//case 8 principal    
            
        }//switch principal
        }catch(Exception E){
            
            System.out.println("Error, Porfavor Seleccione una opcion valida.: " +E.getMessage());
        }
        }//while
       
    }
    
}
