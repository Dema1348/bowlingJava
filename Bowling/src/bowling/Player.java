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
public class Player {
    private String nombre;
    private byte level;
    private short score;
    private byte intento;

    public Player() {
    }

    public Player(String nombre, byte level) {
        this.nombre = nombre;
        this.level = level;
        this.score = 0;//Todo jugador parte con score de 0
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getLevel() {
        return level;
    }

    public void setLevel(byte level) {
        this.level = level;
    }

    public short getScore() {
        return score;
    }

    public void setScore(short score) {
        this.score = score;
    }

    public byte getIntento() {
        return intento;
    }

    public void setIntento(byte intento) {
        this.intento = intento;
    }

    @Override
    public String toString() {
        return "Player{" + "nombre=" + nombre + ", level=" + level + ", score=" + score + ", intento=" + intento + '}';
    }
    
    
    
}
