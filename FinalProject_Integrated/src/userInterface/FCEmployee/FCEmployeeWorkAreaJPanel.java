/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.FCEmployee;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.FoodConservation.FCEmployeeOrganization;
import Business.FoodConservation.OrphanageOrganization;
import Business.Organization.Organization;
import Business.Network.Network;
import Business.SendEmail.SendMail;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FCWorkRequest;
import Business.WorkQueue.OrphanageWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tejesh
 */
public class FCEmployeeWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount userAccount;
    FCEmployeeOrganization fcEmployeeOrganization;
    EcoSystem ecosystem;

    public FCEmployeeWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, FCEmployeeOrganization fcEmployeeOrganization, Enterprise enterprise, EcoSystem business) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.enterprise = enterprise;
        this.fcEmployeeOrganization = fcEmployeeOrganization;
        this.ecosystem = business;

        populateFCTable();
    }

    public void populateFCTable() {
        DefaultTableModel model = (DefaultTableModel) foodCollectorJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : ecosystem.getWorkQueue().getWorkRequestList()) {
            if (request instanceof FCWorkRequest) {
                FCWorkRequest req = (FCWorkRequest) request;
                Object[] row = new Object[6];
                row[0] = req;
                row[1] = req.getSender().getPerson().getName();
                row[2] = req.getQuantity();
                row[3] = req.getZipcode();
                row[4] = req.getStatus();
                row[5] = req.getReceiver() == null ? null : request.getReceiver().getPerson().getName();

                model.addRow(row);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        foodCollectorJTable = new javax.swing.JTable();
        assignToFCBtn = new javax.swing.JButton();
        collectedBtn = new javax.swing.JButton();
        deliverToOrphanBtn = new javax.swing.JButton();
        timerLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        foodCollectorJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "UserName", "Quantity", "User Zipcode", "Status", "FCEmp"
            }
        ));
        jScrollPane1.setViewportView(foodCollectorJTable);

        assignToFCBtn.setBackground(new java.awt.Color(255, 102, 102));
        assignToFCBtn.setText("Assign to Me");
        assignToFCBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignToFCBtnActionPerformed(evt);
            }
        });

        collectedBtn.setBackground(new java.awt.Color(255, 102, 102));
        collectedBtn.setText("Collected");
        collectedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collectedBtnActionPerformed(evt);
            }
        });

        deliverToOrphanBtn.setBackground(new java.awt.Color(255, 102, 102));
        deliverToOrphanBtn.setText("Deliver to Orphanage");
        deliverToOrphanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliverToOrphanBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(timerLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(assignToFCBtn)
                                .addGap(56, 56, 56)
                                .addComponent(collectedBtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(deliverToOrphanBtn)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timerLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignToFCBtn)
                    .addComponent(collectedBtn))
                .addGap(31, 31, 31)
                .addComponent(deliverToOrphanBtn)
                .addContainerGap(229, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignToFCBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignToFCBtnActionPerformed
        int selectedRow = foodCollectorJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the request to assign it to yourself.");
        } else {
            FCWorkRequest request = (FCWorkRequest) foodCollectorJTable.getValueAt(selectedRow, 0);
            if (request.getReceiver() == null) {

                request.setReceiver(userAccount);
                request.setStatus("Pending");
                populateFCTable();
            } else {
                JOptionPane.showMessageDialog(null, "This request is already assigned to other employee");

            }
        }
    }//GEN-LAST:event_assignToFCBtnActionPerformed

    private void collectedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_collectedBtnActionPerformed
        // TODO add your handling code here:

        int selectedRow = foodCollectorJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to proceed.");
        } else {

            FCWorkRequest request = (FCWorkRequest) foodCollectorJTable.getValueAt(selectedRow, 0);
            if (request.getReceiver() == userAccount && request.getStatus().equalsIgnoreCase("Pending")) {
                request.setStatus("Collected");
                request.setResult("Completed");
                populateFCTable();

                SendMail sendmail = new SendMail();

                sendmail.fcSendMail(request.getSender().getPerson().getEmailID(), request.getQuantity());
                JOptionPane.showMessageDialog(null, "Food Collected. User will get a confirmation mail. ");
                request.setResolveDate(new Date());

            } else {
                JOptionPane.showMessageDialog(null, "This request does not belong to you or is already collected. Please collect the appropriate request from the queue.");
            }
        }


    }//GEN-LAST:event_collectedBtnActionPerformed

    private void deliverToOrphanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliverToOrphanBtnActionPerformed
        // TODO add your handling code here:

        int selectedRow = foodCollectorJTable.getSelectedRow();
        int count = 0;

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to forward the work request to Orphanage");
        } else {

            FCWorkRequest request = (FCWorkRequest) foodCollectorJTable.getValueAt(selectedRow, 0);
            OrphanageWorkRequest orpRequest = new OrphanageWorkRequest();
            if (request.getReceiver() == userAccount && request.getStatus().equalsIgnoreCase("Collected")) {
                Double quantity = request.getQuantity();
                String status = "Sent to Orphanage";
                orpRequest.setMessage(request.getMessage());
                orpRequest.setQuantity(quantity);
                orpRequest.setSender(request.getReceiver());
                orpRequest.setStatus(status);

                for (Network network : ecosystem.getNetworkList()) {
                    for (Enterprise enterprise : network.getEnterpriseList().getEnterpriseList()) {
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            if (organization instanceof OrphanageOrganization) {
                                //org = organization;
                                count++;
                                break;

                            }
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "You are not authorized to forward this work request to Orphanage");

            }
            if (count > 0) {
                ecosystem.getWorkQueue().getWorkRequestList().add(orpRequest);
                userAccount.getWorkQueue().getWorkRequestList().add(orpRequest);
                JOptionPane.showMessageDialog(null, "The request has been forwarded to the Orphanage Organization.");
            }
        }

    }//GEN-LAST:event_deliverToOrphanBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignToFCBtn;
    private javax.swing.JButton collectedBtn;
    private javax.swing.JButton deliverToOrphanBtn;
    private javax.swing.JTable foodCollectorJTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel timerLbl;
    // End of variables declaration//GEN-END:variables
}
