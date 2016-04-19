/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import Model.Aplikasi2;
import Model.Barang;
import View.Penyedia_Create;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Aziz
 */
public class ControllerPenyedia_Create implements ActionListener, FocusListener{
    Aplikasi2 model;
    Penyedia_Create view;
    Barang b;
    
    public ControllerPenyedia_Create(Aplikasi2 model){
        this.model = model;
        view = new Penyedia_Create();
        view.setVisible(true);
        view.addListener(this);
        this.b = null;
        
        this.view.getTfJumlah().addFocusListener(this);
        this.view.getTfNama().addFocusListener(this);
        this.view.getTfKode().addFocusListener(this);
        this.view.getTfMerek().addFocusListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if(source.equals(view.getBtnCreate())){
            String nama =view.getNama();
            String merek = view.getMerek();
            int jumlah = view.getJumlah();
            
            if(b == null){
                long idBarang = model.createBarang(nama,merek,jumlah);
                view.showMessage(view,"ID Barang = "+idBarang);
                view.setNama("");
                view.setMerek("");
                view.setJumlah(0);
                
            }
            else{
                b.setNmBarang(nama);
                b.setMrkBarang(merek);
                b.setJmlBarang(jumlah);
                model.updateBarang(b);
                JOptionPane.showMessageDialog(view," ID Barang "+b.getIdBarang()+" berhasil di update");
                new Controller
                
            }
        }
        
        
    }

    @Override
    public void focusGained(FocusEvent e) {
        
    }

    @Override
    public void focusLost(FocusEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
