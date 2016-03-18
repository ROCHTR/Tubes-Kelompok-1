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
    
    public Petugas (long id, String pass) {
        this.id=id;
        this.pass=pass;
    }
    
    public long getId(){
        return id;
    }
    
    public String getPass(){
        return pass;
    }
    
}
