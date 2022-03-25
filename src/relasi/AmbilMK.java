
package relasi;
import entitas.*;

public class AmbilMK {
    private Matakuliah matkul;
    private Mahasiswa mhs;
    private String nilai;
    private String tahunAjaran;

    
    //constructor
    public AmbilMK(Matakuliah matkul,Mahasiswa mhs, String nilai, String tahunAjaran){
        this.matkul = matkul;
        this.mhs = mhs;
        this.nilai = nilai;
        this.tahunAjaran = tahunAjaran;
        
    }
    
    //ger&set
    public Matakuliah getMatkul() {
        return matkul;
    }

    public void setMatkul(Matakuliah matkul) {
        this.matkul = matkul;
    }

    public Mahasiswa getMhs() {
        return mhs;
    }

    public void setMhs(Mahasiswa mhs) {
        this.mhs = mhs;
    }

    public String getNilai() {
        return nilai;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    public String getTahunAjaran() {
        return tahunAjaran;
    }

    public void setTahunAjaran(String tahunAjaran) {
        this.tahunAjaran = tahunAjaran;
    }
    
    
    
}
