/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btl_jv;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Administrator
 */
public class KhachHang extends TaiKhoan implements Serializable{
    String id,hoten,phutrach,diachi,email;
    int sdt;
    
    public KhachHang() {
        
    }

    public KhachHang(String id, String hoten, String phutrach, String diachi, String email, int sdt, String userName, String passWord, String quyen) {
        super(userName, passWord, quyen);
        this.id = id;
        this.hoten = hoten;
        this.phutrach = phutrach;
        this.diachi = diachi;
        this.email = email;
        this.sdt = sdt;
        
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setPhutrach(String phutrach) {
        this.phutrach = phutrach;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getId() {
        return id;
    }

    public String getHoten() {
        return hoten;
    }

    public String getPhutrach() {
        return phutrach;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getEmail() {
        return email;
    }

    public int getSdt() {
        return sdt;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
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
        final KhachHang other = (KhachHang) obj;
        return Objects.equals(this.id, other.id);
    }
    
    

    
    
    
}
