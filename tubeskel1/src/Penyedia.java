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
    Barang[] daftarBarang;
    private String asalPerusahaan;
    private String sandi;
    private long IdPenyedia;
    private int maxBarang;
    private int jmlBarang;

    public Penyedia(String nama, String tempatLahir, String tglLahir, String alamat,String asalPerusahaan, long IdPenyedia,String sandi ) {
        super(nama, tempatLahir, tglLahir, alamat);
        this.asalPerusahaan = asalPerusahaan;
        this.sandi = sandi;
        this.IdPenyedia = IdPenyedia;
        daftarBarang = new Barang[maxBarang];
        this.jmlBarang = 0;
        
    }
    
    
//    public Penyedia (String asalPerusahaan, long IdPenyedia, String sandi, int maxBarang){
//        this.asalPerusahaan=asalPerusahaan;
//        this.IdPenyedia=IdPenyedia;
//        this.sandi=sandi;
//        daftarBarang = new Barang[maxBarang];
//        jmlBarang=0;
//    }
    
    public void createBarang(String nmBarang, String mrkBarang) {
       if (jmlBarang < maxBarang){
           daftarBarang[jmlBarang] = new Barang(nmBarang, mrkBarang, IdPenyedia, jmlBarang);
           jmlBarang++;
       }
    }
    
    public String getAsalPerusahaan () {
        return asalPerusahaan;
    }
    
    public long getIdPenyedia() {
        return IdPenyedia;
    }
    
    public String getSandi() {
        return sandi;
    }
    
    public Barang getBarang(int jmlBarang){
        return daftarBarang[jmlBarang];
    }
    
    public void removeBarang (int indeks){
        for (int i = indeks+1; i < this.jmlBarang; i++) {
            daftarBarang[i-1] = daftarBarang[i];
            
        }
        this.jmlBarang--;
    }
}
