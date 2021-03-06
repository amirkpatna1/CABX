import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AMIR KHAN
 */
public class LoginUI extends javax.swing.JFrame {

        /**
         * Creates new form LoginUI
         */
        public RegisterUI registerObj;
        public Object ddobj;
        public DisplayManager displaymanagerobject;
        public static LoginUI instance;

        public LoginUI(Object ddobj) {
                this.displaymanagerobject = DisplayManager.getInstanceOfDisplayManager();
                this.registerObj = RegisterUI.getInstanceOfRegisterUI();
                initComponents();
        }

        public static LoginUI getInstanceOfLogin() {
                if (instance == null)
                        instance = new LoginUI(new Object());
                return instance;
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jPanel2 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jPanel3 = new javax.swing.JPanel();
                jPanel4 = new javax.swing.JPanel();
                jLabel2 = new javax.swing.JLabel();
                jTextField1 = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                jPasswordField1 = new javax.swing.JPasswordField();
                cust = new javax.swing.JRadioButton();
                driv = new javax.swing.JRadioButton();
                jLabel4 = new javax.swing.JLabel();
                jButton1 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel2.setBackground(new java.awt.Color(204, 0, 102));

                jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setText("CABX");

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(jPanel2Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout
                                                .createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(424, 424, 424)));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel2Layout.createSequentialGroup()
                                                                .addContainerGap(54, Short.MAX_VALUE)
                                                                .addComponent(jLabel1).addContainerGap()));

                jPanel3.setBackground(new java.awt.Color(255, 255, 255));

                jPanel4.setBackground(new java.awt.Color(204, 0, 102));

                jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(255, 255, 255));
                jLabel2.setText("Email :");

                jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

                jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(255, 255, 255));
                jLabel3.setText("Password :");

                jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

                cust.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                // cust.setForeground(new java.awt.Color(255, 255, 255));
                cust.setText("Customer");
                cust.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                custActionPerformed(evt);
                        }
                });

                driv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                // driv.setForeground(new java.awt.Color(255, 255, 255));
                driv.setText("Driver");
                driv.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                drivActionPerformed(evt);
                        }
                });

                jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(255, 255, 255));
                jLabel4.setText("Need an account? Register here");
                jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jLabel4MouseClicked(evt);
                        }
                });

                jButton1.setBackground(new java.awt.Color(204, 0, 102));
                jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jButton1.setForeground(new java.awt.Color(255, 255, 255));
                jButton1.setText("Submit");
                jButton1.setActionCommand("Submit");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                jPanel4.setLayout(jPanel4Layout);
                jPanel4Layout.setHorizontalGroup(jPanel4Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel4Layout.createSequentialGroup().addGap(29, 29, 29)
                                                                .addGroup(jPanel4Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(driv,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                95,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(jPanel4Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel3)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(jPasswordField1))
                                                                                .addGroup(jPanel4Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel2)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(jTextField1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                233,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(cust,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel4,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)))
                                                .addGroup(jPanel4Layout.createSequentialGroup().addGap(139, 139, 139)
                                                                .addComponent(jButton1)))
                                                .addContainerGap(37, Short.MAX_VALUE)));
                jPanel4Layout.setVerticalGroup(jPanel4Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup().addGap(61, 61, 61)
                                                .addGroup(jPanel4Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel2).addComponent(jTextField1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(27, 27, 27)
                                                .addGroup(jPanel4Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel3).addComponent(jPasswordField1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18).addComponent(cust)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(driv).addGap(18, 18, 18).addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36,
                                                                Short.MAX_VALUE)
                                                .addComponent(jButton1).addGap(29, 29, 29)));

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(jPanel3Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout
                                                .createSequentialGroup().addContainerGap(297, Short.MAX_VALUE)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(281, 281, 281)));
                jPanel3Layout.setVerticalGroup(jPanel3Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup().addGap(32, 32, 32)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(76, Short.MAX_VALUE)));

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                jPanel1Layout.setVerticalGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                pack();
        }// </editor-fold>

        private void custActionPerformed(java.awt.event.ActionEvent evt) {
                if (this.cust.isSelected())
                        this.driv.setSelected(false);
                // TODO add your handling code here:
        }

        private void drivActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
                if (this.driv.isSelected())
                        this.cust.setSelected(false);
        }

        private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {
                // TODO add your handling code here:
                this.jLabel4.setForeground(new java.awt.Color(0, 0, 25));
                this.setVisible(false);
                registerObj.setVisible(true);

        }

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
                if (this.jTextField1.getText().equals("")
                                || String.valueOf(this.jPasswordField1.getPassword()).equals("")
                                || !(this.cust.isSelected() || this.driv.isSelected())) {
                        JOptionPane.showMessageDialog(this, "Enter details to log in");
                } else {
                        if (this.cust.isSelected()) {
                                Customer cobj = Login.loginCustomer(this.jTextField1.getText(),
                                                String.valueOf(this.jPasswordField1.getPassword()));
                                try {
                                        cobj.getCustomID();
                                        // SearchCab searchcabUI = SearchCab.getInstanceOfSearchCab(cobj);

                                        this.setVisible(false);
                                        // searchcabUI.setVisible(true);
                                        DisplayManager.getInstanceOfDisplayManager()
                                                        .getCustomerDisplayObjectFromCustomerObject(cobj)
                                                        .getSearchCabObject().setVisible(true);

                                } catch (NullPointerException e) {
                                        JOptionPane.showMessageDialog(this, "Incorrect Email or password");
                                }
                        } else if (this.driv.isSelected()) {
                                Driver dobj = Login.loginDriver(this.jTextField1.getText(),
                                                String.valueOf(this.jPasswordField1.getPassword()));

                                try {
                                        dobj.getCustomID();
                                        // DriverHomePage dui = DriverHomePage.getInstanceOfDriverHomePage(dobj);
                                        // System.out.println(dobj.getEmail());
                                        this.setVisible(false);
                                        // dui.setVisible(true);
                                        // DisplayManager.getInstanceOfDisplayManager()
                                        // .getDriverDisplayObjectFromDriverObject(dobj)
                                        // .getDriverHomePageObject().setVisible(true);
                                        this.displaymanagerobject.getDriverDisplayObject(dobj).getDriverHomePageObject()
                                                        .setVisible(true);
                                        ;
                                } catch (NullPointerException e) {
                                        JOptionPane.showMessageDialog(this, "Incorrect Email or password");
                                        // TODO: handle exception
                                }
                        }
                }
                // TODO add your handling code here:

        }

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
                // (optional) ">
                /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
                 * look and feel. For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                 */

                // </editor-fold>

                /* Create and display the form */
                // java.awt.EventQueue.invokeLater(new Runnable() {
                // public void run() {
                // new LoginUI().setVisible(true);
                // }
                // });
        }

        // Variables declaration - do not modify
        private javax.swing.JRadioButton cust;
        private javax.swing.JRadioButton driv;
        private javax.swing.JButton jButton1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JPasswordField jPasswordField1;
        private javax.swing.JTextField jTextField1;
        // End of variables declaration
}
