/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staffservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static org.omg.CORBA.AnySeqHelper.insert;

/**
 *
 * @author snwijesuriya
 */
public class AddCustomer extends javax.swing.JFrame {
    private Object conn;
    private String insert;

    /**
     * Creates new form AddCustomer
     */
    public AddCustomer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtName = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtContactNo1 = new javax.swing.JTextField();
        txtContactNo2 = new javax.swing.JTextField();
        txtContactNo3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtContactNo4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(700, 600));
        setMinimumSize(new java.awt.Dimension(700, 600));
        setPreferredSize(new java.awt.Dimension(400, 300));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtID);
        txtID.setBounds(220, 90, 270, 25);

        txtName.setColumns(20);
        txtName.setRows(5);
        jScrollPane1.setViewportView(txtName);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(220, 140, 270, 60);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel1.setText("Contact No   ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 232, 100, 16);

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel2.setText("ID                 ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 96, 240, 16);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel3.setText("Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 160, 170, 16);

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel4.setText("Destination         ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 344, 120, 16);

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel5.setText("Starting ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 294, 100, 16);

        jButton1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jButton1.setText("Reset");
        jPanel1.add(jButton1);
        jButton1.setBounds(370, 440, 120, 30);

        jButton2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jButton2.setText("Submit");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(220, 440, 120, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setText("Add Customer");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(230, 20, 320, 50);

        txtContactNo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNo1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtContactNo1);
        txtContactNo1.setBounds(220, 230, 270, 25);

        txtContactNo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNo2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtContactNo2);
        txtContactNo2.setBounds(220, 290, 270, 25);

        txtContactNo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNo3ActionPerformed(evt);
            }
        });
        jPanel1.add(txtContactNo3);
        txtContactNo3.setBounds(220, 340, 270, 25);

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel8.setText("Bus Number         ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(90, 392, 120, 16);

        jButton3.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButton3.setText("Payment Page");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(60, 520, 140, 25);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        txtContactNo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNo4ActionPerformed(evt);
            }
        });
        jPanel2.add(txtContactNo4);
        txtContactNo4.setBounds(160, 370, 270, 25);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(60, 20, 530, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
    // TODO add your handling code here:

    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String ID = txtName.getText();    
    String Name = txtName.getText();
    String contact = txtContactNo1.getText();
    String starting = txtContactNo2.getText();
    String destination = txtContactNo3.getText();
    String busnumber = txtContactNo4.getText();   
        try
     {
         
Class.forName("com.mysql.jdbc.Driver");
        String dbURL = "jdbc:mysql://localhost/staff_service";
        String user = "root";
        String pass = "root";
        Connection conn = DriverManager.getConnection(dbURL, user, pass);
         
       Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("insert into customer(customer_id,customer_name,,starting,destination,) values('"+ID+"','"+Name+"','"+starting+"','"+destination+"','"+busnumber+"')");
                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
    System.out.println(rs);        // TODO add your handling code here:
     }
     catch(Exception e)
     {
         JOptionPane.showMessageDialog(null, e.getMessage() ,"Error", 1);

     }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtContactNo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNo1ActionPerformed

    private void txtContactNo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNo2ActionPerformed

    private void txtContactNo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNo3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed


   AddCustomer frame1=new AddCustomer();
    Payment frame2=new Payment();
    this.dispose();
   frame1.setVisible(false);
   frame2.setVisible(true);
 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtContactNo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNo4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtContactNo1;
    private javax.swing.JTextField txtContactNo2;
    private javax.swing.JTextField txtContactNo3;
    private javax.swing.JTextField txtContactNo4;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextArea txtName;
    // End of variables declaration//GEN-END:variables
}
