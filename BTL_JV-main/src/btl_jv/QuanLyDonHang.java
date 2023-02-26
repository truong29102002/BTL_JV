package btl_jv;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author An Mai
 */
public class QuanLyDonHang extends javax.swing.JFrame {

    String filename = "QuanLyDonHang.txt";
    DBEngine db = new DBEngine();
    ArrayList<DonHang> dsDH = new ArrayList<>();
    File fileName;
    int dongChon = -1;//Dòng chọn bảng hóa đơn
    DonHang dh = new DonHang();

    public void fakeData() {
        DonHang a = new DonHang("DH01", "Nguyễn Thị Loan", "20/11/2020", "KHMT01", "K14", "Công nghệ thông tin", "0974536278", 53, "Đã hoàn thành");
        dsDH.add(a);
        DonHang b = new DonHang("DH02", "Vũ Văn Thuấn", "25/09/2019", "HTTT02", "K15", "Công nghệ thông tin", "0987536278", 75, "Chờ xác nhận");
        dsDH.add(b);
        DonHang c = new DonHang("DH03", "Hoàng Thị Huệ", "10/03/2018", "CNTT01", "K13", "Công nghệ thông tin", "0974536438", 64, "Đã hoàn thành");
        dsDH.add(c);
        DonHang d = new DonHang("DH04", "Nguyễn Tuấn Tú", "15/12/2019", "KTPM01", "K17", "Công nghệ thông tin", "0973236278", 30, "Chờ xác nhận");
        dsDH.add(d);
        DonHang e = new DonHang("DH05", "Trần Văn Cảnh", "08/12/2020", "CK1", "K13", "Cơ khí", "0932236278", 25, "Chờ xác nhận");
        dsDH.add(e);
        DonHang f = new DonHang("DH06", "Vũ Tuyết Dung", "04/11/2018", "DT1", "K14", "Điện tử", "0921236278", 42, "Đã hoàn thành");
        dsDH.add(f);
        DonHang g = new DonHang("DH07", "Nguyễn Thị Anh", "28/10/2020", "QTKS1", "K15", "Quản lý knh doanh", "0921236438", 31, "Chờ xác nhận");
        dsDH.add(g);
        DonHang h = new DonHang("DH08", "Nguyễn Thị Thu Hồng", "11/09/2020", "DL2", "K13", "Du lịch", "0921224538", 10, "Chờ xác nhận");
        dsDH.add(h);
        DonHang i = new DonHang("DH09", "Vũ Hồng Hạnh", "02/10/2019", "NNA1", "K14", "Ngôn ngữ Anh", "0932224538", 29, "Đã hoàn thành");
        dsDH.add(i);
        DonHang k = new DonHang("DH10", "Trần Văn Hải", "01/11/2018", "Kế Toán1", "K15", "Kế-Kiểm", "0931424538", 78, "Đã hoàn thành");
        dsDH.add(k);
        DonHang l = new DonHang("DH11", "Vũ Tuấn Hưng", "01/09/2018", "KTMP03", "K15", "Công nghệ thông tin", "0961424538", 20, "Chờ xác nhận");
        dsDH.add(l);
        DonHang m = new DonHang("DH12", "Hoàng Hạnh Lan", "02/12/2018", "KTMP04", "K13", "Công nghệ thông tin", "0961424538", 36, "Chờ xác nhận");
        dsDH.add(m);
    }

    public QuanLyDonHang() {
        initComponents();
        fakeData();
        loadTableHoaDon();
        fileName = new File("DonHang_Excel.xls");
    }

