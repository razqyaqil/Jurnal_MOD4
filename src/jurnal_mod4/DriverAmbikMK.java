/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jurnal_mod4;
import entitas.*;
import relasi.*;

public class DriverAmbikMK {
         
        
    public Matakuliah PBO = new Matakuliah("CII3B4","Pemrograman Berorientasi objek", 4);
    public Matakuliah KPL = new Matakuliah("CII3H4","Konstruksi Perangkat Lunak", 4);
    public Matakuliah APB = new Matakuliah("CTI3I3","Aplikasi Perangkat Lunak", 4);
    public Matakuliah aplat = new Matakuliah("CII6H9","Aplikasi Akan Tiba", 3);
        
    public Mahasiswa mhs1 = new Mahasiswa("1302091000","Bertholdt Hoover",1);
        public Mahasiswa mhs2 = new Mahasiswa("1303209999","Reiner Braun",12);
        
    public AmbilMK[] arr = {
        new AmbilMK(PBO,mhs1,"A","20/21"),
        new AmbilMK(aplat,mhs1,"C","20/21"),
        new AmbilMK(APB,mhs1,"AB","20/21"),
            
        new AmbilMK(PBO,mhs2,"B","20/21"),
        new AmbilMK(aplat,mhs2,"A","20/21"),
        new AmbilMK(APB,mhs2,"BC","19/20"),
        new AmbilMK(aplat,mhs2,"D","19/20"),        
        };
    public void test(){
       
    }
}
