/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author My PC #16
 */
public class inputsiswa extends javax.swing.JFrame {
    public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabModel;
    Connection cn = koneksiDB.koneksi.getKoneksi();
    /**
     * Creates new form inputsiswa
     */
    public inputsiswa() {
        initComponents();
        judul();
        reset();
        tampilData();
    }
    
    public void tampilData()    {
        try{
            st = cn.createStatement();
            tabModel.getDataVector().removeAllElements();
            tabModel.fireTableDataChanged();
            rs = st.executeQuery("select * from tb_siswa");
            while (rs.next()){
                Object[] data = {
                    rs.getString("nis"),
                    rs.getString("nama"),
                    rs.getString("gender"),
                    rs.getString("kelas"),
                };
                tabModel.addRow(data);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void judul(){
        Object[] judul = {"NIS","Nama","Gender"," Kelas"};
        tabModel = new DefaultTableModel(null, judul);
        tb_tabungan.setModel(tabModel);
    }
    
    public void reset(){
        jnis.setText("");
        jnama.setText("");
        gender.clearSelection();
        ckelas.setSelectedItem("");
        bedit.setEnabled(false);
        bhapus.setEnabled(false);
        bsimpan.setEnabled(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        gender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcari = new javax.swing.JTextField();
        jnama = new javax.swing.JTextField();
        ckelas = new javax.swing.JComboBox<>();
        perempuan = new javax.swing.JRadioButton();
        laki = new javax.swing.JRadioButton();
        bsimpan = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_tabungan = new javax.swing.JTable();
        jnis = new javax.swing.JTextField();
        bedit = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(0, 102, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(440, 370));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Add_User_Group_Man_Man_48px.png"))); // NOI18N
        jLabel1.setText("INPUT DATA SISWA SDN 02 Sentul");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(366, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 70));

        jcari.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jcariKeyReleased(evt);
            }
        });
        jPanel1.add(jcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 330, -1));

        jnama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 180, -1));

        ckelas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ckelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "KELAS 1", "KELAS 2", "KELAS 3", "KELAS 4", "KELAS 5", "KELAS 6" }));
        ckelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckelasActionPerformed(evt);
            }
        });
        jPanel1.add(ckelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 180, -1));

        perempuan.setBackground(new java.awt.Color(204, 204, 255));
        gender.add(perempuan);
        perempuan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        perempuan.setText("Perempuan");
        perempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perempuanActionPerformed(evt);
            }
        });
        jPanel1.add(perempuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        laki.setBackground(new java.awt.Color(204, 204, 255));
        gender.add(laki);
        laki.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        laki.setText("Laki-Laki");
        jPanel1.add(laki, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        bsimpan.setBackground(new java.awt.Color(153, 255, 102));
        bsimpan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Save_24px.png"))); // NOI18N
        bsimpan.setText("Simpan");
        bsimpan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });
        jPanel1.add(bsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 110, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Kelas");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Jenis Kelamin");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nama");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("NIS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        tb_tabungan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_tabungan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_tabunganMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_tabungan);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 400, 280));

        jnis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jnis, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 180, -1));

        bedit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Pencil_24px_1.png"))); // NOI18N
        bedit.setText("Edit");
        bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditActionPerformed(evt);
            }
        });
        jPanel1.add(bedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 110, 30));

        bhapus.setBackground(new java.awt.Color(255, 102, 102));
        bhapus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Delete_24px_1.png"))); // NOI18N
        bhapus.setText("Hapus");
        bhapus.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });
        jPanel1.add(bhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 110, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Go_Back_24px.png"))); // NOI18N
        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 110, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Cari Data");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 60, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
        if(jnis.getText().equals("") || jnama.getText().equals("") || gender.getSelection().equals("") || ckelas.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null, "Data Belum Lengkap!");
        }else{
        try{
            String gender;
            if(laki.isSelected()){
                gender = "P";
            }else{
                gender = "W";
            }
            st = cn.createStatement();
            st.executeUpdate("insert into tb_siswa set nis='" + jnis.getText() +"', nama='" + jnama.getText() +"', gender='" +gender+ "', kelas='" + ckelas.getSelectedItem() + "', ket='belum'");
            tampilData();
            reset();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan!");
        }catch(Exception e){
            e.printStackTrace();
            }
        }
    }//GEN-LAST:event_bsimpanActionPerformed

    private void tb_tabunganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_tabunganMouseClicked
        bsimpan.setEnabled(false);
        bedit.setEnabled(true);
        bhapus.setEnabled(true);
        jnis.setText(tabModel.getValueAt(tb_tabungan.getSelectedRow(), 0) + "");
        jnama.setText(tabModel.getValueAt(tb_tabungan.getSelectedRow(), 1) + "");
        String a = (tabModel.getValueAt(tb_tabungan.getSelectedRow(), 2) + "");
        if(a.equals("P")){
            laki.setSelected(true);
        }else{
            perempuan.setSelected(true);
        }
        ckelas.setSelectedItem(tabModel.getValueAt(tb_tabungan.getSelectedRow(), 3) + "");
    }//GEN-LAST:event_tb_tabunganMouseClicked

    private void beditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditActionPerformed
        try{
            bsimpan.setEnabled(true);
            String gender;
            if(laki.isSelected()){
                gender = "P";
            }else{
                gender = "W";
            }
            st = cn.createStatement();
            st.executeUpdate("update tb_siswa set nama='" + jnama.getText() +"', gender='" + gender+ "', kelas='" + ckelas.getSelectedItem() + "' where nis='"+ jnis.getText() +"'");
            tampilData();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah!");
            reset();
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_beditActionPerformed

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
        try{
            int jawab;
            if((jawab = JOptionPane.showConfirmDialog(null, "Apakah Benar Ingin Menghapus Data?", "konfirmasi", JOptionPane.YES_NO_OPTION)) == 0 ){
                st = cn.createStatement();
                st.executeUpdate("delete from tb_siswa where nis='" + jnis.getText() + "'");
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus!");
                tampilData();
                reset();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_bhapusActionPerformed

    private void jcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcariKeyReleased
        try{
            st = cn.createStatement();
            tabModel.getDataVector().removeAllElements();
            tabModel.fireTableDataChanged();
            rs = st.executeQuery("select * from tb_siswa where nis like '%" + jcari.getText() + "%' or nama like '%" + jcari.getText() + "%' or gender like '%" + jcari.getText() + "%' or kelas like '%" + jcari.getText() + "%'");
            while(rs.next()){
                Object[] data = {
                    rs.getString("nis"),
                    rs.getString("nama"),
                    rs.getString("gender"),
                    rs.getString("kelas")
                };
                tabModel.addRow(data);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jcariKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ckelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckelasActionPerformed

    private void perempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perempuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perempuanActionPerformed

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
            java.util.logging.Logger.getLogger(inputsiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inputsiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inputsiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inputsiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inputsiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bedit;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bsimpan;
    private javax.swing.JComboBox<String> ckelas;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jcari;
    private javax.swing.JTextField jnama;
    private javax.swing.JTextField jnis;
    private javax.swing.JRadioButton laki;
    private javax.swing.JRadioButton perempuan;
    private javax.swing.JTable tb_tabungan;
    // End of variables declaration//GEN-END:variables
}
