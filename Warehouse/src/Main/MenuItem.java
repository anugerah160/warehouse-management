/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Main;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.Icon;

/**
 *
 * @author Administrator
 */
public class MenuItem extends javax.swing.JPanel {

    /**
     * @return the subMenu
     */
    public ArrayList<MenuItem> getSubMenu() {
        return subMenu;
    }

    /**
     * Creates new form MenuItem
     */
    private final ArrayList<MenuItem> subMenu = new ArrayList<>();
    private ActionListener act;
    
    public MenuItem (Icon icon, boolean sbm, Icon iconSub, String menuName, ActionListener act, MenuItem... subMenu) {
        initComponents();
        setFont();
        
        lb_icon.setIcon(icon);
        lb_menuName.setText(menuName);
        lb_iconSub.setIcon(iconSub);
        lb_iconSub.setVisible(sbm);
        
        if (act != null){
            this.act = act;
        }
        this.setSize(new Dimension(Integer.MAX_VALUE, 45));
        this.setMaximumSize(new Dimension(Integer.MAX_VALUE, 45));
        this.setMinimumSize(new Dimension(Integer.MAX_VALUE, 45));
        for (MenuItem subMenu1 : subMenu) {
            this.subMenu.add(subMenu1);
            subMenu1.setVisible(false);
        }
    }
    
    private void setFont(){
        try {
            File fontStyle = new File("src/custom/Poppins-Bold.ttf");
            Font font = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(14f);
            lb_menuName.setFont(font);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jpanel1 = new custom.panelCustom();
        lb_menuName = new javax.swing.JLabel();
        lb_iconSub = new javax.swing.JLabel();
        lb_icon = new javax.swing.JLabel();

        setBackground(new java.awt.Color(35, 39, 47));
        setPreferredSize(new java.awt.Dimension(240, 40));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        Jpanel1.setBackground(new java.awt.Color(35, 39, 47));
        Jpanel1.setPreferredSize(new java.awt.Dimension(240, 40));
        Jpanel1.setRoundBottomLeft(15);
        Jpanel1.setRoundBottomRight(15);
        Jpanel1.setRoundTopLeft(15);
        Jpanel1.setRoundTopRight(15);

        lb_menuName.setForeground(new java.awt.Color(255, 255, 255));
        lb_menuName.setText("Menu Item...");

        lb_iconSub.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Jpanel1Layout = new javax.swing.GroupLayout(Jpanel1);
        Jpanel1.setLayout(Jpanel1Layout);
        Jpanel1Layout.setHorizontalGroup(
            Jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jpanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lb_iconSub, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_menuName, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        Jpanel1Layout.setVerticalGroup(
            Jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jpanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_iconSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_menuName, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jpanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jpanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private boolean showing = false;
    private boolean sw = true;

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        Menu_Utama mainFrame = (Menu_Utama) javax.swing.SwingUtilities.getWindowAncestor(this);

        mainFrame.setActiveMenuItem(this);
        Jpanel1.setBackground(new java.awt.Color(255,255,255)); // Change background to 
        lb_menuName.setForeground(new java.awt.Color(0, 0, 0)); // Change text color to 

        if (showing) {
            hideMenu();
        } else {
            showMenu();
        }

        if (act != null) {
            act.actionPerformed(null);
        }
// //untuk warna jika diklik
//        if(sw){
//        lb_menuName.setForeground(new java.awt.Color(0,0,0));
//        setBackground(new java.awt.Color(255,255,255));
//        sw = false;
//        }else{
//        lb_menuName.setForeground(new java.awt.Color(255,255,255));
//        setBackground(new java.awt.Color(35,39,47));
//        sw = true;
//        }
//        //setBackground(new java.awt.Color(255,255,255));
//        //setBackground(Color.red);
//        if (showing) {
//            hideMenu();
//        }else{
//            showMenu();
//        }
//        if (act != null){
//            act.actionPerformed(null);
//        }
    }//GEN-LAST:event_formMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private custom.panelCustom Jpanel1;
    private javax.swing.JLabel lb_icon;
    private javax.swing.JLabel lb_iconSub;
    private javax.swing.JLabel lb_menuName;
    // End of variables declaration//GEN-END:variables

    public void resetBackground() {
        Jpanel1.setBackground(new java.awt.Color(35, 39, 47));
        lb_menuName.setForeground(new java.awt.Color(255, 255, 255));
    }

    protected void hideMenu() {
        new Thread(() -> {
            for (int i = subMenu.size() - 1; i >= 0; i--) {
                sleep();
                subMenu.get(i).setVisible(false);
                subMenu.get(i).hideMenu();
            }
            getParent().repaint();
            getParent().revalidate();
            showing = false;
        }).start();
    }

    private void showMenu() {
        new Thread(() -> {
            for (int i = 0; i < subMenu.size(); i++) {
                sleep();
                subMenu.get(i).setVisible(true);

            }
            getParent().repaint();
            getParent().revalidate();
            showing = true;
        }).start();
    }

    private void sleep() {
        try {
            Thread.sleep(20);
        } catch (Exception e) {
        }
    }
}
