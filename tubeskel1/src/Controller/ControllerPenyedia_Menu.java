/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.Aplikasi2;
import View.Penyedia_Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 *
 * @author Aziz
 */
public class ControllerPenyedia_Menu implements ActionListener, FocusListener {

    Aplikasi2 model;
    Penyedia_Menu view;

    public ControllerPenyedia_Menu(Aplikasi2 model) {
        this.model = model;
        view = new Penyedia_Menu();
        view.setVisible(true);
        view.addListener(this);
//        view.addAdapter(this);
//        view.setListId(model.getListIdPelanggan());
    }

    @Override
   
         

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnCreate())) {
            new ControllerPenyedia_Create(model, model.getPenyedia1());
           view.dispose();
        } else if (source.equals(view.getBtnHapus())) {
           // new ControllerInputPelanggan(model);
           view.dispose();

        } else {
            view.dispose();
        }
    }


@Override
        public void focusGained(FocusEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
        public void focusLost(FocusEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
