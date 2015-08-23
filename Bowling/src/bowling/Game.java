/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowling;

import com.google.gson.Gson;
import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;
import tabla.Record;
import tabla.Records;

/**
 *
 * @author LC
 */
public class Game extends javax.swing.JFrame {

    private Player player1;
    private Player player2;
    short score1, score2;
    byte intento = 1;
    byte contador = 0;
    byte pinos = 10;
    String msg= "Puntuacion: ";
    //Todos los pinos parten es estado activo , 
    //estas variables se ocupan para saber si el pino ya fue botado en la misma tirada
    boolean estado1=true;
    boolean estado2=true;
    boolean estado3=true;
    boolean estado4=true;
    boolean estado5=true;
    boolean estado6=true;
    boolean estado7=true;
    boolean estado8=true;
    boolean estado9=true;
    boolean estado10=true;
    boolean estado11=true;
    boolean estado12=true;
    boolean estado13=true;
    boolean estado14=true;
    boolean estado15=true;
    boolean estado16=true;
    boolean estado17=true;
    boolean estado18=true;
    boolean estado19=true;
    boolean estado20=true;
   
   
    
    public Game(Player player1, Player player2) {
        initComponents();
        this.setLocationRelativeTo(null);
        lblScore1.setText(msg);
        lblScore2.setText(msg);
        this.player1= player1;
        this.player2=player2;
        llenarNombres();//Metodo para llenar los nombres
        btnLanza2.setEnabled(false);
        pintarPinos();
        pintarPinos2();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre1 = new javax.swing.JLabel();
        nombre2 = new javax.swing.JLabel();
        derribos = new javax.swing.JLabel();
        btnLanza1 = new javax.swing.JButton();
        btnLanza2 = new javax.swing.JButton();
        lblScore1 = new javax.swing.JLabel();
        lblScore2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pino7 = new javax.swing.JRadioButton();
        pino8 = new javax.swing.JRadioButton();
        pino9 = new javax.swing.JRadioButton();
        pino10 = new javax.swing.JRadioButton();
        pino11 = new javax.swing.JRadioButton();
        pino15 = new javax.swing.JRadioButton();
        pino14 = new javax.swing.JRadioButton();
        pino13 = new javax.swing.JRadioButton();
        pino12 = new javax.swing.JRadioButton();
        pino16 = new javax.swing.JRadioButton();
        pino17 = new javax.swing.JRadioButton();
        pino18 = new javax.swing.JRadioButton();
        pino20 = new javax.swing.JRadioButton();
        pino19 = new javax.swing.JRadioButton();
        pino3 = new javax.swing.JRadioButton();
        pino4 = new javax.swing.JRadioButton();
        pino2 = new javax.swing.JRadioButton();
        pino6 = new javax.swing.JRadioButton();
        pino5 = new javax.swing.JRadioButton();
        pino1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombre1.setText("Nombre 1");
        getContentPane().add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        nombre2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombre2.setText("Nombre 2");
        getContentPane().add(nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, -1, -1));

