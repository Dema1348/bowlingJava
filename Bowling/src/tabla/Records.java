/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabla;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Edson
 */
public class Records {
    private   ArrayList<Record> records;
    public Records(){
        records= new ArrayList<Record>();
    }

    public ArrayList<Record> getRecords() {
        return records;
    }

   
    public  boolean ingresar(Record record)
    {
        if(records.contains(record))
        {
            return false;
        }
        
        else 
        {
            records.add(record);
            return true;
        }
    }
    
    
    public  void burbuja(){
         int i, j;
         Record aux;
         for(i=0;i<records.size()-1;i++)
              for(j=0;j<records.size()-i-1;j++)
                   if(records.get(j+1).getPlayer().getScore()<records.get(j).getPlayer().getScore()){
                      aux=records.get(j+1);
                      records.add(j+1,records.get(j));
                      records.add(j, aux);
                   }
    }
    
   

}
