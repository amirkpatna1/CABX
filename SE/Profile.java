/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AMIR KHAN
 */
public class Profile extends javax.swing.JFrame {

        /**
         * Creates new form Profile
         */

        public static Profile instance;
        public int flag;
        public DisplayCustomer dcobj;
        public DisplayDriver ddobj;

        public Profile(int flag, Object dcobj) {
                initComponents();
                if (flag == 1) {
                        this.jLabel18.setVisible(false);
                        this.jLabel19.setVisible(false);
                        this.jLabel20.setVisible(false);
                        this.jLabel21.setVisible(false);

                        this.dcobj = (DisplayCustomer) dcobj;
                        // this.searchcabobj = SearchCab.getInstanceOfSearchCab(cobj);
                        this.jLabel6.setText(this.dcobj.getCustomerObject().getName());
                        this.jLabel9.setText(this.dcobj.getCustomerObject().getEmail());
                        this.jLabel11.setText(this.dcobj.getCustomerObject().getAge());
                        this.jLabel13.setText(this.dcobj.getCustomerObject().getPhoneNumber());
                        this.jLabel15.setText(this.dcobj.getCustomerObject().getLocation());
                        this.jLabel17.setText(String.valueOf(this.dcobj.getCustomerObject().getCustomID()));
                        this.jLabel3.setText(this.dcobj.getCustomerObject().getName());
                } else {
                        this.ddobj = (DisplayDriver) dcobj;
                        // this.driverhome = DriverHomePage.getInstanceOfDriverHomePage(dobj);
                        this.jLabel6.setText(this.ddobj.getDriverObject().getName());
                        this.jLabel9.setText(this.ddobj.getDriverObject().getEmail());
                        this.jLabel11.setText(this.ddobj.getDriverObject().getAge());
                        this.jLabel13.setText(this.ddobj.getDriverObject().getPhoneNumber());
                        this.jLabel15.setText(this.ddobj.getDriverObject().getLocation());
                        this.jLabel17.setText(String.valueOf(this.ddobj.getDriverObject().getCustomID()));
                        this.jLabel3.setText(this.ddobj.getDriverObject().getName());
                        this.jLabel19.setText(this.ddobj.getDriverObject().getVehiclename());
                        this.jLabel21.setText(this.ddobj.getDriverObject().getVehiclenumber());

                }
                this.flag = flag;
                // this.loginuiobj = LoginUI.getInstanceOfLoginUI();
        }

