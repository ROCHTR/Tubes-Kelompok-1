
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmad
 */
public class Aplikasi2 {
    ArrayList<Orang> daftarOrang = new ArrayList<>();
    ArrayList<Gudang> daftarGudang = new ArrayList<>();
    
    public void addPenyedia(String nama, String tempatLahir, String tglLahir, String alamat,String asalPerusahaan, long IdPenyedia,String sandi){
        Penyedia py = new Penyedia(nama, tempatLahir, tglLahir, alamat, asalPerusahaan, IdPenyedia, sandi);
        daftarOrang.add(py);
    }
    
    public void addPetugas(String nama, String tempatLahir, String tglLahir, String alamat, long id,String pass){
        Petugas pt = new Petugas(nama, tempatLahir, tglLahir, alamat, id, pass);
        daftarOrang.add(pt);
    }
    
    public void addGudang(int maxCapacity){
        Gudang g = new Gudang(maxCapacity);
        daftarGudang.add(g);
    }
    
    public Petugas getPetugas(long id){
        for (int i = 0; i < daftarOrang.size(); i++) {
            if(daftarOrang.get(i) instanceof Petugas){
                if(id == daftarOrang.get(i).getId()){
                    return (Petugas) daftarOrang.get(i);
                }
            }
//           list.remove(i); bufferreader
        }
        return null;
    }
    
    public Penyedia getPenyedia(long id){
        for (int i = 0; i < daftarOrang.size(); i++) {
            if(daftarOrang.get(i) instanceof Penyedia){
               if(id == daftarOrang.get(i).getId()){
                   return (Penyedia) daftarOrang.get(i);
               } 
            }
        }
        return null;
    }
    
//    public Gudang getGudang()
    
    public Petugas delPetugas(long id){
        for (int i = 0; i < daftarOrang.size(); i++) {
            if(daftarOrang.get(i) instanceof Petugas){
                if(id == daftarOrang.get(i).getId()){
                    daftarOrang.remove(i);
                }
            }
        }
        return null;
    }
    
    public Penyedia delPenyedia(long id){
        for (int i = 0; i < daftarOrang.size(); i++) {
            if(daftarOrang.get(i) instanceof Penyedia){
                if(id == daftarOrang.get(i).getId()){
                    daftarOrang.remove(i);
                }
            }
        }
        return null;
    }
    
    public void pilihMenu(int nomor){
        System.out.println("Pilihan Menu : ");
        System.out.println("1. Add Penyedia");
        System.out.println("2. Add Petugas");
        System.out.println("3. Add Gudang");
        System.out.println("4. Remove Penyedia");
        System.out.println("5. Remove Petugas ");
        System.out.println("6. Remove Gudang");
        switch(nomor){
            case 1: 
            case 2: 
            case 3: 
            case 4: 
        }
    }
    
}
