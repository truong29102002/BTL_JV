/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btl_jv;

import java.util.Objects;

/**
 *
 * @author xuant
 */
public class TaiKhoan {
    String userName, passWord, quyen;

    public TaiKhoan() {
    }

    public TaiKhoan(String userName, String passWord, String quyen) {
        this.userName = userName;
        this.passWord = passWord;
        this.quyen = quyen;
    }

    public TaiKhoan(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    
    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getQuyen() {
        return quyen;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.userName);
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
        final TaiKhoan other = (TaiKhoan) obj;
        return Objects.equals(this.userName, other.userName);
    }

    public TaiKhoan(String userName) {
        this.userName = userName;
    }
    
    
}
