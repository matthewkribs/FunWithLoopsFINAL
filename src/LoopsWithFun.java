/*
This program prompts the user for a starting number, and then an ending number. Then 
after the button is clicked the program displays all values in between the two numbers.
April 12, 2017  
Matthew Kribs
 */

/**
 *
 * @author makri3110
 */
public class LoopsWithFun extends javax.swing.JFrame {

    /**
     * Creates new form LoopsWithFun
     */
    public LoopsWithFun() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        startingNumberText = new javax.swing.JLabel();
        endingNumberText = new javax.swing.JLabel();
        startNumberInput = new javax.swing.JTextField();
        endNumberInput = new javax.swing.JTextField();
        showValues = new javax.swing.JButton();
        finalDisplay = new javax.swing.JLabel();
        MenuTab = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ExitOption = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("MicrogrammaDEEBolExt", 1, 36)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Fun With Loops");

        startingNumberText.setFont(new java.awt.Font("MicrogrammaDEEBolExt", 0, 18)); // NOI18N
        startingNumberText.setText("Enter a starting number:");

        endingNumberText.setFont(new java.awt.Font("MicrogrammaDEEBolExt", 0, 18)); // NOI18N
        endingNumberText.setText("Enter an ending number:");

        startNumberInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startNumberInputActionPerformed(evt);
            }
        });

        showValues.setText("Show Values");
        showValues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showValuesActionPerformed(evt);
            }
        });

        finalDisplay.setFont(new java.awt.Font("MicrogrammaDEEBolExt", 0, 18)); // NOI18N
        finalDisplay.setForeground(new java.awt.Color(51, 51, 255));

        jMenu1.setText("File");

        ExitOption.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        ExitOption.setText("Exit");
        ExitOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitOptionActionPerformed(evt);
            }
        });
        jMenu1.add(ExitOption);

        MenuTab.add(jMenu1);

        jMenu2.setText("Edit");
        MenuTab.add(jMenu2);

        setJMenuBar(MenuTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(finalDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(startingNumberText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                    .addComponent(endingNumberText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(showValues, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(endNumberInput)
                                    .addComponent(startNumberInput))))
                        .addGap(0, 92, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(startNumberInput)
                    .addComponent(startingNumberText, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(endingNumberText, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(endNumberInput))
                .addGap(18, 18, 18)
                .addComponent(showValues)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(finalDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startNumberInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startNumberInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startNumberInputActionPerformed

    private void showValuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showValuesActionPerformed
        String pool = "";//
        
        int startingValue = Integer.parseInt(startNumberInput.getText());
        int endingValue = Integer.parseInt(endNumberInput.getText());
        
        for (int i = startingValue; i <= endingValue; i++){
            pool += i;
        }
        finalDisplay.setText(pool);
    }//GEN-LAST:event_showValuesActionPerformed

    private void ExitOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitOptionActionPerformed
    System.exit(0);
    }//GEN-LAST:event_ExitOptionActionPerformed

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
            java.util.logging.Logger.getLogger(LoopsWithFun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoopsWithFun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoopsWithFun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoopsWithFun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoopsWithFun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ExitOption;
    private javax.swing.JMenuBar MenuTab;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField endNumberInput;
    private javax.swing.JLabel endingNumberText;
    private javax.swing.JLabel finalDisplay;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JButton showValues;
    private javax.swing.JTextField startNumberInput;
    private javax.swing.JLabel startingNumberText;
    // End of variables declaration//GEN-END:variables
}
