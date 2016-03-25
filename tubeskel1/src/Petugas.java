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
    private String pass;

    public Petugas(String nama, String tempatLahir, String tglLahir, String alamat, long id,String pass) {
        super(nama, tempatLahir, tglLahir, alamat, id);
        this.pass = pass;
    }
    
    
    public String getPass(){
        return pass;
    }
    
}
