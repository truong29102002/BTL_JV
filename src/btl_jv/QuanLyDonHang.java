package btl_jv;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author An Mai
 */
public class QuanLyDonHang extends javax.swing.JFrame {

    ArrayList<QLDonHang> dsDH = new ArrayList<QLDonHang>();
    ArrayList<QLDonHang> dsDHHT = new ArrayList<QLDonHang>();
    ArrayList<QLDonHang> dsDHC = new ArrayList<QLDonHang>();
    File fileName;
//    DBEngine db = new DBEngine();
    int dongChon = -1;//Dòng chọn bảng hóa đơn
    QLDonHang dh = new QLDonHang();

    public void fakeData() {
        QLDonHang a = new QLDonHang("DH01", "20/11/2020", "KHMT01", 14, "Công nghệ thông tin", "0974536278", "Đã hoàn thành");
        dsDH.add(a);
        QLDonHang b = new QLDonHang("DH02", "25/09/2019", "HTTT02", 15, "Công nghệ thông tin", "0987536278", "Chờ xác nhận");
        dsDH.add(b);
        QLDonHang c = new QLDonHang("DH03", "10/03/2018", "CNTT01", 13, "Công nghệ thông tin", "0974536438", "Đã hoàn thành");
        dsDH.add(c);
        QLDonHang d = new QLDonHang("DH04", "15/12/2019", "KTPM01", 14, "Công nghệ thông tin", "0973236278", "Chờ xác nhận");
        dsDH.add(d);
        QLDonHang e = new QLDonHang("DH05", "08/12/2020", "Cơ khí1", 13, "Cơ khí", "0932236278", "Chờ xác nhận");
        dsDH.add(e);
        QLDonHang f = new QLDonHang("DH06", "04/11/2018", "Điển tử 1 ", 15, "Điện tử", "0921236278", "Đã hoàn thành");
        dsDH.add(f);
        QLDonHang g = new QLDonHang("DH07", "28/10/2020", "Quản trị khách sạn 1", 15, "Quản lý knh doanh", "0921236438", "Chờ xác nhận");
        dsDH.add(g);
        QLDonHang h = new QLDonHang("DH08", "11/09/2020", "Du lịch", 15, "Du lịch", "0921224538", "Chờ xác nhận");
        dsDH.add(h);
        QLDonHang i = new QLDonHang("DH09", "02/10/2019", "Ngôn ngữ Anh 1", 15, "Ngôn ngữ Anh", "0932224538", "Đã hoàn thành");
        dsDH.add(i);
        QLDonHang k = new QLDonHang("DH10", "01/11/2018", "Kế toán 1", 15, "Kế-Kiểm", "0931424538", "Đã hoàn thành");
        dsDH.add(k);
        QLDonHang l = new QLDonHang("DH11", "01/09/2018", "KTMP03", 15, "Công nghệ thông tin", "0961424538", "Chờ xác nhận");
        dsDH.add(l);
        QLDonHang m = new QLDonHang("DH12", "02/12/2018", "KTMP04", 15, "Công nghệ thông tin", "0961424538", "Chờ xác nhận");
        dsDH.add(m);
//        luuFile();
//        docFile();
        //file.ghiHD(dsDH);
    }

    public QuanLyDonHang() {
        initComponents();
        fakeData();
        loadTableHoaDon();
        fileName = new File("DonHang_Excel.xls");
    }
//    public void luuFile(){
//        try{
//            db.luuFile(fileName, dsDH);
//        }catch(Exception e){
//            System.out.println(e.toString());
//        }
//    }

//    public void docFile(){
//        try{
//            dsDH = (ArrayList<DonHang>) db.docFile(fileName);
//        }catch(Exception e){
//            System.out.printf(e.toString());
//        }
//    }
    public void find_HT() {
        for (QLDonHang s : dsDH) {
            if (s.getTinhT().equals("Đã hoàn thành")) {
                dsDHHT.add(s);
            }
        }
    }

    public void find_C() {
        for (QLDonHang s : dsDH) {
            if (s.getTinhT().equals("Chờ xác nhận")) {
                dsDHC.add(s);

            }
        }
    }

    public void sua_TT() {
        for (QLDonHang s : dsDH) {
            if (s.getTinhT().equals("Chờ xác nhận")) {
                s.setTinhT("Đã hoàn thành");
            }
        }

    }

    public void loadTableHoaDon() {
        TableDH.setModel(new TableDonHang(dsDH));
    }

    public void loadDHHoanThanh() {
        TableDH.setModel(new TableDonHang(dsDHHT));
    }

