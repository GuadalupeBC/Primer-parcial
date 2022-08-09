/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pksparcial1;

import java.util.Scanner;

/**
 *
 * @author barah
 */
public class Clscod {
     private static final String[][] comisiones = new String [6][11];
   
    
    private static final int NOMBRE = 0;
    private static final int ENERO = 1;
    private static final int FEBRERO = 2;
    private static final int MARZO = 3;
    private static final int ABRIL = 4;
    private static final int TOTDEVENTAS = 5;//total de ventas
    private static final int VEINTE = 6; //el 20%
    private static final int TRECINCO = 7; //el 35%
    private static final int TOTVENCO = 8;//TOTAL DE VENTAS Y COMICION 
    private static final int ISR = 9; // ISR MENOS (5%)
    private static final int LIQUIDO = 10; //LIQUIDO A RECIBIR

 
 
  
    public static void cargadedatos (int fila){
        Scanner t = new Scanner (System.in);
        
        
       System.out.println("INGRESE NOMBRE "+(fila +1));
       comisiones[fila][NOMBRE] = t.nextLine();
       
       System.out.println("INGRESE ENERO "+(fila +1));
       comisiones[fila][ENERO] = t.nextLine();
       
       System.out.println("INGRESE FEEBRERO "+(fila +1));
       comisiones[fila][FEBRERO] = t.nextLine();
       
       System.out.println("INGRSE MARZO "+(fila +1));
       comisiones[fila][MARZO] = t.nextLine();
       
      System.out.println("INGRESE ABRIL "+(fila +1));
       comisiones[fila][ABRIL] = t.nextLine();
       
       
    }
    
    public static void imprimirDecorado(){
        for (String[] comisiones : comisiones) {
            System.out.print("|");
            for (int y = 0; y < comisiones.length; y++) {
                System.out.print(comisiones[y]);
                if (y != comisiones.length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    }
    
    public static void ingresodedatos(){
        for (int i=0; i< 5; i++){
            cargadedatos(i);
           
        }
    }
    
    public static void calculos (){
        int m = 0;//esta variable sera la variable del calculo
         int n = 0;//esta variable sera la variable del calculo
         int t = 0;//esta variable sera la variable del calculo
         int l = 0;//esta variable sera la variable del calculo
        int total =0;
        
        
       
          for (int i=0; i< 5; i++){
              
           
            total = Integer.parseInt(comisiones[i][ENERO]);
            total = total + Integer.parseInt(comisiones[i][FEBRERO]);
            total = total + Integer.parseInt(comisiones[i][MARZO]);
            total = total + Integer.parseInt(comisiones[i][ABRIL]);
            comisiones[i][TOTDEVENTAS] = total+"";
            
            if ( total <= 2000) {
                
                m = (int) (total * 1.20); //si es menor a 2000 se le sumará 20%
                
    comisiones [i] [VEINTE] = String.valueOf(m);
    comisiones[i][TOTVENCO] = total+""; //se pasa el resultado a Total ventas y comision
            }
            
     if ( total >= 2001) {  
                m = (int) (total * 1.35);//si es mayor a 2001 se le sumará 35%
                
    comisiones [i] [TRECINCO] = String.valueOf(m);
    
     comisiones[i][TOTVENCO] = total+""; //se pasa el resultado a Total ventas y comision
    
  
   }
     
    n = Integer.parseInt(comisiones[i][TOTVENCO]);
    t = (int) (n * 0.05 );
    comisiones[i][ISR] = t +""; //calculo del ISR
    
    
    l = (int) (n - t);
    comisiones[i][LIQUIDO] = l +""; //calculo, y repuesta del sueldo liquido 
    
  }
     
            
    }
    
   
    
          


}
