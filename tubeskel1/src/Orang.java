/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aziz
 */
public abstract class Orang {

    private String nama;
    private String tempatLahir;
    private String tglLahir;
    private String alamat;
    long id;
    
    public Orang(String nama,String tempatLahir,String tglLahir, String alamat, long id){
        setNama(nama);
        setTempatLahir(tempatLahir);
        setTglLahir(tglLahir);
        setAlamat(alamat);
        setId(id);
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }
    
    public long getId(){
        return id;
    }
    
    public void setId(long id){
        this.id = id;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

}
