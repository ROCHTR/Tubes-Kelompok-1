package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MuhammadAswan
 */
public class Barang {
    private String nmBarang;
    private String mrkBarang;
    private long idBarang;
    private int jmlBarang;
    
    public Barang (String nmBarang, String mrkBarang, long idBarang, int jmlBarang){
        setNmBarang(nmBarang);
        setIdBarang(idBarang);
        setJmlBarang(jmlBarang);
        setMrkBarang(mrkBarang);
    }
    public Barang (String nmBarang, String mrkBarang, int jmlBarang){
        setNmBarang(nmBarang);
        setJmlBarang(jmlBarang);
        setMrkBarang(mrkBarang);
    }

    public String getNmBarang() {
        return nmBarang;
    }

    public void setNmBarang(String nmBarang) {
        this.nmBarang = nmBarang;
    }

    public String getMrkBarang() {
        return mrkBarang;
    }

    public void setMrkBarang(String mrkBarang) {
        this.mrkBarang = mrkBarang;
    }

    public long getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(long idBarang) {
        this.idBarang = idBarang;
    }

    public int getJmlBarang() {
        return jmlBarang;
    }

    public void setJmlBarang(int jmlBarang) {
        this.jmlBarang = jmlBarang;
    }
}
