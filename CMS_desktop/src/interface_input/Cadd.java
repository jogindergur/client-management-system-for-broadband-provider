/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_input;

import all_classes.javamail;
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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Cadd extends javax.swing.JFrame {

    /**
     * Creates new form Cadd
     */
    int mX, mY;
    DefaultTableModel model = new DefaultTableModel();
    public Cadd() {
        initComponents();
        ImageIcon img=new ImageIcon("img\\cms.png");
        this.setIconImage(img.getImage());
        move.setCursor(new Cursor(Cursor.MOVE_CURSOR));
        exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        min.setCursor(new Cursor(Cursor.HAND_CURSOR));
        print.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add.setCursor(new Cursor(Cursor.HAND_CURSOR));
        work2();
        tb_update();
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
        lb_pic = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        print = new javax.swing.JLabel();
        mac = new javax.swing.JTextField();
        cid = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        bod = new javax.swing.JTextField();
        band = new javax.swing.JTextField();
        mob = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        ip = new javax.swing.JTextField();
        type = new javax.swing.JComboBox();
        fname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        pendReq = new javax.swing.JTable();
        search = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
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
        getContentPane().add(lb_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 140, 130));

        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 140, 30));

        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
        });
        getContentPane().add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, 130, 40));

        mac.setBackground(new java.awt.Color(94, 74, 118));
        mac.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mac.setToolTipText("Give a MAC Address");
        mac.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(mac, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 425, 30));

        cid.setBackground(new java.awt.Color(94, 74, 118));
        cid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(cid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 75, 264, 30));

        name.setBackground(new java.awt.Color(94, 74, 118));
        name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        name.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 284, 30));

        bod.setBackground(new java.awt.Color(94, 74, 118));
        bod.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bod.setToolTipText("Ex: 2015-04-13");
        bod.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(bod, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 482, 310, 30));

        band.setBackground(new java.awt.Color(94, 74, 118));
        band.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        band.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(band, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 285, 30));

        mob.setBackground(new java.awt.Color(94, 74, 118));
        mob.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mob.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(mob, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 211, 275, 30));

        email.setBackground(new java.awt.Color(94, 74, 118));
        email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        email.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 257, 405, 30));

        ip.setBackground(new java.awt.Color(94, 74, 118));
        ip.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ip.setToolTipText("Give a IP Address");
        ip.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(ip, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 303, 445, 30));

        type.setBackground(new java.awt.Color(94, 74, 118));
        type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Shared", "Dedicated" }));
        type.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 396, 310, 30));

        fname.setBackground(new java.awt.Color(94, 74, 118));
        fname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fname.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 166, 210, 30));

        jScrollPane1.setBackground(new java.awt.Color(94, 74, 118));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        pendReq.setBackground(new java.awt.Color(94, 74, 118));
        pendReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sl", "Name", "Email", "Mobile"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pendReq.setSelectionBackground(new java.awt.Color(51, 51, 51));
        pendReq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pendReqMouseClicked(evt);
            }
        });
        pendReq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pendReqKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(pendReq);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 80, 350, 270));

        search.setBackground(new java.awt.Color(59, 62, 136));
        search.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        search.setToolTipText("Search by Name");
        search.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 38, 220, 40));

        address.setBackground(new java.awt.Color(94, 74, 118));
        address.setColumns(20);
        address.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        address.setRows(5);
        address.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setViewportView(address);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 390, 343, 130));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Client_Add_1.png"))); // NOI18N
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
        this.setExtendedState(Cadd.ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
     work2();
     search();
    }//GEN-LAST:event_searchKeyReleased

    private void pendReqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendReqMouseClicked
        // TODO add your handling code here:
    onclick();
    }//GEN-LAST:event_pendReqMouseClicked

    private void pendReqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pendReqKeyReleased
    onclick();
    }//GEN-LAST:event_pendReqKeyReleased

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
    if(allValid())
    {
        try {
            //INSERT INTO `clientinfo`(`cid`, `name`, `fname`, `mobile`,
            //`email`, `bdate`, `address`, `type`, `bandwidth`, `picture`, `status`)
                connection();
                String sql="insert into clientinfo(cid,name,fname,mobile,"
                        + "email,bdate,address,type,bandwidth,ip,mac,picture)"
                        + " values(?,?,?,?,?,?,?,?,?,?,?,?)";
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
                preparedStatement.setString(12, P_LOC);
                preparedStatement.executeUpdate();
                String sql2="insert into login(cid,uname,email,pass)"
                        + " values(?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql2);
                pst.setString(1, CID);
                pst.setString(2, UNAME);
                pst.setString(3, EMAIL);
                pst.setString(4, PASS);
                pst.executeUpdate();
                String sql3 = "Update pendingreq set status='Active' where sl='" +SL+ "'";
                Statement st = null;
                st = con.createStatement();
                st.executeUpdate(sql3);
                //mail send
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
                JOptionPane.showMessageDialog(null, "Press ok andPlease wait a moments.The confermation\n message is sending...");
                if(javamail.Sendmail(EMAIL,"Confermation message by FutureNet",body)){
                   JOptionPane.showMessageDialog(null, "Messsage successfully send.");
                }
                else{
                   JOptionPane.showMessageDialog(null, "Some technical problems to send email!");
                }
                JOptionPane.showMessageDialog(null, "Registerd Successfully!!!!");
                nill();
                work2();
                tb_update();
            } catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);
            }
    }
    }//GEN-LAST:event_addMouseClicked

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
    MessageFormat head=new MessageFormat(
            "**** LIST of Online Request for new line ****"
    );
     MessageFormat foot=new MessageFormat("Page{0, number,integer}");
     try{
         pendReq.print(JTable.PrintMode.NORMAL, head, foot);
     }catch(java.awt.print.PrinterException e)
     {
         JOptionPane.showMessageDialog(null, "Errors:"+e);
     }
    }//GEN-LAST:event_printMouseClicked

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
            java.util.logging.Logger.getLogger(Cadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JTextArea address;
    private javax.swing.JTextField band;
    private javax.swing.JLabel bg;
    private javax.swing.JTextField bod;
    private javax.swing.JTextField cid;
    private javax.swing.JTextField email;
    private javax.swing.JLabel exit;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField ip;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_pic;
    private javax.swing.JTextField mac;
    private javax.swing.JLabel min;
    private javax.swing.JTextField mob;
    private javax.swing.JLabel move;
    private javax.swing.JTextField name;
    private javax.swing.JTable pendReq;
    private javax.swing.JLabel print;
    private javax.swing.JTextField search;
    private javax.swing.JComboBox type;
    // End of variables declaration//GEN-END:variables
Connection con = null;
String NAME="",FNAME="",EMAIL="",MOBILE="",ADDRESS="",IP="",
        MAC="",DOB="",BANDWIDTH="",TYPE="",P_LOC="",CID="",SL="",UNAME="",PASS="FutureNet";
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
        DOB=bod.getText();
        BANDWIDTH=band.getText();
        TYPE=type.getSelectedItem().toString();
        CID=cid.getText();

        if(NAME.equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Enter valid Name!");
            return false;
        }
        else if(FNAME.equalsIgnoreCase(""))
        {
            //alert.setText("* Email not Bandwidth !");
            JOptionPane.showMessageDialog(null, "Enter valid Father's name!");
            return false;
        }
        else if(ADDRESS.equalsIgnoreCase(""))
        {
            //alert.setText("* Email not Bandwidth !");
            JOptionPane.showMessageDialog(null, "Enter valid Address!");
            return false;
        }
        else if(BANDWIDTH.equalsIgnoreCase(""))
        {
            //alert.setText("* Email not Bandwidth !");
            JOptionPane.showMessageDialog(null, "Enter valid Bandwidth!");
            return false;
        }
        else if(CID.equalsIgnoreCase(""))
        {
            //alert.setText("* Password not valid");
            JOptionPane.showMessageDialog(null, "Enter valid Client ID!");
            return false;
        }
        else if(IP.equalsIgnoreCase(""))
        {
            //alert.setText("* Mobile not valid!");
            JOptionPane.showMessageDialog(null, "Enter valid IP!");
            return false;
        }
        else if(MAC.equalsIgnoreCase(""))
        {
            //alert.setText("* Mobile not valid!");
            JOptionPane.showMessageDialog(null, "Enter valid MAC!");
            return false;
        }
        else if(DOB.equalsIgnoreCase(""))
        {
            //alert.setText("* Mobile not valid!");
            JOptionPane.showMessageDialog(null, "Enter valid Date of birth!");
            return false;
        }
        else if(MOBILE.equalsIgnoreCase(""))
        {
            //alert.setText("* Mobile not valid!");
            JOptionPane.showMessageDialog(null, "Enter valid Mobile!");
            return false;
        }
        else if(EMAIL.equalsIgnoreCase(""))
        {
            //alert.setText("* Mobile not valid!");
            JOptionPane.showMessageDialog(null, "Enter valid Email!");
            return false;
        }
        else{
          //  alert.setText("");
            return true;
        }
    }
    private void tb_update() {

        try {
            connection();
            model = (DefaultTableModel) pendReq.getModel();
            PreparedStatement st = null;
            String sql = "Select * from pendingreq where status='Pending'";
            st = con.prepareStatement(sql);
            ResultSet res = null;
            res = st.executeQuery();
            while (res.next()) {
                String a[] = {res.getString(1), res.getString(2), res.getString(7), res.getString(6)};
                model.insertRow(model.getRowCount(), a);
            }
        } catch (SQLException e) {
            System.out.print(e);
        }
    }

    private void search() {
        if (search.getText().trim().length() != 0) {
            try {
                connection();
                model = (DefaultTableModel) pendReq.getModel();
                PreparedStatement st = null;
                String sql = "Select * from pendingreq where name LIKE '%" + search.getText() + "%' ";
                st = con.prepareStatement(sql);
                ResultSet res = null;
                res = st.executeQuery();
                while (res.next()) {
                    String a[] = {res.getString(1), res.getString(2), res.getString(7), res.getString(6)};
                    model.insertRow(model.getRowCount(), a);
                }

            } catch (SQLException e) {

            }
        } else if (search.getText().equalsIgnoreCase("")) {
            work2();
            tb_update();
        }
    }

    public void work2() {
        model.setRowCount(0);
    }

    private void nill() {
        name.setText(null);
        email.setText(null);
        mob.setText(null);
        fname.setText(null);
        address.setText(null);
        ip.setText(null);
        mac.setText(null);
        type.setSelectedIndex(0);
        band.setText(null);
        bod.setText(null);
        UNAME=NAME;
        PASS="FutureNet";
    }
