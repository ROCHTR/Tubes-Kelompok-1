/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi2;
import View.Awal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Aziz
 */
public class ControllerAwal implements ActionListener {

    Aplikasi2 model;
    Awal view;

    public ControllerAwal(Aplikasi2 model) {
        this.model = model;
        view = new Awal();
        view.setVisible(true);
        view.addListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnPetugas())) {
            new ControllerPetugas_Menu(model);
            view.dispose();
        } else if (source.equals(view.getBtnPetugas())) {
           
            new ControllerPenyedia_Menu(model);
            view.dispose();
        }
    }

}

