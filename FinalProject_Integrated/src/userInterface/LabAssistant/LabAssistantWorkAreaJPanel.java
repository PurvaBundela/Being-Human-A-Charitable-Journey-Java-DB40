/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.LabAssistant;

import Business.EcoSystem;
import Business.Enterprise.BloodEnterprise;
import Business.Enterprise.Enterprise;
import Business.Person.VitalSigns;
import Business.SendEmail.SendMail;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class LabAssistantWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private BloodEnterprise bloodEnterprise;

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public LabAssistantWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem business) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.bloodEnterprise = (BloodEnterprise) enterprise;

        populateTable();
        assignJButton.setEnabled(true);
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : business.getWorkQueue().getWorkRequestList()) {
            if (request instanceof LabTestWorkRequest) {
                Object[] row = new Object[6];
                row[0] = request;
                row[1] = request.getSender().getPerson().getName();
                row[2] = request.getReceiver() == null ? null : request.getReceiver().getPerson().getName();
                row[3] = request.getStatus();
                row[4] = ((LabTestWorkRequest) request).getBloodType();
                row[5] = request.getLocation();

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
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        vitalSignGenrateContainer = new javax.swing.JPanel();
        eligibityLabel = new javax.swing.JLabel();
        scheduleAppButton = new javax.swing.JButton();
        cancelRequestButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Preffered Location", "Sender", "Receiver", "Status", "Blood Group", "Message"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workRequestJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        assignJButton.setBackground(new java.awt.Color(255, 102, 102));
        assignJButton.setText("Assign");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        vitalSignGenrateContainer.setLayout(new java.awt.CardLayout());

        eligibityLabel.setFont(new java.awt.Font("Bradley Hand", 1, 24)); // NOI18N
        eligibityLabel.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                eligibityLabelPropertyChange(evt);
            }
        });

        scheduleAppButton.setBackground(new java.awt.Color(255, 102, 102));
        scheduleAppButton.setText("Schedule Appointment");
        scheduleAppButton.setEnabled(false);
        scheduleAppButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleAppButtonActionPerformed(evt);
            }
        });

        cancelRequestButton.setBackground(new java.awt.Color(255, 102, 102));
        cancelRequestButton.setText("Cancel Request");
        cancelRequestButton.setEnabled(false);
        cancelRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelRequestButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(301, 301, 301))
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(scheduleAppButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelRequestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(vitalSignGenrateContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(225, 225, 225)
                            .addComponent(eligibityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(assignJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vitalSignGenrateContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eligibityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelRequestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scheduleAppButton))
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }

        LabTestWorkRequest request = (LabTestWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");

        populateTable();

        VitalSigns vs = calculateVitalSign(request);
        //setting vital sign of the sender
        request.getSender().getPerson().setVitalSign(vs);
        request.setEligibility(vs.getEligibility());

        eligibityLabel.setText(vs.getEligibility());
        VitalSignsGenerateJPanel vitalSignPane = new VitalSignsGenerateJPanel(vitalSignGenrateContainer, vs);
        vitalSignGenrateContainer.add("VitalSignsGenerateJPanel", vitalSignPane);
        CardLayout layout = (CardLayout) vitalSignGenrateContainer.getLayout();
        layout.next(vitalSignGenrateContainer);

        assignJButton.setEnabled(false);


    }//GEN-LAST:event_assignJButtonActionPerformed
    public VitalSigns calculateVitalSign(WorkRequest request) {
        VitalSigns vitalSign = new VitalSigns();
//        vitalSign.setAge(request.getSender().getPerson().getAge());
//        vitalSign.setHeight(vitalSign.initializeHeight());
//        vitalSign.setBloodpressure(vitalSign.initializeBP());
//        vitalSign.setDiabetic(vitalSign.initializeDiabetes());
//        vitalSign.setDonationInterval(vitalSign.randInt(0, 4));
//        vitalSign.setHivAids(vitalSign.initializeHIV());
//        vitalSign.setWeight(vitalSign.randInt(47, 80));
//        vitalSign.setEligibility(calculateEligibility(vitalSign));

        vitalSign.setAge(19);
        vitalSign.setHeight(160);
        vitalSign.setBloodpressure("Normal");
        vitalSign.setDiabetic("No");
        vitalSign.setDonationInterval(3);
        vitalSign.setHivAids("No");
        vitalSign.setWeight(60);
        vitalSign.setEligibility(calculateEligibility(vitalSign));

        return vitalSign;

    }

    public String calculateEligibility(VitalSigns vs) {
        if (vs.getAge() >= 18 && vs.getWeight() >= 50 && vs.getBloodpressure().equalsIgnoreCase("Normal")
                && vs.getDiabetic().equalsIgnoreCase("No") && vs.getDonationInterval() >= 1
                && vs.getHivAids().equalsIgnoreCase("No")) {
            return "Eligible";
        } else {
            return "Not Eligible";
        }
    }
    private void scheduleAppButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleAppButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row");
        }
        else{
        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        request.setStatus("Scheduled");
        populateTable();
        scheduleAppButton.setEnabled(false);
        cancelRequestButton.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Appointment scheduled for Blood Donation");
        //send mail
            SendMail.sendMailScheduledAppointment(request.getSender().getPerson().getEmailID());
        }
        
    }//GEN-LAST:event_scheduleAppButtonActionPerformed

    private void cancelRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelRequestButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();

        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);

        request.setStatus("Cancelled");
        populateTable();
        cancelRequestButton.setEnabled(false);
        scheduleAppButton.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Request Cancelled");
        //send mail
        SendMail.sendMailCancelledAppointment(request.getSender().getPerson().getEmailID());
    }//GEN-LAST:event_cancelRequestButtonActionPerformed

    private void eligibityLabelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_eligibityLabelPropertyChange
        // TODO add your handling code here:
        if (eligibityLabel.getText().equalsIgnoreCase("Eligible")) {
            scheduleAppButton.setEnabled(true);
            cancelRequestButton.setEnabled(true);
        } else {
            scheduleAppButton.setEnabled(false);
            cancelRequestButton.setEnabled(true);
        }
    }//GEN-LAST:event_eligibityLabelPropertyChange

    private void workRequestJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workRequestJTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();

        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        if (request instanceof LabTestWorkRequest) {
            if (request.getStatus().equals("Completed")) {
                assignJButton.setEnabled(false);
                scheduleAppButton.setEnabled(false);
                cancelRequestButton.setEnabled(false);
            } else if (request.getStatus().equals("Sent")) {
                assignJButton.setEnabled(true);
                scheduleAppButton.setEnabled(false);
                cancelRequestButton.setEnabled(false);
            } else if (request.getStatus().equals("Pending")) {
                assignJButton.setEnabled(false);
            }
        }
    }//GEN-LAST:event_workRequestJTableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton cancelRequestButton;
    private javax.swing.JLabel eligibityLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton scheduleAppButton;
    private javax.swing.JPanel vitalSignGenrateContainer;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