private void onclick() {
        try {
            int row=pendReq.getSelectedRow();
            SL=pendReq.getModel().getValueAt(row, 0).toString();
            
            String sql="Select * from pendingreq where sl='"+SL+"'";
            PreparedStatement st=null;
            ResultSet rs=null;
            connection();
            st=con.prepareStatement(sql);
            rs=st.executeQuery();
            if(rs.next())
            {
                //getData form table
                NAME=rs.getString(2);
                UNAME=rs.getString(3);
                PASS=rs.getString(4);
                FNAME=rs.getString(5);
                MOBILE=rs.getString(6);
                EMAIL=rs.getString(7);
                DOB=rs.getDate(8).toString();
                ADDRESS=rs.getString(9);
                TYPE=rs.getString(10);
                BANDWIDTH=rs.getString(11);
                P_LOC=rs.getString(12);
                
                //set data in jframe
                lb_pic.setIcon(new javax.swing.ImageIcon("C:\\xampp\\htdocs\\cms_web\\image_uploads\\"+P_LOC));
                cid.setToolTipText("Suggest Client ID: "+SL);
                name.setText(NAME);
                email.setText(EMAIL);
                mob.setText(MOBILE);
                fname.setText(FNAME);
                address.setText(ADDRESS);
                band.setText(BANDWIDTH);
                bod.setText(DOB);
                if(TYPE.equalsIgnoreCase("Dedicated")){
                    type.setSelectedIndex(1);
                }
                else{
                    type.setSelectedIndex(0);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Cadd.class.getName()).log(Level.SEVERE, null, ex);
        }
               

    }
//end tag
}
