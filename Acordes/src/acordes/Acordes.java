/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acordes;

/**
 *
 * @author Juan
 */
import java.awt.Color;
import java.util.*;
public class Acordes {

    /**
     * @param args the command line arguments
     */
    
    public static void acordeMayor(String acorde, String[] notas, String[] acord){
        for(int i=0;i<notas.length;i++){
            if(acord[0]!=null&&acord[1]!=null&&acord[2]!=null){
                break;
            }
            if(notas[i]==acorde){
                acord[0]=acorde;
                acord[1]=notas[i+4];
                acord[2]=notas[i+7];
            }
        }
        for(int i=0;i<acord.length;i++){
         System.out.print(acord[i]+" ");
        }
    }
    public static void acordeMenor(String acorde, String[] notas, String[] acord){
           for(int i=0;i<notas.length;i++){
            if(notas[i]==acorde){
                acord[0]=acorde;
                acord[1]=notas[i+3];
                acord[2]=notas[i+7];
            }
        }
        for(int i=0;i<acord.length;i++){
         System.out.print(acord[i]+" ");
        }
    }
      public static void muestraNotas(String notas[],String acorde[]){
         for(int i=0;i<notas.length;i++){
                for(int j=0;j<acorde.length;j++){
                    
                    if(acorde[j]==notas[i]){
                        System.out.print(i+" "+notas[i]+"|");
                    }
                    
                }
                
            }
    }
    
  public static String eligeNota(String a[]){
      Scanner entrada=new Scanner(System.in);
      String tonica;
      int opcion;
      String polla="pola";
      
      String rojo="\033[31m"; 
      String azul="\033[34m";
      String verde="\033[32m";
   String reset="\u001B[0m";
   System.out.println(); 
   System.out.println(rojo+"Cadena de texto en rojo"+reset); 
   System.out.println(azul+"Cadena de texto en rojo"+reset);
   System.out.println(verde+"Cadena de texto en rojo"+reset);
   
      System.out.println("\033[30m----Seleccionar Nota-----"+polla);
   
         System.out.println("<1>DO <2>RE <3>MI <4>FA <5>SOL <6>LA <7>SI");
         opcion=entrada.nextInt();
         tonica=a[opcion-1];
      return tonica;
  }
    public static void main(String[] args) {
        ventana window= new ventana();
        window.setTitle("Acordes");
        window.setVisible(true);
        String acorde[]=new String[3];
        Scanner entrada=new Scanner(System.in);
        String [] notas={"DO","DO#/REb ","RE","RE#/MIb","MI","FA","FA#/SOLb",
            "SOL","SOL#/LAb","LA","LA#/SIb","SI","DO","DO#/REb ","RE","RE#/MIb","MI","FA","FA#/SOLb",
            "SOL","SOL#/LAb","LA","LA#/SIb","SI"};
        String []cuerdaMI={"MI","FA","FA#SOLb","SOL","SOL#/LAb","LA",
          "LA#/SIb","SI","DO","DO#/REb","RE","RE#/MIb","MI","FA","FA#/SOLb",
            "SOL"};
        String []cuerdaSI={"SI","DO","DO#REb","RE","RE#/REb","MI","FA","FA#/SOLb",
            "SOL","SOL#/LAb","LA","LA#/SIb","SI","DO","DO#/REb ","RE" };
        String []cuerdaSOL={"SOL","SOL#/LAb","LA","LA#/SIb","SI","DO",
              "DO#/REb ","RE","RE#/MIb","MI","FA","FA#/SOLb",
            "SOL","SOL#/LAb"};
        String []cuerdaRE={"RE","RE#/MIb","MI","FA","FA#/SOLb",
            "SOL","SOL#/LAb","LA","LA#/SIb","SI","DO","DO#/REb","RE","RE#/MIb","MI","FA"};
        String []cuerdaLA={"LA","LA#/SIb","SI","DO","DO#/REb ","RE","RE#/MIb","MI","FA","FA#/SOLb",
            "SOL","SOL#/LAb","LA","LA#/SIb","SI","DO"};
        System.out.println("");
        String []notasAux={"DO","RE","MI","FA","SOL","LA","SI"};
        int menu=0;
        int a=0;
        String tonica;
         
         tonica=eligeNota(notasAux);
    System.out.println("");
    while(menu!=7){
        System.out.println("------------MENU----------");
         System.out.println("<1> Acorde Mayor");
         System.out.println("<2> Acorde Menor");
         System.out.println("<3> Mostral Mastil");
         System.out.println("<4> Cambiar tonica");
         
         System.out.println("<7> Salir ");
         System.out.println("--------------------------");
        
         menu=entrada.nextInt();
    
         
        switch (menu){
                
        case 1:
           
            System.out.println(tonica);
     acordeMayor(tonica,notas,acorde);
     System.out.println("");
           break;
        case 2:
        acordeMenor(tonica,notas,acorde);
        System.out.println("");
           break;
        case 3:
          muestraNotas(cuerdaMI,acorde);
          System.out.println("");
          muestraNotas(cuerdaSI,acorde);
          System.out.println("");
          muestraNotas(cuerdaSOL,acorde);
          System.out.println("");
         // muestraNotas(cuerdaRE,acorde);
         // System.out.println("");
        //  muestraNotas(cuerdaLA,acorde);
         // System.out.println("");
         // muestraNotas(cuerdaMI,acorde);
          
          System.out.println("");
          break;
        case 4:
            
            tonica=eligeNota(notasAux);
            System.out.println(tonica);
            break;
        default:
    }
    }
}
      
    
    
}
