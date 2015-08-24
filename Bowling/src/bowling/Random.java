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
    
    //Metodo que permite generar un numero random
    public static byte AzarJ(byte max, byte min){
    return (byte)(Math.random()*((max+1)+min)-min);
    }
}
