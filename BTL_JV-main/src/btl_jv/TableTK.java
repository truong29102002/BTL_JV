/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btl_jv;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Administrator
 */
public class TableTK extends AbstractTableModel{
    String name[]={"id","ho ten","dia chi","sdt","email","Phu trach","tai khoan"};
    Class classes[]={String.class,String.class,String.class,Integer.class,String.class,String.class,String.class};
    ArrayList<KhachHang> dstk= new ArrayList<>();

    public TableTK(ArrayList<KhachHang> dstk) {
        this.dstk = dstk;
    }
    @Override
    public int getRowCount() {
        return dstk.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return dstk.get(rowIndex).getId();
            case 1: return dstk.get(rowIndex).getHoten();
            case 2: return dstk.get(rowIndex).getDiachi();
            case 3: return dstk.get(rowIndex).getSdt();
            case 4: return dstk.get(rowIndex).getEmail();
            case 5: return dstk.get(rowIndex).getPhutrach();
            case 6: return dstk.get(rowIndex).getUserName();
            default: return null;
        }
    }
    
    @Override
    public Class getColumnClass(int columnIndex) {
        return classes[columnIndex]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getColumnName(int column) {
        return name[column]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}

