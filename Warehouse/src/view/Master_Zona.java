/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import dao.DAO_Zona;
import java.util.List;
import javax.swing.JOptionPane;
import model.Model_Gudang;
import model.Model_Zona;
import service.Service_Zona;
import tablemodel.TableMod_Zona;

/**
 *
 * @author Anugerah
 */
public class Master_Zona extends javax.swing.JPanel {

    private Service_Zona servis = new DAO_Zona();
    private TableMod_Zona tblModel = new TableMod_Zona();
    
    /**
     * Creates new form Master_Zona
     */
    public Master_Zona() {
        initComponents();
        
        tbl_data.setModel(tblModel);
        
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        tampilData = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_tambah = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_data = new javax.swing.JTable();
        t_cari = new javax.swing.JTextField();
        tambahData = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_tambah1 = new javax.swing.JButton();
        btn_batal1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        t_id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t_namaZona = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t_idGudang = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t_temperatur = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbx_tingkatKeamanan = new javax.swing.JComboBox<>();
        btn_gud = new javax.swing.JButton();
        t_namaGudang = new javax.swing.JTextField();

        setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("List Data Zona");

        btn_tambah.setBackground(new java.awt.Color(103, 178, 113));
        btn_tambah.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_tambah.setForeground(new java.awt.Color(255, 255, 255));
        btn_tambah.setText("TAMBAH");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_hapus.setBackground(new java.awt.Color(255, 51, 51));
        btn_hapus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_hapus.setForeground(new java.awt.Color(255, 255, 255));
        btn_hapus.setText("HAPUS");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_batal.setBackground(new java.awt.Color(255, 153, 0));
        btn_batal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_batal.setForeground(new java.awt.Color(255, 255, 255));
        btn_batal.setText("BATAL");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        tbl_data.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_dataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_data);

