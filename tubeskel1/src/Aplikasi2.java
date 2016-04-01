
import java.util.ArrayList;
import java.util.Scanner;

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
    Scanner inputan = new Scanner(System.in);

    ArrayList<Orang> daftarOrang = new ArrayList<>();
    ArrayList<Gudang> daftarGudang = new ArrayList<>();

    public void addPenyedia(String nama, String tempatLahir, String tglLahir, String alamat, String asalPerusahaan, long IdPenyedia, String sandi) {
        Penyedia py = new Penyedia(nama, tempatLahir, tglLahir, alamat, asalPerusahaan, IdPenyedia, sandi);
        daftarOrang.add(py);
    }

    public void addPetugas(String nama, String tempatLahir, String tglLahir, String alamat, long id, String pass) {
        Petugas pt = new Petugas(nama, tempatLahir, tglLahir, alamat, id, pass);
        daftarOrang.add(pt);
    }

    public void addGudang(int maxCapacity) {
        Gudang g = new Gudang(maxCapacity);
        daftarGudang.add(g);
    }

    public Petugas getPetugas(long id) {
        for (int i = 0; i < daftarOrang.size(); i++) {
            if (daftarOrang.get(i) instanceof Petugas) {
                if (id == daftarOrang.get(i).getId()) {
                    return (Petugas) daftarOrang.get(i);
                }
            }
//           list.remove(i); bufferreader
        }
        return null;
    }

    public Penyedia getPenyedia(long id) {
        for (int i = 0; i < daftarOrang.size(); i++) {
            if (daftarOrang.get(i) instanceof Penyedia) {
                if (id == daftarOrang.get(i).getId()) {
                    return (Penyedia) daftarOrang.get(i);
                }
            }
        }
        return null;
    }

//    public Gudang getGudang()
    public Petugas delPetugas(long id) {
        for (int i = 0; i < daftarOrang.size(); i++) {
            if (daftarOrang.get(i) instanceof Petugas) {
                if (id == daftarOrang.get(i).getId()) {
                    daftarOrang.remove(i);
                }
            }
        }
        return null;
    }

    public Penyedia delPenyedia(long id) {
        for (int i = 0; i < daftarOrang.size(); i++) {
            if (daftarOrang.get(i) instanceof Penyedia) {
                if (id == daftarOrang.get(i).getId()) {
                    daftarOrang.remove(i);
                }
            }
        }
        return null;
    }
    public Gudang delGudang(int indeks) {
      
            if (daftarGudang.get(indeks) instanceof Gudang) {
    
                    daftarGudang.remove(indeks);
                }
              return null;
            }
        
      
    
    
    public void login(){};
    public void kategori(){};
    public void menuAdmin(Penyedia p){
        
    }

    public void mainMenu() {
        String nama;
        String tempatLahir;
        String tglLahir;
        String alamat;
        String asalPerusahaan;
        long id;
        String pass;
        int maxCap;
        int indeks;
        
        int nomor;
        
        System.out.println("ID :");id = inputan.nextLong();
        System.out.println("Password :");pass = inputan.next();
        
        while (true) {
            System.out.println("Pilihan Menu : ");
            System.out.println("1. Add Penyedia");
            System.out.println("2. Add Petugas");
            System.out.println("3. Add Gudang");
            System.out.println("4. Remove Penyedia");
            System.out.println("5. Remove Petugas ");
            System.out.println("6. Remove Gudang");
            System.out.println("Masukkan Pilihan : ");nomor = inputan.nextInt();
            switch (nomor) {
                case 1: 
                    //Penyedia(nama, tempatLahir, tglLahir, alamat, asalPerusahaan, IdPenyedia, sandi);
                    System.out.print("Masukkan Nama : "); nama = inputan.next();
                    System.out.print("Masukkan Tempat Lahir : "); tempatLahir = inputan.next();
                    System.out.print("Masukkan Tanggal Lahir : "); tglLahir = inputan.next();
                    System.out.print("Masukkan Alamat : "); alamat = inputan.next();
                    System.out.print("Masukkan Asal Perusahaan : "); asalPerusahaan = inputan.next();
                    System.out.print("Masukkan ID : "); id = inputan.nextLong();
                    System.out.print("Masukkan Pass : "); pass = inputan.next();
                    addPenyedia(nama, tempatLahir, tglLahir, alamat, asalPerusahaan, id, pass);
                    break;
                    
                case 2:
                    
                    System.out.print("Masukkan Nama : "); nama = inputan.next();
                    System.out.print("Masukkan Tempat Lahir : "); tempatLahir = inputan.next();
                    System.out.print("Masukkan Tanggal Lahir : "); tglLahir = inputan.next();
                    System.out.print("Masukkan Alamat : "); alamat = inputan.next();
                    System.out.print("Masukkan ID : "); id = inputan.nextLong();
                    System.out.print("Masukkan Pass : "); pass = inputan.next();
                    addPetugas(nama, tempatLahir, tglLahir, alamat,  id, pass);
                    break;
                case 3:
                    System.out.println("Masukkan kapasistas gudang : "); maxCap = inputan.nextInt();
                    addGudang(maxCap);
                    break;
                    
                case 4: 
                    System.out.println("Id Penyedia yang ingin dihapus : "); id = inputan.nextLong();
                    delPenyedia(id);
                    
                case 5:
                     System.out.println("Id Petugas yang ingin dihapus : "); id = inputan.nextLong();
                    delPetugas(id);
                case 6:
                    System.out.println("Indeks Gudang yang ingin dihapus : "); indeks = inputan.nextInt();
                    delGudang(indeks);
            }
        }
    }
    
}
