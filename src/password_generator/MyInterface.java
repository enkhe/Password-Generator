package password_generator;

import java.awt.Component;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.LinkedList;

/**
 * GUI interface for Password Generator.
 * @author Enkhamgalan Baterdene
 * @version 1.2
 * @date 01/05/2018
 */
public class MyInterface extends javax.swing.JFrame {

    public MyInterface() {
        initComponents();
        nums = new int[60];
        populateNums(nums);
        cbNums.setSelectedIndex(7);
    }
    
    private void populateNums(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i+1;
            cbNums.addItem("" + nums[i]);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chbSYMBOLS = new javax.swing.JCheckBox();
        chbNUMBERS = new javax.swing.JCheckBox();
        chbAMBIGIOUS = new javax.swing.JCheckBox();
        chbLOWERCASE = new javax.swing.JCheckBox();
        chbUPPERCASE = new javax.swing.JCheckBox();
        btnGen = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBox = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        cbNums = new javax.swing.JComboBox<>();
        btnCpTxt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        chbSYMBOLS.setSelected(true);
        chbSYMBOLS.setText("Symbols: !@#$%^&*()_+");
        chbSYMBOLS.setName("SYMBOLS"); // NOI18N
        chbSYMBOLS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbSYMBOLSActionPerformed(evt);
            }
        });

        chbNUMBERS.setSelected(true);
        chbNUMBERS.setText("Numbers: 1234567890");
        chbNUMBERS.setName("NUMBERS"); // NOI18N

        chbAMBIGIOUS.setSelected(true);
        chbAMBIGIOUS.setText("Ambigious: ({}[]()/\\\\'\\\"`~,;:.<>)");
        chbAMBIGIOUS.setName("AMBIGIOUS"); // NOI18N

        chbLOWERCASE.setSelected(true);
        chbLOWERCASE.setText("Lowercase: abcdefghijklmnopqrstuvwxyz");
        chbLOWERCASE.setName("LOWERCASE"); // NOI18N

        chbUPPERCASE.setSelected(true);
        chbUPPERCASE.setText("Uppercase: ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        chbUPPERCASE.setName("UPPERCASE"); // NOI18N

        btnGen.setText("Generate");
        btnGen.setActionCommand("btnGen");
        btnGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenActionPerformed(evt);
            }
        });

        txtBox.setColumns(20);
        txtBox.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        txtBox.setRows(5);
        jScrollPane1.setViewportView(txtBox);

        jLabel1.setText("Password Length");

        cbNums.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNumsActionPerformed(evt);
            }
        });

        btnCpTxt.setText("Copy Text");
        btnCpTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCpTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chbUPPERCASE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnGen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbSYMBOLS)
                    .addComponent(chbNUMBERS)
                    .addComponent(chbAMBIGIOUS)
                    .addComponent(chbLOWERCASE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbNums, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(btnCpTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(chbSYMBOLS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbNUMBERS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbAMBIGIOUS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbLOWERCASE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbUPPERCASE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbNums, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCpTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenActionPerformed
        String password = new Password(getLen(), getAT()).toString();
        txtBox.setText("" + password);
    }//GEN-LAST:event_btnGenActionPerformed

    private int getLen() {
        int len = 8;
        
        try {
            len = Integer.parseInt(cbNums.getSelectedItem().toString());
        } catch(Exception ex) {
            // Message to user say input should be integer.
            len = 8;
        }
        
        return len;
    }
    private LinkedList<String> getAT () {
        LinkedList<String> aT = new LinkedList<>();
        Component[] comps = getContentPane().getComponents();
        
        for (int i = 0; i < comps.length; i++) {
            if(comps[i] instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox chB = (javax.swing.JCheckBox) comps[i];
                if(chB.isSelected()) {
                    aT.add(chB.getName());
                }
            }
        }
    
        return aT;
    }
    private void chbSYMBOLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbSYMBOLSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbSYMBOLSActionPerformed

    private void cbNumsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNumsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbNumsActionPerformed

    private void btnCpTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCpTxtActionPerformed
        String get= txtBox.getText();
        StringSelection selec= new StringSelection(get);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selec, selec);
    }//GEN-LAST:event_btnCpTxtActionPerformed

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
            java.util.logging.Logger.getLogger(MyInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyInterface().setVisible(true);
            }
        });
    }

    int[] nums;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCpTxt;
    private javax.swing.JButton btnGen;
    private javax.swing.JComboBox<String> cbNums;
    private javax.swing.JCheckBox chbAMBIGIOUS;
    private javax.swing.JCheckBox chbLOWERCASE;
    private javax.swing.JCheckBox chbNUMBERS;
    private javax.swing.JCheckBox chbSYMBOLS;
    private javax.swing.JCheckBox chbUPPERCASE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtBox;
    // End of variables declaration//GEN-END:variables
}
