/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entitas;

import jurnal_mod4.*;
import relasi.*;


public class Mahasiswa {
    private String NIM;
    private String nama;
    private String kelas;
    private String prodi;

    //constructor
    public Mahasiswa(String nim, String nama, int nokelas){
        String prodi = "";
        String Angkatan;
        this.nama = nama;
        this.NIM = nim;
        
        if("1301".equals(nim.substring(0,4))){
            this.prodi = "IF";
            prodi = "IF";
            
        }else if("1302".equals(nim.substring(0,4))){
            this.prodi = "SE";
            prodi = "SE";
        }else if("1303".equals(nim.substring(0,4))){
            this.prodi = "TI";
            prodi = "TI";
        }
        this.prodi = prodi;
        
        Angkatan = "20"+nim.substring(4, 6);
        int hitungAngkatan = Integer.parseInt(Angkatan) - 1976;
        Angkatan = String.valueOf(hitungAngkatan);
        this.kelas = prodi+"-"+Angkatan+"-"+String.valueOf(nokelas);        
        
    }
    
    //method
    public void hitungIPK(AmbilMK[] arr,String tahunAjaran){
        double IPK;
        IPK = 0;
        for(int i= 0; i < arr.length ; i++){
            String index = arr[i].getNilai();
            Matakuliah matkul = arr[i].getMatkul();
            int Sks = matkul.getSks();
            
            if("A".equals(index)){
                IPK = (4*Sks)/i;
            }else if("AB".equals(index)){
                IPK = (3.5*Sks)/i;
            }else if("B".equals(index)){
                IPK = (3*Sks)/i;
            }else if("BC".equals(index)){
                IPK = (2.5*Sks)/i;
            }else if("C".equals(index)){
                IPK = (2*Sks)/i;
            }else if("D".equals(index)){
                IPK = (1*Sks)/i;
            }else if("E".equals(index)){
                IPK = (0*Sks)/i;
            }
            
        }
        System.out.println(IPK);
        
    }
    
    //Get&Set
    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    
    
}
