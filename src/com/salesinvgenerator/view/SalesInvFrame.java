/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.salesinvgenerator.view;

import com.salesinvgenerator.controller.SalesInvoiceMainController;
import com.salesinvgenerator.model.InvoiceTitle;
import com.salesinvgenerator.model.InvoiceTitleTable;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author Antony.Shenouda
 */
public class SalesInvFrame extends javax.swing.JFrame {

        /**
         * Creates new form SalesInvFrame
         */
        public SalesInvFrame() {
                initComponents();
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jScrollPane1 = new javax.swing.JScrollPane();
                invoiceTable = new javax.swing.JTable();
                invoiceTable.getSelectionModel().addListSelectionListener(controller);
                newInvoiceButton = new javax.swing.JButton();
                newInvoiceButton.addActionListener(controller);
                deleteInvoiceButton = new javax.swing.JButton();
                deleteInvoiceButton.addActionListener(controller);
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                invoiceNumberValue = new javax.swing.JLabel();
                customerNameValue = new javax.swing.JLabel();
                invoiceDateValue = new javax.swing.JLabel();
                invoiceTotalValue = new javax.swing.JLabel();
                jScrollPane2 = new javax.swing.JScrollPane();
                lineTable = new javax.swing.JTable();
                newButton = new javax.swing.JButton();
                newButton.addActionListener(controller);
                deleteButton = new javax.swing.JButton();
                deleteButton.addActionListener(controller);
                jScrollPane4 = new javax.swing.JScrollPane();
                jLabel5 = new javax.swing.JLabel();
                jMenuBar1 = new javax.swing.JMenuBar();
                jMenu1 = new javax.swing.JMenu();
                OpenFile = new javax.swing.JMenuItem();
                OpenFile.addActionListener(controller);
                saveFile = new javax.swing.JMenuItem();
                saveFile.addActionListener(controller);

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                invoiceTable.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {

                                },
                                new String[] {

                                }));
                jScrollPane1.setViewportView(invoiceTable);

                newInvoiceButton.setText("New Invoice");
                newInvoiceButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                newInvoiceButtonActionPerformed(evt);
                        }
                });

                deleteInvoiceButton.setText("Delete Invoice");

                jLabel1.setForeground(java.awt.Color.black);
                jLabel1.setText("Invoice Number");

                jLabel2.setForeground(java.awt.Color.black);
                jLabel2.setText("Invoice Date");

                jLabel3.setForeground(java.awt.Color.black);
                jLabel3.setText("Customer Name");

                jLabel4.setForeground(java.awt.Color.black);
                jLabel4.setText("Invoice Total");

                lineTable.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {

                                },
                                new String[] {

                                }));
                jScrollPane2.setViewportView(lineTable);

                newButton.setText("New");
                newButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                newButtonActionPerformed(evt);
                        }
                });

                deleteButton.setText("Delete");

                jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
                jLabel5.setText("    Invoice Chart");
                jScrollPane4.setViewportView(jLabel5);

                jMenu1.setText("File");
                saveFile.setText("Save File");

                OpenFile.setText("Load File");
                OpenFile.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                LoadFileActionPerformed(evt);
                        }
                });
                jMenu1.add(OpenFile);

                jMenu1.add(saveFile);

                jMenuBar1.add(jMenu1);

                setJMenuBar(jMenuBar1);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jScrollPane1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                374,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addGap(17, 17, 17)
                                                                                                                                .addComponent(jLabel3))
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                .addComponent(jLabel1)))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                layout
                                                                                                                                                .createSequentialGroup()
                                                                                                                                                .addComponent(customerNameValue,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                152,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(jLabel4)
                                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                                .addComponent(invoiceTotalValue,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                120,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                layout
                                                                                                                                                .createSequentialGroup()
                                                                                                                                                .addComponent(invoiceNumberValue,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                154,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(jLabel2)
                                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                                .addComponent(invoiceDateValue,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                116,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(2, 2, 2)
                                                                                                .addComponent(jScrollPane2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                475,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(jScrollPane4,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                180,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(216, Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(newInvoiceButton)
                                                                .addGap(46, 46, 46)
                                                                .addComponent(deleteInvoiceButton)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(newButton)
                                                                .addGap(122, 122, 122)
                                                                .addComponent(deleteButton)
                                                                .addGap(264, 264, 264)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addComponent(jScrollPane4,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                70,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(28, 28, 28)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                false)
                                                                                                                .addComponent(invoiceNumberValue,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jLabel1,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(invoiceDateValue,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jLabel2,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE))
                                                                                                .addGap(10, 10, 10)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(invoiceTotalValue,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                16,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel4)
                                                                                                                .addComponent(customerNameValue,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                16,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel3))
                                                                                                .addGap(18, 18, Short.MAX_VALUE)
                                                                                                .addComponent(jScrollPane2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                247,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(jScrollPane1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                0,
                                                                                                Short.MAX_VALUE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(deleteInvoiceButton)
                                                                                .addComponent(newInvoiceButton)
                                                                                .addComponent(newButton)
                                                                                .addComponent(deleteButton))
                                                                .addGap(65, 65, 65)));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void LoadFileActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_loadFileActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_loadFileActionPerformed

        private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_newButtonActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_newButtonActionPerformed

        private void newInvoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_newInvoiceButtonActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_newInvoiceButtonActionPerformed

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
                // (optional) ">
                /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
                 * look and feel.
                 * For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                 */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(SalesInvFrame.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(SalesInvFrame.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(SalesInvFrame.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(SalesInvFrame.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                }
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new SalesInvFrame().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel customerNameValue;
        private javax.swing.JButton deleteButton;
        private javax.swing.JButton deleteInvoiceButton;
        private javax.swing.JLabel invoiceDateValue;
        private javax.swing.JLabel invoiceNumberValue;
        private javax.swing.JTable invoiceTable;
        private javax.swing.JLabel invoiceTotalValue;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JMenu jMenu1;
        private javax.swing.JMenuBar jMenuBar1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JScrollPane jScrollPane4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JTable lineTable;
        private javax.swing.JMenuItem OpenFile;
        private javax.swing.JButton newButton;
        private javax.swing.JButton newInvoiceButton;
        private javax.swing.JMenuItem saveFile;
        // End of variables declaration//GEN-END:variables

        private ArrayList<InvoiceTitle> invs;
        private SalesInvoiceMainController controller = new SalesInvoiceMainController(this);

        private InvoiceTitleTable invoicesTableModel;

        public ArrayList<InvoiceTitle> getInvs() {
                return invs;
        }

        public void setInvs(ArrayList<InvoiceTitle> invs) {
                this.invs = invs;
        }

        public InvoiceTitleTable getInvoicesTableModel() {
                return invoicesTableModel;
        }

        public void setInvoicesTableModel(InvoiceTitleTable invoicesTableModel) {
                this.invoicesTableModel = invoicesTableModel;
        }

        public JLabel getCustomerNameValue() {
                return customerNameValue;
        }

        public JLabel getInvoiceDateValue() {
                return invoiceDateValue;
        }

        public JLabel getInvoiceNumberValue() {
                return invoiceNumberValue;
        }

        public JTable getInvoiceTable() {
                return invoiceTable;
        }

        public JLabel getInvoiceTotalValue() {
                return invoiceTotalValue;
        }

        public JTable getLineTable() {
                return lineTable;
        }

        public SalesInvoiceMainController getController() {
                return controller;
        }

        public int getNextInvoiceNumber() {
                int nextInvoiceNumber = invs.size() + 1;
                return nextInvoiceNumber;
        }

}
