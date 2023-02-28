/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btl_jv;

import java.io.Serializable;

import java.util.Objects;

/**
 *
 * @author xuant
 */
public class DonHang extends SanPham implements Serializable {

    private String maDH;
    String userName, tenLop, tenKhoa, ngayD, soDT, tinhT, khoas;
    int soLuongDat, yeuC;

    public DonHang() {
    }

    public DonHang(String maDH) {
        this.maDH = maDH;
    }

    public DonHang(String maDH, String nguoiD, String ngayD, String tenL, String khoas, String khoa, String soDT, int Sl, String tinhT) {
        this.maDH = maDH;
        this.ngayD = ngayD;
        this.tenLop = tenL;
        this.tenKhoa = khoa;
        this.soDT = soDT;
        this.tinhT = tinhT;
        this.khoas = khoas;
        this.userName = nguoiD;
        this.soLuongDat = Sl;
    }

    public DonHang(String maDH, String userName, String tenLop, String tenKhoa, String LoaiSP, String size, String khoas, int soLuongDat, double giaTien, int yeuC) {
        this.maDH = maDH;
        this.userName = userName;
        this.tenLop = tenLop;
        this.tenKhoa = tenKhoa;
        super.tenSP = LoaiSP;
        super.size = size;
        this.khoas = khoas;
        this.soLuongDat = soLuongDat;
        this.giaTien = giaTien;
        this.yeuC = yeuC;
    }

    public String getMaDH() {
        return maDH;
    }

    public int getYeuC() {
        return yeuC;
    }

    public void setYeuC(int yeuC) {
        this.yeuC = yeuC;
    }

    public String getUserName() {
        return userName;
    }

    public String getTenLop() {
        return tenLop;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    @Override
    public String getTenSP() {
        return tenSP;
    }

    @Override
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    @Override
    public String getSize() {
        return size;
    }

    public String getNgayD() {
        return ngayD;
    }

    public String getSoDT() {
        return soDT;
    }

    public String getTinhT() {
        return tinhT;
    }

    public int getSoLuongDat() {
        return soLuongDat;
    }

    public String getKhoas() {
        return khoas;
    }

    @Override
    public double getGiaTien() {
        return giaTien;
    }

    public void setMaDH(String maDH) {
        this.maDH = maDH;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    @Override
    public void setSize(String size) {
        this.size = size;
    }

    public void setNgayD(String ngayD) {
        this.ngayD = ngayD;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public void setTinhT(String tinhT) {
        this.tinhT = tinhT;
    }

    public void setSoLuongDat(int soLuongDat) {
        this.soLuongDat = soLuongDat;
    }

    public void setKhoas(String khoas) {
        this.khoas = khoas;
    }

    @Override
    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.maDH);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DonHang other = (DonHang) obj;
        return Objects.equals(this.maDH, other.maDH);
    }

    double TongTien() {
        return giaTien * soLuongDat;
    }
    String YeuCau(){
        if(yeuC == 0){
            return "Chưa gửi";
        }else{
            return "Đã gửi";
        }
    }
    @Override
    public String toString() {
        return "DonHang{" + "maDH=" + maDH + ", userName=" + userName + ", tenLop=" + tenLop + ", tenKhoa=" + tenKhoa + ", ngayD=" + ngayD + ", soDT=" + soDT + ", tinhT=" + tinhT + ", khoas=" + khoas + ", soLuongDat=" + soLuongDat + "Gia tien: "+ giaTien+'}';
    }
    
}
