/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banteng;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author Thomas Wiga
 */
public class MainFrame extends javax.swing.JFrame {
private Connection conn=DbHelper.getConnection();
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
//        try {
//            getClass().getClassLoader().loadClass("Banteng.DbHelper");
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ctxTblWilayah = new javax.swing.JPopupMenu();
        mnuTblWilTambah = new javax.swing.JMenuItem();
        mnuTblWilUbah = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Home = new javax.swing.JPanel();
        Daftar_wilayah = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        text_Nama_wilayah = new javax.swing.JTextField();
        text_PJ_wilayah = new javax.swing.JTextField();
        text_Lokasi_wilayah = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_Wilayah = new javax.swing.JTable();
        text_kode_wilayah = new javax.swing.JTextField();
        button_tambahEdit = new javax.swing.JButton();
        Daftar_lingkungan = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        text_IDLingkungan = new javax.swing.JTextField();
        text_NamaLingkungan = new javax.swing.JTextField();
        text_PJLingkungan = new javax.swing.JTextField();
        button_simpanEdit = new javax.swing.JButton();
        button_hapus = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        text_noHP = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_Lingkungan = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        mnuTblWilTambah.setText("Tambah");
        mnuTblWilTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTblWilTambahActionPerformed(evt);
            }
        });
        ctxTblWilayah.add(mnuTblWilTambah);

        mnuTblWilUbah.setText("Ubah");
        ctxTblWilayah.add(mnuTblWilUbah);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Penjadwalan Koor Paroki Keluarga Kudus Banteng");
        setBackground(new java.awt.Color(0, 0, 0));

        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Ubuntu", 3, 11)); // NOI18N

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 519, Short.MAX_VALUE)
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Home", Home);

        jLabel5.setFont(new java.awt.Font("Ubuntu Light", 0, 11)); // NOI18N
        jLabel5.setText("Nama Wilayah");

        jLabel6.setFont(new java.awt.Font("Ubuntu Light", 0, 11)); // NOI18N
        jLabel6.setText("Lokasi Wilayah");

        jLabel7.setFont(new java.awt.Font("Ubuntu Light", 0, 11)); // NOI18N
        jLabel7.setText("Penanggung Jawab");

        text_Nama_wilayah.setFont(new java.awt.Font("Ubuntu Light", 0, 11)); // NOI18N

        text_PJ_wilayah.setFont(new java.awt.Font("Ubuntu Light", 0, 11)); // NOI18N
        text_PJ_wilayah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_PJ_wilayahActionPerformed(evt);
            }
        });

        text_Lokasi_wilayah.setFont(new java.awt.Font("Ubuntu Light", 0, 11)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Daftar Wilayah", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 3, 11))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Ubuntu", 3, 11)); // NOI18N

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tabel_Wilayah.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Wilayah", "Nama Wilayah", "Lokasi Wilayah", "Penanggung Jawab"
            }
        ));
        tabel_Wilayah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabel_WilayahMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabel_WilayahMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_Wilayah);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addContainerGap())
        );

        text_kode_wilayah.setFont(new java.awt.Font("Ubuntu Light", 0, 11)); // NOI18N

        button_tambahEdit.setFont(new java.awt.Font("Ubuntu Light", 0, 11)); // NOI18N
        button_tambahEdit.setText("Tambah");

        javax.swing.GroupLayout Daftar_wilayahLayout = new javax.swing.GroupLayout(Daftar_wilayah);
        Daftar_wilayah.setLayout(Daftar_wilayahLayout);
        Daftar_wilayahLayout.setHorizontalGroup(
            Daftar_wilayahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Daftar_wilayahLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(54, 54, 54)
                .addComponent(text_Nama_wilayah, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(text_kode_wilayah, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(Daftar_wilayahLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGap(50, 50, 50)
                .addComponent(text_Lokasi_wilayah, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(Daftar_wilayahLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addGap(26, 26, 26)
                .addComponent(text_PJ_wilayah, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_tambahEdit))
            .addGroup(Daftar_wilayahLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Daftar_wilayahLayout.setVerticalGroup(
            Daftar_wilayahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Daftar_wilayahLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(Daftar_wilayahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(Daftar_wilayahLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(Daftar_wilayahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_Nama_wilayah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_kode_wilayah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(Daftar_wilayahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(text_Lokasi_wilayah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(Daftar_wilayahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Daftar_wilayahLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(text_PJ_wilayah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_tambahEdit))
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Daftar Wilayah", Daftar_wilayah);

        Daftar_lingkungan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setFont(new java.awt.Font("Ubuntu Light", 0, 11)); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu Light", 0, 11)); // NOI18N
        jLabel1.setText("ID Lingkungan");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 20));

        jLabel2.setFont(new java.awt.Font("Ubuntu Light", 0, 11)); // NOI18N
        jLabel2.setText("Nama Lingkungan");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 10));

        jLabel3.setFont(new java.awt.Font("Ubuntu Light", 0, 11)); // NOI18N
        jLabel3.setText("Penanggung Jawab");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 10));
        jPanel3.add(text_IDLingkungan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 99, 20));
        jPanel3.add(text_NamaLingkungan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 231, 20));
        jPanel3.add(text_PJLingkungan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 231, 20));

        button_simpanEdit.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        button_simpanEdit.setText("Simpan");
        jPanel3.add(button_simpanEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, 20));

        button_hapus.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        button_hapus.setText("Hapus");
        jPanel3.add(button_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, 20));

        jLabel4.setFont(new java.awt.Font("Ubuntu Light", 0, 11)); // NOI18N
        jLabel4.setText("No. Telpon/HP");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 10));
        jPanel3.add(text_noHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 231, 20));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Daftar Lingkungan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 3, 11))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Ubuntu", 3, 11)); // NOI18N

        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N

        tabel_Lingkungan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Lingkungan", "Nama Lingkungan", "Penanggung Jawab", "Nomer Telpon/HP"
            }
        ));
        jScrollPane2.setViewportView(tabel_Lingkungan);
        if (tabel_Lingkungan.getColumnModel().getColumnCount() > 0) {
            tabel_Lingkungan.getColumnModel().getColumn(3).setHeaderValue("Nomer Telpon/HP");
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 170));

        Daftar_lingkungan.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 519, 355));

        jTabbedPane1.addTab("Daftar Lingkungan", Daftar_lingkungan);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 519, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab4", jPanel4);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_PJ_wilayahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_PJ_wilayahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_PJ_wilayahActionPerformed

    private void mnuTblWilTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTblWilTambahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuTblWilTambahActionPerformed

    private void tabel_WilayahMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_WilayahMouseReleased
        // TODO add your handling code here:
        if (evt.isPopupTrigger()) {
            ctxTblWilayah.show(tabel_Wilayah, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tabel_WilayahMouseReleased

    private void tabel_WilayahMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_WilayahMousePressed
        // TODO add your handling code here:
        if (evt.isPopupTrigger()) {
            ctxTblWilayah.show(tabel_Wilayah, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tabel_WilayahMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
//        UIManager.setLookAndFeel("com.jtattoo.plaf.alumunium.AlumuniumLookAndFeel");
            UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
//        UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
            SwingUtilities.updateComponentTreeUI(new MainFrame());
        } catch (Exception e) {

        }
        new MainFrame().setVisible(true);

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//        if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainFrame().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Daftar_lingkungan;
    private javax.swing.JPanel Daftar_wilayah;
    private javax.swing.JPanel Home;
    private javax.swing.JButton button_hapus;
    private javax.swing.JButton button_simpanEdit;
    private javax.swing.JButton button_tambahEdit;
    private javax.swing.JPopupMenu ctxTblWilayah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField kode_wilayah;
    private javax.swing.JMenuItem mnuTblWilTambah;
    private javax.swing.JMenuItem mnuTblWilUbah;
    private javax.swing.JTable tabel_Lingkungan;
    private javax.swing.JTable tabel_Wilayah;
    private javax.swing.JTextField text_IDLingkungan;
    private javax.swing.JTextField text_Lokasi_wilayah;
    private javax.swing.JTextField text_NamaLingkungan;
    private javax.swing.JTextField text_Nama_wilayah;
    private javax.swing.JTextField text_PJLingkungan;
    private javax.swing.JTextField text_PJ_wilayah;
    private javax.swing.JTextField text_kode_wilayah;
    private javax.swing.JTextField text_noHP;
    // End of variables declaration//GEN-END:variables
}
