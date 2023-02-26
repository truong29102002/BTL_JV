/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btl_jv;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author HNC
 */
public class SanPham implements Serializable {

    String maSP, tenSP, size;
    int slCon;
    double giaTien;

    public SanPham() {
    }

    public SanPham(String maSP) {
        this.maSP = maSP;
    }

    public SanPham(String maSP, String tenSP, String size, int slCon, double giaTien) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.size = size;
        this.slCon = slCon;
        this.giaTien = giaTien;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSlCon(int slCon) {
        this.slCon = slCon;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public String getTenSP() {
        return tenSP;
    }

    public String getSize() {
        return size;
    }

    public int getSlCon() {
        return slCon;
    }

    public double getGiaTien() {
        return giaTien;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.maSP);
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
        final SanPham other = (SanPham) obj;
        return Objects.equals(this.maSP, other.maSP);
    }

}
