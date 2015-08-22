/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabla;

import bowling.Player;

import java.util.*;

/**
 *
 * @author Edson
 */
public class Record{
   private Player player;
   private Date fecha;

    public Record(Player player, Date fecha) {
        this.player = player;
        this.fecha = fecha;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

 

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

   
   
    
   
}
