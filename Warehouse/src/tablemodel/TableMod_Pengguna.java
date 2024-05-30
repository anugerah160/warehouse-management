/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.Model_Pengguna;


/**
 *
 * @author Administrator
 */
public class TableMod_Pengguna extends AbstractTableModel{
    private List<Model_Pengguna> list = new ArrayList<>();

    public void tambahData(Model_Pengguna mod_pengguna) {
        list.add(mod_pengguna);
        fireTableRowsInserted(list.size() - 1, list.size() - 1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
    }

    public void perbaruiData(int row, Model_Pengguna mod_pengguna) {
        list.add(row, mod_pengguna);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null, "Data Berhasil di perbarui");
    }

    public void hapusData(int index) {
        list.remove(index);
        fireTableRowsDeleted(index, index);
        JOptionPane.showMessageDialog(null, "Data Berhasil di hapus");
    }

    public void clear() {
        list.clear();
        fireTableDataChanged();
    }

    public void setData(List<Model_Pengguna> list) {
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }

    public void setData(int index, Model_Pengguna mod_pengguna) {
        list.set(index, mod_pengguna);
        fireTableRowsUpdated(index, index);
    }
    
    public Model_Pengguna get_Data(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount(){
        return list.size();
    }
    
    @Override
    public int getColumnCount(){
        return 6;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        switch (columnIndex){
            case 0: return list.get(rowIndex).getId_pengguna();
            case 1: return list.get(rowIndex).getNama_pengguna();
            case 2: return list.get(rowIndex).getUsername();
            case 3: return list.get(rowIndex).getLevel();

            default: return null;
        }
    }
    
    public String getColumnName(int column){
        switch(column){
            case 0: return "No id";
            case 1: return "Total"; 
            case 2: return "ID Pengguna";
            case 3: return "Level";
            default: return null;
        }
    }
}