/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_input;

import all_classes.javamail;
import interface_input.*;
import interface_output.*;
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Client_add_manual extends javax.swing.JFrame {

    /**
     * Creates new form Cadd
     */
    int mX,mY;
    DefaultTableModel model = new DefaultTableModel();
    public Client_add_manual() {
        initComponents();
        ImageIcon img=new ImageIcon("img\\cms.png");
        this.setIconImage(img.getImage());
        move.setCursor(new Cursor(Cursor.MOVE_CURSOR));
        exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        min.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add.setCursor(new Cursor(Cursor.HAND_CURSOR));
        reset.setCursor(new Cursor(Cursor.HAND_CURSOR));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        move = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        dob = new com.toedter.calendar.JDateChooser();
        mac = new javax.swing.JTextField();
        cid = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        band = new javax.swing.JTextField();
        mob = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        ip = new javax.swing.JTextField();
        type = new javax.swing.JComboBox();
        uname = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jScrollPane2 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        alert = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        reset = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        move.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                moveMouseDragged(evt);
            }
        });
        move.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                moveMousePressed(evt);
            }
        });
        getContentPane().add(move, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 810, 30));

        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
        });
        getContentPane().add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 30, 30));

        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 40, 30));

        dob.setBackground(new java.awt.Color(46, 46, 89));
        dob.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dob.setToolTipText("Select the date");
        dob.setDateFormatString("yyyy-M-d");
        dob.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 245, 30));

        mac.setBackground(new java.awt.Color(38, 32, 132));
        mac.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mac.setForeground(new java.awt.Color(255, 255, 255));
        mac.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(mac, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 425, 30));

        cid.setBackground(new java.awt.Color(38, 32, 132));
        cid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cid.setForeground(new java.awt.Color(255, 255, 255));
        cid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(cid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 75, 377, 30));

        name.setBackground(new java.awt.Color(38, 32, 132));
        name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 397, 30));

        band.setBackground(new java.awt.Color(38, 32, 132));
        band.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        band.setForeground(new java.awt.Color(255, 255, 255));
        band.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(band, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 285, 30));

        mob.setBackground(new java.awt.Color(38, 32, 132));
        mob.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mob.setForeground(new java.awt.Color(255, 255, 255));
        mob.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(mob, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 211, 395, 30));

        email.setBackground(new java.awt.Color(38, 32, 132));
        email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 257, 405, 30));

        ip.setBackground(new java.awt.Color(38, 32, 132));
        ip.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ip.setForeground(new java.awt.Color(255, 255, 255));
        ip.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(ip, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 303, 445, 30));

        type.setBackground(new java.awt.Color(38, 32, 132));
        type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Shared", "Dedicated" }));
        type.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 396, 310, 30));

        uname.setBackground(new java.awt.Color(38, 32, 132));
        uname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        uname.setForeground(new java.awt.Color(255, 255, 255));
        uname.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 75, 265, 30));

        fname.setBackground(new java.awt.Color(38, 32, 132));
        fname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fname.setForeground(new java.awt.Color(255, 255, 255));
        fname.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 166, 330, 30));

        pass.setBackground(new java.awt.Color(38, 32, 132));
        pass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 124, 275, 30));

        address.setBackground(new java.awt.Color(38, 32, 132));
        address.setColumns(20);
        address.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        address.setForeground(new java.awt.Color(255, 255, 255));
        address.setRows(3);
        address.setTabSize(4);
        address.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setViewportView(address);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 370, 120));

        alert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        alert.setForeground(new java.awt.Color(255, 0, 0));
        alert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alertMouseClicked(evt);
            }
        });
        getContentPane().add(alert, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 910, 35));

        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, 130, 50));

        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 400, 130, 50));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Client_add_Manual.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void moveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveMouseDragged
        // TODO add your handling code here:
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-mX, y-mY);
    }//GEN-LAST:event_moveMouseDragged

    private void moveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveMousePressed
        // TODO add your handling code here:
        mX=evt.getX();
        mY=evt.getY();
    }//GEN-LAST:event_moveMousePressed

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(Client_add_manual.ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
    nill();
    }//GEN-LAST:event_resetMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
    if(allValid())
    {
        try {
            //clientinfo`(`cid`, `name`, `fname`, `mobile`, `email`, `bdate`,
            //`address`, `type`, `bandwidth`, `ip`, `mac`, `picture`, `status`) 
                connection();
                String sql="insert into clientinfo(cid,name,fname,mobile,"
                        + "email,bdate,address,type,bandwidth,ip,mac)"
                        + " values(?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement preparedStatement = con.prepareStatement(sql);
                preparedStatement.setString(1, CID);
                preparedStatement.setString(2, NAME);
                preparedStatement.setString(3, FNAME);
                preparedStatement.setString(4, MOBILE);   
                preparedStatement.setString(5, EMAIL);
                preparedStatement.setString(6, DOB);
                preparedStatement.setString(7, ADDRESS);
                preparedStatement.setString(8, TYPE);
                preparedStatement.setString(9, BANDWIDTH);
                preparedStatement.setString(10, IP);
                preparedStatement.setString(11, MAC);
                preparedStatement.executeUpdate();
                String sql2="insert into login(cid,uname,email,pass)"
                        + " values(?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql2);
                pst.setString(1, CID);
                pst.setString(2, UNAME);
                pst.setString(3, EMAIL);
                pst.setString(4, PASS);
                pst.executeUpdate();
                String body="Dear sir,"+NAME+
                        "\nWelcome to FutureNet\n________be connected with world\n"+
                        "\n_______________________________\n"+
                        "Your Client ID: "+CID+
                        "\nUsername      :"+UNAME+
                        "\nEmail         :"+EMAIL+
                        "\nPassword      :"+PASS+
                        "\nIP            :"+IP+
                        "\nMAC           :"+MAC+
                        "\n_______________________________\n"+
                        "Powered By nullPointerException.";
                alert.setText("Please wait a moments.The confermation message is sending...");
                if(javamail.Sendmail(EMAIL,"Confermation message by FutureNet",body)){
                   alert.setText("Messsage successfully send."); 
                }
                else{
                   alert.setText("Some technical problems to send email!");  
                }
                JOptionPane.showMessageDialog(null, "Registerd Successfully!!!!");
                alert.setText("Registerd Successfully!!");
                nill();
            } catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }//GEN-LAST:event_addMouseClicked

    private void alertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alertMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_alertMouseClicked

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
            java.util.logging.Logger.getLogger(Client_add_manual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client_add_manual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client_add_manual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client_add_manual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client_add_manual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JTextArea address;
    private javax.swing.JLabel alert;
    private javax.swing.JTextField band;
    private javax.swing.JLabel bg;
    private javax.swing.JTextField cid;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField email;
    private javax.swing.JLabel exit;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField ip;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField mac;
    private javax.swing.JLabel min;
    private javax.swing.JTextField mob;
    private javax.swing.JLabel move;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel reset;
    private javax.swing.JComboBox type;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
Connection con = null;
String NAME="",FNAME="",EMAIL="",MOBILE="",ADDRESS="",IP="",
        MAC="",DOB="",BANDWIDTH="",TYPE="",CID="",PASS,UNAME;
    private void connection() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cms", "root", "");
        } catch (Exception ex) {

        }
    }
 private boolean allValid() {
        NAME=name.getText();
        FNAME=fname.getText();
        EMAIL=email.getText();
        MOBILE=mob.getText();
        ADDRESS=address.getText();
        IP=ip.getText();
        MAC=mac.getText();
        DOB=((JTextField)dob.getDateEditor().getUiComponent()).getText();
        BANDWIDTH=band.getText();
        TYPE=type.getSelectedItem().toString();
        CID=cid.getText();
        UNAME=uname.getText();
        PASS=pass.getText();
        if(CID.equalsIgnoreCase(""))
        {
            alert.setText("* Enter valid Client ID!");
            return false;
        }
        else if(UNAME.equalsIgnoreCase(""))
        {
            alert.setText("* Enter valid UserName!");
            return false;
        }
        else if(NAME.equalsIgnoreCase(""))
        {
            alert.setText("* Enter valid Name!");
            return false;
        }
        else if(FNAME.equalsIgnoreCase(""))
        {
            alert.setText("* Email not Father's name! !");
            //JOptionPane.showMessageDialog(null, "Enter valid Father's name!");
            return false;
        }
        else if(ADDRESS.equalsIgnoreCase(""))
        {
            alert.setText("* Email not Address !");
            //JOptionPane.showMessageDialog(null, "Enter valid Address!");
            return false;
        }
        else if(BANDWIDTH.equalsIgnoreCase(""))
        {
            alert.setText("* Email not Bandwidth !");
            //JOptionPane.showMessageDialog(null, "Enter valid Bandwidth!");
            return false;
        }
        else if(PASS.equalsIgnoreCase(""))
        {
            alert.setText("* Password not valid");
            //JOptionPane.showMessageDialog(null, "Enter valid Client ID!");
            return false;
        }
        else if(IP.equalsIgnoreCase(""))
        {
            alert.setText("* Enter valid IP!");
            //JOptionPane.showMessageDialog(null, "Enter valid IP!");
            return false;
        }
        else if(MAC.equalsIgnoreCase(""))
        {
            alert.setText("* Enter valid MAC!");
            //JOptionPane.showMessageDialog(null, "* Enter valid MAC!");
            return false;
        }
        else if(DOB.equalsIgnoreCase(""))
        {
            alert.setText("* Enter valid Date of birth!");
            //JOptionPane.showMessageDialog(null, "Enter valid Date of birth!");
            return false;
        }
        else if(MOBILE.equalsIgnoreCase(""))
        {
            alert.setText("* Mobile not valid!");
            //JOptionPane.showMessageDialog(null, "Enter valid Mobile!");
            return false;
        }
        else if(EMAIL.equalsIgnoreCase(""))
        {
            alert.setText("* Email not valid!");
            //JOptionPane.showMessageDialog(null, "Enter valid Email!");
            return false;
        }
        else{
          //  alert.setText("");
            return true;
        }
    }

    private void nill() {
        uname.setText(null);
        name.setText(null);
        email.setText(null);
        mob.setText(null);
        fname.setText(null);
        pass.setText(null);
        address.setText(null);
        ip.setText(null);
        mac.setText(null);
        type.setSelectedIndex(0);
        band.setText(null);
        cid.setText(null);
    }
//end tag
}
