/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.Model_BarangMasuk;

/**
 *
 * @author hellc
 */
public interface Service_BarangMasuk {
    void tambahData(Model_BarangMasuk mod_masuk);
    void perbaruiStatus (String kode_barang);
    
    Model_BarangMasuk getByid (String id);
    List<Model_BarangMasuk> ambilData();
    List<Model_BarangMasuk> pencarian(String id);
    String nomor();
    
}
