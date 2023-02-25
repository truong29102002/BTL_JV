
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author An Mai
 */
public class TableDonHang extends AbstractTableModel implements Serializable{
    private String name[] = {"Mã đơn hàng","Ngày đặt","Tên lớp","Khoa","Khóa","Số điện thoại","Tình trạng"};
    
    private Class classes[] = {String.class,String.class,String.class,String.class,Integer.class,String.class,String.class};
   
    ArrayList<QLDonHang> dsDH = new ArrayList<QLDonHang>();

    public TableDonHang(ArrayList<QLDonHang> dh) {
        dsDH = dh;
    }
        
    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return dsDH.size();
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        switch(columnIndex){
            case 0: return dsDH.get(rowIndex).getMaHD();
            
            case 1: return dsDH.get(rowIndex).getNgayD();
            
            case 2: return dsDH.get(rowIndex).getTenL();
            
            case 3: return dsDH.get(rowIndex).getKhoa();
            
            case 4: return dsDH.get(rowIndex).getKhoas();
            case 5: return dsDH.get(rowIndex).getSoDT();
            
            case 6: return dsDH.get(rowIndex).getTinhT();
            default : return null;
        }
    }
    
    @Override
    public Class getColumnClass(int columnIndex)
    {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column)
    {
        return name[column];
    }
}

