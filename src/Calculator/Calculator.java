/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Calculator;

/**
 *
 * @author Atej
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    
    double NumEnter1;
    double NumEnter2;
    double Result;
    String op;
    
    public Calculator() {
        initComponents();
    }
    public void disable()
    {
        jtxtResult.setEnabled(false);
        jbtnDigit0.setEnabled(false);
        jbtnDigit1.setEnabled(false);
        jbtnDigit2.setEnabled(false);
        jbtnDigit3.setEnabled(false);
        jbtnDigit4.setEnabled(false);
        jbtnDigit5.setEnabled(false);
        jbtnDigit6.setEnabled(false);
        jbtnDigit7.setEnabled(false);
        jbtnDigit8.setEnabled(false);
        jbtnDigit9.setEnabled(false);
        jbtnC.setEnabled(false);
        jbtnCE.setEnabled(false);
        jbtnDiv.setEnabled(false);
        jbtnDot.setEnabled(false);
        jbtnE.setEnabled(false);
        jbtnMult.setEnabled(false);
        jbtnPM.setEnabled(false);
        jbtnPlus.setEnabled(false);
        JbtnSub.setEnabled(false);
        jbtnBS.setEnabled(false);
    }
        public void enable()
    {
        jtxtResult.setEnabled(true);
        jbtnDigit0.setEnabled(true);
        jbtnDigit1.setEnabled(true);
        jbtnDigit2.setEnabled(true);
        jbtnDigit3.setEnabled(true);
        jbtnDigit4.setEnabled(true);
        jbtnDigit5.setEnabled(true);
        jbtnDigit6.setEnabled(true);
        jbtnDigit7.setEnabled(true);
        jbtnDigit8.setEnabled(true);
        jbtnDigit9.setEnabled(true);
        jbtnC.setEnabled(true);
        jbtnCE.setEnabled(true);
        jbtnDiv.setEnabled(true);
        jbtnDot.setEnabled(true);
        jbtnE.setEnabled(true);
        jbtnMult.setEnabled(true);
        jbtnPM.setEnabled(true);
        jbtnPlus.setEnabled(true);
        JbtnSub.setEnabled(true);
        jbtnBS.setEnabled(true);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void EnterNumbers(String q)
    {
        String Nums = jtxtResult.getText() + q;
        jtxtResult.setText(Nums);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jtxtResult = new javax.swing.JTextField();
        jbtnDigit5 = new javax.swing.JButton();
        jbtnDigit4 = new javax.swing.JButton();
        jbtnDigit6 = new javax.swing.JButton();
        JbtnSub = new javax.swing.JButton();
        jbtnDot = new javax.swing.JButton();
        jbtnDigit0 = new javax.swing.JButton();
        jbtnE = new javax.swing.JButton();
        jbtnDiv = new javax.swing.JButton();
        jbtnCE = new javax.swing.JButton();
        jbtnBS = new javax.swing.JButton();
        jbtnC = new javax.swing.JButton();
        jbtnPM = new javax.swing.JButton();
        jbtnDigit8 = new javax.swing.JButton();
        jbtnDigit7 = new javax.swing.JButton();
        jbtnDigit9 = new javax.swing.JButton();
        jbtnPlus = new javax.swing.JButton();
        jbtnDigit1 = new javax.swing.JButton();
        jbtnDigit2 = new javax.swing.JButton();
        jbtnDigit3 = new javax.swing.JButton();
        jbtnMult = new javax.swing.JButton();
        jRadioBtnOFF = new javax.swing.JRadioButton();
        jRadioBtnON = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtResult.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jtxtResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtResultActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 340, 50));

        jbtnDigit5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDigit5.setText("5");
        jbtnDigit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit5ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 70, 70));

        jbtnDigit4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDigit4.setText("4");
        jbtnDigit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit4ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 70, 70));

        jbtnDigit6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDigit6.setText("6");
        jbtnDigit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit6ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 70, 70));

        JbtnSub.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JbtnSub.setText("-");
        JbtnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnSubActionPerformed(evt);
            }
        });
        getContentPane().add(JbtnSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 70, 70));

        jbtnDot.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDot.setText(".");
        jbtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDotActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDot, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 70, 70));

        jbtnDigit0.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDigit0.setText("0");
        jbtnDigit0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit0ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 70, 70));

        jbtnE.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnE.setText("=");
        jbtnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnE, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 70, 70));

        jbtnDiv.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDiv.setText("/");
        jbtnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDivActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 70, 70));

        jbtnCE.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnCE.setText("CE");
        jbtnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCEActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 70, 70));

        jbtnBS.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnBS.setText("<--");
        jbtnBS.setToolTipText("");
        jbtnBS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBSActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 70, 70));

        jbtnC.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnC.setText("C");
        jbtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 70, 70));

        jbtnPM.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnPM.setText("± ");
        jbtnPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPMActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 70, 70));

        jbtnDigit8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDigit8.setText("8");
        jbtnDigit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit8ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 70, 70));

        jbtnDigit7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDigit7.setText("7");
        jbtnDigit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit7ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 70, 70));

        jbtnDigit9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDigit9.setText("9");
        jbtnDigit9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit9ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 70, 70));

        jbtnPlus.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnPlus.setText("+");
        jbtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlusActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 70, 70));

        jbtnDigit1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDigit1.setText("1");
        jbtnDigit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 70, 70));

        jbtnDigit2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDigit2.setText("2");
        jbtnDigit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 70, 70));

        jbtnDigit3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDigit3.setText("3");
        jbtnDigit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 70, 70));

        jbtnMult.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnMult.setText("*");
        jbtnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMultActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnMult, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 70, 70));

        buttonGroup1.add(jRadioBtnOFF);
        jRadioBtnOFF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jRadioBtnOFF.setText("OFF");
        jRadioBtnOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBtnOFFActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioBtnOFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        buttonGroup1.add(jRadioBtnON);
        jRadioBtnON.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jRadioBtnON.setText("ON");
        jRadioBtnON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBtnONActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioBtnON, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtResultActionPerformed

    private void jbtnBSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBSActionPerformed
        String backSp = null;
                
        if(jtxtResult.getText().length() > 0)
        {
            StringBuilder sb = new StringBuilder(jtxtResult.getText());
            sb.deleteCharAt(jtxtResult.getText().length() - 1);
            backSp = sb.toString();
            jtxtResult.setText(backSp);
        }
    }//GEN-LAST:event_jbtnBSActionPerformed

    private void jbtnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCEActionPerformed
        jtxtResult.setText("");
        
        String Fn, Sn;
        Fn = String.valueOf(NumEnter1);
        Sn = String.valueOf(NumEnter2);
        
        Fn = "";
        Sn = "";
    }//GEN-LAST:event_jbtnCEActionPerformed

    private void jbtnDigit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit7ActionPerformed
        EnterNumbers("7");
    }//GEN-LAST:event_jbtnDigit7ActionPerformed

    private void jbtnDigit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit8ActionPerformed
        EnterNumbers("8");
    }//GEN-LAST:event_jbtnDigit8ActionPerformed

    private void jbtnDigit9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit9ActionPerformed
         EnterNumbers("9");
    }//GEN-LAST:event_jbtnDigit9ActionPerformed

    private void jbtnDigit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit4ActionPerformed
         EnterNumbers("4");
    }//GEN-LAST:event_jbtnDigit4ActionPerformed

    private void jbtnDigit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit5ActionPerformed
         EnterNumbers("5");
    }//GEN-LAST:event_jbtnDigit5ActionPerformed

    private void jbtnDigit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit6ActionPerformed
         EnterNumbers("6");
    }//GEN-LAST:event_jbtnDigit6ActionPerformed

    private void jbtnDigit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit1ActionPerformed
         EnterNumbers("1");
    }//GEN-LAST:event_jbtnDigit1ActionPerformed

    private void jbtnDigit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit2ActionPerformed
         EnterNumbers("2");
    }//GEN-LAST:event_jbtnDigit2ActionPerformed

    private void jbtnDigit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit3ActionPerformed
         EnterNumbers("3");
    }//GEN-LAST:event_jbtnDigit3ActionPerformed

    private void jbtnDigit0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit0ActionPerformed
         EnterNumbers("0");
    }//GEN-LAST:event_jbtnDigit0ActionPerformed

    private void jbtnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDivActionPerformed
        NumEnter1 = Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        op = "/";
    }//GEN-LAST:event_jbtnDivActionPerformed

    private void jbtnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMultActionPerformed
        NumEnter1 = Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        op = "*";
    }//GEN-LAST:event_jbtnMultActionPerformed

    private void JbtnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnSubActionPerformed
        NumEnter1 = Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        op = "-";
    }//GEN-LAST:event_JbtnSubActionPerformed

    private void jbtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPlusActionPerformed
        NumEnter1 = Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        op = "+";
    }//GEN-LAST:event_jbtnPlusActionPerformed

    private void jbtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCActionPerformed
        jtxtResult.setText("");
    }//GEN-LAST:event_jbtnCActionPerformed

    private void jbtnPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPMActionPerformed
        double nums = Double.parseDouble(String.valueOf(jtxtResult.getText()));
        nums = nums * (-1);
        jtxtResult.setText(String.valueOf(nums));
    }//GEN-LAST:event_jbtnPMActionPerformed

    private void jbtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDotActionPerformed
        
        if(! jtxtResult.getText().contains("."))
        {
            jtxtResult.setText(jtxtResult.getText() + jbtnDot.getText());
        }
        
    }//GEN-LAST:event_jbtnDotActionPerformed

    private void jbtnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEActionPerformed
        NumEnter2 = Double.parseDouble(jtxtResult.getText());
        if(op == "+")
        {
            Result = NumEnter1 + NumEnter2;
            jtxtResult.setText(String.valueOf(Result));
        }
        else if(op == "-")
        {
            Result = NumEnter1 - NumEnter2;
            jtxtResult.setText(String.valueOf(Result));
        }
        else if(op == "*")
        {
            Result = NumEnter1 * NumEnter2;
            jtxtResult.setText(String.valueOf(Result));
        }
        else if(op == "/")
        {
            Result = NumEnter1 / NumEnter2;
            jtxtResult.setText(String.valueOf(Result));
        }
    }//GEN-LAST:event_jbtnEActionPerformed

    private void jRadioBtnOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBtnOFFActionPerformed
        disable();
    }//GEN-LAST:event_jRadioBtnOFFActionPerformed

    private void jRadioBtnONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBtnONActionPerformed
        enable();
    }//GEN-LAST:event_jRadioBtnONActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbtnSub;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton jRadioBtnOFF;
    private javax.swing.JRadioButton jRadioBtnON;
    private javax.swing.JButton jbtnBS;
    private javax.swing.JButton jbtnC;
    private javax.swing.JButton jbtnCE;
    private javax.swing.JButton jbtnDigit0;
    private javax.swing.JButton jbtnDigit1;
    private javax.swing.JButton jbtnDigit2;
    private javax.swing.JButton jbtnDigit3;
    private javax.swing.JButton jbtnDigit4;
    private javax.swing.JButton jbtnDigit5;
    private javax.swing.JButton jbtnDigit6;
    private javax.swing.JButton jbtnDigit7;
    private javax.swing.JButton jbtnDigit8;
    private javax.swing.JButton jbtnDigit9;
    private javax.swing.JButton jbtnDiv;
    private javax.swing.JButton jbtnDot;
    private javax.swing.JButton jbtnE;
    private javax.swing.JButton jbtnMult;
    private javax.swing.JButton jbtnPM;
    private javax.swing.JButton jbtnPlus;
    private javax.swing.JTextField jtxtResult;
    // End of variables declaration//GEN-END:variables
}
