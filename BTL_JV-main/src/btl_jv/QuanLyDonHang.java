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

    ArrayList<DonHang> dsDH = new ArrayList<DonHang>();
    ArrayList<DonHang> dsDHHT = new ArrayList<DonHang>();
    ArrayList<DonHang> dsDHC = new ArrayList<DonHang>();
    File fileName;
//    DBEngine db = new DBEngine();
    int dongChon = -1;//Dòng chọn bảng hóa đơn
    DonHang dh = new DonHang();

    public void fakeData(){
        DonHang a = new DonHang("DH01","Nguyễn Thị Loan","20/11/2020","KHMT01","K14","Công nghệ thông tin","0974536278","Đã hoàn thành");
        dsDH.add(a);
        DonHang b = new DonHang("DH02","Vũ Văn Thuấn","25/09/2019","HTTT02","K15","Công nghệ thông tin","0987536278","Chờ xác nhận");
        dsDH.add(b);
        DonHang c = new DonHang("DH03","Hoàng Thị Huệ","10/03/2018","CNTT01","K13","Công nghệ thông tin","0974536438","Đã hoàn thành");
        dsDH.add(c);
        DonHang d = new DonHang("DH04","Nguyễn Tuấn Tú","15/12/2019","KTPM01","K14","Công nghệ thông tin","0973236278","Chờ xác nhận");
        dsDH.add(d);
        DonHang e = new DonHang("DH05","Trần Văn Cảnh","08/12/2020","CK1","K13","Cơ khí","0932236278","Chờ xác nhận");
        dsDH.add(e);
        DonHang f = new DonHang("DH06","Vũ Tuyết Dung","04/11/2018","DT1","K15","Điện tử","0921236278","Đã hoàn thành");
        dsDH.add(f);
        DonHang g = new DonHang("DH07","Nguyễn Thị Anh","28/10/2020","QTKS1","K15","Quản lý knh doanh","0921236438","Chờ xác nhận");
        dsDH.add(g);
        DonHang h = new DonHang("DH08","Nguyễn Thị Thu Hồng","11/09/2020","DL2","K13","Du lịch","0921224538","Chờ xác nhận");
        dsDH.add(h);
        DonHang i = new DonHang("DH09","Vũ Hồng Hạnh","02/10/2019","NNA1","K14","Ngôn ngữ Anh","0932224538","Đã hoàn thành");
        dsDH.add(i);
        DonHang k = new DonHang("DH10","Trần Văn Hải","01/11/2018","Kế Toán1","K15","Kế-Kiểm","0931424538","Đã hoàn thành");
        dsDH.add(k);
        DonHang l = new DonHang("DH11","Vũ Tuấn Hưng","01/09/2018","KTMP03","K15","Công nghệ thông tin","0961424538","Chờ xác nhận");
        dsDH.add(l);
        DonHang m = new DonHang("DH12","Hoàng Hạnh Lan","02/12/2018","KTMP04","K13","Công nghệ thông tin","0961424538","Chờ xác nhận");
        dsDH.add(m);
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
    public void Clear(){
        txtMaDH.setText("");
        txtNgayD.setText("");
        txtTenL.setText("");
        txtKhoa.setText("");
        txtKhoas.setText("");
        txtSDT.setText("");
    }
    public void find_HT() {
        for (DonHang s : dsDH) {
            if (s.getTinhT().equals("Đã hoàn thành")) {
                dsDHHT.add(s);
            }
        }
    }

    public void find_C() {
        for (DonHang s : dsDH) {
            if (s.getTinhT().equals("Chờ xác nhận")) {
                dsDHC.add(s);

            }
        }
    }

    public void sua_TT() {
        for (DonHang s : dsDH) {
            if (s.getTinhT().equals("Chờ xác nhận")) {
                s.setTinhT("Đã hoàn thành");
            }
        }

    }

    public void loadTableHoaDon(){
        TableDH.setModel(new TableDonHang(dsDH));
    }
    public void loadDHHoanThanh(){
        TableDH.setModel(new TableDonHang(dsDHHT));
    }
    public void loadDHHCho(){
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jButton5)
                            .addComponent(jButton6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 58, Short.MAX_VALUE))
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
                        .addGap(8, 8, 8)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)
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
       if(dongChon != -1){
            if (JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn xóa ?", "Thong bao", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
                dsDH.remove(dongChon);
                loadTableHoaDon();
                JOptionPane.showMessageDialog(this, "Xóa đơn hàng thành công","Thông báo", WIDTH);              
            }
        } else
          JOptionPane.showMessageDialog(this, 
                  "Chưa chọn dòng xóa","Thông báo", WIDTH);

        Clear();
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
            txtMaDH.setText(dh.getMaDH()+"");
            txtNgayD.setText(dh.getNgayD()+"");
            txtTenL.setText(dh.getTenLop()+"");
            txtKhoa.setText(dh.getTenKhoa()+"");
            txtKhoas.setText(dh.getKhoas()+"");
            txtSDT.setText(dh.getSoDT()+"");
    }//GEN-LAST:event_TableDHMouseClicked
}
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        if (JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn đóng ?", "Thong bao", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION) {
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
