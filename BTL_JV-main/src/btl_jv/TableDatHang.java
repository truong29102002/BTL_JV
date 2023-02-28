/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btl_jv;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author xuant
 */
public class TableDatHang extends AbstractTableModel {

    String nameCol[] = {"Mã Đơn", "Người Đặt", "Lớp", "Khoa", "Tên Sản Phẩm", "Size", "Khóa", "Số lượng", "Thành Tiền","Trạng thái"};
    Class cl[] = {String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.class, Double.class,String.class};
    ArrayList<DonHang> dsDH = new ArrayList<>();

    public TableDatHang(ArrayList<DonHang> dsD) {
        dsDH = dsD;
    }

    @Override
    public int getRowCount() {
        return dsDH.size();
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getColumnCount() {
        return nameCol.length;
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return dsDH.get(rowIndex).getMaDH();
            case 1:
                return dsDH.get(rowIndex).getUserName();
            case 2:
                return dsDH.get(rowIndex).getTenLop();
            case 3:
                return dsDH.get(rowIndex).getTenKhoa();
            case 4:
                return dsDH.get(rowIndex).getTenSP();
            case 5:
                return dsDH.get(rowIndex).getSize();
            case 6:
                return dsDH.get(rowIndex).getKhoas();
            case 7:
                return dsDH.get(rowIndex).getSoLuongDat();
            case 8:
                return dsDH.get(rowIndex).TongTien();
            case 9:
                return dsDH.get(rowIndex).YeuCau();
            default:
                return null;
        }
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        return cl[columnIndex];
//        return super.getColumnClass(columnIndex); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getColumnName(int column) {
        return nameCol[column];
//        return super.getColumnName(column); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
