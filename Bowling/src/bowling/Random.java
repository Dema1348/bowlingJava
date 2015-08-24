/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowling;

/**
 *
 * @author LC
 */
public  class Random {
    
    //Metodo que permite generar un numero random desde el 0 hasta el 10
    public static byte Azar(byte max){
    return (byte)(Math.random()*(max+1));
    }
    
    //Metodo que permite generar un numero random dependiendo del nivel del jugador 
    public static byte AzarJ(byte max, byte nivel){
        //Cada caso es para cada nivel de 0 a 9, luego del nivel 10 el jugador
        //hará solo strikes
        switch (nivel) {
            case 0:
                return (byte)(Math.random()*(max+1));
            case 1:
                return (byte)(Math.random()*((max+1)-1)+1);
             case 2:
                return (byte)(Math.random()*((max+1)-2)+2);
             case 3:
                return (byte)(Math.random()*((max+1)-3)+3);
             case 4:
                return (byte)(Math.random()*((max+1)-4)+4);
             case 5:
                return (byte)(Math.random()*((max+1)-5)+5);
             case 6:
                return (byte)(Math.random()*((max+1)-6)+6);
              case 7:
                return (byte)(Math.random()*((max+1)-7)+7);
              case 8:
                return (byte)(Math.random()*((max+1)-8)+8);
              case 9:
                return (byte)(Math.random()*((max+1)-9)+9);
              default:
                return (byte)(Math.random()*((max+1)-10)+10);
            
                
        }
       
        
    }
}
