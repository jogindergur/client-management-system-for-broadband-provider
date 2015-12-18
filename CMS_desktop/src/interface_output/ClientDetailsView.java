package interface_output;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class ClientDetailsView extends javax.swing.JDialog {

    /**
     * A return status code - returned if Cancel button has been pressed
     */
    public static final int RET_CANCEL = 0;
    /**
     * A return status code - returned if OK button has been pressed
     */
    public static final int RET_OK = 1;

    /**
     * Creates new form DetailsBills
     */
    DefaultTableModel model = new DefaultTableModel();
    public ClientDetailsView(java.awt.Frame parent, boolean modal,String CID,
            String NAME,String EMAIL,String MOBILE,String IP,String MAC,
            String FNAME,String ADDRESS,String BAND,String TYPE,
            String DOB,String Status,String IMG) {
        super(parent, modal);
        initComponents();   
        ImageIcon img=new ImageIcon("img\\cms.png");
        this.setIconImage(img.getImage());
            Cid.setText("Client ID : :"+CID);
            name.setText("Name :"+NAME);
            fname.setText("Father's name : "+FNAME);
            add.setText(ADDRESS);
            band.setText("Bandwidth : "+BAND);
            ip.setText("IP : "+IP);
            mac.setText("MAC : "+MAC);
            email.setText("Email : "+EMAIL);
            dob.setText("Birth Date : "+DOB);
            mobile.setText("Mobile : "+MOBILE);
            status.setText("Status : "+Status);
            type.setText("Bandwidth type : "+TYPE);
            pic.setIcon(new javax.swing.ImageIcon(IMG));
    }

    /**
     * @return the return status of this dialog - one of RET_OK or RET_CANCEL
     */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                jPanel1 = new javax.swing.JPanel();
                pic = new javax.swing.JLabel();
                name = new javax.swing.JLabel();
                Cid = new javax.swing.JLabel();
                fname = new javax.swing.JLabel();
                mobile = new javax.swing.JLabel();
                sol = new javax.swing.JLabel();
                jScrollPane2 = new javax.swing.JScrollPane();
                add = new javax.swing.JTextPane();
                ip = new javax.swing.JLabel();
                mac = new javax.swing.JLabel();
                email = new javax.swing.JLabel();
                dob = new javax.swing.JLabel();
                status = new javax.swing.JLabel();
                type = new javax.swing.JLabel();
                band = new javax.swing.JLabel();
                jLabel1 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();

                setUndecorated(true);
                addWindowListener(new java.awt.event.WindowAdapter() {
                        public void windowClosing(java.awt.event.WindowEvent evt) {
                                closeDialog(evt);
                        }
                });
                getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jButton1.setText("Print");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });
                getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 50));

                jButton2.setText("Close");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });
                getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 240, 50));

                jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Client  Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 153, 0))); // NOI18N
                jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
                jPanel1.add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 10, 140, 130));

                name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                name.setText("name");
                jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 320, 30));

                Cid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                Cid.setText("cid");
                jPanel1.add(Cid, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 320, 30));

                fname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                fname.setText("fname");
                jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 320, 30));

                mobile.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                mobile.setText("Mobile");
                jPanel1.add(mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 490, 30));

                sol.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                sol.setText("Address :");
                jPanel1.add(sol, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 130, 20));

                add.setEditable(false);
                add.setBackground(new java.awt.Color(204, 204, 204));
                add.setOpaque(false);
                jScrollPane2.setViewportView(add);

                jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 490, 90));

                ip.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                ip.setText("ip");
                jPanel1.add(ip, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 490, 30));

                mac.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                mac.setText("MAC");
                jPanel1.add(mac, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 490, 30));

                email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                email.setText("Email");
                jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 490, 30));

                dob.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                dob.setText("dob");
                jPanel1.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 230, 30));

                status.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                status.setText("status");
                jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 240, 30));

                type.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                type.setText("type");
                jPanel1.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 240, 30));

                band.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                band.setText("Promlems :");
                jPanel1.add(band, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 230, 30));

                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
                jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 320, 70));

                jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                jLabel3.setText("Powered by nullPointerException.");
                jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 210, 30));

                getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 510, 540));

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog

    }//GEN-LAST:event_closeDialog

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        printJavaComponent();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DetailsBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DetailsBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DetailsBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DetailsBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                DetailsBills dialog = new DetailsBills(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel Cid;
        private javax.swing.JTextPane add;
        private javax.swing.JLabel band;
        private javax.swing.JLabel dob;
        private javax.swing.JLabel email;
        private javax.swing.JLabel fname;
        private javax.swing.JLabel ip;
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JLabel mac;
        private javax.swing.JLabel mobile;
        private javax.swing.JLabel name;
        private javax.swing.JLabel pic;
        private javax.swing.JLabel sol;
        private javax.swing.JLabel status;
        private javax.swing.JLabel type;
        // End of variables declaration//GEN-END:variables

    private int returnStatus = RET_CANCEL;
    public void printJavaComponent() {
    PrinterJob job = PrinterJob.getPrinterJob();
    job.setJobName("Print Problems Details!");
 
    job.setPrintable (new Printable() {    
        public int print(Graphics g, PageFormat pageFormat, int pageIndex) {
            if (pageIndex > 0) {
                return(NO_SUCH_PAGE);
            } else {
                Graphics2D g2d = (Graphics2D)g;
                g2d.translate(pageFormat.getImageableX(), 
                pageFormat.getImageableY());
 
                jPanel1.paint(g2d);
                
                return(PAGE_EXISTS); 
            }
        }
    });
         
    if (job.printDialog()) {
        try {
            job.print();
        } catch (PrinterException e) {
            System.err.println(e.getMessage()); 
        }
    }
}
}