        t_cari.setForeground(new java.awt.Color(204, 204, 204));
        t_cari.setText("Cari...");
        t_cari.setMaximumSize(new java.awt.Dimension(100, 2147483647));
        t_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_cariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tampilDataLayout = new javax.swing.GroupLayout(tampilData);
        tampilData.setLayout(tampilDataLayout);
        tampilDataLayout.setHorizontalGroup(
            tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                    .addGroup(tampilDataLayout.createSequentialGroup()
                        .addComponent(btn_tambah)
                        .addGap(24, 24, 24)
                        .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(t_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tampilDataLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tampilDataLayout.setVerticalGroup(
            tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tambah)
                    .addComponent(btn_hapus)
                    .addComponent(btn_batal)
                    .addComponent(t_cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        mainPanel.add(tampilData, "card2");

        tambahData.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Tambah Lokasi Zona");

        btn_tambah1.setBackground(new java.awt.Color(103, 178, 113));
        btn_tambah1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_tambah1.setForeground(new java.awt.Color(255, 255, 255));
        btn_tambah1.setText("TAMBAH");
        btn_tambah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambah1ActionPerformed(evt);
            }
        });

        btn_batal1.setBackground(new java.awt.Color(255, 204, 51));
        btn_batal1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_batal1.setForeground(new java.awt.Color(255, 255, 255));
        btn_batal1.setText("BATAL");
        btn_batal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batal1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("ID Zona");

        t_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_idActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nama Zona");

        t_namaZona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_namaZonaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Nama Gudang");

        t_idGudang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_idGudangActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("ID Gudang");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Temperatur");

        t_temperatur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_temperaturActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Tingkat Keamanan");

        cbx_tingkatKeamanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "* Pilih Tingkat Keamanan *", "Rendah", "Sedang", "Tinggi" }));
        cbx_tingkatKeamanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_tingkatKeamananActionPerformed(evt);
            }
        });

        btn_gud.setText("Pilih");
        btn_gud.setPreferredSize(new java.awt.Dimension(75, 22));
        btn_gud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gudActionPerformed(evt);
            }
        });

        t_namaGudang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_namaGudangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_namaGudang)
                    .addComponent(t_id)
                    .addComponent(t_temperatur)
                    .addComponent(cbx_tingkatKeamanan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t_namaZona)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(t_idGudang, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_gud, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_namaZona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_idGudang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_gud, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_namaGudang, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_temperatur, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx_tingkatKeamanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );

        javax.swing.GroupLayout tambahDataLayout = new javax.swing.GroupLayout(tambahData);
        tambahData.setLayout(tambahDataLayout);
        tambahDataLayout.setHorizontalGroup(
            tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tambahDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(tambahDataLayout.createSequentialGroup()
                        .addComponent(btn_tambah1)
                        .addGap(18, 18, 18)
                        .addComponent(btn_batal1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tambahDataLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        tambahDataLayout.setVerticalGroup(
            tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tambahDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tambah1)
                    .addComponent(btn_batal1))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainPanel.add(tambahData, "card3");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(tambahData);
        mainPanel.repaint();
        mainPanel.revalidate();
        
        btn_tambah1.setText("SIMPAN");
        t_id.setText(servis.nomor());
        
        if(btn_tambah.getText().equals("UBAH")){
            dataTabel();
        }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        hapusData();
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        // TODO add your handling code here:
        tampilPanel();
        loadData();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_tambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambah1ActionPerformed
        // TODO add your handling code here:
        if(btn_tambah1.getText().equals("TAMBAH")){
            btn_tambah1.setText("SIMPAN");
            t_id.setText(servis.nomor());
        }else if(btn_tambah1.getText().equals("SIMPAN")){
            simpanData();
        }else if(btn_tambah1.getText().equals("PERBARUI")){
            perbaruiData();
        }
    }//GEN-LAST:event_btn_tambah1ActionPerformed

    private void btn_batal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batal1ActionPerformed
        // TODO add your handling code here:
//        mainPanel.removeAll();
//        mainPanel.add(tampilData);
//        mainPanel.repaint();
//        mainPanel.revalidate();
        tampilPanel();
        loadData();
        resetForm();
    }//GEN-LAST:event_btn_batal1ActionPerformed

    private void t_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_idActionPerformed

    private void t_namaZonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_namaZonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_namaZonaActionPerformed

    private void t_idGudangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_idGudangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_idGudangActionPerformed

    private void t_temperaturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_temperaturActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_temperaturActionPerformed

    private void cbx_tingkatKeamananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_tingkatKeamananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_tingkatKeamananActionPerformed

    private void t_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_cariActionPerformed

    private void tbl_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dataMouseClicked
        // TODO add your handling code here:
        if(btn_tambah.getText().equals("TAMBAH")){
            btn_tambah.setText("UBAH");
        }
        btn_hapus.setVisible(true);
        btn_batal.setVisible(true);
    }//GEN-LAST:event_tbl_dataMouseClicked

        boolean closeable = true;
    private void btn_gudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gudActionPerformed
        Data_Gudang dg = new Data_Gudang(null, closeable);
        dg.setVisible(true);
        
        t_idGudang.setText(dg.jb.getId_gdg());
        t_namaGudang.setText(dg.jb.getNama_gudang());
        
        t_temperatur.requestFocus();
        aktif();
    }//GEN-LAST:event_btn_gudActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void t_namaGudangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_namaGudangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_namaGudangActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_batal1;
    private javax.swing.JButton btn_gud;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton btn_tambah1;
    private javax.swing.JComboBox<String> cbx_tingkatKeamanan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField t_cari;
    private javax.swing.JTextField t_id;
    private javax.swing.JTextField t_idGudang;
    private javax.swing.JTextField t_namaGudang;
    private javax.swing.JTextField t_namaZona;
    private javax.swing.JTextField t_temperatur;
    private javax.swing.JPanel tambahData;
    private javax.swing.JPanel tampilData;
    private javax.swing.JTable tbl_data;
    // End of variables declaration//GEN-END:variables

    
    private void dataTabel() {
        tampilData.setVisible(false);
        tambahData.setVisible(true);

        int row = tbl_data.getSelectedRow();
        jLabel2.setText("Perbarui Data Zona");
        
        t_idGudang.setEnabled(false);
        t_namaGudang.setEnabled(false);
        t_namaZona.setEnabled(true);

        t_id.setText(tbl_data.getModel().getValueAt(row, 1).toString());
        t_namaZona.setText(tbl_data.getModel().getValueAt(row, 2).toString());
        t_idGudang.setText(tbl_data.getModel().getValueAt(row, 3).toString());
        t_namaGudang.setText(tbl_data.getModel().getValueAt(row, 4).toString());
        t_temperatur.setText(tbl_data.getModel().getValueAt(row, 5).toString());
        cbx_tingkatKeamanan.setSelectedItem(tbl_data.getModel().getValueAt(row, 6).toString());

//        aktif();
        btn_tambah1.setText("PERBARUI");
        btn_batal.setVisible(true);
    }

    
    private void aktif(){
        t_idGudang.setEnabled(false);
        t_namaGudang.setEnabled(false);
        t_id.setEnabled(false);
        t_namaZona.setEnabled(true);
    }
    private void loadData(){
        t_id.setEnabled(false);
        t_idGudang.setEnabled(false);
        t_namaGudang.setEnabled(false);
        btn_hapus.setVisible(false);
        btn_batal.setVisible(false);
        List<Model_Zona> list = servis.ambilData();
        tblModel.setData(list);
    }
    
    private void hapusData(){
        int index = tbl_data.getSelectedRow();
        if (index!=-1){
            Model_Zona model = tblModel.getData(tbl_data.convertRowIndexToModel(index));
            if(JOptionPane.showConfirmDialog(null,"Data akan Dihapus?","Konfirmasi",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
                servis.hapusData(model);
                tblModel.hapusData(index);
                loadData();
                resetForm();
            }
        }else{
            JOptionPane.showMessageDialog(null,"Pilih Record yang akan diupdate");
        }
    }
    
    private void resetForm() {
    btn_tambah.requestFocus();
    btn_tambah.setText("TAMBAH");
    t_id.setText("");
    t_namaZona.setText("");
}

private void tampilPanel() {
    mainPanel.removeAll();
    mainPanel.add(new Master_Zona());
    mainPanel.repaint();
    mainPanel.revalidate();
}

private void simpanData() {
    if (validasiInput() == true) {
        String ID = t_id.getText();
        String Nama_zona= t_namaZona.getText();
        String ID_gudang = t_idGudang.getText();
        String Nama_gudang = t_namaGudang.getText();
        String Temperatur = t_temperatur.getText();
        String Tingkat_keamanan = cbx_tingkatKeamanan.getSelectedItem().toString();

        Model_Zona model = new Model_Zona();
        Model_Gudang jbr = new Model_Gudang();
        
        model.setId(ID);
        model.setNama_zona(Nama_zona);
        jbr.setId_gdg(ID_gudang);
        jbr.setNama_gudang(Nama_gudang);
        model.setTemperatur(Temperatur);
        model.setTingkat_keamanan(Tingkat_keamanan);

        model.setId_gudang(jbr);
        
        servis.tambahData(model);
        tblModel.tambahData(model);
        tampilPanel();
        loadData();
        resetForm();
        btn_tambah.setText("TAMBAH");
    }
}
    private void perbaruiData() {
        int index = tbl_data.getSelectedRow();
        if (index!=-1) {
            Model_Zona mod_pen = tblModel.getData(tbl_data.convertRowIndexToModel(index));
            if (validasiInput() == true) {
            String ID = t_id.getText();
            String Nama_zona= t_namaZona.getText();
            String ID_gudang = t_idGudang.getText();
            String Nama_gudang = t_namaGudang.getText();
            String Temperatur = t_temperatur.getText();
            String Tingkat_keamanan = cbx_tingkatKeamanan.getSelectedItem().toString();

            Model_Zona model = new Model_Zona();
            Model_Gudang jbr = new Model_Gudang();
            
            model.setId(ID);
            model.setNama_zona(Nama_zona);
            jbr.setId_gdg(ID_gudang);
            jbr.setNama_gudang(Nama_gudang);
            model.setTemperatur(Temperatur);
            model.setTingkat_keamanan(Tingkat_keamanan);

            model.setId_gudang(jbr);
            
            servis.perbaruiData(model);
            tblModel.perbaruiData(index, model);
            tampilPanel();
            loadData();
            resetForm();
            btn_tambah.setText("TAMBAH");
            }
        }
    }
    private boolean validasiInput(){
        boolean valid = false;
        if (t_id.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ID tidak boleh kosong");
        } else if (t_namaZona.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nama Zona tidak boleh kosong");
        } else if (t_idGudang.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ID gudang tidak boleh kosong");
        } else if (t_namaGudang.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "nama Gudang tidak boleh kosong");
        } else if (t_temperatur.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Temperatur tidak boleh kosong");
        } else if (cbx_tingkatKeamanan.getSelectedItem().equals("* Pilih Tingkat Keamanan *")) {
            JOptionPane.showMessageDialog(null, "Tingkat Keamanan harus dipilih");
        } else {
            valid = true;
        }
        return valid;
    }
    
    private void pencarian(){
        List<Model_Zona> list = servis.Pencarian(t_cari.getText());
    }
}
