/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowling;
import java.awt.Color;
/**
 *
 * @author LC
 */
public class NewPlayers extends javax.swing.JFrame {

    /**
     * Creates new form NewPlayers
     */
    public NewPlayers() {
        initComponents();
          this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nombrePlayer1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombrePlayer2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        message = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Por favor ingrese el jugador 1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));
        getContentPane().add(nombrePlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 230, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nombre jugador 1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Por favor ingrese el jugador 2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Nombre jugador 2");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, -1, -1));
        getContentPane().add(nombrePlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 230, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("A jugar!!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 319, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));
        getContentPane().add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 540, 20));
        message.getAccessibleContext().setAccessibleName("message");

        jLabel5.setFont(new java.awt.Font("Javanese Text", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(125, 30, 1));
        jLabel5.setText(" Comenzar");
        jLabel5.setToolTipText("");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 90, 40));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Plantilla.jpg"))); // NOI18N
        getContentPane().add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Se sacan las variables y se validan
        String nombre1= nombrePlayer1.getText();
        String nombre2= nombrePlayer2.getText();
        //Se crea el color rojo en caso de haber un error en el ingreso del nombre
        Color color = new Color(255,0,0);
        //Se llama a método que valida los nombres de los jugadores
        byte op = Player.validation(nombre1, nombre2);
        switch (op)
        {
            case 0: message.setText("Nombre de jugador uno no válido");
                    nombrePlayer1.requestFocus();
                    nombrePlayer1.setForeground(color);
                    break;
            case 1: message.setText("Nombre de jugador dos no válido");
                    nombrePlayer2.requestFocus();
                    nombrePlayer2.setForeground(color);
                    break;
            case 2: message.setText("Nombre de jugadores no válido");
                    nombrePlayer1.requestFocus();
                    nombrePlayer1.setForeground(color);
                    nombrePlayer2.setForeground(color);
                    break;
            case 3: //Se intancia cada jugador con su nombre respectivo y su nivel
                    Player player1= new Player(nombre1, (byte)0);
                    Player player2= new Player(nombre2, (byte)0); 
                    Game game = new Game(player1, player2);//Se instancia la ventana para ser utilizada
                    game.setVisible(true);//Ponemos visible la ventana
                    this.setVisible(false);//Dejamos invisible la ventana anterior
                    break;
        }
        
        
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Main main = new Main();//Se instancia la ventana para ser utilizada
        main.setVisible(true);//Ponemos visible la ventana
        this.setVisible(false);//Dejamos invible la ventana anterior
    }//GEN-LAST:event_jButton2ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel message;
    private javax.swing.JTextField nombrePlayer1;
    private javax.swing.JTextField nombrePlayer2;
    // End of variables declaration//GEN-END:variables
}
