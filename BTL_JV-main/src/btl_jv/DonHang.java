/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btl_jv;

import java.util.Objects;

/**
 *
 * @author xuant
 */
public class DonHang {

    String maDH, userName, tenLop, tenKhoa, LoaiSP, size,ngayD,soDT,tinhT,khoas;
    int soLuongDat;
    double giaTien;

    public DonHang() {
    }

    public DonHang(String maDH) {
        this.maDH = maDH;
    }
    public DonHang(String maDH,String nguoiD, String ngayD, String tenL,String khoas, String khoa,String soDT, String tinhT) {
        this.maDH = maDH;
        this.ngayD = ngayD;
        this.tenLop = tenL;
        this.tenKhoa = khoa;
        this.soDT = soDT;
        this.tinhT = tinhT;
        this.khoas = khoas;
        this.userName = nguoiD;
    }
    public DonHang(String maDH, String userName, String tenLop, String tenKhoa, String LoaiSP, String size, String khoas, int soLuongDat, double giaTien) {
        this.maDH = maDH;
        this.userName = userName;
        this.tenLop = tenLop;
        this.tenKhoa = tenKhoa;
        this.LoaiSP = LoaiSP;
        this.size = size;
        this.khoas = khoas;
        this.soLuongDat = soLuongDat;
        this.giaTien = giaTien;
    }

    public String getMaDH() {
        return maDH;
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

    public String getLoaiSP() {
        return LoaiSP;
    }

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

    public void setLoaiSP(String LoaiSP) {
        this.LoaiSP = LoaiSP;
    }

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

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    

    double TongTien() {
        return giaTien * soLuongDat;
    }
}
