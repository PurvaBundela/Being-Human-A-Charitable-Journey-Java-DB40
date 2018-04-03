/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.User;

import Business.BeingHuman.FinanceOrganization;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.FoodConservation.FCEmployeeOrganization;
import Business.Organization.Organization;
import Business.PlasticConservation.PCEmployeeOrganization;
import Business.BeingHuman.UserOrganization;
import Business.BloodDonation.BloodBank;
import Business.BloodDonation.BloodSpecification;
import Business.Enterprise.BeingHumanEnterprise;
import Business.Network.Network;
import Business.SendEmail.SendMail;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BloodBankAssistantWorkRequest;
import Business.WorkQueue.FCWorkRequest;
import Business.WorkQueue.FinanceWorkRequest;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.PCWorkRequest;
import Business.WorkQueue.RecyclingTeamWorkRequest;
import Business.WorkQueue.WorkRequest;
import aurelienribon.slidinglayout.SLAnimator;
import aurelienribon.slidinglayout.demo.TheFrame;
import aurelienribon.slidinglayout.demo.ThePanel;
import aurelienribon.tweenengine.Tween;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.BarcodeFactory;

/**
 *
 * @author palakagrawal
 */
public class UserWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    UserOrganization organization;
    Enterprise enterprise;
    UserAccount userAccount;
    EcoSystem ecosystem;
    int count = 0;

    /**
     * Creates new form UserWorkArea
     */
    public UserWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, UserOrganization userOrganization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.organization = userOrganization;
        this.enterprise = enterprise;
        this.ecosystem = business;
        userLbl.setText(userAccount.getPerson().getName());
        valueLbl1.setText(userAccount.getPerson().getName());
        valueLbl2.setText(userAccount.getPerson().getName());
        populateTableForBD();
        populateTableForFC();
        populateTableForPC();
    }

    public void populateTableForBD() {
        DefaultTableModel model = (DefaultTableModel) bloodWorkReqJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request instanceof BloodBankAssistantWorkRequest) {
                Object[] row = new Object[6];
                row[0] = request;
                row[1] = request.getStatus();
                row[2] = request.getMessage();
//            String result = ((FCWorkRequest) request).getResult();
//            row[3] = result == null ? "Waiting" : result;
                row[3] = request.getSender().getPerson().getName();
                row[4] = ((BloodBankAssistantWorkRequest) request).getBloodType();
                model.addRow(row);
            } else if (request instanceof LabTestWorkRequest) {
                Object[] row = new Object[6];
                row[0] = request;
                row[1] = request.getStatus();
                row[2] = request.getMessage();
//            String result = ((FCWorkRequest) request).getResult();
//            row[3] = result == null ? "Waiting" : result;
                row[3] = request.getSender().getPerson().getName();
                row[4] = ((LabTestWorkRequest) request).getBloodType();
                row[5] = ((LabTestWorkRequest) request).getEligibility();
                model.addRow(row);
            }
        }
    }

    public void populateTableForFC() {
        DefaultTableModel model = (DefaultTableModel) userStatusFCJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request instanceof FCWorkRequest) {
                Object[] row = new Object[5];
                row[0] = request.getMessage();
                row[1] = ((FCWorkRequest) request).getQuantity();
                row[2] = request.getStatus();
                row[3] = ((FCWorkRequest) request).getResult();

                model.addRow(row);
            }
        }
    }

    public void populateTableForPC() {
        DefaultTableModel model = (DefaultTableModel) userStatusPCJTable.getModel();

        model.setRowCount(0);
        // String result = null;
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request instanceof PCWorkRequest) {
                Object[] row = new Object[4];
                row[0] = request.getLocation();
                row[1] = request.getStatus();
                row[2] = ((PCWorkRequest) request).getResult();

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

        userTypeForBloodDonationButtonGroup = new javax.swing.ButtonGroup();
        userTabbedPanel = new javax.swing.JTabbedPane();
        profilePanel = new javax.swing.JPanel();
        welcomLbl = new javax.swing.JLabel();
        userLbl1 = new javax.swing.JLabel();
        userLbl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        uploadBtn = new javax.swing.JButton();
        imageLbl = new javax.swing.JLabel();
        goButton = new javax.swing.JButton();
        bloodDonationUserWorkarea = new javax.swing.JPanel();
        donorRadioButton = new javax.swing.JRadioButton();
        recieverRadioButton = new javax.swing.JRadioButton();
        userBloodProcessPanel = new javax.swing.JPanel();
        foodDonationUserWorkarea = new javax.swing.JPanel();
        valueLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        quantityTextField = new javax.swing.JTextField();
        messageLbl = new javax.swing.JLabel();
        messageTextField = new javax.swing.JTextField();
        notifyFCButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        zipCodeFCTextField = new javax.swing.JTextField();
        plasticDonationUserWorkarea = new javax.swing.JPanel();
        valueLbl1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        zipcodeLbl = new javax.swing.JLabel();
        quantityLbl = new javax.swing.JLabel();
        locationComboBox = new javax.swing.JComboBox<>();
        messageLbl1 = new javax.swing.JLabel();
        messageTextField1 = new javax.swing.JTextField();
        notifyPCButton = new javax.swing.JButton();
        zipCodePCTextField = new javax.swing.JTextField();
        userWorkRequestPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        valueLbl2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        bloodWorkReqJPanel = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        bloodWorkReqJTable = new javax.swing.JTable();
        cancelReqButton1 = new javax.swing.JButton();
        processDonationButton = new javax.swing.JButton();
        payButton = new javax.swing.JButton();
        invoicePanel = new javax.swing.JPanel();
        foodWorkReqJPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        userStatusFCJTable = new javax.swing.JTable();
        newRequestBtn = new javax.swing.JButton();
        refreshFCBtn = new javax.swing.JButton();
        plasticWorkReqJPanel = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        userStatusPCJTable = new javax.swing.JTable();
        newRequestBtn1 = new javax.swing.JButton();
        refreshPCBtn = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(900, 1400));

        userTabbedPanel.setBackground(new java.awt.Color(255, 0, 51));

        profilePanel.setBackground(new java.awt.Color(255, 255, 255));

        welcomLbl.setFont(new java.awt.Font("Phosphate", 1, 24)); // NOI18N
        welcomLbl.setForeground(new java.awt.Color(255, 51, 51));
        welcomLbl.setText("WELCOME TO BEING HUMAN..!!");

        userLbl1.setFont(new java.awt.Font("Bradley Hand", 1, 18)); // NOI18N
        userLbl1.setText("DEAR");

        userLbl.setFont(new java.awt.Font("Bradley Hand", 1, 18)); // NOI18N
        userLbl.setText("<<User>>");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Bradley Hand", 1, 18)); // NOI18N
        jLabel6.setText("YOU can make a DIFFERENCE in someone's life..!!");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Bradley Hand", 1, 14)); // NOI18N
        jLabel7.setText("YOU have two hands, One to help yourself and second to help others.");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Bradley Hand", 1, 14)); // NOI18N
        jLabel8.setText("We're glad that you are here.... Thank you so much for Donating..!!");

        uploadBtn.setBackground(new java.awt.Color(255, 255, 255));
        uploadBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/upload.jpg"))); // NOI18N
        uploadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadBtnActionPerformed(evt);
            }
        });

        goButton.setBackground(new java.awt.Color(255, 255, 255));
        goButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/go.JPG"))); // NOI18N
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout profilePanelLayout = new javax.swing.GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilePanelLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addComponent(userLbl1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(475, 475, 475))
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(profilePanelLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel8))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)))
                .addComponent(imageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(welcomLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addGap(745, 745, 745)
                        .addComponent(uploadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(goButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        profilePanelLayout.setVerticalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(welcomLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addComponent(imageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uploadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(goButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        userTabbedPanel.addTab("Profile", profilePanel);

        bloodDonationUserWorkarea.setBackground(new java.awt.Color(255, 255, 255));

        userTypeForBloodDonationButtonGroup.add(donorRadioButton);
        donorRadioButton.setFont(new java.awt.Font("Bradley Hand", 1, 14)); // NOI18N
        donorRadioButton.setText("Donor");
        donorRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donorRadioButtonActionPerformed(evt);
            }
        });

        userTypeForBloodDonationButtonGroup.add(recieverRadioButton);
        recieverRadioButton.setFont(new java.awt.Font("Bradley Hand", 1, 14)); // NOI18N
        recieverRadioButton.setText("Receiver");
        recieverRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recieverRadioButtonActionPerformed(evt);
            }
        });

        userBloodProcessPanel.setBackground(new java.awt.Color(255, 255, 255));
        userBloodProcessPanel.setPreferredSize(new java.awt.Dimension(900, 1400));
        userBloodProcessPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout bloodDonationUserWorkareaLayout = new javax.swing.GroupLayout(bloodDonationUserWorkarea);
        bloodDonationUserWorkarea.setLayout(bloodDonationUserWorkareaLayout);
        bloodDonationUserWorkareaLayout.setHorizontalGroup(
            bloodDonationUserWorkareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloodDonationUserWorkareaLayout.createSequentialGroup()
                .addGroup(bloodDonationUserWorkareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bloodDonationUserWorkareaLayout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(donorRadioButton)
                        .addGap(110, 110, 110)
                        .addComponent(recieverRadioButton))
                    .addGroup(bloodDonationUserWorkareaLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(userBloodProcessPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        bloodDonationUserWorkareaLayout.setVerticalGroup(
            bloodDonationUserWorkareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloodDonationUserWorkareaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(bloodDonationUserWorkareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(donorRadioButton)
                    .addComponent(recieverRadioButton))
                .addGap(18, 18, 18)
                .addComponent(userBloodProcessPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 957, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        userTabbedPanel.addTab("Blood", bloodDonationUserWorkarea);

        foodDonationUserWorkarea.setBackground(new java.awt.Color(255, 255, 255));

        valueLbl.setFont(new java.awt.Font("Bradley Hand", 1, 18)); // NOI18N
        valueLbl.setForeground(new java.awt.Color(255, 51, 51));
        valueLbl.setText("<value>");

        jLabel1.setFont(new java.awt.Font("Bradley Hand", 1, 18)); // NOI18N
        jLabel1.setText("ZipCode:");

        jLabel2.setFont(new java.awt.Font("Bradley Hand", 1, 18)); // NOI18N
        jLabel2.setText("Approx. Quantity:");

        messageLbl.setFont(new java.awt.Font("Bradley Hand", 1, 18)); // NOI18N
        messageLbl.setText("Message:");

        notifyFCButton.setBackground(new java.awt.Color(255, 255, 255));
        notifyFCButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/notify.png"))); // NOI18N
        notifyFCButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notifyFCButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(255, 255, 255));
        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.jpg"))); // NOI18N
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bradley Hand", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Dear:");

        javax.swing.GroupLayout foodDonationUserWorkareaLayout = new javax.swing.GroupLayout(foodDonationUserWorkarea);
        foodDonationUserWorkarea.setLayout(foodDonationUserWorkareaLayout);
        foodDonationUserWorkareaLayout.setHorizontalGroup(
            foodDonationUserWorkareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodDonationUserWorkareaLayout.createSequentialGroup()
                .addGroup(foodDonationUserWorkareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodDonationUserWorkareaLayout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(notifyFCButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(foodDonationUserWorkareaLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel3)
                        .addGap(59, 59, 59)
                        .addComponent(valueLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(foodDonationUserWorkareaLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addGroup(foodDonationUserWorkareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(messageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(foodDonationUserWorkareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(quantityTextField)
                            .addComponent(messageTextField)
                            .addComponent(zipCodeFCTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(295, Short.MAX_VALUE))
        );
        foodDonationUserWorkareaLayout.setVerticalGroup(
            foodDonationUserWorkareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodDonationUserWorkareaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(foodDonationUserWorkareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(37, 37, 37)
                .addGroup(foodDonationUserWorkareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(zipCodeFCTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(foodDonationUserWorkareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(foodDonationUserWorkareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messageLbl)
                    .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(foodDonationUserWorkareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(notifyFCButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(927, Short.MAX_VALUE))
        );

        userTabbedPanel.addTab("Food", foodDonationUserWorkarea);

        plasticDonationUserWorkarea.setBackground(new java.awt.Color(255, 255, 255));

        valueLbl1.setFont(new java.awt.Font("Bradley Hand", 1, 18)); // NOI18N
        valueLbl1.setForeground(new java.awt.Color(255, 51, 51));
        valueLbl1.setText("<value>");

        jLabel4.setFont(new java.awt.Font("Bradley Hand", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Dear:");

        zipcodeLbl.setFont(new java.awt.Font("Bradley Hand", 1, 18)); // NOI18N
        zipcodeLbl.setText("ZipCode:");

        quantityLbl.setFont(new java.awt.Font("Bradley Hand", 1, 18)); // NOI18N
        quantityLbl.setText("Location Type:");

        locationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Public place", "House" }));
        locationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationComboBoxActionPerformed(evt);
            }
        });

        messageLbl1.setFont(new java.awt.Font("Bradley Hand", 1, 18)); // NOI18N
        messageLbl1.setText("Message:");

        notifyPCButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/notify.png"))); // NOI18N
        notifyPCButton.setText("Notify to Collect");
        notifyPCButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notifyPCButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plasticDonationUserWorkareaLayout = new javax.swing.GroupLayout(plasticDonationUserWorkarea);
        plasticDonationUserWorkarea.setLayout(plasticDonationUserWorkareaLayout);
        plasticDonationUserWorkareaLayout.setHorizontalGroup(
            plasticDonationUserWorkareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plasticDonationUserWorkareaLayout.createSequentialGroup()
                .addGroup(plasticDonationUserWorkareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plasticDonationUserWorkareaLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel4)
                        .addGap(38, 38, 38)
                        .addComponent(valueLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(plasticDonationUserWorkareaLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addGroup(plasticDonationUserWorkareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(zipcodeLbl, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quantityLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(messageLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(plasticDonationUserWorkareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(plasticDonationUserWorkareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(messageTextField1)
                                .addComponent(locationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(zipCodePCTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(plasticDonationUserWorkareaLayout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(notifyPCButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(408, Short.MAX_VALUE))
        );
        plasticDonationUserWorkareaLayout.setVerticalGroup(
            plasticDonationUserWorkareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plasticDonationUserWorkareaLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(plasticDonationUserWorkareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(43, 43, 43)
                .addGroup(plasticDonationUserWorkareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zipcodeLbl)
                    .addComponent(zipCodePCTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(plasticDonationUserWorkareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityLbl)
                    .addComponent(locationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(plasticDonationUserWorkareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messageLbl1)
                    .addComponent(messageTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(notifyPCButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(912, Short.MAX_VALUE))
        );

        userTabbedPanel.addTab("Plastic", plasticDonationUserWorkarea);

        jLabel5.setFont(new java.awt.Font("Bradley Hand", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Dear:");

        valueLbl2.setFont(new java.awt.Font("Bradley Hand", 1, 18)); // NOI18N
        valueLbl2.setForeground(new java.awt.Color(255, 51, 51));
        valueLbl2.setText("<value>");

        jTabbedPane1.setBackground(new java.awt.Color(255, 51, 51));

        bloodWorkReqJPanel.setBackground(new java.awt.Color(255, 255, 255));
        bloodWorkReqJPanel.setPreferredSize(new java.awt.Dimension(711, 1000));

        bloodWorkReqJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Location", "Status", "Message", "Sender", "Blood Group", "Eligibity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        bloodWorkReqJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bloodWorkReqJTableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bloodWorkReqJTableMouseEntered(evt);
            }
        });
        jScrollPane8.setViewportView(bloodWorkReqJTable);

        cancelReqButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.jpg"))); // NOI18N
        cancelReqButton1.setText("Cancel");
        cancelReqButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelReqButton1ActionPerformed(evt);
            }
        });

        processDonationButton.setBackground(new java.awt.Color(255, 255, 255));
        processDonationButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/process.jpg"))); // NOI18N
        processDonationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processDonationButtonActionPerformed(evt);
            }
        });

        payButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pay1.jpg"))); // NOI18N
        payButton.setText("Pay");
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });

        invoicePanel.setBackground(new java.awt.Color(255, 255, 255));
        invoicePanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout bloodWorkReqJPanelLayout = new javax.swing.GroupLayout(bloodWorkReqJPanel);
        bloodWorkReqJPanel.setLayout(bloodWorkReqJPanelLayout);
        bloodWorkReqJPanelLayout.setHorizontalGroup(
            bloodWorkReqJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloodWorkReqJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8)
                .addContainerGap())
            .addGroup(bloodWorkReqJPanelLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(processDonationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(payButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(cancelReqButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloodWorkReqJPanelLayout.createSequentialGroup()
                .addComponent(invoicePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bloodWorkReqJPanelLayout.setVerticalGroup(
            bloodWorkReqJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloodWorkReqJPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloodWorkReqJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(processDonationButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(bloodWorkReqJPanelLayout.createSequentialGroup()
                        .addGroup(bloodWorkReqJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancelReqButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(payButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(invoicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Blood Work Request", bloodWorkReqJPanel);

        foodWorkReqJPanel.setBackground(new java.awt.Color(255, 255, 255));

        userStatusFCJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Quantity", "Status", "Result"
            }
        ));
        jScrollPane3.setViewportView(userStatusFCJTable);

        newRequestBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/request.jpeg"))); // NOI18N
        newRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newRequestBtnActionPerformed(evt);
            }
        });

        refreshFCBtn.setText("Refresh");
        refreshFCBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshFCBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout foodWorkReqJPanelLayout = new javax.swing.GroupLayout(foodWorkReqJPanel);
        foodWorkReqJPanel.setLayout(foodWorkReqJPanelLayout);
        foodWorkReqJPanelLayout.setHorizontalGroup(
            foodWorkReqJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodWorkReqJPanelLayout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(refreshFCBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(foodWorkReqJPanelLayout.createSequentialGroup()
                .addGap(356, 356, 356)
                .addComponent(newRequestBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        foodWorkReqJPanelLayout.setVerticalGroup(
            foodWorkReqJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodWorkReqJPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(foodWorkReqJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshFCBtn))
                .addGap(18, 18, 18)
                .addComponent(newRequestBtn)
                .addContainerGap(949, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Food Work Request", foodWorkReqJPanel);

        plasticWorkReqJPanel.setBackground(new java.awt.Color(255, 255, 255));

        userStatusPCJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Location", "Status", "Result"
            }
        ));
        jScrollPane5.setViewportView(userStatusPCJTable);

        newRequestBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/request.jpeg"))); // NOI18N
        newRequestBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newRequestBtn1ActionPerformed(evt);
            }
        });

        refreshPCBtn.setText("Refresh");
        refreshPCBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshPCBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plasticWorkReqJPanelLayout = new javax.swing.GroupLayout(plasticWorkReqJPanel);
        plasticWorkReqJPanel.setLayout(plasticWorkReqJPanelLayout);
        plasticWorkReqJPanelLayout.setHorizontalGroup(
            plasticWorkReqJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plasticWorkReqJPanelLayout.createSequentialGroup()
                .addGroup(plasticWorkReqJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plasticWorkReqJPanelLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refreshPCBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(plasticWorkReqJPanelLayout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(newRequestBtn1)))
                .addGap(90, 144, Short.MAX_VALUE))
        );
        plasticWorkReqJPanelLayout.setVerticalGroup(
            plasticWorkReqJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plasticWorkReqJPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(plasticWorkReqJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshPCBtn))
                .addGap(18, 18, 18)
                .addComponent(newRequestBtn1)
                .addContainerGap(947, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Plastic Work Request", plasticWorkReqJPanel);

        javax.swing.GroupLayout userWorkRequestPanelLayout = new javax.swing.GroupLayout(userWorkRequestPanel);
        userWorkRequestPanel.setLayout(userWorkRequestPanelLayout);
        userWorkRequestPanelLayout.setHorizontalGroup(
            userWorkRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userWorkRequestPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jTabbedPane1))
            .addGroup(userWorkRequestPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valueLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        userWorkRequestPanelLayout.setVerticalGroup(
            userWorkRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userWorkRequestPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userWorkRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        userTabbedPanel.addTab("Work Request", userWorkRequestPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(userTabbedPanel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(userTabbedPanel)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void notifyFCButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notifyFCButtonActionPerformed
        // TODO add your handling code here:
        double quantity = Double.parseDouble(quantityTextField.getText());
        String message = messageTextField.getText();
        String zipcode = zipCodeFCTextField.getText();
        String status = "Sent";

        FCWorkRequest request = new FCWorkRequest();
        request.setMessage(message);
        request.setQuantity(quantity);
        request.setZipcode(zipcode);
        request.setSender(userAccount);
        request.setStatus(status);

        //Organization org = null;
        for (Network network : ecosystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseList().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof FCEmployeeOrganization) {
                        //org = organization;
                        count++;
                        break;

                    }
                }
            }
        }
        if (count > 0) {
            //org.getWorkQueue().getWorkRequestList().add(request);
            ecosystem.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
            request.setRequestDate(new Date());
            JOptionPane.showMessageDialog(null, "Request has been raised and notified to BeingHuman. We'll revert back shortly.");
        } else {
            JOptionPane.showMessageDialog(null, "The work request was not created. Please raise it again..!!");
        }


    }//GEN-LAST:event_notifyFCButtonActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {
        // TODO add your handling code here:
        populateTableForBD();
        populateTableForFC();
        populateTableForPC();
    }

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        zipCodeFCTextField.setText("");
        quantityTextField.setText("");
        messageTextField.setText("");
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void locationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationComboBoxActionPerformed

    private void notifyPCButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notifyPCButtonActionPerformed
        // TODO add your handling code here:
        String location = (locationComboBox.getSelectedItem().toString());
        String message = messageTextField.getText();
        String zipcode = zipCodePCTextField.getText();

        PCWorkRequest request = new PCWorkRequest();
        request.setMessage(message);
        request.setLocation(location);
        request.setZipcode(zipcode);
        request.setSender(userAccount);
        request.setStatus("Sent");

        for (Network network : ecosystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseList().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof PCEmployeeOrganization) {
                        //org = organization;
                        count++;
                        break;

                    }
                }
            }
        }
        if (count > 0) {
            //org.getWorkQueue().getWorkRequestList().add(request);
            ecosystem.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        }

    }//GEN-LAST:event_notifyPCButtonActionPerformed

    private void donorRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donorRadioButtonActionPerformed
        // TODO add your handling code here:
        if (donorRadioButton.isSelected()) {
            DonationWorkRequestJPanel donorworkJPanel = new DonationWorkRequestJPanel(userBloodProcessPanel, userAccount, organization, enterprise, ecosystem);
            userBloodProcessPanel.add("DonationWorkRequestPanel", donorworkJPanel);
            CardLayout layout = (CardLayout) userBloodProcessPanel.getLayout();
            layout.next(userBloodProcessPanel);
        }
    }//GEN-LAST:event_donorRadioButtonActionPerformed

    private void recieverRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recieverRadioButtonActionPerformed
        // TODO add your handling code here:
        if (recieverRadioButton.isSelected()) {
            ReceiverWorkRequestPanel recieverWorkJPanel = new ReceiverWorkRequestPanel(userBloodProcessPanel, userAccount, organization, enterprise, ecosystem);
            userBloodProcessPanel.add("ReceiverWorkRequestPanel", recieverWorkJPanel);
            CardLayout layout = (CardLayout) userBloodProcessPanel.getLayout();
            layout.next(userBloodProcessPanel);
        }
    }//GEN-LAST:event_recieverRadioButtonActionPerformed


    private void bloodWorkReqJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloodWorkReqJTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = bloodWorkReqJTable.getSelectedRow();

        WorkRequest request = (WorkRequest) bloodWorkReqJTable.getValueAt(selectedRow, 0);
        if (request instanceof LabTestWorkRequest) {
            if (request.getEligibility().equals("Eligible")) {
                payButton.setEnabled(false);
                processDonationButton.setEnabled(true);
            } else {
                processDonationButton.setEnabled(false);
            }

            if (request.getStatus().equals("Completed")) {
                payButton.setEnabled(false);
                processDonationButton.setEnabled(false);
            }
        }
        if (request instanceof BloodBankAssistantWorkRequest) {
            if (request.getStatus().equalsIgnoreCase("Pending")) {
                payButton.setEnabled(true);
                processDonationButton.setEnabled(false);
            }
            if (request.getStatus().equals("Completed")) {
                payButton.setEnabled(false);
                processDonationButton.setEnabled(false);
            }
        }


    }//GEN-LAST:event_bloodWorkReqJTableMouseClicked

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = bloodWorkReqJTable.getSelectedRow();
        if (selectedRow <= 0) {
            JOptionPane.showMessageDialog(null, "Please select the row");
        } else {
            synchronized (this) {
                try {
                    WorkRequest request = (WorkRequest) bloodWorkReqJTable.getValueAt(selectedRow, 0);
                    int orderedQuantity = ((BloodBankAssistantWorkRequest) request).getBloodBankQuantity();
                    request.setStatus("Completed");
                    if (request instanceof BloodBankAssistantWorkRequest) {
                        for (Network network : ecosystem.getNetworkList()) {
                            if (network.getNetworkAddress().getAddress().equalsIgnoreCase(request.getLocation())) {
                                if (network.getBloodBank() == null) {
                                    network.setBloodBank(new BloodBank());
                                }
                                
                                for (BloodSpecification bs : network.getBloodBank().getBloodList()) {
                                    if (bs.getBloodGroup().equalsIgnoreCase(((BloodBankAssistantWorkRequest) request).getBloodType())) {
                                        for (int i = 0; i < orderedQuantity; i++) {
                                            network.getBloodBank().getBloodList().remove(bs);
                                            
                                        }
                                    }
                                }
                                
                            }
                        }
                        
                        BloodPaymentInvoiceJPanel bloodPaymentInvoiceJPanel = new BloodPaymentInvoiceJPanel(invoicePanel, userAccount, organization, enterprise, ecosystem, request.getLocation());
                        invoicePanel.add("BloodPaymentInvoiceJPanel", bloodPaymentInvoiceJPanel);
                        CardLayout layout = (CardLayout) invoicePanel.getLayout();
                        layout.next(invoicePanel);
                        populateTableForBD();
                        JOptionPane.showMessageDialog(null, "You payment is successful, lease check your mail for invoice");
                        payButton.setEnabled(false);
                        //SendMail sendMail = new SendMail();
                    }
                } catch (Exception e) {
                    //request.setStatus("Completed");
                    
                    //JOptionPane.showMessageDialog(null, "Done, Good Job");
                        BloodPaymentInvoiceJPanel bloodPaymentInvoiceJPanel = new BloodPaymentInvoiceJPanel(invoicePanel, userAccount, organization, enterprise, ecosystem, "Bill Generated");
                        invoicePanel.add("BloodPaymentInvoiceJPanel", bloodPaymentInvoiceJPanel);
                        CardLayout layout = (CardLayout) invoicePanel.getLayout();
                        layout.next(invoicePanel);
                        populateTableForBD();
                        JOptionPane.showMessageDialog(null, "You payment is successful, lease check your mail for invoice");
                        payButton.setEnabled(false);
                }

            }
        }

        int count = 0;

        BloodBankAssistantWorkRequest request = (BloodBankAssistantWorkRequest) bloodWorkReqJTable.getValueAt(selectedRow, 0);
        FinanceWorkRequest bfWorkRequest = new FinanceWorkRequest();
        String employee = request.getSender().getUsername();
        bfWorkRequest.setMessage("The amount collected by " + employee);
        bfWorkRequest.setLocation(request.getLocation());
        bfWorkRequest.setSender(userAccount);
        bfWorkRequest.setStatus("Sent");

        bfWorkRequest.setAmountCollected(200);

        for (Network network : ecosystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseList().getEnterpriseList()) {
                if (enterprise instanceof BeingHumanEnterprise) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof FinanceOrganization) {
                            count++;
                            break;
                        }
                    }
                }
            }
        }
        if (count > 0) {
            ecosystem.getWorkQueue().getWorkRequestList().add(bfWorkRequest);
            userAccount.getWorkQueue().getWorkRequestList().add(bfWorkRequest);
            JOptionPane.showMessageDialog(null, "Funds collected from blood are transfered to Finance Team");
        }

    }//GEN-LAST:event_payButtonActionPerformed

    private void processDonationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processDonationButtonActionPerformed
        // TODO add your handling code here:
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        ; //2016/11/16 12:08:43
        int selectedRow = bloodWorkReqJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        } else {
            try {

                LabTestWorkRequest labRequest = (LabTestWorkRequest) bloodWorkReqJTable.getValueAt(selectedRow, 0);

                String data = null;

                for (Network network : ecosystem.getNetworkList()) {
                    if (network.getNetworkAddress().getAddress().equalsIgnoreCase(labRequest.getLocation())) {
                        if (network.getBloodBank() == null) {
                            network.setBloodBank(new BloodBank());
                        }

                        BloodSpecification bs = network.getBloodBank().createBloodBank();
                        bs.setBloodGroup(labRequest.getBloodType());
                        bs.setDateOfDonation(dateFormat.format(date).toString());
                        bs.setQuantity(1);
                        data = userAccount.getPerson().getName() + bs.getBloodGroup() + bs.getDateOfDonation();
                    }
                }

                Barcode barcode = BarcodeFactory.createCode128B(data);

                JFrame frame = new JFrame("Barcode Details");
                frame.getContentPane().add(barcode);
                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                frame.pack();
                frame.setLocation(240, 290);
                frame.setVisible(true);
                labRequest.setStatus("Completed");
                JOptionPane.showMessageDialog(null, "Thank you for donating blood, God bless");
                populateTableForBD();
                processDonationButton.setEnabled(false);

            } catch (BarcodeException ex) {
                Logger.getLogger(UserWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_processDonationButtonActionPerformed

    private void bloodWorkReqJTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloodWorkReqJTableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodWorkReqJTableMouseEntered

    private void cancelReqButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelReqButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.removeAll();
        JPanel blankJP = new JPanel();
        userProcessContainer.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.next(userProcessContainer);
        //add animation panel
    }//GEN-LAST:event_cancelReqButton1ActionPerformed

    private void uploadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChoose = new JFileChooser();
        FileNameExtensionFilter extensionfilter = new FileNameExtensionFilter("Images", "jpg", "gif", "png");
        fileChoose.addChoosableFileFilter(extensionfilter);
        fileChoose.showOpenDialog(null);
        File file = fileChoose.getSelectedFile();
        String imagePath = file.getAbsolutePath();
        BufferedImage picture = null;
        try {

            picture = ImageIO.read(new File(imagePath));

        } catch (Exception e) {
            e.printStackTrace();
        }
        //setting image in picture label and in resume object
        imageLbl.setIcon(resizeImageInLabel(imagePath));
    }//GEN-LAST:event_uploadBtnActionPerformed

    private void newRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newRequestBtnActionPerformed
        // TODO add your handling code here:
        userTabbedPanel.setSelectedIndex(2);
    }//GEN-LAST:event_newRequestBtnActionPerformed

    private void newRequestBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newRequestBtn1ActionPerformed
        // TODO add your handling code here:
        userTabbedPanel.setSelectedIndex(3);
    }//GEN-LAST:event_newRequestBtn1ActionPerformed

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        // TODO add your handling code here:
        Tween.registerAccessor(ThePanel.class, new ThePanel.Accessor());
        SLAnimator.start();

        TheFrame frame = new TheFrame();
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }//GEN-LAST:event_goButtonActionPerformed

    private void refreshFCBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshFCBtnActionPerformed
        // TODO add your handling code here:
        populateTableForFC();

    }//GEN-LAST:event_refreshFCBtnActionPerformed

    private void refreshPCBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshPCBtnActionPerformed
        // TODO add your handling code here:
        populateTableForPC();

    }//GEN-LAST:event_refreshPCBtnActionPerformed
    //Method to resize the image as per the label size
    public ImageIcon resizeImageInLabel(String imagePath) {
        ImageIcon myImg = new ImageIcon(imagePath);
        Image image = myImg.getImage();
        Image newImage = image.getScaledInstance(imageLbl.getWidth(), imageLbl.getHeight(), imageLbl.getWidth());
        ImageIcon resizedImage = new ImageIcon(newImage);
        return resizedImage;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bloodDonationUserWorkarea;
    private javax.swing.JPanel bloodWorkReqJPanel;
    private javax.swing.JTable bloodWorkReqJTable;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton cancelReqButton1;
    private javax.swing.JRadioButton donorRadioButton;
    private javax.swing.JPanel foodDonationUserWorkarea;
    private javax.swing.JPanel foodWorkReqJPanel;
    private javax.swing.JButton goButton;
    private javax.swing.JLabel imageLbl;
    private javax.swing.JPanel invoicePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> locationComboBox;
    private javax.swing.JLabel messageLbl;
    private javax.swing.JLabel messageLbl1;
    private javax.swing.JTextField messageTextField;
    private javax.swing.JTextField messageTextField1;
    private javax.swing.JButton newRequestBtn;
    private javax.swing.JButton newRequestBtn1;
    private javax.swing.JButton notifyFCButton;
    private javax.swing.JButton notifyPCButton;
    private javax.swing.JButton payButton;
    private javax.swing.JPanel plasticDonationUserWorkarea;
    private javax.swing.JPanel plasticWorkReqJPanel;
    private javax.swing.JButton processDonationButton;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JLabel quantityLbl;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JRadioButton recieverRadioButton;
    private javax.swing.JButton refreshFCBtn;
    private javax.swing.JButton refreshPCBtn;
    private javax.swing.JButton uploadBtn;
    private javax.swing.JPanel userBloodProcessPanel;
    private javax.swing.JLabel userLbl;
    private javax.swing.JLabel userLbl1;
    private javax.swing.JTable userStatusFCJTable;
    private javax.swing.JTable userStatusPCJTable;
    private javax.swing.JTabbedPane userTabbedPanel;
    private javax.swing.ButtonGroup userTypeForBloodDonationButtonGroup;
    private javax.swing.JPanel userWorkRequestPanel;
    private javax.swing.JLabel valueLbl;
    private javax.swing.JLabel valueLbl1;
    private javax.swing.JLabel valueLbl2;
    private javax.swing.JLabel welcomLbl;
    private javax.swing.JTextField zipCodeFCTextField;
    private javax.swing.JTextField zipCodePCTextField;
    private javax.swing.JLabel zipcodeLbl;
    // End of variables declaration//GEN-END:variables
}