        // public static Profile getProfileObject(int flag, Object dcobj) {
        // if (instance == null)
        // instance = new Profile(flag, dcobj);
        // return instance;
        // }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jPanel2 = new javax.swing.JPanel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                jLabel9 = new javax.swing.JLabel();
                jLabel10 = new javax.swing.JLabel();
                jLabel11 = new javax.swing.JLabel();
                jLabel12 = new javax.swing.JLabel();
                jLabel13 = new javax.swing.JLabel();
                jLabel14 = new javax.swing.JLabel();
                jLabel15 = new javax.swing.JLabel();
                jLabel16 = new javax.swing.JLabel();
                jLabel17 = new javax.swing.JLabel();
                jLabel18 = new javax.swing.JLabel();
                jLabel19 = new javax.swing.JLabel();
                jLabel20 = new javax.swing.JLabel();
                jLabel21 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(153, 0, 102));

                jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(255, 255, 255));
                jLabel2.setText("CabX");

                jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(255, 255, 255));
                jLabel3.setText("User name");

                jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(255, 255, 255));
                jLabel4.setText("Home");
                jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jLabel4MouseClicked(evt);
                        }
                });

                jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                jLabel5.setForeground(new java.awt.Color(255, 255, 255));
                jLabel5.setText("Logout");
                jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jLabel5MouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup().addGap(22, 22, 22).addComponent(jLabel3)
                                                .addGap(245, 245, 245).addComponent(jLabel2).addGap(134, 134, 134)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(23, 23, 23)));
                jPanel1Layout.setVerticalGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup().addContainerGap(66, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel2).addComponent(jLabel3)
                                                                .addComponent(jLabel4).addComponent(jLabel5))
                                                .addContainerGap()));

                jPanel2.setBackground(new java.awt.Color(255, 255, 255));

                jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                jLabel6.setForeground(new java.awt.Color(102, 0, 51));
                jLabel6.setText("Setname");

                jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                jLabel7.setForeground(new java.awt.Color(102, 0, 51));
                jLabel7.setText("Name : ");

                jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                jLabel8.setForeground(new java.awt.Color(102, 0, 51));
                jLabel8.setText("Email :");

                jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                jLabel9.setForeground(new java.awt.Color(102, 0, 51));
                jLabel9.setText("Setemail");

                jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                jLabel10.setForeground(new java.awt.Color(102, 0, 51));
                jLabel10.setText("Age :");

                jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                jLabel11.setForeground(new java.awt.Color(102, 0, 51));
                jLabel11.setText("setage");

                jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                jLabel12.setForeground(new java.awt.Color(102, 0, 51));
                jLabel12.setText("Phone number :");

                jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                jLabel13.setForeground(new java.awt.Color(102, 0, 51));
                jLabel13.setText("Setphone");

                jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                jLabel14.setForeground(new java.awt.Color(102, 0, 51));
                jLabel14.setText("Location :");

                jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                jLabel15.setForeground(new java.awt.Color(102, 0, 51));
                jLabel15.setText("Setlocation");

                jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                jLabel16.setForeground(new java.awt.Color(102, 0, 51));
                jLabel16.setText("Customer ID :");

                jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                jLabel17.setForeground(new java.awt.Color(102, 0, 51));
                jLabel17.setText("Setcustomid");

                jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                jLabel18.setForeground(new java.awt.Color(102, 0, 51));
                jLabel18.setText("Vehicle name :");

                jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                jLabel19.setForeground(new java.awt.Color(102, 0, 51));
                jLabel19.setText("setvehicle");

                jLabel20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                jLabel20.setForeground(new java.awt.Color(102, 0, 51));
                jLabel20.setText("Vehicle number :");

                jLabel21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                jLabel21.setForeground(new java.awt.Color(102, 0, 51));
                jLabel21.setText("setVehiclenum");

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(jPanel2Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup().addGap(30, 30, 30)
                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(jLabel7)
                                                                                .addGap(112, 112, 112)
                                                                                .addComponent(jLabel6,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                223,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(jLabel18)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jLabel19,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addGroup(jPanel2Layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                .addGroup(jPanel2Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(jLabel8)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                .addComponent(jLabel9,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                332,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(jPanel2Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(jPanel2Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(jLabel10,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                82,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addGap(124, 124,
                                                                                                                                                124)
                                                                                                                                .addComponent(jLabel11,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                82,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGroup(jPanel2Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGroup(jPanel2Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(jLabel12,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                201,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(jLabel14,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                179,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(jLabel16,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                179,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addGroup(jPanel2Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(jLabel17,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                179,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(jLabel15,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                179,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(jLabel13,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                217,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jLabel20,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                204,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jLabel21,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                194, Short.MAX_VALUE)))
                                                .addContainerGap()));
                jPanel2Layout.setVerticalGroup(jPanel2Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup().addGap(34, 34, 34)
                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel6).addComponent(jLabel7)
                                                                .addComponent(jLabel18).addComponent(jLabel19))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel8).addComponent(jLabel9)
                                                                .addComponent(jLabel20).addComponent(jLabel21))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel11).addComponent(jLabel10))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel12).addComponent(jLabel13))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel14).addComponent(jLabel15))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel16).addComponent(jLabel17))
                                                .addContainerGap(30, Short.MAX_VALUE)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)));

                pack();
        }

        private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {
                if (flag == 1) {
                        this.setVisible(false);
                        // searchcabobj.setVisible(true);
                        dcobj.getSearchCabObject().setVisible(true);
                } else {
                        this.setVisible(false);
                        // driverhome.setVisible(true);
                        ddobj.getDriverHomePageObject().setVisible(true);
                }

                // TODO add your handling code here:
        }

        private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {
                this.setVisible(false);
                // loginuiobj.setVisible(true);
                LoginUI.getInstanceOfLogin().setVisible(true);
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

        }

        // Variables declaration - do not modify
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel15;
        private javax.swing.JLabel jLabel16;
        private javax.swing.JLabel jLabel17;
        private javax.swing.JLabel jLabel18;
        private javax.swing.JLabel jLabel19;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel20;
        private javax.swing.JLabel jLabel21;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        // End of variables declaration
}
