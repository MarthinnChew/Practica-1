/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_201700648;
import java.util.Scanner;

/**
 *
 * @author Marthinn Chew
 */
public class Practica1_201700648 { //https://github.com/MarthinnChew/Practica-1               

    
                             
    public static void main(String[] args) {  
        
       int matrizBodegas[][]= new int[5][61];  // matriz[filas j]x[columnas i] 
       
              matrizBodegas[0][0] = 0;//PRODUCTO 1 P1_B1
              matrizBodegas[1][0] = 0;//PRODUCTO 2 P2_B1
              matrizBodegas[2][0] = 0;//PRODUCTO 3 P3_B1
              matrizBodegas[3][0] = 0;//PRODUCTO 4 P4_B1
              matrizBodegas[4][0] = 0;//PRODUCTO 5 P5_B1

                                                // BODEGA 2-------
              matrizBodegas[0][1] = 0;//PRODUCTO 1 P1_B2
              matrizBodegas[1][1] = 0;//PRODUCTO 2 P2_B2
              matrizBodegas[2][1] = 0;//PRODUCTO 3 P3_B2
              matrizBodegas[3][1] = 0;//PRODUCTO 4 P4_B2
              matrizBodegas[4][1] = 0;//PRODUCTO 5 P5_B2
                                                // BODEGA 3-------
              matrizBodegas[0][2] = 0;//PRODUCTO 1 P1_B3
              matrizBodegas[1][2] = 0;//PRODUCTO 2 P2_B3
              matrizBodegas[2][2] = 0;//PRODUCTO 3 P3_B3
              matrizBodegas[3][2] = 0;//PRODUCTO 4 P4_B3
              matrizBodegas[4][2] = 0;//PRODUCTO 5 P5_B3
                                                // BODEGA 4-------
              matrizBodegas[0][3] = 0;//PRODUCTO 1 P1_B4
              matrizBodegas[1][3] = 0;//PRODUCTO 2 P2_B4
              matrizBodegas[2][3] = 0;//PRODUCTO 3 P3_B4
              matrizBodegas[3][3] = 0;//PRODUCTO 4 P4_B4
              matrizBodegas[4][3] = 0;//PRODUCTO 5 P5_B4
                                                // BODEGA 5-------
              matrizBodegas[0][4] = 0;//PRODUCTO 1 P1_B5
              matrizBodegas[1][4] = 0;//PRODUCTO 2 P2_B5
              matrizBodegas[2][4] = 0;//PRODUCTO 3 P3_B5
              matrizBodegas[3][4] = 0;//PRODUCTO 4 P4_B5
              matrizBodegas[4][4] = 0;//PRODUCTO 5 P5_B5
                                               // BODEGA 6-------
              matrizBodegas[0][5] = 0;//PRODUCTO 1 P1_B6
              matrizBodegas[1][5] = 0;//PRODUCTO 2 P2_B6
              matrizBodegas[2][5] = 0;//PRODUCTO 3 P3_B6
              matrizBodegas[3][5] = 0;//PRODUCTO 4 P4_B6
              matrizBodegas[4][5] = 0;//PRODUCTO 5 P5_B6        
               
        
        int opcion = 0;
        int Numero = 0;
        
        
        while (Numero==0) {
            
        System.out.print("******Menu Principal: Sistema Control de Bodegas:*******");
        System.out.println("______________________________________________________________________________________________________________________________________________________");
        System.out.println("1. Datos de prueba");
        System.out.println("2. Traslados de bodega");
        System.out.println("3. Rebastecimiento");
        System.out.println("4. Salida de productos");
        System.out.println("5. Kardex");
        System.out.println("6. Reportes");
        System.out.println("7. Mostrar Bodega");
        System.out.println("8. Salir");
        System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________");
       Scanner entrada = new Scanner(System.in);
        
        
        try{
            opcion = entrada.nextInt();
        switch(opcion){
            
            case 1:// MENU DATOS DE PRUEBA
                System.out.println("1. Ingresar parámetros");
                System.out.println("2. Limpiar Bodegas");
                System.out.println("3. Regresar");
                opcion = entrada.nextInt();
                
                    switch(opcion){
                        case 1:
                            int num_bodega;
                            int num_producto;
                            System.out.println("Estado actual de las bodegas");
                            System.out.println("           "+ "Bodega 1 - Bodega 2 - Bodega 3 - Bodega 4 - Bodega 5 - Bodega 6");
                             System.out.println("Producto A1" + "      "+matrizBodegas[0][0]+"          "+matrizBodegas[0][1]+"          "+matrizBodegas[0][2]+"          "+matrizBodegas[0][3]+"          "+matrizBodegas[0][4]+"          "+matrizBodegas[0][5] );
                             System.out.println("Producto A2" + "      "+matrizBodegas[1][0]+"          "+matrizBodegas[1][1]+"          "+matrizBodegas[1][2]+"          "+matrizBodegas[1][3]+"          "+matrizBodegas[1][4]+"          "+matrizBodegas[1][5] );
                             System.out.println("Producto A3" + "      "+matrizBodegas[2][0]+"          "+matrizBodegas[2][1]+"          "+matrizBodegas[2][2]+"          "+matrizBodegas[2][3]+"          "+matrizBodegas[2][4]+"          "+matrizBodegas[2][5] );
                             System.out.println("Producto A4" + "      "+matrizBodegas[3][0]+"          "+matrizBodegas[3][1]+"          "+matrizBodegas[3][2]+"          "+matrizBodegas[3][3]+"          "+matrizBodegas[3][4]+"          "+matrizBodegas[3][5] );
                             System.out.println("Producto A5" + "      "+matrizBodegas[4][0]+"          "+matrizBodegas[4][1]+"          "+matrizBodegas[4][2]+"          "+matrizBodegas[4][3]+"          "+matrizBodegas[4][4]+"          "+matrizBodegas[4][5] );
                            
                             System.out.println("Ingrese el numero de bodega");
                               num_bodega = entrada.nextInt();
                             System.out.println("Ingrese el numero productos a ingresar( 15-75 productos)");
                               num_producto = entrada.nextInt();
                                            switch(num_bodega){
                                                case 1:
                                                    break;
                                                case 2:
                                                    break;
                                                case 3:
                                                    break;
                                                case 4:
                                                    break;
                                                case 5:
                                                    break;
                                                case 6:
                                                    break;
                                                 case 7:
                                                    break;
                                                    
                                            }
                             break;//case 1
                        case 2:
                            break;
                    }
                
                
                break;//case 1 principal
            case 2:// MENU TRASLADOS DE BODEGA
                System.out.println("1. Verificar posibles traslados");
                System.out.println("2. Realizar traslado");
                System.out.println("3. Regresar");
                opcion = entrada.nextInt();
                
                    switch(opcion){
                            case 1:
                                break;
                            case 2:
                                break;
                    }
                
                break;//case 2 principal
            case 3:// MENU REBASTECIMIENTO
                System.out.println("1. Rebastecer Aumatizado");
                System.out.println("2. Rebastecer manual");
                System.out.println("3. Regresar");
                opcion = entrada.nextInt();
                
                     switch(opcion){
                            case 1:
                                break;
                            case 2:
                                break;               
                     }
                     
                break;//case 3 principal
            case 4:// MENU SALIDA DE PRODUCTOS
                System.out.println("1. Realizar pedido");
                System.out.println("2. Regresar");
                opcion = entrada.nextInt();
                
                    switch(opcion){
                            case 1:
                                break;
                            case 2:
                                break;                
                    }
                    
                break;//case 4 principal
            case 5:// NENU KARDEX
                break;//case 5 principal
            case 6:// MENU REPORTES
                break;//case 6 principal
            case 7:// MENU MOSTRAR BODEGA
                break;//case 7 principal
            case 8:// SALIR
                System.out.println("Finalizado.");
            System.exit(0);
                break;//case 8 principal 
        }//switch principal
        }catch(Exception E){
            
            System.out.println("Error, Porfavor Seleccione una opcion valida.: " + E.getMessage());
        }
        }//while
       
    }//FIN Practica 1
    
}
