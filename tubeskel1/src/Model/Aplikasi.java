package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmad
 */
public class Aplikasi {
    private Penyedia[] -;
    private Petugas[] daftarPetugas;
    private Gudang[] daftarGudang;
    private int jmlPenyedia;
    private int jmlPetugas;
    private int jmlGudang;
    
    public void addPetugas(Petugas pt){
        daftarPetugas[jmlPetugas] = pt;
        jmlPetugas++;
    }
    public void addPenyedia(Penyedia py){
        daftarPenyedia[jmlPenyedia] = py;
        jmlPenyedia++;
    }
    public void addGudang(Gudang gd){
        daftarGudang[jmlGudang] = gd;
        jmlGudang++;
    }
    public Penyedia getPenyedia(int jmlPenyedia){
        return daftarPenyedia[jmlPenyedia];
    }
    public Petugas getPetugas(int jmlPetugas){
        return daftarPetugas[jmlPetugas];
    }
    public Gudang getGudang(int jmlGudang){
        return daftarGudang[jmlGudang];
    }
    public void pilihMenu(int nomor){
        switch(nomor){
            case 1:
                return 
                break;
            case 2: break;
            case 3: break;
        }
    }

    public long createBarang(String nama, String merek, int jumlah) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
