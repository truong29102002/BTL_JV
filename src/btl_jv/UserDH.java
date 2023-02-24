/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btl_jv;

/**
 *
 * @author xuant
 */
public class UserDH {

    String userName, tenLop, tenKhoa, LoaiSP, size, khoa;
    int soLuongDat;
    double giaTien;

    public UserDH() {
    }
    
    public UserDH(String userName, String tenLop, String tenKhoa, String LoaiSP, String size, String khoa, int soLuongDat, double giaTien) {
        this.userName = userName;
        this.tenLop = tenLop;
        this.tenKhoa = tenKhoa;
        this.LoaiSP = LoaiSP;
        this.size = size;
        this.khoa = khoa;
        this.soLuongDat = soLuongDat;
        this.giaTien = giaTien;
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

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public void setSoLuongDat(int soLuongDat) {
        this.soLuongDat = soLuongDat;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
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

    public String getKhoa() {
        return khoa;
    }

    public int getSoLuongDat() {
        return soLuongDat;
    }

    public double getGiaTien() {
        return giaTien;
    }
    double TongTien(){
        return soLuongDat * giaTien;
    }
}
