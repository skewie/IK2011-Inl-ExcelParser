/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excelparser;

import model.League;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import model.Team;

/**
 *
 * @author Jeff
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        Controller controller = Controller.getInstance();
        controller.setGUI(this);
        taAppInstructions.setBorder(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfChosenFilePath = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bChooseFile = new javax.swing.JButton();
        bUploadData = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        taAppInstructions = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        epLeagueOutput = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ligaadministration - Ladda upp data");
        setResizable(false);

        tfChosenFilePath.setEditable(false);
        tfChosenFilePath.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfChosenFilePathMouseClicked(evt);
            }
        });
        tfChosenFilePath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfChosenFilePathActionPerformed(evt);
            }
        });

        jLabel1.setText("Välj excel-fil:");

        bChooseFile.setText("Välj...");
        bChooseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bChooseFileActionPerformed(evt);
            }
        });

        bUploadData.setText("Ladda upp data");
        bUploadData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUploadDataActionPerformed(evt);
            }
        });

        jScrollPane2.setBorder(null);

        taAppInstructions.setEditable(false);
        taAppInstructions.setColumns(20);
        taAppInstructions.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        taAppInstructions.setLineWrap(true);
        taAppInstructions.setRows(5);
        taAppInstructions.setTabSize(1);
        taAppInstructions.setText("Detta program hjälper dig som ligaadministratör att snabbt ladda upp ny ligainformation\n\n\t* Skapa en excelfil där varje kolumn representerar en egen liga. Den första\n\t  raden i kolumnen ska vara liganamnet och varje efterföljande rad ett namn på\n\t  ett lag som ska delta i den ligan.\n\n\t* Ladda in excel-filen i detta program genom att trycka på \"Välj...\"-knappen.\n\n\t* När du säkerställt att all data är korrekt, tryck på \"Ladda upp data\"-knappen.");
        taAppInstructions.setWrapStyleWord(true);
        taAppInstructions.setBorder(null);
        taAppInstructions.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        taAppInstructions.setFocusable(false);
        taAppInstructions.setHighlighter(null);
        taAppInstructions.setRequestFocusEnabled(false);
        jScrollPane2.setViewportView(taAppInstructions);

        epLeagueOutput.setContentType("text/html");
        jScrollPane3.setViewportView(epLeagueOutput);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfChosenFilePath)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bChooseFile))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bUploadData))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfChosenFilePath, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bChooseFile, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bUploadData)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfChosenFilePathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfChosenFilePathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfChosenFilePathActionPerformed

    private void bChooseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bChooseFileActionPerformed

        displayFileChooser();;
    }//GEN-LAST:event_bChooseFileActionPerformed

    private void bUploadDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUploadDataActionPerformed
        JDialog dialog = new JDialog();
        LoginWindow loginWindow = new LoginWindow();
        dialog.add(loginWindow);
        dialog.setResizable(false);
        dialog.pack();
        dialog.setVisible(true);
    }//GEN-LAST:event_bUploadDataActionPerformed

    private void tfChosenFilePathMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfChosenFilePathMouseClicked
        displayFileChooser();
    }//GEN-LAST:event_tfChosenFilePathMouseClicked

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
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bChooseFile;
    private javax.swing.JButton bUploadData;
    private javax.swing.JEditorPane epLeagueOutput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea taAppInstructions;
    private javax.swing.JTextField tfChosenFilePath;
    // End of variables declaration//GEN-END:variables

    public void displayLeagueInfo(ArrayList<League> leagues) {

        StringBuilder build = new StringBuilder("<font face=\"sans-serif\"><h1>Hittade ligor</h1>");

        for (League league : leagues) {
            build.append("<b>");
            build.append(league.getName());
            build.append("<br />Lag:<br />");
            build.append("</b>");
            
            for (Team team : league.getTeams()) {
                build.append(team.getName());
                build.append("<br />");
            }
            build.append("<br />");
        }
        build.append("</font>");
        this.epLeagueOutput.setText(build.toString());
        this.epLeagueOutput.setCaretPosition(0);
    }

    public void setChosenFilePath(String filePath) {
        tfChosenFilePath.setText(filePath);
    }

    private void displayFileChooser() {
        final Controller contr = Controller.getInstance();

        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(Utils.getExcelFileFilter());
        int response = chooser.showOpenDialog(this);

        if (response == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();

            contr.chooseFile(file);
        }
    }

    public void displayError(String error) {
        JOptionPane.showMessageDialog(this, error, "Ett fel har inträffat:", JOptionPane.ERROR_MESSAGE);
    }

    public void displayMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Meddelande", JOptionPane.PLAIN_MESSAGE);
    }

    public void displayHTMLMessage(String returnMessage) {
        ReturnWindow dialog = new ReturnWindow(this, true);
        
        dialog.setHTMLContent(returnMessage);
        dialog.setVisible(true);
    }
}
