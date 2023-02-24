/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package btl_jv;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author xuant
 */
public class Users extends javax.swing.JFrame {

    /**
     * Creates new form Users
     */
    ArrayList<DonHang> dsDH = new ArrayList<>();
    int chonDong = -1;
    int i = 0;
    DonHang dh = new DonHang();

    void TongTien() {
        double sumTT = 0;
        for (DonHang i : dsDH) {
            sumTT += i.TongTien();
        }
        lbTongTien.setText(String.valueOf(sumTT) + " VND");
    }

    void LoadTable() {
        tableDH.setModel(new TableDH(dsDH));
    }

    void CbxLoaiSP() {
        String tenLoai[] = {"Ao the duc", "Ao khoac", "Ao thuc hanh"};
        cbxLoaiSP.setModel(new DefaultComboBoxModel<>(tenLoai));
    }

    void CbxKhoaH() {
        String tenKhoa[] = {"K17", "K16", "K15", "K14"};
        cbxKhoa.setModel(new DefaultComboBoxModel<>(tenKhoa));
    }

    void CbxSize() {
        String size[] = {"S", "M", "L", "XL", "2XL", "3XL"};
        cbxsize.setModel(new DefaultComboBoxModel<>(size));
    }

    public Users() {
        dsDH.add(new DonHang("D100", "abc", "KTPM1", "CNTT", "Ao khoac", "S", "K15", 10, 100000));
        initComponents();
        CbxLoaiSP();
        CbxKhoaH();
        CbxSize();
        lbGiaTien.setText("100000 VND");
        LoadTable();
        TongTien();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Khoa = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTenLop = new javax.swing.JTextField();
        btnRq = new javax.swing.JButton();
        cbxKhoa = new javax.swing.JComboBox<>();
        txtKhoa = new javax.swing.JTextField();
        txtSLD = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbxsize = new javax.swing.JComboBox<>();
        cbxLoaiSP = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDH = new javax.swing.JTable();
        btnXemMau = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lbGiaTien = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbTongTien = new javax.swing.JLabel();
        labelUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User");
        setSize(new java.awt.Dimension(1920, 1080));

        linkFeedback.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        linkFeedback.setForeground(new java.awt.Color(0, 0, 255));
        linkFeedback.setText("<HTML><u>FeedBack</u></HTML>");
        linkFeedback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        linkFeedback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkFeedbackMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("<HTML><u>Đăng xuất</u></HTML>");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel1.setText("Ten lop");

        Khoa.setText("Khoa");

        jLabel4.setText("So luong dat");

        btnRq.setText("Gửi yêu cầu");
        btnRq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRqActionPerformed(evt);
            }
        });

        cbxKhoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Khóa:");

        jLabel5.setText("Loại sp:");

        jLabel6.setText("Size:");

        cbxsize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbxLoaiSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxLoaiSP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxLoaiSPItemStateChanged(evt);
            }
        });

        tableDH.setModel(new javax.swing.table.DefaultTableModel(
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
        tableDH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDHMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDH);

        btnXemMau.setText("Xem mẫu các sản phảm");
        btnXemMau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemMauActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel7.setText("Giá tiền:");

        lbGiaTien.setText("0");

        jLabel9.setText("Tong tien:");

        lbTongTien.setText("0");

        labelUser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelUser.setForeground(new java.awt.Color(255, 0, 51));
        labelUser.setText("abc");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnXoa)
                                    .addComponent(btnSua)
                                    .addComponent(btnThem)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 33, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(linkFeedback)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Khoa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtSLD, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(txtKhoa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(txtTenLop, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxLoaiSP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbGiaTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxsize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxKhoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnXemMau)
                            .addComponent(btnRq))
                        .addGap(69, 69, 69))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(btnRq)
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Khoa)
                                    .addComponent(txtKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(lbGiaTien)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6)
                                            .addComponent(cbxsize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbxKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(txtTenLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5)
                                        .addComponent(cbxLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addComponent(btnXemMau))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtSLD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnThem)
                        .addGap(26, 26, 26)
                        .addComponent(btnSua)
                        .addGap(31, 31, 31)
                        .addComponent(btnXoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lbTongTien))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linkFeedback)
                    .addComponent(jLabel2)
                    .addComponent(labelUser))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void linkFeedbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkFeedbackMouseClicked
        // TODO add your handling code here:
        FeedBack fb = new FeedBack();
        fb.setLocationRelativeTo(null);
        fb.setVisible(true);
    }//GEN-LAST:event_linkFeedbackMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(this, "Ban muon dang xuat?", "Dang xuat", JOptionPane.YES_NO_OPTION, 0) == JOptionPane.YES_OPTION) {
            this.dispose();
            DangNhap dn = new DangNhap();
            dn.setLocationRelativeTo(null);
            dn.setVisible(true);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnXemMauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemMauActionPerformed
        // TODO add your handling code here:
        MauSP mSp = new MauSP();
        mSp.setLocationRelativeTo(null);
        mSp.setVisible(true);
    }//GEN-LAST:event_btnXemMauActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        i = ++i;
        String tenLop = txtTenLop.getText();
        String tenKhoa = txtKhoa.getText();
        String loaiSP = (String) cbxLoaiSP.getSelectedItem();
        String size = (String) cbxsize.getSelectedItem();
        String khoa = (String) cbxKhoa.getSelectedItem();
        int soLuong = Integer.parseInt(txtSLD.getText() + "");
        double giaTien = Double.parseDouble(lbGiaTien.getText() + "");
        DonHang dhn = new DonHang("D" + String.valueOf(i), labelUser.getText(), tenLop, tenKhoa, loaiSP, size, khoa, soLuong, giaTien);
        dsDH.add(dhn);
        LoadTable();
        TongTien();
    }//GEN-LAST:event_btnThemActionPerformed

    private void cbxLoaiSPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxLoaiSPItemStateChanged
        // TODO add your handling code here:
        double giaTien = 0;
        switch (cbxLoaiSP.getSelectedIndex()) {
            case 0:
                giaTien = 100000;
                break;
            case 1:
                giaTien = 110000;
                break;
            case 2:
                giaTien = 120000;
                break;
            default:
                giaTien = 100000;
        }
        lbGiaTien.setText(String.valueOf(giaTien)+ " VND");
    }//GEN-LAST:event_cbxLoaiSPItemStateChanged

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        chonDong = tableDH.getSelectedRow();
        if (chonDong != -1) {
            dh = dsDH.get(chonDong);
            DonHang dnUpdate = new DonHang(dh.maDH);
            dnUpdate.setUserName(labelUser.getText());
            dnUpdate.setTenLop(txtTenLop.getText() + "");
            dnUpdate.setTenKhoa(txtKhoa.getText());
            dnUpdate.setSoLuongDat(Integer.parseInt(txtSLD.getText()));
            dnUpdate.setLoaiSP((String) cbxLoaiSP.getSelectedItem());
            dnUpdate.setGiaTien(Double.parseDouble(lbGiaTien.getText()));
            dnUpdate.setKhoa((String) cbxKhoa.getSelectedItem());
            dnUpdate.setSize((String) cbxsize.getSelectedItem());
            dsDH.set(chonDong, dnUpdate);
            LoadTable();
            TongTien();
        } else {
            JOptionPane.showMessageDialog(null, "Chua chon dong sua", "Thong bao", 0);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void tableDHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDHMouseClicked
        // TODO add your handling code here:
        chonDong = tableDH.getSelectedRow();
        if (chonDong != -1) {
            dh = dsDH.get(chonDong);
            txtTenLop.setText(dh.tenLop);
            txtKhoa.setText(dh.tenKhoa);
            txtSLD.setText(String.valueOf(dh.soLuongDat));
            cbxLoaiSP.setSelectedItem(dh.LoaiSP);
            cbxKhoa.setSelectedItem(dh.khoa);
            cbxsize.setSelectedItem(dh.size);
        } else {
            JOptionPane.showMessageDialog(null, "Chua chon dong", "Thong bao", 0);
        }
    }//GEN-LAST:event_tableDHMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        chonDong = tableDH.getSelectedRow();
        if (chonDong != -1) {
            if (JOptionPane.showConfirmDialog(null, "ban chac muon xoa ?", "Thong bao", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
                dsDH.remove(chonDong);
                LoadTable();
                TongTien();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Chua chon hang xoa", "Thong bao", 1);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnRqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRqActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Don hang da duoc gui di", "Thong bao", 1);
    }//GEN-LAST:event_btnRqActionPerformed

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
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Khoa;
    private javax.swing.JButton btnRq;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXemMau;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbxKhoa;
    private javax.swing.JComboBox<String> cbxLoaiSP;
    private javax.swing.JComboBox<String> cbxsize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel labelUser;
    private javax.swing.JLabel lbGiaTien;
    private javax.swing.JLabel lbTongTien;
    private final javax.swing.JLabel linkFeedback = new javax.swing.JLabel();
    private javax.swing.JTable tableDH;
    private javax.swing.JTextField txtKhoa;
    private javax.swing.JTextField txtSLD;
    private javax.swing.JTextField txtTenLop;
    // End of variables declaration//GEN-END:variables
}
