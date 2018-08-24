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
        
         int matrizBodega1[][]= new int[5][20];  // matriz[filas j]x[columnas i] 
                                                                                                                                                                                                                                                                                                    
 matrizBodega1[0][0] = 0; matrizBodega1[0][1] = 0; matrizBodega1[0][2] = 0; matrizBodega1[0][3] = 0; matrizBodega1[0][4] = 0; matrizBodega1[0][5] = 0;matrizBodega1[0][6] = 0; matrizBodega1[0][7] = 0; matrizBodega1[0][8] = 0; matrizBodega1[0][9] = 0; matrizBodega1[0][10] = 0; matrizBodega1[0][11] = 0;matrizBodega1[0][12] = 0; matrizBodega1[0][13] = 0; matrizBodega1[0][14] = 0; matrizBodega1[0][15] = 0; matrizBodega1[0][16] = 0; matrizBodega1[0][17] = 0;matrizBodega1[0][18] = 0; matrizBodega1[0][19] = 0;//PRODUCTO 1 P1_B1
 matrizBodega1[1][0] = 0; matrizBodega1[1][1] = 0; matrizBodega1[1][2] = 0; matrizBodega1[1][3] = 0; matrizBodega1[1][4] = 0; matrizBodega1[1][5] = 0;matrizBodega1[1][6] = 0; matrizBodega1[1][7] = 0; matrizBodega1[1][8] = 0; matrizBodega1[1][9] = 0; matrizBodega1[1][10] = 0; matrizBodega1[1][11] = 0;matrizBodega1[1][12] = 0; matrizBodega1[1][13] = 0; matrizBodega1[1][14] = 0; matrizBodega1[1][15] = 0; matrizBodega1[1][16] = 0; matrizBodega1[1][17] = 0;matrizBodega1[1][18] = 0; matrizBodega1[1][19] = 0;//PRODUCTO 1 P2_B1
 matrizBodega1[2][0] = 0; matrizBodega1[2][1] = 0; matrizBodega1[2][2] = 0; matrizBodega1[2][3] = 0; matrizBodega1[2][4] = 0; matrizBodega1[2][5] = 0;matrizBodega1[2][6] = 0; matrizBodega1[2][7] = 0; matrizBodega1[2][8] = 0; matrizBodega1[2][9] = 0; matrizBodega1[2][10] = 0; matrizBodega1[2][11] = 0;matrizBodega1[2][12] = 0; matrizBodega1[2][13] = 0; matrizBodega1[2][14] = 0; matrizBodega1[2][15] = 0; matrizBodega1[2][16] = 0; matrizBodega1[2][17] = 0;matrizBodega1[2][18] = 0; matrizBodega1[2][19] = 0;//PRODUCTO 1 P3_B1
 matrizBodega1[3][0] = 0; matrizBodega1[3][1] = 0; matrizBodega1[3][2] = 0; matrizBodega1[3][3] = 0; matrizBodega1[3][4] = 0; matrizBodega1[3][5] = 0;matrizBodega1[3][6] = 0; matrizBodega1[3][7] = 0; matrizBodega1[3][8] = 0; matrizBodega1[3][9] = 0; matrizBodega1[3][10] = 0; matrizBodega1[3][11] = 0;matrizBodega1[3][12] = 0; matrizBodega1[3][13] = 0; matrizBodega1[3][14] = 0; matrizBodega1[3][15] = 0; matrizBodega1[3][16] = 0; matrizBodega1[3][17] = 0;matrizBodega1[3][18] = 0; matrizBodega1[3][19] = 0;//PRODUCTO 1 P4_B1
 matrizBodega1[4][0] = 0; matrizBodega1[4][1] = 0; matrizBodega1[4][2] = 0; matrizBodega1[4][3] = 0; matrizBodega1[4][4] = 0; matrizBodega1[4][5] = 0;matrizBodega1[4][6] = 0; matrizBodega1[4][7] = 0; matrizBodega1[4][8] = 0; matrizBodega1[4][9] = 0; matrizBodega1[4][10] = 0; matrizBodega1[4][11] = 0;matrizBodega1[4][12] = 0; matrizBodega1[4][13] = 0; matrizBodega1[4][14] = 0; matrizBodega1[4][15] = 0; matrizBodega1[4][16] = 0; matrizBodega1[4][17] = 0;matrizBodega1[4][18] = 0; matrizBodega1[4][19] = 0;//PRODUCTO 1 P5_B1
        
         int matrizBodega2[][] = new int [5][20]; 
 matrizBodega2[0][0] = 0; matrizBodega2[0][1] = 0; matrizBodega2[0][2] = 0; matrizBodega2[0][3] = 0; matrizBodega2[0][4] = 0; matrizBodega2[0][5] = 0;matrizBodega2[0][6] = 0; matrizBodega2[0][7] = 0; matrizBodega2[0][8] = 0; matrizBodega2[0][9] = 0; matrizBodega2[0][10] = 0; matrizBodega2[0][11] = 0;matrizBodega2[0][12] = 0; matrizBodega2[0][13] = 0; matrizBodega2[0][14] = 0; matrizBodega2[0][15] = 0; matrizBodega2[0][16] = 0; matrizBodega2[0][17] = 0;matrizBodega2[0][18] = 0; matrizBodega2[0][19] = 0;//PRODUCTO 1 P1_B2
 matrizBodega2[1][0] = 0; matrizBodega2[1][1] = 0; matrizBodega2[1][2] = 0; matrizBodega2[1][3] = 0; matrizBodega2[1][4] = 0; matrizBodega2[1][5] = 0;matrizBodega2[1][6] = 0; matrizBodega2[1][7] = 0; matrizBodega2[1][8] = 0; matrizBodega2[1][9] = 0; matrizBodega2[1][10] = 0; matrizBodega2[1][11] = 0;matrizBodega2[1][12] = 0; matrizBodega2[1][13] = 0; matrizBodega2[1][14] = 0; matrizBodega2[1][15] = 0; matrizBodega2[1][16] = 0; matrizBodega2[1][17] = 0;matrizBodega2[1][18] = 0; matrizBodega2[1][19] = 0;//PRODUCTO 1 P2_B2
 matrizBodega2[2][0] = 0; matrizBodega2[2][1] = 0; matrizBodega2[2][2] = 0; matrizBodega2[2][3] = 0; matrizBodega2[2][4] = 0; matrizBodega2[2][5] = 0;matrizBodega2[2][6] = 0; matrizBodega2[2][7] = 0; matrizBodega2[2][8] = 0; matrizBodega2[2][9] = 0; matrizBodega2[2][10] = 0; matrizBodega2[2][11] = 0;matrizBodega2[2][12] = 0; matrizBodega2[2][13] = 0; matrizBodega2[2][14] = 0; matrizBodega2[2][15] = 0; matrizBodega2[2][16] = 0; matrizBodega2[2][17] = 0;matrizBodega2[2][18] = 0; matrizBodega2[2][19] = 0;//PRODUCTO 1 P3_B2
 matrizBodega2[3][0] = 0; matrizBodega2[3][1] = 0; matrizBodega2[3][2] = 0; matrizBodega2[3][3] = 0; matrizBodega2[3][4] = 0; matrizBodega2[3][5] = 0;matrizBodega2[3][6] = 0; matrizBodega2[3][7] = 0; matrizBodega2[3][8] = 0; matrizBodega2[3][9] = 0; matrizBodega2[3][10] = 0; matrizBodega2[3][11] = 0;matrizBodega2[3][12] = 0; matrizBodega2[3][13] = 0; matrizBodega2[3][14] = 0; matrizBodega2[3][15] = 0; matrizBodega2[3][16] = 0; matrizBodega2[3][17] = 0;matrizBodega2[3][18] = 0; matrizBodega2[3][19] = 0;//PRODUCTO 1 P4_B2
 matrizBodega2[4][0] = 0; matrizBodega2[4][1] = 0; matrizBodega2[4][2] = 0; matrizBodega2[4][3] = 0; matrizBodega2[4][4] = 0; matrizBodega2[4][5] = 0;matrizBodega2[4][6] = 0; matrizBodega2[4][7] = 0; matrizBodega2[4][8] = 0; matrizBodega2[4][9] = 0; matrizBodega2[4][10] = 0; matrizBodega2[4][11] = 0;matrizBodega2[4][12] = 0; matrizBodega2[4][13] = 0; matrizBodega2[4][14] = 0; matrizBodega2[4][15] = 0; matrizBodega2[4][16] = 0; matrizBodega2[4][17] = 0;matrizBodega2[4][18] = 0; matrizBodega2[4][19] = 0;//PRODUCTO 1 P5_B2            
        
         int matrizBodega3[][]= new int[5][20];  // matriz[filas j]x[columnas i] 
                                                                                                                                                                                                                                                                                                    
 matrizBodega3[0][0] = 0; matrizBodega3[0][1] = 0; matrizBodega3[0][2] = 0; matrizBodega3[0][3] = 0; matrizBodega3[0][4] = 0; matrizBodega3[0][5] = 0;matrizBodega3[0][6] = 0; matrizBodega3[0][7] = 0; matrizBodega1[0][8] = 0; matrizBodega1[0][9] = 0; matrizBodega1[0][10] = 0; matrizBodega1[0][11] = 0;matrizBodega1[0][12] = 0; matrizBodega1[0][13] = 0; matrizBodega1[0][14] = 0; matrizBodega1[0][15] = 0; matrizBodega1[0][16] = 0; matrizBodega1[0][17] = 0;matrizBodega1[0][18] = 0; matrizBodega1[0][19] = 0;//PRODUCTO 1 P1_B3
 matrizBodega3[1][0] = 0; matrizBodega3[1][1] = 0; matrizBodega3[1][2] = 0; matrizBodega3[1][3] = 0; matrizBodega3[1][4] = 0; matrizBodega3[1][5] = 0;matrizBodega3[1][6] = 0; matrizBodega3[1][7] = 0; matrizBodega1[1][8] = 0; matrizBodega1[1][9] = 0; matrizBodega1[1][10] = 0; matrizBodega1[1][11] = 0;matrizBodega1[1][12] = 0; matrizBodega1[1][13] = 0; matrizBodega1[1][14] = 0; matrizBodega1[1][15] = 0; matrizBodega1[1][16] = 0; matrizBodega1[1][17] = 0;matrizBodega1[1][18] = 0; matrizBodega1[1][19] = 0;//PRODUCTO 1 P2_B3
 matrizBodega3[2][0] = 0; matrizBodega3[2][1] = 0; matrizBodega3[2][2] = 0; matrizBodega3[2][3] = 0; matrizBodega3[2][4] = 0; matrizBodega3[2][5] = 0;matrizBodega3[2][6] = 0; matrizBodega3[2][7] = 0; matrizBodega1[2][8] = 0; matrizBodega1[2][9] = 0; matrizBodega1[2][10] = 0; matrizBodega1[2][11] = 0;matrizBodega1[2][12] = 0; matrizBodega1[2][13] = 0; matrizBodega1[2][14] = 0; matrizBodega1[2][15] = 0; matrizBodega1[2][16] = 0; matrizBodega1[2][17] = 0;matrizBodega1[2][18] = 0; matrizBodega1[2][19] = 0;//PRODUCTO 1 P3_B3
 matrizBodega3[3][0] = 0; matrizBodega3[3][1] = 0; matrizBodega3[3][2] = 0; matrizBodega3[3][3] = 0; matrizBodega3[3][4] = 0; matrizBodega3[3][5] = 0;matrizBodega3[3][6] = 0; matrizBodega3[3][7] = 0; matrizBodega1[3][8] = 0; matrizBodega1[3][9] = 0; matrizBodega1[3][10] = 0; matrizBodega1[3][11] = 0;matrizBodega1[3][12] = 0; matrizBodega1[3][13] = 0; matrizBodega1[3][14] = 0; matrizBodega1[3][15] = 0; matrizBodega1[3][16] = 0; matrizBodega1[3][17] = 0;matrizBodega1[3][18] = 0; matrizBodega1[3][19] = 0;//PRODUCTO 1 P4_B3
 matrizBodega3[4][0] = 0; matrizBodega3[4][1] = 0; matrizBodega3[4][2] = 0; matrizBodega3[4][3] = 0; matrizBodega3[4][4] = 0; matrizBodega3[4][5] = 0;matrizBodega3[4][6] = 0; matrizBodega3[4][7] = 0; matrizBodega1[4][8] = 0; matrizBodega1[4][9] = 0; matrizBodega1[4][10] = 0; matrizBodega1[4][11] = 0;matrizBodega1[4][12] = 0; matrizBodega1[4][13] = 0; matrizBodega1[4][14] = 0; matrizBodega1[4][15] = 0; matrizBodega1[4][16] = 0; matrizBodega1[4][17] = 0;matrizBodega1[4][18] = 0; matrizBodega1[4][19] = 0;//PRODUCTO 1 P5_B3
        
         int matrizBodega4[][] = new int [5][20]; // matriz[filas j]x[columnas i] 
         
 matrizBodega4[0][0] = 0; matrizBodega4[0][1] = 0; matrizBodega4[0][2] = 0; matrizBodega4[0][3] = 0; matrizBodega4[0][4] = 0; matrizBodega4[0][5] = 0;matrizBodega4[0][6] = 0; matrizBodega4[0][7] = 0; matrizBodega4[0][8] = 0; matrizBodega4[0][9] = 0; matrizBodega4[0][10] = 0; matrizBodega4[0][11] = 0;matrizBodega4[0][12] = 0; matrizBodega4[0][13] = 0; matrizBodega4[0][14] = 0; matrizBodega4[0][15] = 0; matrizBodega4[0][16] = 0; matrizBodega4[0][17] = 0;matrizBodega4[0][18] = 0; matrizBodega4[0][19] = 0;//PRODUCTO 1 P1_B4
 matrizBodega4[1][0] = 0; matrizBodega4[1][1] = 0; matrizBodega4[1][2] = 0; matrizBodega4[1][3] = 0; matrizBodega4[1][4] = 0; matrizBodega4[1][5] = 0;matrizBodega4[1][6] = 0; matrizBodega4[1][7] = 0; matrizBodega4[1][8] = 0; matrizBodega4[1][9] = 0; matrizBodega4[1][10] = 0; matrizBodega4[1][11] = 0;matrizBodega4[1][12] = 0; matrizBodega4[1][13] = 0; matrizBodega4[1][14] = 0; matrizBodega4[1][15] = 0; matrizBodega4[1][16] = 0; matrizBodega4[1][17] = 0;matrizBodega4[1][18] = 0; matrizBodega4[1][19] = 0;//PRODUCTO 1 P2_B4
 matrizBodega4[2][0] = 0; matrizBodega4[2][1] = 0; matrizBodega4[2][2] = 0; matrizBodega4[2][3] = 0; matrizBodega4[2][4] = 0; matrizBodega4[2][5] = 0;matrizBodega4[2][6] = 0; matrizBodega4[2][7] = 0; matrizBodega4[2][8] = 0; matrizBodega4[2][9] = 0; matrizBodega4[2][10] = 0; matrizBodega4[2][11] = 0;matrizBodega4[2][12] = 0; matrizBodega4[2][13] = 0; matrizBodega4[2][14] = 0; matrizBodega4[2][15] = 0; matrizBodega4[2][16] = 0; matrizBodega4[2][17] = 0;matrizBodega4[2][18] = 0; matrizBodega4[2][19] = 0;//PRODUCTO 1 P3_B4
 matrizBodega4[3][0] = 0; matrizBodega4[3][1] = 0; matrizBodega4[3][2] = 0; matrizBodega4[3][3] = 0; matrizBodega4[3][4] = 0; matrizBodega4[3][5] = 0;matrizBodega4[3][6] = 0; matrizBodega4[3][7] = 0; matrizBodega4[3][8] = 0; matrizBodega4[3][9] = 0; matrizBodega4[3][10] = 0; matrizBodega4[3][11] = 0;matrizBodega4[3][12] = 0; matrizBodega4[3][13] = 0; matrizBodega4[3][14] = 0; matrizBodega4[3][15] = 0; matrizBodega4[3][16] = 0; matrizBodega4[3][17] = 0;matrizBodega4[3][18] = 0; matrizBodega4[3][19] = 0;//PRODUCTO 1 P4_B4
 matrizBodega4[4][0] = 0; matrizBodega4[4][1] = 0; matrizBodega4[4][2] = 0; matrizBodega4[4][3] = 0; matrizBodega4[4][4] = 0; matrizBodega4[4][5] = 0;matrizBodega4[4][6] = 0; matrizBodega4[4][7] = 0; matrizBodega4[4][8] = 0; matrizBodega4[4][9] = 0; matrizBodega4[4][10] = 0; matrizBodega4[4][11] = 0;matrizBodega4[4][12] = 0; matrizBodega4[4][13] = 0; matrizBodega4[4][14] = 0; matrizBodega4[4][15] = 0; matrizBodega4[4][16] = 0; matrizBodega4[4][17] = 0;matrizBodega4[4][18] = 0; matrizBodega4[4][19] = 0;//PRODUCTO 1 P5_B4                 
         
         int matrizBodega5[][] = new int [5][20]; // matriz[filas j]x[columnas i] 
 
 matrizBodega5[0][0] = 0; matrizBodega5[0][1] = 0; matrizBodega5[0][2] = 0; matrizBodega5[0][3] = 0; matrizBodega5[0][4] = 0; matrizBodega5[0][5] = 0;matrizBodega5[0][6] = 0; matrizBodega5[0][7] = 0; matrizBodega5[0][8] = 0; matrizBodega5[0][9] = 0; matrizBodega5[0][10] = 0; matrizBodega5[0][11] = 0;matrizBodega5[0][12] = 0; matrizBodega5[0][13] = 0; matrizBodega5[0][14] = 0; matrizBodega5[0][15] = 0; matrizBodega5[0][16] = 0; matrizBodega5[0][17] = 0;matrizBodega5[0][18] = 0; matrizBodega5[0][19] = 0;//PRODUCTO 1 P1_B5
 matrizBodega5[1][0] = 0; matrizBodega5[1][1] = 0; matrizBodega5[1][2] = 0; matrizBodega5[1][3] = 0; matrizBodega5[1][4] = 0; matrizBodega5[1][5] = 0;matrizBodega5[1][6] = 0; matrizBodega5[1][7] = 0; matrizBodega5[1][8] = 0; matrizBodega5[1][9] = 0; matrizBodega5[1][10] = 0; matrizBodega5[1][11] = 0;matrizBodega5[1][12] = 0; matrizBodega5[1][13] = 0; matrizBodega5[1][14] = 0; matrizBodega5[1][15] = 0; matrizBodega5[1][16] = 0; matrizBodega5[1][17] = 0;matrizBodega5[1][18] = 0; matrizBodega5[1][19] = 0;//PRODUCTO 1 P2_B5
 matrizBodega5[2][0] = 0; matrizBodega5[2][1] = 0; matrizBodega5[2][2] = 0; matrizBodega5[2][3] = 0; matrizBodega5[2][4] = 0; matrizBodega5[2][5] = 0;matrizBodega5[2][6] = 0; matrizBodega5[2][7] = 0; matrizBodega5[2][8] = 0; matrizBodega5[2][9] = 0; matrizBodega5[2][10] = 0; matrizBodega5[2][11] = 0;matrizBodega5[2][12] = 0; matrizBodega5[2][13] = 0; matrizBodega5[2][14] = 0; matrizBodega5[2][15] = 0; matrizBodega5[2][16] = 0; matrizBodega5[2][17] = 0;matrizBodega5[2][18] = 0; matrizBodega5[2][19] = 0;//PRODUCTO 1 P3_B5
 matrizBodega5[3][0] = 0; matrizBodega5[3][1] = 0; matrizBodega5[3][2] = 0; matrizBodega5[3][3] = 0; matrizBodega5[3][4] = 0; matrizBodega5[3][5] = 0;matrizBodega5[3][6] = 0; matrizBodega5[3][7] = 0; matrizBodega5[3][8] = 0; matrizBodega5[3][9] = 0; matrizBodega5[3][10] = 0; matrizBodega5[3][11] = 0;matrizBodega5[3][12] = 0; matrizBodega5[3][13] = 0; matrizBodega5[3][14] = 0; matrizBodega5[3][15] = 0; matrizBodega5[3][16] = 0; matrizBodega5[3][17] = 0;matrizBodega5[3][18] = 0; matrizBodega5[3][19] = 0;//PRODUCTO 1 P4_B5
 matrizBodega5[4][0] = 0; matrizBodega5[4][1] = 0; matrizBodega5[4][2] = 0; matrizBodega5[4][3] = 0; matrizBodega5[4][4] = 0; matrizBodega5[4][5] = 0;matrizBodega5[4][6] = 0; matrizBodega5[4][7] = 0; matrizBodega5[4][8] = 0; matrizBodega5[4][9] = 0; matrizBodega5[4][10] = 0; matrizBodega5[4][11] = 0;matrizBodega5[4][12] = 0; matrizBodega5[4][13] = 0; matrizBodega5[4][14] = 0; matrizBodega5[4][15] = 0; matrizBodega5[4][16] = 0; matrizBodega5[4][17] = 0;matrizBodega5[4][18] = 0; matrizBodega5[4][19] = 0;//PRODUCTO 1 P5_B5  
       
        int matrizBodega6[][] = new int [5][20]; // matriz[filas j]x[columnas i] 
        
 matrizBodega6[0][0] = 0; matrizBodega6[0][1] = 0; matrizBodega6[0][2] = 0; matrizBodega6[0][3] = 0; matrizBodega6[0][4] = 0; matrizBodega6[0][5] = 0;matrizBodega6[0][6] = 0; matrizBodega6[0][7] = 0; matrizBodega6[0][8] = 0; matrizBodega6[0][9] = 0; matrizBodega6[0][10] = 0; matrizBodega6[0][11] = 0;matrizBodega6[0][12] = 0; matrizBodega6[0][13] = 0; matrizBodega6[0][14] = 0; matrizBodega6[0][15] = 0; matrizBodega6[0][16] = 0; matrizBodega6[0][17] = 0;matrizBodega6[0][18] = 0; matrizBodega6[0][19] = 0;//PRODUCTO 1 P1_B6
 matrizBodega6[1][0] = 0; matrizBodega6[1][1] = 0; matrizBodega6[1][2] = 0; matrizBodega6[1][3] = 0; matrizBodega6[1][4] = 0; matrizBodega6[1][5] = 0;matrizBodega6[1][6] = 0; matrizBodega6[1][7] = 0; matrizBodega6[1][8] = 0; matrizBodega6[1][9] = 0; matrizBodega6[1][10] = 0; matrizBodega6[1][11] = 0;matrizBodega6[1][12] = 0; matrizBodega6[1][13] = 0; matrizBodega6[1][14] = 0; matrizBodega6[1][15] = 0; matrizBodega6[1][16] = 0; matrizBodega6[1][17] = 0;matrizBodega6[1][18] = 0; matrizBodega6[1][19] = 0;//PRODUCTO 1 P2_B6
 matrizBodega6[2][0] = 0; matrizBodega6[2][1] = 0; matrizBodega6[2][2] = 0; matrizBodega6[2][3] = 0; matrizBodega6[2][4] = 0; matrizBodega6[2][5] = 0;matrizBodega6[2][6] = 0; matrizBodega6[2][7] = 0; matrizBodega6[2][8] = 0; matrizBodega6[2][9] = 0; matrizBodega6[2][10] = 0; matrizBodega6[2][11] = 0;matrizBodega6[2][12] = 0; matrizBodega6[2][13] = 0; matrizBodega6[2][14] = 0; matrizBodega6[2][15] = 0; matrizBodega6[2][16] = 0; matrizBodega6[2][17] = 0;matrizBodega6[2][18] = 0; matrizBodega6[2][19] = 0;//PRODUCTO 1 P3_B6
 matrizBodega6[3][0] = 0; matrizBodega6[3][1] = 0; matrizBodega6[3][2] = 0; matrizBodega6[3][3] = 0; matrizBodega6[3][4] = 0; matrizBodega6[3][5] = 0;matrizBodega6[3][6] = 0; matrizBodega6[3][7] = 0; matrizBodega6[3][8] = 0; matrizBodega6[3][9] = 0; matrizBodega6[3][10] = 0; matrizBodega6[3][11] = 0;matrizBodega6[3][12] = 0; matrizBodega6[3][13] = 0; matrizBodega6[3][14] = 0; matrizBodega6[3][15] = 0; matrizBodega6[3][16] = 0; matrizBodega6[3][17] = 0;matrizBodega6[3][18] = 0; matrizBodega6[3][19] = 0;//PRODUCTO 1 P4_B6
 matrizBodega6[4][0] = 0; matrizBodega6[4][1] = 0; matrizBodega6[4][2] = 0; matrizBodega6[4][3] = 0; matrizBodega6[4][4] = 0; matrizBodega6[4][5] = 0;matrizBodega6[4][6] = 0; matrizBodega6[4][7] = 0; matrizBodega6[4][8] = 0; matrizBodega6[4][9] = 0; matrizBodega6[4][10] = 0; matrizBodega6[4][11] = 0;matrizBodega6[4][12] = 0; matrizBodega6[4][13] = 0; matrizBodega6[4][14] = 0; matrizBodega6[4][15] = 0; matrizBodega6[4][16] = 0; matrizBodega6[4][17] = 0;matrizBodega6[4][18] = 0; matrizBodega6[4][19] = 0;//PRODUCTO 1 P5_B6  
       
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
                while (Numero==0) {////////////////
                    switch(opcion){
                        case 1:
                            int num_bodega;
                            int num_producto;
                            
                            System.out.println("Estado actual de la bodega 1:");
                            System.out.println("-E1 -E2 -E3 -E4 -E5 -E6 -E7 -E8 -E9 -E10-E11-E12-E13-E14-E15-E16-E17-E18-E19-E20");
                            for(int i=0; i < 5; i++){               //llena de izquierda a derecha de fila en fila
                                            for(int j=0; j <20; j++){
                            System.out.print("   "+matrizBodega1[i][j]);
                                            }
                            System.out.println();
                            }
                            
                            
                            System.out.println("Estado actual de la bodega 2:");
                            System.out.println("-E1 -E2 -E3 -E4 -E5 -E6 -E7 -E8 -E9 -E10-E11-E12-E13-E14-E15-E16-E17-E18-E19-E20");
                            for(int i=0; i < 5; i++){               //llena de izquierda a derecha de fila en fila
                                            for(int j=0; j <20; j++){
                            System.out.print("   "+matrizBodega2[i][j]);
                                            }
                            System.out.println();
                            }
                            
                            
                            System.out.println("Estado actual de la bodega 3:");
                            System.out.println("-E1 -E2 -E3 -E4 -E5 -E6 -E7 -E8 -E9 -E10-E11-E12-E13-E14-E15-E16-E17-E18-E19-E20");
                            for(int i=0; i < 5; i++){               //llena de izquierda a derecha de fila en fila
                                            for(int j=0; j <20; j++){
                            System.out.print("   "+matrizBodega3[i][j]);
                                            }
                            System.out.println();
                            }
                            
                            
                            System.out.println("Estado actual de la bodega 4:");
                            System.out.println("-E1 -E2 -E3 -E4 -E5 -E6 -E7 -E8 -E9 -E10-E11-E12-E13-E14-E15-E16-E17-E18-E19-E20");
                            for(int i=0; i < 5; i++){               //llena de izquierda a derecha de fila en fila
                                            for(int j=0; j <20; j++){
                            System.out.print("   "+matrizBodega4[i][j]);
                                            }
                            System.out.println();
                            }
                            
                            
                            System.out.println("Estado actual de la bodega 5:");
                            System.out.println("-E1 -E2 -E3 -E4 -E5 -E6 -E7 -E8 -E9 -E10-E11-E12-E13-E14-E15-E16-E17-E18-E19-E20");
                            for(int i=0; i < 5; i++){               //llena de izquierda a derecha de fila en fila
                                            for(int j=0; j <20; j++){
                            System.out.print("   "+matrizBodega5[i][j]);
                                            }
                            System.out.println();
                            }
                            
                            System.out.println("Estado actual de la bodega 6:");
                            System.out.println("-E1 -E2 -E3 -E4 -E5 -E6 -E7 -E8 -E9 -E10-E11-E12-E13-E14-E15-E16-E17-E18-E19-E20");
                            for(int i=0; i < 5; i++){               //llena de izquierda a derecha de fila en fila
                                            for(int j=0; j <20; j++){
                            System.out.print("   "+matrizBodega6[i][j]);
                                            }
                            System.out.println();
                            }
                             
                             
                             System.out.println("Ingrese el numero de bodega");
                               num_bodega = entrada.nextInt();
                             System.out.println("Ingrese el numero productos a ingresar( 15-75 productos)");
                               num_producto = entrada.nextInt();
                               
                                            switch(num_bodega){
                                                case 1:
                                                    
                                                                    int contador = 1;
                                                                    int asignado = 1;//da valor 1 a la casilla
                                                                       if(num_producto>14){
                                                              for(int i=0; i < 5; i++){               //llena de izquierda a derecha de fila en fila
                                                              for(int j=0; j <20; j++){

                                                                  matrizBodega1[i][j]=asignado;
                                                                  contador++;
                                                                        if(contador> num_producto+1){ //si es mayor al numero de ingresos llena de ceros

                                                                           matrizBodega1[i][j]=0;
                                                                           contador++;
                                                                                                    }                                   
                                                          System.out.print("   "+matrizBodega1[i][j] );
                                                                                      }                       
                                                                   System.out.println("");
                                                                       }

                                                                     }//if

                                                                      break;
                                                case 2:
                                                   
                                                                  int contador2 = 1;
                                                                  int asignado2 = 1;//da valor 1 a la casilla
                                                                     if(num_producto>14){
                                                            for(int i=0; i < 5; i++){               //llena de izquierda a derecha de fila en fila
                                                            for(int j=0; j <20; j++){

                                                                matrizBodega2[i][j]=asignado2;
                                                                contador2++;
                                                                      if(contador2> num_producto+1){ //si es mayor al numero de ingresos llena de ceros

                                                                         matrizBodega2[i][j]=0;
                                                                         contador2++;
                                                                                                  }                                   
                                                        System.out.print("   "+matrizBodega2[i][j] );
                                                                                    }                       
                                                                 System.out.println("");
                                                                     }

                                                                   }//if
                                                     
                                                    break;
                                                case 3:
                                                    
                                                   
                                                                  int contador3 = 1;
                                                                  int asignado3 = 1;//da valor 1 a la casilla
                                                                     if(num_producto>14){
                                                            for(int i=0; i < 5; i++){               //llena de izquierda a derecha de fila en fila
                                                            for(int j=0; j <20; j++){

                                                                matrizBodega3[i][j]=asignado3;
                                                                contador3++;
                                                                      if(contador3> num_producto+1){ //si es mayor al numero de ingresos llena de ceros

                                                                         matrizBodega3[i][j]=0;
                                                                         contador3++;
                                                                                                  }                                   
                                                        System.out.print("   "+matrizBodega3[i][j] );
                                                                                    }                       
                                                                 System.out.println("");
                                                                     }

                                                                   }//if
                                                                     
                                                    break;
                                                case 4:
                                                    
                                                                  int contador4 = 1;
                                                                  int asignado4 = 1;//da valor 1 a la casilla
                                                                     if(num_producto>14){
                                                            for(int i=0; i < 5; i++){               //llena de izquierda a derecha de fila en fila
                                                            for(int j=0; j <20; j++){

                                                                matrizBodega4[i][j]=asignado4;
                                                                contador4++;
                                                                      if(contador4> num_producto+1){ //si es mayor al numero de ingresos llena de ceros

                                                                         matrizBodega4[i][j]=0;
                                                                         contador4++;
                                                                                                  }                                   
                                                        System.out.print("   "+matrizBodega4[i][j] );
                                                                                    }                       
                                                                 System.out.println("");
                                                                     }

                                                                   }//if                                                    
                                                    break;
                                                case 5:
                                                    
                                                                  int contador5 = 1;
                                                                  int asignado5 = 1;//da valor 1 a la casilla
                                                                     if(num_producto>14){
                                                            for(int i=0; i < 5; i++){               //llena de izquierda a derecha de fila en fila
                                                            for(int j=0; j <20; j++){

                                                                matrizBodega5[i][j]=asignado5;
                                                                contador5++;
                                                                      if(contador5> num_producto+1){ //si es mayor al numero de ingresos llena de ceros

                                                                         matrizBodega5[i][j]=0;
                                                                         contador5++;
                                                                                                  }                                   
                                                        System.out.print("   "+matrizBodega5[i][j] );
                                                                                    }                       
                                                                 System.out.println("");
                                                                     }

                                                                   }//if                                                    
                                                    break;
                                                case 6:
                                                    
                                                                  int contador6 = 1;
                                                                  int asignado6 = 1;//da valor 1 a la casilla
                                                                     if(num_producto>14){
                                                            for(int i=0; i < 5; i++){               //llena de izquierda a derecha de fila en fila
                                                            for(int j=0; j <20; j++){

                                                                matrizBodega6[i][j]=asignado6;
                                                                contador6++;
                                                                      if(contador6> num_producto+1){ //si es mayor al numero de ingresos llena de ceros

                                                                         matrizBodega6[i][j]=0;
                                                                         contador6++;
                                                                                                  }                                   
                                                        System.out.print("   "+matrizBodega6[i][j] );
                                                                                    }                       
                                                                 System.out.println("");
                                                                     }

                                                                   }//if
                                                                     
                                                    break;
                                                 case 7:
                                                 default: System.out.println("Bodega inexistente");
                                                    break;
                                                    
                                            }
                             break;//case 1
                        case 2:
                            break;
                    }
                
                
                break;//case 1 principal
                }///////////////////////////////////////////////////////////////
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
