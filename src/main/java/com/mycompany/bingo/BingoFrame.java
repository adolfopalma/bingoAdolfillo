package com.mycompany.bingo;

import java.util.ArrayList;
import java.util.List;


public class BingoFrame extends javax.swing.JFrame {

    List<Integer> bombo;
    List<Integer> carton1;
    List<Integer> carton2;
    List<Integer> discards;

    int randomNumber;
    boolean win;

    
    public BingoFrame() {
        initComponents();
        bombo = new ArrayList<>();
        discards = new ArrayList<>();
        carton1 = new ArrayList<>();
        carton2 = new ArrayList<>();
        win = false;
        
        fillCarton();
        fillPlayerCarton();
    }
    
    private void fillCarton(){
        for (int i = 1; i <= 100; i++) {
            bombo.add(i);
        }
        
        for (int i = 1; i <= 10; i++) {
            carton1.add((int)(Math.random()*100+1));
        }
        
        for (int i = 1; i <= 10; i++) {
            carton2.add((int)(Math.random()*100+1));
        }
    }
    
    private void fillPlayerCarton(){
        for (int c1: carton1){
            taCarton1.append(c1 + "  ");
        }
        
        for (int c2 : carton2){
            taCarton2.append(c2 + "  ");
        }
    }
    
    private void fillDiscardsCarton(){
        taDiscards.setText("");
        for (int dis : discards){
            taDiscards.append(dis + "  ");
        }
    }
    
    private void clearCartonNumbers(){
        taCarton1.setText("");
        taCarton2.setText("");
    }
    
    private void checkNumber(){
        for (int i=0; i < carton1.size(); i++){
            if(carton1.get(i) == randomNumber){
                carton1.remove(i);
            }
        }
        for (int i=0; i < carton2.size(); i++){
            if(carton2.get(i) == randomNumber){
                carton2.remove(i);
            }
        }
        clearCartonNumbers();
        fillPlayerCarton();
    }
    
    private void checkWinner(){
        if(carton1.size() <= 0){
            winner.setText("GANA EL CARTON 1");
            win = true;
        }
        if(carton2.size() <= 0){
            winner.setText("GANA EL CARTON 2");
            win = true;
        }
    }
    
    private void deleteNumber(int n){
        for (int i=0; i < bombo.size(); i++){
            if(bombo.get(i) == n){
                bombo.remove(i);
            }
        }
    }
    

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        carton1Title = new javax.swing.JLabel();
        carton2Title = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taDiscards = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        taCarton2 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        taCarton1 = new javax.swing.JTextArea();
        resetButton = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        taNumbersInBombo = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        displayNumber = new javax.swing.JLabel();
        winner = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(0, 153, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Sacar Bola");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        carton1Title.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        carton1Title.setText("Carton 1");

        carton2Title.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        carton2Title.setText("Carton 2");

        taDiscards.setColumns(20);
        taDiscards.setRows(5);
        jScrollPane3.setViewportView(taDiscards);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("NUMEROS QUE YA HAN SALIDO");

        taCarton2.setColumns(20);
        taCarton2.setRows(5);
        jScrollPane4.setViewportView(taCarton2);

        taCarton1.setColumns(20);
        taCarton1.setRows(5);
        jScrollPane5.setViewportView(taCarton1);

        resetButton.setBackground(new java.awt.Color(255, 204, 0));
        resetButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        resetButton.setForeground(new java.awt.Color(0, 153, 255));
        resetButton.setText("Reiniciar");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        taNumbersInBombo.setColumns(20);
        taNumbersInBombo.setRows(5);
        jScrollPane6.setViewportView(taNumbersInBombo);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setText("NUMEROS QUE QUEDAN");

        displayNumber.setBackground(new java.awt.Color(0, 255, 51));
        displayNumber.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        displayNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        winner.setBackground(new java.awt.Color(51, 255, 51));
        winner.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        winner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(displayNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(74, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(winner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(143, 143, 143))
            .addGroup(layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(carton1Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(carton2Title)
                .addGap(215, 215, 215))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displayNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carton1Title)
                    .addComponent(carton2Title))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(winner, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(193, Short.MAX_VALUE))
        );

        jButton1.getAccessibleContext().setAccessibleName("buttonStart");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(win == false){
            randomNumber = (int)bombo.get((int)(Math.random()*bombo.size()));
            deleteNumber(randomNumber);
            displayNumber.setText("" + randomNumber);
            checkNumber();
            discards.add(randomNumber);  
            fillDiscardsCarton();
            checkWinner();  
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        clearCartonNumbers();
        carton1.clear();
        carton2.clear();
        discards.clear();
        bombo.clear();
        winner.setText("");
        fillDiscardsCarton();
        fillCarton();
        fillPlayerCarton();
        win = false;
        displayNumber.setText("");
    }//GEN-LAST:event_resetButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BingoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BingoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BingoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BingoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BingoFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel carton1Title;
    private javax.swing.JLabel carton2Title;
    private javax.swing.JLabel displayNumber;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextArea taCarton1;
    private javax.swing.JTextArea taCarton2;
    private javax.swing.JTextArea taDiscards;
    private javax.swing.JTextArea taNumbersInBombo;
    private javax.swing.JLabel winner;
    // End of variables declaration//GEN-END:variables
}