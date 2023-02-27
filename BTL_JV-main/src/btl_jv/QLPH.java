package QLPhanHoi;




import java.io.Serializable;
import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class QLPH implements Serializable{
     String id, hoTen, hinhAnh, nhanXet;
    double diemDG;

    public QLPH() {
    }

    public QLPH(String id) {
        this.id = id;
    }

    public QLPH(String id, String hoTen, String hinhAnh, String nhanXet, double diemDG) {
        this.id = id;
        this.hoTen = hoTen;
        this.hinhAnh = hinhAnh;
        this.nhanXet = nhanXet;
        this.diemDG = diemDG;
    }

    public String getId() {
        return id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public String getNhanXet() {
        return nhanXet;
    }

    public double getDiemDG() {
        return diemDG;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public void setNhanXet(String nhanXet) {
        this.nhanXet = nhanXet;
    }

    public void setDiemDG(double diemDG) {
        this.diemDG = diemDG;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
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
        final QLPH other = (QLPH) obj;
        return Objects.equals(this.id, other.id);
    }
    
}
