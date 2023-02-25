
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author An Mai
 */
public class QLDonHang implements Serializable{
    private String maDH,ngayD,tenL,khoa,soDT,tinhT;
    private int khoas;
    public QLDonHang() {
    }

    public QLDonHang(String maDH, String ngayD, String tenL,int khoas, String khoa,String soDT, String tinhT) {
        this.maDH = maDH;
        this.ngayD = ngayD;
        this.tenL = tenL;
        this.khoa = khoa;
        this.soDT = soDT;
        this.tinhT = tinhT;
        this.khoas = khoas;
    }
    

    public String getMaHD() {
        return maDH;
    }

    public String getNgayD() {
        return ngayD;
    }

    public String getTenL() {
        return tenL;
    }

    public int getKhoas() {
        return khoas;
    }

    public String getKhoa() {
        return khoa;
    }

    public String getTinhT() {
        return tinhT;
    }
    
    public String getSoDT() {
        return soDT;
    }

    public void setMaDH(String maDH) {
        this.maDH = maDH;
    }

    public void setNgayD(String ngayD) {
        this.ngayD = ngayD;
    }

    public void setTenL(String tenL) {
        this.tenL = tenL;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public void setTinhT(String tinhT) {
        this.tinhT = tinhT;
    }

    public void setKhoas(int khoas) {
        this.khoas = khoas;
    }
    
}

