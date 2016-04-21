/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.Aplikasi2;
import Model.Barang;
import Model.Penyedia;
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
    
    public ControllerPenyedia_Create(Aplikasi2 model,Penyedia p){
        this.model = model;
        view = new Penyedia_Create();
        view.setVisible(true);
        view.addListener(this);
        this.b = null;
     
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
            long id = view.getKode();
            
            
            if(b == null){
                long idBarang = model.createBarang(nama,merek,id);
               
                view.setNama("");
                view.setMerek("");
                
                
            }
            else{
                b.setNmBarang(nama);
                b.setMrkBarang(merek);
                b.setIdBarang(id);
                model.createBarang(nama, merek, id);
//                JOptionPane.showMessageDialog(view," ID Barang "+b.getIdBarang()+" berhasil di update");
                new ControllerPetugas_Menu(model);
                
            }
        }
        else if(source.equals(view.getBtnBack())){
            new ControllerPenyedia_Menu(model);
            view.dispose();
        }
        
        
    }

    @Override
    public void focusGained(FocusEvent e) {
        
    }

    @Override
    public void focusLost(FocusEvent e) {
       Object o = e.getSource();
        if(o.equals(this.view.getTfNama())){
            if(this.view.getTfNama().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Isi Semua Field");
            }
        }
    }
    
}
