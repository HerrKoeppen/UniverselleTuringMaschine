/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


 

/**
 *
 * @author kiara.jung
 */
public class NewJFrame extends javax.swing.JFrame {
    


    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        jFrameFileChooser = new javax.swing.JFrame();
        jFileChooser1 = new javax.swing.JFileChooser();
        TextFeld1 = new javax.swing.JTextField();
        EingabeB = new javax.swing.JButton();
        WahlTuringB = new javax.swing.JButton();
        jTextFieldTuring = new javax.swing.JTextField();
        jLabelWort = new javax.swing.JLabel();
        jLabelTuring = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAusgabe1 = new javax.swing.JTextArea();
        jLabelAusgabe1 = new javax.swing.JLabel();

        jFrameFileChooser.setSize(new java.awt.Dimension(600, 500));

        javax.swing.GroupLayout jFrameFileChooserLayout = new javax.swing.GroupLayout(jFrameFileChooser.getContentPane());
        jFrameFileChooser.getContentPane().setLayout(jFrameFileChooserLayout);
        jFrameFileChooserLayout.setHorizontalGroup(
            jFrameFileChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameFileChooserLayout.createSequentialGroup()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                .addContainerGap())
        );
        jFrameFileChooserLayout.setVerticalGroup(
            jFrameFileChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameFileChooserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jFileChooser1.getAccessibleContext().setAccessibleParent(WahlTuringB);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        EingabeB.setText("Wort einlesen");
        EingabeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EingabeBActionPerformed(evt);
            }
        });

        WahlTuringB.setText("Wähle Turing-Maschine");
        WahlTuringB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WahlTuringBActionPerformed(evt);
            }
        });

        jTextFieldTuring.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTuringActionPerformed(evt);
            }
        });

        jLabelWort.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelWort.setText("Das einzulesende Wort eintragen:");

        jLabelTuring.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelTuring.setText("Folgende Datei gewählt:");

        jTextAreaAusgabe1.setColumns(20);
        jTextAreaAusgabe1.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAusgabe1);

        jLabelAusgabe1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelAusgabe1.setText("Ergebnis:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(WahlTuringB)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTuring, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTuring)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelWort)
                        .addGap(74, 74, 74)
                        .addComponent(jLabelAusgabe1)))
                .addContainerGap(141, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(EingabeB, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TextFeld1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(WahlTuringB, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTuring)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldTuring, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelWort)
                    .addComponent(jLabelAusgabe1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextFeld1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EingabeB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EingabeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EingabeBActionPerformed

        wort = TextFeld1.getText();
    }//GEN-LAST:event_EingabeBActionPerformed

  private void ergebnisAusgeben(){
//   if(/*Wort gehört nicht zum Eingabealphabet*/){
//            ausgabe="Das Wort "+wort+" gehört nicht zum Eingabealphabet. Überprüfung nicht erfolgreich!";
//   }
//     else if(/*Rückgabewert von überprüfung false*/){
//            ausgabe="Das Wort "+wort+" gehört nicht zur formalen Sprache. Überprüfung nicht erfolgreich!";
//     }
//        else{
//            ausgabe="Das Wort "+wort+" gehört zur formalen Sprache. Überprüfung erfolgreich!";
//        }
     jTextAreaAusgabe1.setText(ausgabe);
  }  
   
    private void WahlTuringBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WahlTuringBActionPerformed
         jFileChooser1.showOpenDialog(null);
         
         int rueckgabeWert = jFileChooser1.showOpenDialog(null);
         
         if(rueckgabeWert == jFileChooser1.APPROVE_OPTION)
         {
         dateiPfad = jFileChooser1.getSelectedFile().getAbsolutePath();
        System.out.println(dateiPfad);
        jTextFieldTuring.setText(jFileChooser1.getSelectedFile().getName()) ;
         }
    }//GEN-LAST:event_WahlTuringBActionPerformed

    private void jTextFieldTuringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTuringActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTuringActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EingabeB;
    private javax.swing.JTextField TextFeld1;
    private javax.swing.JButton WahlTuringB;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFrame jFrameFileChooser;
    private javax.swing.JLabel jLabelAusgabe1;
    private javax.swing.JLabel jLabelTuring;
    private javax.swing.JLabel jLabelWort;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea jTextAreaAusgabe1;
    private javax.swing.JTextField jTextFieldTuring;
    // End of variables declaration//GEN-END:variables
   //Eigene Variablen:
   public String wort;
   public String dateiPfad;
   public String ausgabe;
}
