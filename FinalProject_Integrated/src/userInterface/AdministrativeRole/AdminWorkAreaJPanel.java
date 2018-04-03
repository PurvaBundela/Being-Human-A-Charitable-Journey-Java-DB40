/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AdministrativeRole;

import Business.Chart.PieChart;
import Business.EcoSystem;
import Business.Enterprise.BankDetails;
import Business.Enterprise.BeingHumanEnterprise;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.Organization.OrganizationType;
import Business.Person.Person;
import Business.Person.PersonAddress;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author palakagrawal
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    UserAccount userAccount;
    Enterprise enterprise;
    EcoSystem system;

    public AdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.system = business;
        valueLabel.setText(enterprise.getEnterpriseType().getValue() + " : " + enterprise.getName());

        populateOrganizationCombo();
        populateOrganizationTable();
        populateOrganizationEmpComboBox();
        populateOrganizationComboForEmp();

    }

    private void populateOrganizationCombo() {
        organizationJComboBox.removeAllItems();

        if (enterprise.getEnterpriseType().getValue().equalsIgnoreCase("BeingHuman Enterprise")) {
            organizationJComboBox.addItem(OrganizationType.Finance);
        } else if (enterprise.getEnterpriseType().getValue().equalsIgnoreCase("Blood Donation Enterprise")) {
            organizationJComboBox.addItem(OrganizationType.LabAssistant);
            organizationJComboBox.addItem(OrganizationType.BloodBankAssistant);
        } else if (enterprise.getEnterpriseType().getValue().equalsIgnoreCase("Food Conservation Enterprise")) {
            organizationJComboBox.addItem(OrganizationType.FCEmployee);
            organizationJComboBox.addItem(OrganizationType.Orphanage);
        } else if (enterprise.getEnterpriseType().getValue().equalsIgnoreCase("Plastic Conservation Enterprise")) {
            organizationJComboBox.addItem(OrganizationType.PCEmployee);
            organizationJComboBox.addItem(OrganizationType.RecyclingTeam);
        }
    }

    private void populateOrganizationTable() {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            row[1] = organization.getName();

            model.addRow(row);
        }
    }

    public void populateOrganizationComboForEmp() {
        organizationForEmpComboBox.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            organizationForEmpComboBox.addItem(organization);
        }
    }
     private void populateAccountsTable() {
        DefaultTableModel model = (DefaultTableModel) manageAccountsTbl.getModel();

        model.setRowCount(0);

        
            if (enterprise instanceof BeingHumanEnterprise) {
                Object[] row = new Object[3];
                row[0] = ((BeingHumanEnterprise) enterprise).getBankDet().getAccountNum();
                row[1] = ((BeingHumanEnterprise) enterprise).getBankDet().getAccName();
                row[2] = enterprise.getName();
                model.addRow (row);
            }

    
    }

    public void populateOrganizationEmpComboBox() {
        organizationEmpComboBox.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            organizationEmpComboBox.addItem(organization);
        }
    }

    private void populateEmployeeTable(Organization organization) {
        DefaultTableModel model = (DefaultTableModel) employeeJTable.getModel();

        model.setRowCount(0);
        for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
            Object[] row = new Object[4];
            row[0] = ua.getPerson().getId();
            row[1] = ua.getPerson().getName();
            row[2] = ua.getUsername();
            row[3] = ua.getRole();

            model.addRow(row);

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

        genderButtonGroup = new javax.swing.ButtonGroup();
        valueLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        manageTabbedPane = new javax.swing.JTabbedPane();
        manageOrgTab = new javax.swing.JPanel();
        organizationJComboBox = new javax.swing.JComboBox();
        orgTypeInOrgLabel = new javax.swing.JLabel();
        cancelOrgButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        addOrgButton = new javax.swing.JButton();
        manageEmpTab = new javax.swing.JPanel();
        cancelEmpButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        employeeJTable = new javax.swing.JTable();
        createEmpButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        organizationForEmpComboBox = new javax.swing.JComboBox();
        personalJLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        genderLabel = new javax.swing.JLabel();
        empAgeTextField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        empEmailTextField = new javax.swing.JTextField();
        mobileLabel = new javax.swing.JLabel();
        empMobileTextField = new javax.swing.JTextField();
        custNameLabel = new javax.swing.JLabel();
        empNameTextField = new javax.swing.JTextField();
        bDateLabel = new javax.swing.JLabel();
        empBDateDateChooser1 = new com.toedter.calendar.JDateChooser();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        geoJLabel = new javax.swing.JLabel();
        geoJPanel = new javax.swing.JPanel();
        addressLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        cityTextField = new javax.swing.JTextField();
        zipCodeLabel = new javax.swing.JLabel();
        zipCodeTextField = new javax.swing.JTextField();
        stateLabel = new javax.swing.JLabel();
        stateTextField = new javax.swing.JTextField();
        countryLabel = new javax.swing.JLabel();
        countryTextField = new javax.swing.JTextField();
        geoJPanel1 = new javax.swing.JPanel();
        userNameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        empUserNameTextField = new javax.swing.JTextField();
        empPasswordTextField = new javax.swing.JPasswordField();
        geoJLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        organizationEmpComboBox = new javax.swing.JComboBox();
        roleJComboBox = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        companyLbl = new javax.swing.JLabel();
        companyTextField = new javax.swing.JTextField();
        sponsorListComboBox = new javax.swing.JComboBox<>();
        addSponsorBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        manageAccountsTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        accountTxtField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        accNameTxtField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        routingNumTxtField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        abaNumTxtField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        valueLabel.setFont(new java.awt.Font("Bradley Hand", 1, 24)); // NOI18N

        jScrollPane3.setPreferredSize(new java.awt.Dimension(979, 1200));

        manageTabbedPane.setName(""); // NOI18N

        manageOrgTab.setBackground(new java.awt.Color(255, 255, 255));

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<<Select Organization>>" }));

        orgTypeInOrgLabel.setText("Organization Type: ");

        cancelOrgButton.setBackground(new java.awt.Color(255, 102, 102));
        cancelOrgButton.setText("Cancel");
        cancelOrgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelOrgButtonActionPerformed(evt);
            }
        });

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);

        addOrgButton.setBackground(new java.awt.Color(255, 102, 102));
        addOrgButton.setText("Add");
        addOrgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrgButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout manageOrgTabLayout = new javax.swing.GroupLayout(manageOrgTab);
        manageOrgTab.setLayout(manageOrgTabLayout);
        manageOrgTabLayout.setHorizontalGroup(
            manageOrgTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageOrgTabLayout.createSequentialGroup()
                .addGroup(manageOrgTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageOrgTabLayout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addGroup(manageOrgTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(manageOrgTabLayout.createSequentialGroup()
                                .addComponent(orgTypeInOrgLabel)
                                .addGap(18, 18, 18)
                                .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(manageOrgTabLayout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(addOrgButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(cancelOrgButton)))
                .addContainerGap(480, Short.MAX_VALUE))
        );
        manageOrgTabLayout.setVerticalGroup(
            manageOrgTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageOrgTabLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(manageOrgTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orgTypeInOrgLabel)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(manageOrgTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addOrgButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelOrgButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(534, Short.MAX_VALUE))
        );

        manageTabbedPane.addTab("Manage Organization", manageOrgTab);

        manageEmpTab.setBackground(new java.awt.Color(255, 255, 255));

        cancelEmpButton.setBackground(new java.awt.Color(255, 102, 102));
        cancelEmpButton.setText("Cancel");
        cancelEmpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelEmpButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bradley Hand", 1, 18)); // NOI18N
        jLabel3.setText("Employee's Organization:");

        employeeJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "UserName", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(employeeJTable);

        createEmpButton.setBackground(new java.awt.Color(255, 102, 102));
        createEmpButton.setText("Create");
        createEmpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEmpButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Bradley Hand", 1, 18)); // NOI18N
        jLabel4.setText("Organization:");

        organizationForEmpComboBox.setFont(new java.awt.Font("Bradley Hand", 1, 14)); // NOI18N
        organizationForEmpComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Select Organization to view Employee>" }));
        organizationForEmpComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationForEmpComboBoxActionPerformed(evt);
            }
        });

        personalJLabel.setFont(new java.awt.Font("Bradley Hand", 1, 18)); // NOI18N
        personalJLabel.setText("Personal Information ");

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        genderLabel.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        genderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genderLabel.setText("Gender");
        genderLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        empAgeTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        empAgeTextField.setBorder(null);

        ageLabel.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        ageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ageLabel.setText("Age");
        ageLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        emailLabel.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        emailLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emailLabel.setText("E-Mail*");
        emailLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        empEmailTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        empEmailTextField.setBorder(null);

        mobileLabel.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        mobileLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mobileLabel.setText("Mobile");
        mobileLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        empMobileTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        empMobileTextField.setBorder(null);

        custNameLabel.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        custNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        custNameLabel.setText("Name* ");
        custNameLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        empNameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        empNameTextField.setBorder(null);

        bDateLabel.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        bDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bDateLabel.setText("Birth Date");
        bDateLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        genderButtonGroup.add(maleRadioButton);
        maleRadioButton.setText("Female");

        genderButtonGroup.add(femaleRadioButton);
        femaleRadioButton.setText("Male");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(maleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(femaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(custNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(empNameTextField))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(empEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mobileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(empMobileTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(empAgeTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(empBDateDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ageLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mobileLabel)
                        .addGap(18, 18, 18)
                        .addComponent(bDateLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(custNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(empEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(empNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(empAgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(empMobileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(femaleRadioButton)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(maleRadioButton)
                                        .addComponent(genderLabel))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(empBDateDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        geoJLabel.setFont(new java.awt.Font("Bradley Hand", 1, 18)); // NOI18N
        geoJLabel.setText("Geographical Information ");

        geoJPanel.setBackground(new java.awt.Color(255, 153, 153));
        geoJPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        addressLabel.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        addressLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressLabel.setText("Address*");
        addressLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cityLabel.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        cityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cityLabel.setText("City*");
        cityLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        addressTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addressTextField.setBorder(null);

        cityTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cityTextField.setBorder(null);

        zipCodeLabel.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        zipCodeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        zipCodeLabel.setText("ZipCode*");
        zipCodeLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        zipCodeTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        zipCodeTextField.setBorder(null);

        stateLabel.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        stateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stateLabel.setText("StateProvince*");
        stateLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        stateTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        stateTextField.setBorder(null);

        countryLabel.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        countryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        countryLabel.setText("Country*");
        countryLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        countryTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        countryTextField.setBorder(null);

        javax.swing.GroupLayout geoJPanelLayout = new javax.swing.GroupLayout(geoJPanel);
        geoJPanel.setLayout(geoJPanelLayout);
        geoJPanelLayout.setHorizontalGroup(
            geoJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(geoJPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(geoJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(geoJPanelLayout.createSequentialGroup()
                        .addGroup(geoJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(zipCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(geoJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(zipCodeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(addressTextField)))
                    .addGroup(geoJPanelLayout.createSequentialGroup()
                        .addComponent(cityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68)
                .addGroup(geoJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(countryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(geoJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(stateTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(countryTextField))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        geoJPanelLayout.setVerticalGroup(
            geoJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(geoJPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(geoJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, geoJPanelLayout.createSequentialGroup()
                        .addGroup(geoJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stateLabel)
                            .addComponent(stateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(geoJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(countryLabel)
                            .addComponent(countryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(geoJPanelLayout.createSequentialGroup()
                        .addGroup(geoJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addressLabel)
                            .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(geoJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityLabel))
                        .addGap(18, 18, 18)
                        .addGroup(geoJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(zipCodeTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zipCodeLabel, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        geoJPanel1.setBackground(new java.awt.Color(255, 153, 153));
        geoJPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        userNameLabel.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        userNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userNameLabel.setText("User Name* ");
        userNameLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        passwordLabel.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel.setText("Password* ");
        passwordLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        empUserNameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        empUserNameTextField.setBorder(null);

        javax.swing.GroupLayout geoJPanel1Layout = new javax.swing.GroupLayout(geoJPanel1);
        geoJPanel1.setLayout(geoJPanel1Layout);
        geoJPanel1Layout.setHorizontalGroup(
            geoJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, geoJPanel1Layout.createSequentialGroup()
                .addContainerGap(227, Short.MAX_VALUE)
                .addGroup(geoJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(geoJPanel1Layout.createSequentialGroup()
                        .addComponent(userNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(empUserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(geoJPanel1Layout.createSequentialGroup()
                        .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(empPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(287, 287, 287))
        );
        geoJPanel1Layout.setVerticalGroup(
            geoJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, geoJPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(geoJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLabel)
                    .addComponent(empUserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(geoJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(empPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        geoJLabel1.setFont(new java.awt.Font("Bradley Hand", 1, 18)); // NOI18N
        geoJLabel1.setText("User Account Information");

        jLabel10.setFont(new java.awt.Font("Bradley Hand", 1, 18)); // NOI18N
        jLabel10.setText("Role:");

        organizationEmpComboBox.setBackground(new java.awt.Color(255, 153, 153));
        organizationEmpComboBox.setFont(new java.awt.Font("Bradley Hand", 1, 18)); // NOI18N
        organizationEmpComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<<Select>>" }));
        organizationEmpComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationEmpComboBoxActionPerformed(evt);
            }
        });

        roleJComboBox.setBackground(new java.awt.Color(255, 153, 153));
        roleJComboBox.setFont(new java.awt.Font("Bradley Hand", 1, 18)); // NOI18N
        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<<Select>>" }));
        roleJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleJComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout manageEmpTabLayout = new javax.swing.GroupLayout(manageEmpTab);
        manageEmpTab.setLayout(manageEmpTabLayout);
        manageEmpTabLayout.setHorizontalGroup(
            manageEmpTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageEmpTabLayout.createSequentialGroup()
                .addGroup(manageEmpTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(manageEmpTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(manageEmpTabLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(manageEmpTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(geoJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(manageEmpTabLayout.createSequentialGroup()
                                    .addComponent(personalJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(manageEmpTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(manageEmpTabLayout.createSequentialGroup()
                                            .addGap(195, 195, 195)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(5, 5, 5))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageEmpTabLayout.createSequentialGroup()
                                            .addGap(28, 28, 28)
                                            .addComponent(jLabel3)))
                                    .addGap(26, 26, 26)
                                    .addGroup(manageEmpTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(organizationEmpComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(roleJComboBox, 0, 234, Short.MAX_VALUE)))))
                        .addGroup(manageEmpTabLayout.createSequentialGroup()
                            .addGap(279, 279, 279)
                            .addComponent(createEmpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(86, 86, 86)
                            .addComponent(cancelEmpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(manageEmpTabLayout.createSequentialGroup()
                        .addComponent(geoJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(695, 695, 695)))
                .addContainerGap(187, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageEmpTabLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(manageEmpTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageEmpTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(geoJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(geoJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(manageEmpTabLayout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(jLabel4)
                .addGap(32, 32, 32)
                .addComponent(organizationForEmpComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        manageEmpTabLayout.setVerticalGroup(
            manageEmpTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageEmpTabLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(manageEmpTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(organizationForEmpComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(manageEmpTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageEmpTabLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(personalJLabel))
                    .addGroup(manageEmpTabLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(manageEmpTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(organizationEmpComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(manageEmpTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(roleJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(geoJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(geoJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(geoJLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(geoJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(manageEmpTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createEmpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelEmpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        manageTabbedPane.addTab("Manage Employee", manageEmpTab);
        manageEmpTab.getAccessibleContext().setAccessibleName("");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        companyLbl.setText("Company Name:");

        sponsorListComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sponsor List" }));

        addSponsorBtn.setBackground(new java.awt.Color(255, 102, 102));
        addSponsorBtn.setText("Add Sponsor");
        addSponsorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSponsorBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(255, 102, 102));
        deleteBtn.setText("Delete Sponsor");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(companyLbl)
                        .addGap(18, 18, 18)
                        .addComponent(companyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(addSponsorBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteBtn)))
                .addGap(42, 42, 42)
                .addComponent(sponsorListComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(441, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(companyLbl)
                    .addComponent(companyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sponsorListComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addSponsorBtn)
                    .addComponent(deleteBtn))
                .addContainerGap(710, Short.MAX_VALUE))
        );

        manageTabbedPane.addTab("Sponsor", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        manageAccountsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Accout Number", "Account Name", "Enterprise Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(manageAccountsTbl);

        jLabel1.setText("Account Number:");

        jLabel2.setText("Name on Account:");

        jLabel5.setText("Routing Number:");

        jLabel6.setText("ABA Number:");

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(abaNumTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(accNameTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accountTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(routingNumTxtField)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(426, 426, 426)
                        .addComponent(jButton1)))
                .addContainerGap(369, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(accountTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(accNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(routingNumTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(abaNumTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addContainerGap(494, Short.MAX_VALUE))
        );

        manageTabbedPane.addTab("Manage Account", jPanel3);

        jScrollPane3.setViewportView(manageTabbedPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 973, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void organizationForEmpComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationForEmpComboBoxActionPerformed
        Organization organization = (Organization) organizationForEmpComboBox.getSelectedItem();
        if (organization != null) {
            populateEmployeeTable(organization);
        }
    }//GEN-LAST:event_organizationForEmpComboBoxActionPerformed

    private void createEmpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createEmpButtonActionPerformed

        Organization organization = (Organization) organizationEmpComboBox.getSelectedItem();
        Role role = (Role) roleJComboBox.getSelectedItem();
        Person person = new Person();
        PersonAddress personAdd = new PersonAddress();
        String name = empNameTextField.getText();
        String age = empAgeTextField.getText();
        String userName = empUserNameTextField.getText();
        String password = empPasswordTextField.getText();
        String contact = empMobileTextField.getText();
        String emailID = empEmailTextField.getText();
        String birthDate = empBDateDateChooser1.getDateFormatString();
        String zipCode = zipCodeTextField.getText();

        person.setName(name);
        person.setAge(Integer.parseInt(age));
        person.setContactNum(Long.parseLong(contact));
        person.setEmailID(emailID);
        if (maleRadioButton.isSelected()) {
            person.setGender(maleRadioButton.getText());
        } else {
            person.setGender(femaleRadioButton.getText());
        }

        person.setBirthdate(birthDate.toString());

        personAdd.setAddress(addressTextField.getText());
        personAdd.setZipCode(Integer.parseInt(zipCode));
        personAdd.setCity(cityTextField.getText());
        personAdd.setStateProvince(stateTextField.getText());
        personAdd.setCountry(countryTextField.getText());

        person.setPersonAddress(personAdd);

        organization.getPersonDirectory().addPerson(person);
        organization.getUserAccountDirectory().createUserAccount(userName, password, person, role);


    }//GEN-LAST:event_createEmpButtonActionPerformed

    private void cancelEmpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelEmpButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_cancelEmpButtonActionPerformed

    private void addOrgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrgButtonActionPerformed

        OrganizationType type = (OrganizationType) organizationJComboBox.getSelectedItem();
        enterprise.getOrganizationDirectory().createOrganization(type, enterprise.getEnterpriseType());
        populateOrganizationTable();
        populateOrganizationEmpComboBox();
        populateOrganizationComboForEmp();
    }//GEN-LAST:event_addOrgButtonActionPerformed

    private void cancelOrgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelOrgButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_cancelOrgButtonActionPerformed

    private void organizationEmpComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationEmpComboBoxActionPerformed
        // TODO add your handling code here:
        Organization org = (Organization) organizationEmpComboBox.getSelectedItem();
        if (org != null) {
            roleJComboBox.removeAllItems();
            for (Role role : org.getSupportedRole()) {
                roleJComboBox.addItem(role);
            }
        }
    }//GEN-LAST:event_organizationEmpComboBoxActionPerformed

    private void roleJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleJComboBoxActionPerformed

    private void addSponsorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSponsorBtnActionPerformed
        // TODO add your handling code here:
        sponsorListComboBox.addItem(companyTextField.getText());
        companyTextField.setText("");
        system.getSponsorList().add(companyTextField.getText());
    }//GEN-LAST:event_addSponsorBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:

        if(sponsorListComboBox.getSelectedItem().toString().equals("Sponsor List")){
            JOptionPane.showMessageDialog(null, "Please choose a company to delete from the list.");
        }
        else{
            int dialogBtn = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete the the Company from your list?", "WARNING", dialogBtn);
            if(dialogResult == JOptionPane.YES_OPTION){
                sponsorListComboBox.removeItem(sponsorListComboBox.getSelectedItem());
                system.getSponsorList().remove(sponsorListComboBox.getSelectedItem());

            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        BankDetails bd = new BankDetails();
        bd.setAbaNum(abaNumTxtField.getText());
        bd.setAccName(accNameTxtField.getText());
        bd.setAccountNum(accountTxtField.getText());
        bd.setRoutingNum(Integer.parseInt(routingNumTxtField.getText()));
        
        if(enterprise instanceof BeingHumanEnterprise){
            ((BeingHumanEnterprise)enterprise).setBankDet(bd);
        }
        
        populateAccountsTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField abaNumTxtField;
    private javax.swing.JTextField accNameTxtField;
    private javax.swing.JTextField accountTxtField;
    private javax.swing.JButton addOrgButton;
    private javax.swing.JButton addSponsorBtn;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel bDateLabel;
    private javax.swing.JButton cancelEmpButton;
    private javax.swing.JButton cancelOrgButton;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JLabel companyLbl;
    private javax.swing.JTextField companyTextField;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JTextField countryTextField;
    private javax.swing.JButton createEmpButton;
    private javax.swing.JLabel custNameLabel;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField empAgeTextField;
    private com.toedter.calendar.JDateChooser empBDateDateChooser1;
    private javax.swing.JTextField empEmailTextField;
    private javax.swing.JTextField empMobileTextField;
    private javax.swing.JTextField empNameTextField;
    private javax.swing.JPasswordField empPasswordTextField;
    private javax.swing.JTextField empUserNameTextField;
    private javax.swing.JTable employeeJTable;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel geoJLabel;
    private javax.swing.JLabel geoJLabel1;
    private javax.swing.JPanel geoJPanel;
    private javax.swing.JPanel geoJPanel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JTable manageAccountsTbl;
    private javax.swing.JPanel manageEmpTab;
    private javax.swing.JPanel manageOrgTab;
    private javax.swing.JTabbedPane manageTabbedPane;
    private javax.swing.JLabel mobileLabel;
    private javax.swing.JLabel orgTypeInOrgLabel;
    private javax.swing.JComboBox organizationEmpComboBox;
    private javax.swing.JComboBox organizationForEmpComboBox;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel personalJLabel;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JTextField routingNumTxtField;
    private javax.swing.JComboBox<String> sponsorListComboBox;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JTextField stateTextField;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JLabel zipCodeLabel;
    private javax.swing.JTextField zipCodeTextField;
    // End of variables declaration//GEN-END:variables
}
