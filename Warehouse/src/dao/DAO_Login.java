/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Main.Menu_Utama;
import config.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Model_Login;
import service.Service_Login;
import view.Form_Login;
/**
 *
 * @author Anugerah
 */
public class DAO_Login implements Service_Login {

    private Connection conn;

    public DAO_Login() {
        conn = Koneksi.getConnection();
    }

    @Override
    public void prosesLogin(Model_Login mod_login) {
        PreparedStatement st = null;
        ResultSet rs = null;
        String Id = null;
        String Nama = null;
        String Level2 = null;
        String sql = "SELECT * FROM pengguna WHERE (id_pengguna='" + mod_login.getId_user() + "' "
                   + "OR username='" + mod_login.getUsername() + "') "
                   + "AND password='" + Encrypt.getmd5java(mod_login.getPass_user()) + "'";

        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();

            if (rs.next()) {
                Id = rs.getString("id_pengguna");
                Nama = rs.getString("nama_pengguna");
                Level2 = rs.getString("level");

                Menu_Utama menu = new Menu_Utama(Id, Nama, Level2);
                menu.setVisible(true);
                menu.revalidate();
                
                Form_Login lg = new Form_Login();
                lg.tutup = true;
            } else {
                JOptionPane.showMessageDialog(null, "Username dan Password salah", "Pesan", JOptionPane.INFORMATION_MESSAGE);
                Form_Login lg = new Form_Login();
                lg.tutup = false;
            }
        }catch(SQLException ex){
            Logger.getLogger(DAO_Login.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}