    public void luuFile() {
        try {
            db.luuFile(filename, dsDH);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void docFile() {
        try {
            dsDH = (ArrayList<DonHang>) db.docFile(filename);
        } catch (Exception e) {
            System.out.printf(e.toString());
        }
    }

    public void Clear() {
        txtMaDH.setText("");
        txtNgayD.setText("");
        txtTenL.setText("");
        txtKhoa.setText("");
        txtKhoas.setText("");
        txtSDT.setText("");
        txtSLD.setText("");
        txtTT.setText("");
    }

    public void loadTableHoaDon() {
        TableDH.setModel(new TableDonHang(dsDH));
    }

    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        jLabel9 = new javax.swing.JLabel();
        txtSLD = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTT = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableDH = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        RdTang = new javax.swing.JRadioButton();
        RdGiam = new javax.swing.JRadioButton();
        BtnLuuFile = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        BtnSearch = new javax.swing.JButton();

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

        jLabel9.setText("Số lượng đặt");

        jLabel10.setText("Tình trạng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSLD))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaDH, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(txtTenL)
                            .addComponent(txtKhoa))))
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtKhoas, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(txtSDT)
                    .addComponent(txtNgayD)
                    .addComponent(txtTT))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtTenL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel6)
                        .addComponent(txtNgayD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtSLD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addContainerGap(20, Short.MAX_VALUE))
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

        jLabel8.setText("Số lượng đặt");

        buttonGroup1.add(RdTang);
        RdTang.setText("Tăng dần");
        RdTang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdTangActionPerformed(evt);
            }
        });

        buttonGroup1.add(RdGiam);
        RdGiam.setText("Giảm dần");
        RdGiam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdGiamActionPerformed(evt);
            }
        });

        BtnLuuFile.setText("Lưu File");
        BtnLuuFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLuuFileActionPerformed(evt);
            }
        });

        jLabel11.setText("Mã đơn hàng");

        BtnSearch.setText("Search");
        BtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RdTang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RdGiam, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)))
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
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 863, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jButton5)
                            .addComponent(jButton6)
                            .addComponent(BtnLuuFile)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(428, 428, 428)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(RdTang)
                    .addComponent(RdGiam)
                    .addComponent(jLabel11)
                    .addComponent(BtnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnLuuFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(150, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnDHCho(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDHCho
        // TODO add your handling code here:
        ArrayList<DonHang> dsDHC = new ArrayList<>();
        for (DonHang s : dsDH) {
            if (s.getTinhT().equals("Chờ xác nhận")) {
                if (!dsDHC.contains(s)) {
                    dsDHC.add(s);
                    TableDH.setModel(new TableDonHang(dsDHC));
                }
            } else {
                dsDHC.remove(s);
                TableDH.setModel(new TableDonHang(dsDHC));
            }
        }
    }//GEN-LAST:event_BtnDHCho

    private void btnDHHoanThanh(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDHHoanThanh
        ArrayList<DonHang> dsDHHT = new ArrayList<>();
        for (DonHang s : dsDH) {
            if (s.getTinhT().equals("Đã hoàn thành")) {
                if (!dsDHHT.contains(s)) {
                    dsDHHT.add(s);
                    TableDH.setModel(new TableDonHang(dsDHHT));
                }

            }
        }
    }

    public void sua_TT() {
        for (DonHang s : dsDH) {
            if (s.getTinhT().equals("Chờ xác nhận")) {
                s.setTinhT("Đã hoàn thành");

            }
        }
    }//GEN-LAST:event_btnDHHoanThanh

    private void BtnXoaDH(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnXoaDH
        // TODO add your handling code here:
        dongChon = TableDH.getSelectedRow();
        if (dongChon != -1) {
            dh = dsDH.get(dongChon);
            if (dh.tinhT.compareToIgnoreCase("Đã hoàn thành") == 0) {
                JOptionPane.showMessageDialog(null, "Don hang da hoan thanh khong the huy.", "Thong bao", 1);
            } else {
                if (JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn xóa ?", "Thong bao", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
                    dsDH.remove(dongChon);
                    loadTableHoaDon();
                    JOptionPane.showMessageDialog(this, "Xóa đơn hàng thành công", "Thông báo", WIDTH);
                }
            }

        } else {
            JOptionPane.showMessageDialog(this,
                    "Chưa chọn dòng xóa", "Thông báo", WIDTH);
        }

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
    Workbook workbook = new XSSFWorkbook(); // tạo mới đối tượng đại diện cho excel.
    Sheet sheet = (Sheet) workbook.createSheet("QL_DonHang"); // tạo 1 đối tượng sheet, đại diện cho sheet bên trong file Excel

    public void pt_XuatFileExcel(JTable table) throws IOException {

        // tạo tên cột 
        Row headerRow = sheet.createRow(0);
        for (int i = 0; i < table.getColumnCount(); i++) {
            Cell headerCell = headerRow.createCell(i);
            headerCell.setCellValue(table.getColumnName(i));
            // tạo font chữ đận cho tên cột 
            org.apache.poi.ss.usermodel.Font font = workbook.createFont();
            font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
            org.apache.poi.ss.usermodel.CellStyle style = workbook.createCellStyle();
            style.setFont(font);
            headerCell.setCellStyle(style);
        }

        // thêm dữ liệu trong jtable vào trong file
        for (int i = 0; i < table.getRowCount(); i++) {
            Row row = sheet.createRow(i + 1);
            for (int j = 0; j < table.getColumnCount(); j++) {
                Cell cell = row.createCell(j);
                cell.setCellValue(table.getValueAt(i, j).toString());
            }
        }
        FileOutputStream fileOut = new FileOutputStream("QL_DonHang.xlsx");
        workbook.write(fileOut);
        fileOut.close();
        JOptionPane.showMessageDialog(null, "Đã xuất ra file: QL_DonHang.xlsx");
    }
    private void BtnThongKe(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnThongKe
        try {
            // TODO add your handling code here:
            pt_XuatFileExcel(TableDH);
        } catch (IOException ex) {
            JOptionPane.showConfirmDialog(null, ex.toString());
        }
    }//GEN-LAST:event_BtnThongKe

    private void TableDHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableDHMouseClicked
        // TODO add your handling code here:
        dongChon = TableDH.getSelectedRow();
        if (dongChon != -1) {
            dh = dsDH.get(dongChon);
            txtMaDH.setText(dh.getMaDH() + "");
            txtNgayD.setText(dh.getNgayD() + "");
            txtTenL.setText(dh.getTenLop() + "");
            txtKhoa.setText(dh.getTenKhoa() + "");
            txtKhoas.setText(dh.getKhoas() + "");
            txtSDT.setText(dh.getSoDT() + "");
            txtSLD.setText(dh.getSoLuongDat() + "");
            txtTT.setText(dh.getTinhT() + "");
    }//GEN-LAST:event_TableDHMouseClicked
    }
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        if (JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn đóng ?", "Thong bao", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void BtnLuuFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLuuFileActionPerformed
        // TODO add your handling code here:
        luuFile();
        JOptionPane.showMessageDialog(this,
                "Lưu file thành công !", "Thông báo", WIDTH);
    }//GEN-LAST:event_BtnLuuFileActionPerformed

    private void RdTangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdTangActionPerformed
        // TODO add your handling code here:
        Comparator<DonHang> c = new Comparator<DonHang>() {
            @Override
            public int compare(DonHang o1, DonHang o2) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                return Integer.compare(o1.soLuongDat, o2.soLuongDat);
            }
        };
        Collections.sort(dsDH, c);
        loadTableHoaDon();
    }//GEN-LAST:event_RdTangActionPerformed

    private void RdGiamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdGiamActionPerformed
        // TODO add your handling code here:
        Comparator<DonHang> c = new Comparator<DonHang>() {
            @Override
            public int compare(DonHang o1, DonHang o2) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                return Integer.compare(o1.soLuongDat, o2.soLuongDat);
            }
        };
        Collections.sort(dsDH, c.reversed());
        loadTableHoaDon();
    }//GEN-LAST:event_RdGiamActionPerformed

    public JTextField getTxtSearch() throws Exception {
        if (txtSearch.getText().equals("")) {
            throw new Exception("Nhap ma don hang can tim");
        }
        return txtSearch;
    }

    private void BtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchActionPerformed
        // TODO add your handling code here:
        try {
            String maDHS = getTxtSearch().getText();
            DonHang d = new DonHang(maDHS);
            ArrayList<DonHang> lsDHSearch = new ArrayList<>();
            if (dsDH.contains(d)) {
                for (DonHang s : dsDH) {
                    if (s.getMaDH().equals(maDHS)) {
                        lsDHSearch.add(s);
                        TableDH.setModel(new TableDonHang(lsDHSearch));
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this,
                        "Đơn hàng không tồn tại!", "Thông báo", WIDTH);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString(), "Thong bao", 0);
        }


    }//GEN-LAST:event_BtnSearchActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new QuanLyDonHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLuuFile;
    private javax.swing.JButton BtnSearch;
    private javax.swing.JRadioButton RdGiam;
    private javax.swing.JRadioButton RdTang;
    private javax.swing.JTable TableDH;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtKhoa;
    private javax.swing.JTextField txtKhoas;
    private javax.swing.JTextField txtMaDH;
    private javax.swing.JTextField txtNgayD;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSLD;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTT;
    private javax.swing.JTextField txtTenL;
    // End of variables declaration//GEN-END:variables
}
