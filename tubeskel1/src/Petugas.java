/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MuhammadAswan
 */
public class Petugas extends Orang {
    private Barang[] daftarBarang;
    private long id;
    private String pass;

    public Petugas(String nama, String tempatLahir, String tglLahir, String alamat, long id) {
        super(nama, tempatLahir, tglLahir, alamat);
        this.id = id;
    }
    
    
    
    public long getId(){
        return id;
    }
    
    public String getPass(){
        return pass;
    }
    
}
