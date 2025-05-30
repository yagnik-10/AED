/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.PersonDirectory;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author YAGNIK
 */
public class diffJPanel extends javax.swing.JPanel {

    /**
     * Creates new form diffJPanel
     */
        private JPanel workarea;
        private Person person;
        private PersonDirectory personDirectory;


    diffJPanel(JPanel workarea,Person person, PersonDirectory personDirectory) {
        initComponents();
        this.workarea = workarea;
        this.person = person;
        this.personDirectory = personDirectory;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backbtn = new javax.swing.JButton();
        createbtn = new javax.swing.JButton();
        managebtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 204, 255));

        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        createbtn.setText("Create");
        createbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createbtnActionPerformed(evt);
            }
        });

        managebtn.setText("Manage");
        managebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152)
                .addComponent(createbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152)
                .addComponent(managebtn)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backbtn)
                    .addComponent(createbtn)
                    .addComponent(managebtn))
                .addContainerGap(507, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        workarea.remove(this);
        CardLayout cardLayout = (CardLayout) workarea.getLayout();
        cardLayout.previous(workarea);

    }//GEN-LAST:event_backbtnActionPerformed

    private void createbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbtnActionPerformed
        // TODO add your handling code here:
        CreateJPanel createpanel = new CreateJPanel(workarea, person, personDirectory);
        workarea.add("CreateJPanel", createpanel);
        CardLayout layout = (CardLayout) workarea.getLayout();
        layout.next(workarea);  
        
    }//GEN-LAST:event_createbtnActionPerformed

    private void managebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managebtnActionPerformed
        // TODO add your handling code here:
        AdminJPanel adminpanel = new AdminJPanel(workarea, person, personDirectory);
        workarea.add("CreateJPanel", adminpanel);
        CardLayout layout = (CardLayout) workarea.getLayout();
        layout.next(workarea);         
        
    }//GEN-LAST:event_managebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JButton createbtn;
    private javax.swing.JButton managebtn;
    // End of variables declaration//GEN-END:variables
}
