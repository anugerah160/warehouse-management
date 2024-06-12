/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.Font;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import view.Master_Gudang;
import view.Master_Pengguna;
import view.Master_Barang;
import view.Master_Report;
import view.Master_Zona;
import view.Master_Supplier;
import view.Master_JenisBarang;

/**
 *
 * @author Administrator
 */
public class Menu_Utama extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Utama1
     */
    private Timer timer;
    protected MenuItem activeMenuItem;
     
    public Menu_Utama(String Id, String Nama, String Level2) {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        lb_level.setText(Level2);
        lb_nama.setText(Nama);
        setFont();
        execute();
        
        //refresh timer delay 1 detik
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DateTime();
            }
        });
        //mulai timer
        timer.start();
    }
    
    private void setFont(){
        try {
            File fontStyle = new File("src/custom/Poppins-Bold.ttf");
            Font font = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(30f);
            lb_nama.setFont(font);
            lb_level.setFont(font);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public void DateTime(){
        Calendar calendar = Calendar.getInstance();
        Date TanggalSekarang = new Date();
        SimpleDateFormat Hari = new SimpleDateFormat("EEEE", new Locale("in", "ID"));
        SimpleDateFormat Waktu = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String hari = Hari.format(calendar.getTime());
        String tanggal = Waktu.format(TanggalSekarang);
        lb_tanggal.setText(hari+ ", "+tanggal);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_navbar = new javax.swing.JPanel();
        lb_nama = new javax.swing.JLabel();
        lb_level = new javax.swing.JLabel();
        lb_tanggal = new javax.swing.JLabel();
        pn_sidebar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pn_menus = new javax.swing.JPanel();
        pn_content = new javax.swing.JPanel();
        pn_utama = new custom.panelCustom();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pn_navbar.setBackground(new java.awt.Color(9, 24, 51));
        pn_navbar.setPreferredSize(new java.awt.Dimension(772, 70));

        lb_nama.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lb_nama.setForeground(new java.awt.Color(255, 255, 255));
        lb_nama.setText("Nama");

        lb_level.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lb_level.setForeground(new java.awt.Color(254, 255, 110));
        lb_level.setText("Level");

        lb_tanggal.setBackground(new java.awt.Color(255, 255, 255));
        lb_tanggal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_tanggal.setForeground(new java.awt.Color(255, 255, 255));
        lb_tanggal.setText("Tanggal dan Waktu");

        javax.swing.GroupLayout pn_navbarLayout = new javax.swing.GroupLayout(pn_navbar);
        pn_navbar.setLayout(pn_navbarLayout);
        pn_navbarLayout.setHorizontalGroup(
            pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_navbarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lb_level)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_nama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 440, Short.MAX_VALUE)
                .addComponent(lb_tanggal)
                .addGap(19, 19, 19))
        );
        pn_navbarLayout.setVerticalGroup(
            pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_navbarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nama)
                    .addComponent(lb_level)
                    .addComponent(lb_tanggal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pn_navbar, java.awt.BorderLayout.PAGE_START);

        pn_sidebar.setBackground(new java.awt.Color(35, 39, 47));
        pn_sidebar.setPreferredSize(new java.awt.Dimension(250, 374));

        jScrollPane1.setBorder(null);

        pn_menus.setBackground(new java.awt.Color(35, 39, 47));
        pn_menus.setLayout(new javax.swing.BoxLayout(pn_menus, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(pn_menus);

        javax.swing.GroupLayout pn_sidebarLayout = new javax.swing.GroupLayout(pn_sidebar);
        pn_sidebar.setLayout(pn_sidebarLayout);
        pn_sidebarLayout.setHorizontalGroup(
            pn_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        pn_sidebarLayout.setVerticalGroup(
            pn_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );

        getContentPane().add(pn_sidebar, java.awt.BorderLayout.LINE_START);

        pn_content.setBackground(new java.awt.Color(63, 68, 77));

        pn_utama.setRoundBottomLeft(40);
        pn_utama.setRoundBottomRight(40);
        pn_utama.setRoundTopLeft(40);
        pn_utama.setRoundTopRight(40);
        pn_utama.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout pn_contentLayout = new javax.swing.GroupLayout(pn_content);
        pn_content.setLayout(pn_contentLayout);
        pn_contentLayout.setHorizontalGroup(
            pn_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn_contentLayout.setVerticalGroup(
            pn_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(pn_content, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(809, 577));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here
        pn_utama.add(new content_awal());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Menu_Utama("Id", "Nama", "Level").setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_level;
    private javax.swing.JLabel lb_nama;
    private javax.swing.JLabel lb_tanggal;
    private javax.swing.JPanel pn_content;
    private javax.swing.JPanel pn_menus;
    private javax.swing.JPanel pn_navbar;
    private javax.swing.JPanel pn_sidebar;
    private custom.panelCustom pn_utama;
    // End of variables declaration//GEN-END:variables

    private void execute(){
//        tempat icon
        ImageIcon iconDashboard = new ImageIcon(getClass().getResource("/img/dashboard.png"));
        ImageIcon iconBarang = new ImageIcon(getClass().getResource("/img/produk.png"));
        ImageIcon iconPengguna = new ImageIcon(getClass().getResource("/img/pengguna.png"));
        ImageIcon iconReport = new ImageIcon(getClass().getResource("/img/report.png"));
        ImageIcon iconHome = new ImageIcon(getClass().getResource("/img/home.png"));
        ImageIcon iconLogout = new ImageIcon(getClass().getResource("/img/logout.png"));
        ImageIcon iconMap = new ImageIcon(getClass().getResource("/img/map.png"));
        ImageIcon iconWarehouse = new ImageIcon(getClass().getResource("/img/warehouse.png"));
        ImageIcon iconLocation = new ImageIcon(getClass().getResource("/img/location.png"));

//        untuk submenu
        MenuItem subZona = new MenuItem(null, true, iconMap, "Zona", (ActionEvent e) -> {
            pn_utama.removeAll();
            pn_utama.add(new Master_Zona());
            pn_utama.repaint();
            pn_utama.revalidate();
        });
        MenuItem subGudang = new MenuItem(null, true, iconWarehouse, "Gudang", (ActionEvent e) -> {
            pn_utama.removeAll();
            pn_utama.add(new Master_Gudang());
            pn_utama.repaint();
            pn_utama.revalidate();
        });
        MenuItem subBarang = new MenuItem(null, true, iconBarang, "Barang", (ActionEvent e) -> {
            pn_utama.removeAll();
            pn_utama.add(new Master_Barang());
            pn_utama.repaint();
            pn_utama.revalidate();
        });
        MenuItem subJenBarang = new MenuItem(null, true, iconBarang, "Jenis Barang", (ActionEvent e) -> {
            pn_utama.removeAll();
            pn_utama.add(new Master_JenisBarang());
            pn_utama.repaint();
            pn_utama.revalidate();
        });
        MenuItem subSupplier = new MenuItem(null, true, iconBarang, "Supplier", (ActionEvent e) -> {
            pn_utama.removeAll();
            pn_utama.add(new Master_Supplier());
            pn_utama.repaint();
            pn_utama.revalidate();
        });

//        Untuk menu 
        MenuItem menuHome = new MenuItem(iconHome, false, null, "Home", (ActionEvent e) -> {
            pn_utama.removeAll();
            pn_utama.add(new content_awal());
            pn_utama.repaint();
            pn_utama.revalidate();
        });
        
        MenuItem menuDashboard = new MenuItem(iconDashboard, false, null, "Dashboard", null,subBarang,subSupplier,subJenBarang);
        MenuItem menuLokasi = new MenuItem(iconLocation, false, null, "Manage Lokasi", null,subGudang,subZona);
        MenuItem menuPengguna = new MenuItem(iconPengguna, false, null, "Manage Karyawan", (ActionEvent e) -> {
            pn_utama.removeAll();
            pn_utama.add(new Master_Pengguna());
            pn_utama.repaint();
            pn_utama.revalidate();
        });
        MenuItem menuReport = new MenuItem(iconReport, false, null, "Report", (ActionEvent e) -> {
            pn_utama.removeAll();
            pn_utama.add(new Master_Report());
            pn_utama.repaint();
            pn_utama.revalidate();
        });
        MenuItem menuLogout = new MenuItem(iconLogout, false, null, "Keluar", (ActionEvent e) -> {
            if(JOptionPane.showConfirmDialog(null,"Yakin Ingin Keluar?","Konfirmasi",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
                System.exit(0);
            }
        });
        
//        MenuItem menuBarang = new MenuItem(iconBarang, false, null, "Barang",null);
//        MenuItem menuLokasi = new MenuItem(iconLokasi, false, null, "Lokasi", null);
//        MenuItem menuPengguna = new MenuItem(iconPengguna, false, null, "Pengguna", null);
        addMenu(menuHome,menuDashboard, menuLokasi, menuPengguna,menuReport, menuLogout);
//        addMenu(menuDashboard, menuBarang, menuLokasi, menuPengguna);

    }
    private void addMenu(MenuItem... menu){
        for (MenuItem menu1 : menu) {
            pn_menus.add(menu1);
            ArrayList<MenuItem> subMenu = menu1.getSubMenu();
            for(MenuItem m : subMenu){
                addMenu(m);
            }
        }
        pn_menus.revalidate();
    }
    public void setActiveMenuItem(MenuItem menuItem) {
        if (activeMenuItem != null) {
            activeMenuItem.resetBackground();
//            activeMenuItem.hideMenu();
        }
        activeMenuItem = menuItem;
    }
}
