package Model;


import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aziz
 */
public class Gudang {

    private ArrayList<Barang> daftarBarang;
    // private char[] blok;
    private int maxCapacity;
    private int jumlah;

    public Gudang(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        daftarBarang = new ArrayList<>();
        this.jumlah=0;
    }

    public void addBarang(Barang b) {
        if (jumlah < maxCapacity) {
            daftarBarang.add(b);
            jumlah++;
        }
    }

    public Barang getBarang(int indeks) {
        return daftarBarang.get(indeks);
    }

    public void removeBarang(int indeks) {
//        if (daftarBarang[indeks] != null) {
//            if (daftarBarang[indeks + 1] == null) {
//                daftarBarang[indeks] = null;
//            } 
//            else {
//                for(int i=indeks;i<maxCapacity && daftarBarang[indeks+1]!=null;i++){
//                    daftarBarang[i] = kelas[i+1];
//                    daftarBarang[i+1] = null;
//                }
//
//            }
//        }
//
//    }
//        for (int i = indeks+1; i < this.jumlah; i++) {
//            daftarBarang[i-1] = daftarBarang[i];
//            
//        }
        daftarBarang.remove(indeks);
        this.jumlah--;

        }
}