    public void loadDHHCho() {
        TableDH.setModel(new TableDonHang(dsDHC));
    }

    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTenL = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtKhoa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtKhoas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNgayD = new javax.swing.JTextField();
        txtMaDH = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableDH = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Mã đơn hàng");

        jLabel2.setText("Tên lớp");

        jLabel3.setText("Khoa");

        jLabel4.setText("Khóa");

        jLabel5.setText("Số điện thoại");

        jLabel6.setText("Ngày đặt");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaDH, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(txtTenL)
                    .addComponent(txtKhoa))
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtKhoas, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(txtSDT)
                    .addComponent(txtNgayD))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(txtKhoas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaDH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtTenL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtNgayD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        TableDH.setModel(new javax.swing.table.DefaultTableModel(
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
        TableDH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableDHMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableDH);

        jButton1.setText("Đơn hàng đang chờ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDHCho(evt);
            }
        });

        jButton2.setText("Đơn hàng hoàn thành");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDHHoanThanh(evt);
            }
        });

        jButton3.setText("Hủy đơn hàng");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnXoaDH(evt);
            }
        });

        jButton4.setText("Xác nhận tất cả");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnXacNhan(evt);
            }
        });

        jButton5.setText("Thoát");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnThoat(evt);
            }
        });

        jButton6.setText("Thống kê");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnThongKe(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("QUẢN LÝ ĐƠN HÀNG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jButton3)
                            .addGap(64, 64, 64)))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4)
                                    .addComponent(jButton5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton6))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jButton2)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(14, 14, 14)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(155, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnDHCho(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDHCho
        // TODO add your handling code here:
        find_C();
        loadDHHCho();
    }//GEN-LAST:event_BtnDHCho

    private void btnDHHoanThanh(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDHHoanThanh
        find_HT();
        loadDHHoanThanh();
    }//GEN-LAST:event_btnDHHoanThanh

    private void BtnXoaDH(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnXoaDH
        // TODO add your handling code here:
        dongChon = TableDH.getSelectedRow();
        if (dongChon != -1) {
            dsDH.remove(dongChon);
            JOptionPane.showMessageDialog(this,
                    "Xóa đơn hàng thành công", "Thông báo", WIDTH);
            loadTableHoaDon();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Chưa chọn dòng xóa", "Thông báo", WIDTH);
        }
//        luuFile();
    }//GEN-LAST:event_BtnXoaDH

    private void BtnXacNhan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnXacNhan
        // TODO add your handling code here:
        sua_TT();
        loadTableHoaDon();
    }//GEN-LAST:event_BtnXacNhan

    private void BtnThoat(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnThoat
        // TODO add your handling code here:
        close();

    }//GEN-LAST:event_BtnThoat
    public void pt_XuatFileExcel(JTable table, File file) {
        try {
            FileWriter out = new FileWriter(file);
// Xuat tieu de bang ra file excel
            for (int i = 0; i < table.getColumnCount(); i++) {
                out.write(table.getColumnName(i) + "\t");
            }
            out.write("\n");
// Xuat noi dung bang ra file excel.
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < table.getColumnCount(); j++) {
                    out.write(table.getValueAt(i, j).toString() + "\t"); // \t de chuyen sang cot moi trong file excel.
                }
                out.write("\n"); // \n de xuong dong moi trong file excel.
            }
            out.close();
            JOptionPane.showMessageDialog(null, "Ghi ra file " + file);
        } catch (IOException ex) {
        }
    }
    private void BtnThongKe(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnThongKe
        // TODO add your handling code here:
        pt_XuatFileExcel(TableDH, fileName);
    }//GEN-LAST:event_BtnThongKe

    private void TableDHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableDHMouseClicked
        // TODO add your handling code here:
        dongChon = TableDH.getSelectedRow();
        if (dongChon != -1) {
            dh = dsDH.get(dongChon);
            txtMaDH.setText(dh.getMaHD() + "");
            txtNgayD.setText(dh.getNgayD() + "");
            txtTenL.setText(dh.getTenL() + "");
            txtKhoa.setText(dh.getKhoa() + "");
            txtKhoas.setText(dh.getKhoas() + "");
            txtSDT.setText(dh.getSoDT() + "");
    }//GEN-LAST:event_TableDHMouseClicked
    }
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        if (JOptionPane.showConfirmDialog(null, "Dong man hinh nay?", "Thong bao", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(QuanLyDonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyDonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyDonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyDonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new QuanLyDonHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableDH;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtKhoa;
    private javax.swing.JTextField txtKhoas;
    private javax.swing.JTextField txtMaDH;
    private javax.swing.JTextField txtNgayD;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenL;
    // End of variables declaration//GEN-END:variables
}
