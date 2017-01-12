/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;


 

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

        jFileChooser1 = new javax.swing.JFileChooser();
        jTextFieldWort1 = new javax.swing.JTextField();
        jButtonEinlesen1 = new javax.swing.JButton();
        jButtonWaehlen1 = new javax.swing.JButton();
        jTextFieldTuring1 = new javax.swing.JTextField();
        jLabelWort1 = new javax.swing.JLabel();
        jLabelTuring1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAusgabe1 = new javax.swing.JTextArea();
        jLabelAusgabe1 = new javax.swing.JLabel();
        jButtonStarten1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonEinlesen1.setText("Wort einlesen");
        jButtonEinlesen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEinlesen1ActionPerformed(evt);
            }
        });

        jButtonWaehlen1.setText("Wähle Turing-Maschine");
        jButtonWaehlen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWaehlen1ActionPerformed(evt);
            }
        });

        jTextFieldTuring1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTuring1ActionPerformed(evt);
            }
        });

        jLabelWort1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelWort1.setText("Das einzulesende Wort eintragen:");

        jLabelTuring1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelTuring1.setText("Folgende Datei gewählt:");

        jTextAreaAusgabe1.setColumns(20);
        jTextAreaAusgabe1.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAusgabe1);

        jLabelAusgabe1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelAusgabe1.setText("Ergebnis:");

        jButtonStarten1.setText("Überprüfung starten");
        jButtonStarten1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStarten1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelWort1)
                    .addComponent(jTextFieldWort1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonEinlesen1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButtonWaehlen1)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTuring1)
                    .addComponent(jTextFieldTuring1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButtonStarten1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelAusgabe1)
                        .addGap(147, 147, 147))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonWaehlen1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTuring1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTuring1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelWort1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldWort1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonEinlesen1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelAusgabe1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonStarten1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Funtion um Wort einzulesen
    private void jButtonEinlesen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEinlesen1ActionPerformed

        wort = jTextFieldWort1.getText(); //Einzulesendes Wort
        jTextAreaAusgabe1.setText(null);
        ausgabe="Das Wort "+wort+" wurde eingelesen.";
            jTextAreaAusgabe1.setText(ausgabe);
        
    }//GEN-LAST:event_jButtonEinlesen1ActionPerformed

   //JFileChooser öffnen, um Datei auswählen zu können
    private void jButtonWaehlen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWaehlen1ActionPerformed
         
         int rueckgabeWert = jFileChooser1.showOpenDialog(null);
         
         if(rueckgabeWert == JFileChooser.APPROVE_OPTION)
         {
         dateiPfad = jFileChooser1.getSelectedFile().getAbsolutePath(); //Dateipfad
        jTextFieldTuring1.setText(jFileChooser1.getSelectedFile().getName()) ; //Dateiname
        
         }
    }//GEN-LAST:event_jButtonWaehlen1ActionPerformed


    private void jTextFieldTuring1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTuring1ActionPerformed
        //Nicht verwendet, kann nicht gelöscht werden, da es schreibgeschützt ist
    }//GEN-LAST:event_jTextFieldTuring1ActionPerformed

    //Unsere eigentliche Main-Funktion:
    private void jButtonStarten1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStarten1ActionPerformed
        jTextAreaAusgabe1.setText(null);
      if(dateiPfad==null) {
        //Fehlermeldung ausgebn, wenn keine Datei ausgewählt wurde 
        ausgabe="Keine Turingmaschine ausgewählt. \nÜberprüfung nicht möglich!"; 
        jTextAreaAusgabe1.setText(ausgabe);
        return;
      }
      else if(wort==null){
         //Fehlermeldung ausgeben, wenn kein Wort ausgewählt wurde
         ausgabe="Kein Wort eingegeben. \nÜberprüfung nicht möglich!";
         jTextAreaAusgabe1.setText(ausgabe);
         return;
      }
      jTextAreaAusgabe1.setText(null);
      ausgabe="Es wird überprüft...";
      textgruppe.Texteinlesen e = new textgruppe.Texteinlesen();
        try {
            e.dateiEinlesen(dateiPfad);
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        e.angabenInArraySpeichern();
        turingband.Turingband t = new turingband.Turingband(wort,e);
        e.wortUeberpruefen(wort, t);
        if(!e.eingabePositiv){
            jTextAreaAusgabe1.setText(null);
            ausgabe="Das Wort "+wort+" gehört nicht zum Eingabealphabet. \nÜberprüfung nicht erfolgreich!";
            jTextAreaAusgabe1.setText(ausgabe);
            return;
        }
        uebergangsfunktion.Uebergangsfunktion u = new uebergangsfunktion.Uebergangsfunktion(e);
        if(u.uebergang(u.hashUebergang, t, e)){
            jTextAreaAusgabe1.setText(null);
            ausgabe="Das Wort "+wort+" gehört zur formalen Sprache. \nÜberprüfung erfolgreich!";
            jTextAreaAusgabe1.setText(ausgabe);
        }
        else{
        jTextAreaAusgabe1.setText(null);
        ausgabe="Das Wort "+wort+" gehört nicht zur formalen Sprache. \nÜberprüfung nicht erfolgreich!";;
        jTextAreaAusgabe1.setText(ausgabe);
        }
    }//GEN-LAST:event_jButtonStarten1ActionPerformed

    /**
     * @param args the command line arguments
     */
    //Main-Funktion nur zum Öffnen des JFrame verwendet
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
            @Override
            public void run() {
                NewJFrame n = new NewJFrame();
                n.setVisible(true);
        }
    
            });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEinlesen1;
    public javax.swing.JButton jButtonStarten1;
    private javax.swing.JButton jButtonWaehlen1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabelAusgabe1;
    private javax.swing.JLabel jLabelTuring1;
    private javax.swing.JLabel jLabelWort1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea jTextAreaAusgabe1;
    private javax.swing.JTextField jTextFieldTuring1;
    private javax.swing.JTextField jTextFieldWort1;
    // End of variables declaration//GEN-END:variables
   //Eigene Variablen:
   public String wort;
   public String dateiPfad;
   public String ausgabe;

}     
