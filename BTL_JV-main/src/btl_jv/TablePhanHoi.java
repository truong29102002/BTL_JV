package btl_jv;




import btl_jv.QLPH;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class TablePhanHoi extends AbstractTableModel implements Serializable{

    private String name[]={"Mã khách hàng","Tên khách hàng","Hình ảnh","Nhận xét","Điểm đánh giá"};
    private Class classes[]={String.class,String.class,String.class,String.class,Double.class};
    ArrayList<QLPH> dsKh=new ArrayList<>();

     @Override
    public int getRowCount() {
       return  dsKh.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
        {
            case 0: return dsKh.get(rowIndex).getId();
            case 1: return dsKh.get(rowIndex).getHoTen();
            case 2: return dsKh.get(rowIndex).getHinhAnh();
            case 3: return dsKh.get(rowIndex).getNhanXet();
            case 4: return dsKh.get(rowIndex).getDiemDG();
            default: return null;
        }
    }

    public TablePhanHoi(ArrayList<QLPH> ds) {
        dsKh = ds;
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