        derribos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        derribos.setText("Por favor lance la bola...");
        getContentPane().add(derribos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 250, -1));

        btnLanza1.setText("¡Lanzar Player 1!");
        btnLanza1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanza1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLanza1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        btnLanza2.setText("¡Lanzar Player 2!");
        btnLanza2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanza2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLanza2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, -1, -1));

        lblScore1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblScore1.setText("jLabel1");
        getContentPane().add(lblScore1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        lblScore2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblScore2.setText("jLabel1");
        getContentPane().add(lblScore2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, -1, -1));

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, -1, -1));

        pino7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pino7ActionPerformed(evt);
            }
        });
        getContentPane().add(pino7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        pino8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pino8ActionPerformed(evt);
            }
        });
        getContentPane().add(pino8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        pino9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pino9ActionPerformed(evt);
            }
        });
        getContentPane().add(pino9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        pino10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pino10ActionPerformed(evt);
            }
        });
        getContentPane().add(pino10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        pino11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pino11ActionPerformed(evt);
            }
        });
        getContentPane().add(pino11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, -1, -1));

        pino15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pino15ActionPerformed(evt);
            }
        });
        getContentPane().add(pino15, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, -1, -1));

        pino14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pino14ActionPerformed(evt);
            }
        });
        getContentPane().add(pino14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, -1, -1));

        pino13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pino13ActionPerformed(evt);
            }
        });
        getContentPane().add(pino13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, -1, -1));

        pino12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pino12ActionPerformed(evt);
            }
        });
        getContentPane().add(pino12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, -1, -1));

        pino16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pino16ActionPerformed(evt);
            }
        });
        getContentPane().add(pino16, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, -1, -1));

        pino17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pino17ActionPerformed(evt);
            }
        });
        getContentPane().add(pino17, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, -1, -1));

        pino18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pino18ActionPerformed(evt);
            }
        });
        getContentPane().add(pino18, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, -1, -1));

        pino20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pino20ActionPerformed(evt);
            }
        });
        getContentPane().add(pino20, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, -1, -1));

        pino19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pino19ActionPerformed(evt);
            }
        });
        getContentPane().add(pino19, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, -1, -1));

        pino3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pino3ActionPerformed(evt);
            }
        });
        getContentPane().add(pino3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        pino4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pino4ActionPerformed(evt);
            }
        });
        getContentPane().add(pino4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        pino2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pino2ActionPerformed(evt);
            }
        });
        getContentPane().add(pino2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 20, -1));

        pino6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pino6ActionPerformed(evt);
            }
        });
        getContentPane().add(pino6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        pino5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pino5ActionPerformed(evt);
            }
        });
        getContentPane().add(pino5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        pino1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pino1ActionPerformed(evt);
            }
        });
        getContentPane().add(pino1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        jLabel1.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(125, 30, 1));
        jLabel1.setText("Jugando");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, 20));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Plantilla.jpg"))); // NOI18N
        getContentPane().add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLanza1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanza1ActionPerformed

         pintarPinos2();
        if(contador<39)
        {
           
            
        byte lanzamiento = Random.Azar(pinos);
        botarPino(lanzamiento);
        pinos = (byte) (pinos - lanzamiento);
        intento++;
        score1= (short)(score1+lanzamiento);
        contador++;
        lblScore1.setText(msg+score1);

        //En caso de strike 
        if(lanzamiento == 10)
        {
            derribos.setText("Strike!");
        }
        
        derribos.setText("Jugador 1: derribaste "+lanzamiento+" pinos");
        if(pinos == 0 && intento == 2)
        {
            btnLanza1.setEnabled(false);
            btnLanza2.setEnabled(true);
            pinos=10;
            intento=1;
            
            resetPinos();
            
        }
        
        if(intento==3) 
        {
            
            btnLanza1.setEnabled(false);
            btnLanza2.setEnabled(true);
            pinos=10;
            intento=1;
          
            resetPinos();
           
            
        }
        
        }else
        {
            btnLanza1.setEnabled(false);
            btnLanza2.setEnabled(false);
            
            
            Save();
            
               
                Main main = new Main();
                main.setVisible(true);
                this.setVisible(false);
            }
    }//GEN-LAST:event_btnLanza1ActionPerformed
        
    private void btnLanza2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanza2ActionPerformed
        pintarPinos();
        if(contador<=38)
        {
            
            
        
        byte lanzamiento = Random.Azar(pinos);
        botarPino2(lanzamiento);
        pinos = (byte) (pinos - lanzamiento);
        intento++;
        score2= (short)(score2+lanzamiento);
        //player2.setScore((short)(player2.getScore() + score2));
        contador++;
        lblScore2.setText(msg+score2);

        //En caso de strike 
        if(lanzamiento == 10)
        {
            derribos.setText("Strike!");
        }
        derribos.setText("Jugador 2: derribaste "+lanzamiento+" pinos");
        if(pinos == 0 && intento == 2)
        {
            btnLanza1.setEnabled(true);
            btnLanza2.setEnabled(false);
            pinos=10;
            intento=1;
            
            resetPinos2();
            
        }

        if(intento==3 && contador < 40) 
        {
           
            btnLanza1.setEnabled(true);
            btnLanza2.setEnabled(false);
            pinos=10;
            intento=1;
          
            resetPinos2();
           
            
        }
        
        
        }else
        
        {
            btnLanza1.setEnabled(false);
            btnLanza2.setEnabled(false);
            
            
            Save();
                
                
                Main main = new Main();
                main.setVisible(true);
                this.setVisible(false);
            }
    }//GEN-LAST:event_btnLanza2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Main main = new Main();
        main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pino7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pino7ActionPerformed
        pino7.setSelected(!pino7.isSelected());
    }//GEN-LAST:event_pino7ActionPerformed

    private void pino1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pino1ActionPerformed
        pino1.setSelected(!pino1.isSelected());
    }//GEN-LAST:event_pino1ActionPerformed

    private void pino3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pino3ActionPerformed
        pino3.setSelected(!pino3.isSelected());
    }//GEN-LAST:event_pino3ActionPerformed

    private void pino2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pino2ActionPerformed
        pino2.setSelected(!pino2.isSelected());
    }//GEN-LAST:event_pino2ActionPerformed

    private void pino10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pino10ActionPerformed
        pino10.setSelected(!pino10.isSelected());
    }//GEN-LAST:event_pino10ActionPerformed

    private void pino5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pino5ActionPerformed
        pino5.setSelected(!pino5.isSelected());
    }//GEN-LAST:event_pino5ActionPerformed

    private void pino9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pino9ActionPerformed
        pino9.setSelected(!pino9.isSelected());
    }//GEN-LAST:event_pino9ActionPerformed

    private void pino4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pino4ActionPerformed
        pino4.setSelected(!pino4.isSelected());
    }//GEN-LAST:event_pino4ActionPerformed

    private void pino6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pino6ActionPerformed
        pino6.setSelected(!pino6.isSelected());
    }//GEN-LAST:event_pino6ActionPerformed

    private void pino8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pino8ActionPerformed
        pino8.setSelected(!pino8.isSelected());
    }//GEN-LAST:event_pino8ActionPerformed

    private void pino11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pino11ActionPerformed
         pino11.setSelected(!pino11.isSelected());
    }//GEN-LAST:event_pino11ActionPerformed

    private void pino12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pino12ActionPerformed
         pino12.setSelected(!pino12.isSelected());
    }//GEN-LAST:event_pino12ActionPerformed

    private void pino13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pino13ActionPerformed
         pino13.setSelected(!pino13.isSelected());
    }//GEN-LAST:event_pino13ActionPerformed

    private void pino14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pino14ActionPerformed
         pino14.setSelected(!pino14.isSelected());
    }//GEN-LAST:event_pino14ActionPerformed

    private void pino15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pino15ActionPerformed
         pino15.setSelected(!pino15.isSelected());
    }//GEN-LAST:event_pino15ActionPerformed

    private void pino16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pino16ActionPerformed
         pino16.setSelected(!pino16.isSelected());
    }//GEN-LAST:event_pino16ActionPerformed

    private void pino17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pino17ActionPerformed
         pino17.setSelected(!pino17.isSelected());
    }//GEN-LAST:event_pino17ActionPerformed

    private void pino18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pino18ActionPerformed
         pino18.setSelected(!pino18.isSelected());
    }//GEN-LAST:event_pino18ActionPerformed

    private void pino19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pino19ActionPerformed
         pino19.setSelected(!pino19.isSelected());
    }//GEN-LAST:event_pino19ActionPerformed

    private void pino20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pino20ActionPerformed
         pino20.setSelected(!pino20.isSelected());
    }//GEN-LAST:event_pino20ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLanza1;
    private javax.swing.JButton btnLanza2;
    private javax.swing.JLabel derribos;
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblScore1;
    private javax.swing.JLabel lblScore2;
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel nombre2;
    private javax.swing.JRadioButton pino1;
    private javax.swing.JRadioButton pino10;
    private javax.swing.JRadioButton pino11;
    private javax.swing.JRadioButton pino12;
    private javax.swing.JRadioButton pino13;
    private javax.swing.JRadioButton pino14;
    private javax.swing.JRadioButton pino15;
    private javax.swing.JRadioButton pino16;
    private javax.swing.JRadioButton pino17;
    private javax.swing.JRadioButton pino18;
    private javax.swing.JRadioButton pino19;
    private javax.swing.JRadioButton pino2;
    private javax.swing.JRadioButton pino20;
    private javax.swing.JRadioButton pino3;
    private javax.swing.JRadioButton pino4;
    private javax.swing.JRadioButton pino5;
    private javax.swing.JRadioButton pino6;
    private javax.swing.JRadioButton pino7;
    private javax.swing.JRadioButton pino8;
    private javax.swing.JRadioButton pino9;
    // End of variables declaration//GEN-END:variables

    private void llenarNombres() {
        //Obtenemos ambos nombres de los jugadores y los ponemos en los 
        nombre1.setText(player1.getNombre());
        nombre2.setText(player2.getNombre());
    }

    private void CrearArchivo() {
         Gson gson = new Gson();
        Records records= new Records();
	String json = gson.toJson(records);

	try {
		//se escribe el archivo json vacio con la estructura correspondiente "score.json"
		FileWriter writer = new FileWriter("score.json");
		writer.write(json);
		writer.close();

	} catch (IOException e) {
		e.printStackTrace();
	}
    }

    private void Save() {
        player1.setScore((short)(score1));
        player2.setScore((short)(score2));
        if(player1.getScore()>player2.getScore())
        JOptionPane.showMessageDialog(null, "¡¡Ganador player 1!!..Gracias por jugar.");
        
        else if(player1.getScore()<player2.getScore())
             JOptionPane.showMessageDialog(null, "¡¡Ganador player 2!!..Gracias por jugar.");
        
        else
             JOptionPane.showMessageDialog(null, "¡¡Ha ocurrido un empate!!..Gracias por jugar.");
        Gson gson = new Gson();
                try {
                    //Se lee el archivo json que contiene los records
                    BufferedReader br = new BufferedReader(new FileReader("score.json"));
                    //El archivo json se combierte en un objeto
                    Records records = gson.fromJson(br, Records.class);
                    records.ingresar(new Record(player1, new Date()));
                    records.ingresar(new Record(player2, new Date()));
                    Collections.sort(records.getRecords(), new Comparator() {
                        //Sobre-escribimos el motodo compare para indicar cual es la variable que queremos comparar para ordenar la lista
                        @Override
                        public int compare(Object o1, Object o2) {
                            
                            return new Short(((Record)o2).getPlayer().getScore()).compareTo(((Record)o1).getPlayer().getScore());
                        }
                    });
                   
                    //Grabamos los record nuevos
                    String json = gson.toJson(records);
                    try {
                              //write converted json data to a file named "file.json"
                              FileWriter writer = new FileWriter("score.json");
                              writer.write(json);
                              writer.close();
                              

                      } catch (IOException e) {
                            
                              e.printStackTrace();
                      }

            } catch (IOException e) {
                CrearArchivo();//funcion para crear el archivo de scores en caso que no exista
                Save();
             

            }
           catch (Exception e) {
                 e.printStackTrace();
            }
    }

    private void pintarPinos() {
       
        pino1.setSelected(true);
        pino2.setSelected(true);
        pino3.setSelected(true);
        pino4.setSelected(true);
        pino5.setSelected(true);
        pino6.setSelected(true);
        pino7.setSelected(true);
        pino8.setSelected(true);
        pino9.setSelected(true);
        pino10.setSelected(true);
    }
    
     private void pintarPinos2() {
       
        pino11.setSelected(true);
        pino12.setSelected(true);
        pino13.setSelected(true);
        pino14.setSelected(true);
        pino15.setSelected(true);
        pino16.setSelected(true);
        pino17.setSelected(true);
        pino18.setSelected(true);
        pino19.setSelected(true);
        pino20.setSelected(true);
    }

    private void botarPino(byte cantidad) {
       
        for (int i = 0; i < cantidad; i++) {
            switch(Random.Azar((byte)10)){
                case 0:
                    pino1.setSelected(false);
                    if(estado1)
                        estado1=false;
                    else
                        i--;
                    break;
                case 1:
                    pino2.setSelected(false);
                    if(estado2)
                        estado2=false;
                    else
                        i--;
                    break;
                case 2:
                    pino3.setSelected(false);
                    if(estado3)
                        estado3=false;
                    else
                        i--;
                    break;
                case 3:
                    pino4.setSelected(false);
                    if(estado4)
                        estado4=false;
                    else
                        i--;
                    break;
                case 4:
                    pino5.setSelected(false);
                    if(estado5)
                        estado5=false;
                    else
                        i--;
                    break;
                case 5:
                    pino6.setSelected(false);
                    if(estado6)
                        estado6=false;
                    else
                        i--;
                    break;
                case 6:
                    pino7.setSelected(false);
                    if(estado7)
                        estado7=false;
                    else
                        i--;
                    break;
                case 7:
                    pino8.setSelected(false);
                    if(estado8)
                        estado8=false;
                    else
                        i--;
                    break;
                case 8:
                    pino9.setSelected(false);
                    if(estado9)
                        estado9=false;
                    else
                        i--;
                    break;
                case 9:
                    pino10.setSelected(false);
                    if(estado10)
                        estado10=false;
                    else
                        i--;
                    break;
                
            
            }
        }
       
    }
    
    private void botarPino2(byte cantidad) {
       
        for (int i = 0; i < cantidad; i++) {
            switch(Random.Azar((byte)10)){
                case 0:
                    pino11.setSelected(false);
                    if(estado11)
                        estado11=false;
                    else
                        i--;
                    break;
                case 1:
                    pino12.setSelected(false);
                    if(estado12)
                        estado12=false;
                    else
                        i--;
                    break;
                case 2:
                    pino13.setSelected(false);
                    if(estado13)
                        estado13=false;
                    else
                        i--;
                    break;
                case 3:
                    pino14.setSelected(false);
                    if(estado14)
                        estado14=false;
                    else
                        i--;
                    break;
                case 4:
                    pino15.setSelected(false);
                    if(estado15)
                        estado15=false;
                    else
                        i--;
                    break;
                case 5:
                    pino16.setSelected(false);
                    if(estado16)
                        estado16=false;
                    else
                        i--;
                    break;
                case 6:
                    pino17.setSelected(false);
                    if(estado17)
                        estado17=false;
                    else
                        i--;
                    break;
                case 7:
                    pino18.setSelected(false);
                    if(estado18)
                        estado18=false;
                    else
                        i--;
                    break;
                case 8:
                    pino19.setSelected(false);
                    if(estado19)
                        estado19=false;
                    else
                        i--;
                    break;
                case 9:
                    pino20.setSelected(false);
                    if(estado20)
                        estado20=false;
                    else
                        i--;
                    break;
                
            
            }
        }
       
    }

    private void resetPinos() {
        estado1=true;
        estado2=true;
        estado3=true;
        estado4=true;
        estado5=true;
        estado6=true;
        estado7=true;
        estado8=true;
        estado9=true;
        estado10=true;
    }
    
     private void resetPinos2() {
        estado11=true;
        estado12=true;
        estado13=true;
        estado14=true;
        estado15=true;
        estado16=true;
        estado17=true;
        estado18=true;
        estado19=true;
        estado20=true;
    }
}
