/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.address;

/**
 *
 * @author YAGNIK
 */
public class addressJPanel extends javax.swing.JPanel {

    /**
     * Creates new form addressJPanel
     */
    address address;
    public addressJPanel(address address) {
        initComponents();
        this.address = address;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbladdress = new javax.swing.JLabel();
        lblgpslocation = new javax.swing.JLabel();
        lblcity = new javax.swing.JLabel();
        txtgpslocation = new javax.swing.JTextField();
        txtcity = new javax.swing.JTextField();
        lblstate = new javax.swing.JLabel();
        lblcountry = new javax.swing.JLabel();
        txtstate = new javax.swing.JTextField();
        txtcountry = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        lbladdress.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbladdress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbladdress.setText("Address");

        lblgpslocation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblgpslocation.setText("GPS location");

        lblcity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblcity.setText("City");

        lblstate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblstate.setText("State");

        lblcountry.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblcountry.setText("Country");

        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbladdress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblcity)
                                    .addComponent(lblgpslocation))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtcity)
                                    .addComponent(txtgpslocation, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblcountry)
                                    .addComponent(lblstate))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtcountry)
                                    .addComponent(txtstate, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(700, 700, 700)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(btnsave)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbladdress)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblgpslocation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblcity))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtgpslocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblstate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblcountry))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtstate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btnsave)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        address.setGpslocation(txtgpslocation.getText());
        address.setCity(txtcity.getText());
        address.setState(txtstate.getText());
        address.setCountry(txtcountry.getText());
        
        JOptionPane.showMessageDialog(this,"saved successfully.");
    }//GEN-LAST:event_btnsaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lblcountry;
    private javax.swing.JLabel lblgpslocation;
    private javax.swing.JLabel lblstate;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtcountry;
    private javax.swing.JTextField txtgpslocation;
    private javax.swing.JTextField txtstate;
    // End of variables declaration//GEN-END:variables
}
