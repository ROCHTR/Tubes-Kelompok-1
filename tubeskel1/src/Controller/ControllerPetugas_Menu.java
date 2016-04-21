/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi2;
import View.Penyedia_Menu;
import View.Petugas_Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 *
 * @author Aziz
 */
public class ControllerPetugas_Menu implements ActionListener {
      Aplikasi2 model;
    Petugas_Menu view;

    public ControllerPetugas_Menu(Aplikasi2 model) {
        this.model = model;
        view = new Petugas_Menu();
        view.setVisible(true);
        view.addListener(this);
//        view.addAdapter(this);
//        view.setListId(model.getListIdPelanggan());
    }

    @Override
   
         

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnTambah())) {
          //  new ControllerInputPelanggan(model);
           view.dispose();
        } else if (source.equals(view.getBtnHapus())) {
           // new ControllerInputPelanggan(model);
           view.dispose();

        } else {
            view.dispose();
        }
    }

    
}
