package Model;


import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MuhammadAswan
 */
public class Penyedia extends Orang {
//    Barang[] daftarBarang;
    private List<Barang> daftarBarang;
    private String asalPerusahaan;
    private String sandi;
    private int maxBarang;
    private int jmlBarang;

    public Penyedia(String nama, String tempatLahir, String tglLahir, String alamat,String asalPerusahaan, long id,String sandi,int maxBarang ) {
        super(nama, tempatLahir, tglLahir, alamat, id);
        this.asalPerusahaan = asalPerusahaan;
        this.sandi = sandi;
        daftarBarang = new ArrayList<>();
        this.jmlBarang = 0;
        this.maxBarang = maxBarang;
    }
    
    
//    public Penyedia (String asalPerusahaan, long IdPenyedia, String sandi, int maxBarang){
//        this.asalPerusahaan=asalPerusahaan;
//        this.IdPenyedia=IdPenyedia;
//        this.sandi=sandi;
//        daftarBarang = new Barang[maxBarang];
//        jmlBarang=0;
//    }
    
    public void createBarang(String nmBarang, String mrkBarang,long idBarang) {
       if (jmlBarang < maxBarang){
           daftarBarang.add(new Barang(nmBarang, mrkBarang, idBarang, jmlBarang));
           jmlBarang++;
       }
    }
    
    public String getAsalPerusahaan () {
        return asalPerusahaan;
    }
 
    
    public String getSandi() {
        return sandi;
    }
    
    public Barang getBarang(int indeks){
        return daftarBarang.get(indeks);
    }
    
    public void removeBarang (int indeks){
        daftarBarang.remove(indeks);
        this.jmlBarang--;
    }
}
