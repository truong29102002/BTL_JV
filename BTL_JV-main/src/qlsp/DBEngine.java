/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author HNC
 */
public class DBEngine {
    public void LuuFile(String fileName, Object obj) throws Exception
    {
        FileOutputStream fo=new FileOutputStream(fileName);
        ObjectOutputStream oos=new ObjectOutputStream(fo);
        oos.writeObject(obj);
        oos.flush();
        oos.close();
        fo.close();
    }
    public Object DocFile(String fileName) throws Exception
    {
        Object kq=null;
        FileInputStream fi=new FileInputStream(fileName);
        ObjectInputStream ois=new ObjectInputStream(fi);
        kq=(Object)ois.readObject();
        ois.close();
        fi.close();
        return kq;
    }
}
