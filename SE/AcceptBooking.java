
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 *
 * @author AMIR KHAN
 */
public class AcceptBooking extends javax.swing.JFrame {

        /**
         * Creates new form Cabx
         */
        public DefaultListModel<String> model = new DefaultListModel<>();
        public DisplayDriver ddobj;
        public int bid;

        public AcceptBooking(DisplayDriver ddobj) {
                this.ddobj = ddobj;
                initComponents();
                searchLoc();
        }

        public void searchLoc() {
                model.clear();
                BookingManager bmgr = BookingManager.getInstanceOfBookingManager();
                bmgr.isCalledOnce();
                try {
                        for (int i = 0; i < bmgr.b.size(); i++) {
                                int pickup_pin = Integer.parseInt(bmgr.b.get(i).getPickupLocation());
                                if (Math.abs(Integer.parseInt(ddobj.getDriverObject().getLocation())
                                                - pickup_pin) <= 10) {
                                        ddobj.setBookingObject(bmgr.b.get(i));
                                        String booking_label = ddobj.getBookingObject().getCustomerName() + "    "
                                                        + ddobj.getBookingObject().getCustomerPhoneNumber() + "    "
                                                        + pickup_pin + "    "
                                                        + ddobj.getBookingObject().getDropLocation() + "    "
                                                        + ddobj.getBookingObject().getBookingID();
                                        model.add(model.size(), booking_label);

                                }
                        }

                } catch (Exception e) {
                        // TODO: handle exception
                }

        }

        public void acceptBooking() {
                BookingManager bmgr = BookingManager.getInstanceOfBookingManager();
                bmgr.isCalledOnce();
                Booking bkg = bmgr.getBooking(bid);
                if (bkg.getStatus() == 0) {
                        ddobj.setBookingObject(bkg);
                        ddobj.getBookingObject().setDriverName(ddobj.getDriverObject().getName());
                        ddobj.getBookingObject().setDriverPhoneNumber(ddobj.getDriverObject().getPhoneNumber());
                        ddobj.getBookingObject().setVehicleName(ddobj.getDriverObject().getVehiclename());
                        ddobj.getBookingObject().setVehicleNumber(ddobj.getDriverObject().getVehiclenumber());
                        ddobj.getBookingObject().setStatus(1);
                        bmgr.reWriteInBookingFile(ddobj.getBookingObject());
                        this.setVisible(false);
                        ddobj.getDetailsObject().setVisible(true);

                } else {
                        JOptionPane.showMessageDialog(this, "Try accepting another booking");
                }

                // if (bmgr.removeBooking(bid)) {

                // // new Details(bkg).setVisible(true);
                // // Details detailobj =
                // Details.getInstanceOfDetails(ddobj.getBookingObject());
                // this.setVisible(false);
                // // detailobj.setVisible(true);
                // ddobj.getDetailsObject().setVisible(true);
                // ddobj.getDriverObject().setLocation(ddobj.getBookingObject().getDropLocation());

                searchLoc();

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
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jPanel4 = new javax.swing.JPanel();
                jScrollPane2 = new javax.swing.JScrollPane();
                jList1 = new javax.swing.JList<>();
                jButton1 = new javax.swing.JButton();
                jPanel3 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel2.setBackground(new java.awt.Color(153, 0, 51));
                jPanel2.setForeground(new java.awt.Color(153, 0, 51));

                jLabel2.setBackground(new java.awt.Color(255, 255, 255));
                jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(255, 255, 255));
                jLabel2.setText("Accept Booking");

                jLabel3.setBackground(new java.awt.Color(255, 255, 255));
                jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(255, 255, 255));
                jLabel3.setText(ddobj.getDriverObject().getName());

                jLabel4.setBackground(new java.awt.Color(255, 255, 255));
                jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(255, 255, 255));
                jLabel4.setText("Profile");

                jLabel5.setBackground(new java.awt.Color(255, 255, 255));
                jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                jLabel5.setForeground(new java.awt.Color(255, 255, 255));
                jLabel5.setText("Logout");

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(jPanel2Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                119, Short.MAX_VALUE)
                                                .addComponent(jLabel2).addGap(69, 69, 69)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18).addComponent(jLabel5).addGap(20, 20, 20)));
                jPanel2Layout.setVerticalGroup(jPanel2Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout
                                                .createSequentialGroup().addContainerGap(41, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel2).addComponent(jLabel3)
                                                                .addComponent(jLabel4).addComponent(jLabel5))
                                                .addGap(21, 21, 21)));

                jPanel4.setBackground(new java.awt.Color(153, 0, 51));

                String s = "Name    Phone Number    Pickup    Drop    Booking ID";
                model.add(0, s);
                // System.out.print(model.size());
                jList1 = new JList();

                jList1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jList1.setModel(model);
                MouseListener mouseListener = new MouseAdapter() {
                        public void mouseClicked(MouseEvent mouseEvent) {
                                JList<String> theList = (JList) mouseEvent.getSource();
                                if (mouseEvent.getClickCount() == 2) {
                                        int index = theList.locationToIndex(mouseEvent.getPoint());
                                        if (index >= 0) {
                                                Object o = theList.getModel().getElementAt(index);
                                                String[] strarr = o.toString().split("    ");
                                                bid = Integer.parseInt(strarr[4]);
                                                ddobj.getBookingObject()
                                                                .setDriverName(ddobj.getDriverObject().getName());
                                                ddobj.getBookingObject().setVehicleName(
                                                                ddobj.getDriverObject().getVehiclename());
                                                ddobj.getBookingObject().setVehicleNumber(
                                                                ddobj.getDriverObject().getVehiclenumber());
                                                acceptBooking();
                                                System.out.println("Double-clicked on: " + o.toString());
                                        }
                                }
                        }
                };
                jList1.addMouseListener(mouseListener);

                jScrollPane2.setViewportView(jList1);

                jButton1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
                jButton1.setText("Refresh");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                jPanel4.setLayout(jPanel4Layout);
                jPanel4Layout.setHorizontalGroup(jPanel4Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel4Layout.createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jButton1).addGap(54, 54, 54)));
                jPanel4Layout.setVerticalGroup(jPanel4Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup().addContainerGap()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton1).addContainerGap(28, Short.MAX_VALUE)));

                jLabel1.setBackground(new java.awt.Color(153, 0, 51));
                jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(153, 0, 51));
                jLabel1.setText("List Of Customers");

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel3Layout.createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel1).addGap(224, 224, 224)));
                jPanel3Layout.setVerticalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup().addContainerGap()
                                                                .addComponent(jLabel1)
                                                                .addContainerGap(68, Short.MAX_VALUE)));

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap())
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                jPanel1Layout.setVerticalGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(105, 105, 105)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 10, Short.MAX_VALUE)));

                pack();
        }// </editor-fold>

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
                searchLoc();
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
        private javax.swing.JButton jButton1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JList<String> jList1;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JScrollPane jScrollPane2;
        // End of variables declaration
}
