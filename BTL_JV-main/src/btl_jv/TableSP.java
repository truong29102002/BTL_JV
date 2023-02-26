/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btl_jv;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author HNC
 */
public class TableSP  extends AbstractTableModel{
    private String name[]={"Mã sản phẩm","Tên sản phẩm","Size","Đơn giá","Số lượng còn"};
    private Class classes[]={String.class,String.class,String.class,Double.class,Integer.class};
    ArrayList<SanPham> dssp=new ArrayList<>();

    public TableSP(ArrayList<SanPham> ds) {
        dssp=ds;
    }

    @Override
    public int getRowCount() {
       return  dssp.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
        {
            case 0: return dssp.get(rowIndex).getMaSP();
            case 1: return dssp.get(rowIndex).getTenSP();
            case 2: return dssp.get(rowIndex).getSize();
            case 3: return dssp.get(rowIndex).getGiaTien();
            case 4: return dssp.get(rowIndex).getSlCon();
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
