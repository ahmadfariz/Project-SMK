
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmad Fariz
 */
public class Login extends javax.swing.JFrame {
    public Connection con;
    public Statement stt;
    public ResultSet rs;
    public static int kondisiLogin=3;
    public static String userLogin="tidak terdeteksi";

    /**
     * Creates new form Layout
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tampil = new javax.swing.JCheckBox();
        user = new javax.swing.JTextField();
        paswd = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        masuk = new javax.swing.JButton();
        keluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(680, 566));
        getContentPane().setLayout(null);

        tampil.setOpaque(false);
        tampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilActionPerformed(evt);
            }
        });
        getContentPane().add(tampil);
        tampil.setBounds(140, 370, 20, 21);

        user.setBorder(null);
        user.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(user);
        user.setBounds(140, 150, 330, 80);

        paswd.setBorder(null);
        getContentPane().add(paswd);
        paswd.setBounds(140, 270, 330, 80);

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(600, 20, 40, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 670, 540);

        masuk.setText("jButton1");
        masuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masukActionPerformed(evt);
            }
        });
        getContentPane().add(masuk);
        masuk.setBounds(370, 410, 180, 70);

        keluar.setText("jButton1");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        getContentPane().add(keluar);
        keluar.setBounds(140, 410, 180, 70);

        setSize(new java.awt.Dimension(665, 541));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void tampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilActionPerformed
        // TODO add your handling code here:
              if(tampil.isSelected() == false){
            paswd.setEchoChar('*');
        }
        else{
            paswd.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_tampilActionPerformed

    private void masukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masukActionPerformed
        // TODO add your handling code here:
                try{
        koneksi();
        ResultSet result = stt.executeQuery("Select username,typeuser,password From login where username = '"+user.getText() +"'"+ "and password = '" + paswd.getText() + "'");
            if(result.next()){
            new Menu(result.getString(1), result.getString(2)).setVisible(true);
            this.dispose();
            }else{
            JOptionPane.showMessageDialog(rootPane, "Data tidak valid.");
            }
            }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Login gagal.");
        }
    }//GEN-LAST:event_masukActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_keluarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    private void bersih() {
        user.setText("");
        paswd.setText("");
        user.requestFocus();
    }
    
    private void koneksi() {
        try {
            String hubung="jdbc:mysql://localhost:3306/poliklinik_fariz";
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(hubung,"root","");
            stt=con.createStatement(rs.TYPE_SCROLL_SENSITIVE,rs.CONCUR_UPDATABLE);
            rs=stt.executeQuery("select*from login");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.exit(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton keluar;
    private javax.swing.JButton masuk;
    private javax.swing.JPasswordField paswd;
    private javax.swing.JCheckBox tampil;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
