/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsp;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author HNC
 */
public class SanPham implements Serializable{
    private String maSP,tenSP,size;
    private int slCon;
    private double gia;

    public SanPham() {
    }

    public SanPham(String maSP) {
        this.maSP = maSP;
    }

    public SanPham(String maSP, String tenSP, String size, int slCon, double gia) {
        
        try{this.maSP = maSP;
        this.tenSP = tenSP;
        this.size = size;
        this.slCon = slCon;
        this.gia = gia;
        }
        catch(Exception e)
        {
            System.out.println("Lỗi "+e.toString());
        }
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) throws Exception{
        if(maSP.trim().equals(""))
            throw new Exception("Mã sản phẩm không được để trống!");
        else 
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) throws Exception  {
        if(tenSP.trim().equals(""))
            throw new Exception("Tên sản  phẩm không được để trống!");
        else
        this.tenSP = tenSP;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) throws Exception {
        if(size.trim().equals(""))
            throw new Exception("Size không được để trống!");
        else
        this.size = size;
    }

    public int getSlCon() {
        return slCon;
    }

    public void setSlCon(int slCon) throws Exception {
        if(slCon<0)
            throw new Exception("Số lượng còn phải là số nguyên không âm!");
        else
        this.slCon = slCon;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) throws Exception {
        if(gia<0)
            throw new Exception("Giá phải >0");
        else
        this.gia = gia;
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
