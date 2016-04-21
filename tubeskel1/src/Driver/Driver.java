 package Driver;


import Controller.ControllerAwal;
import Controller.ControllerPenyedia_Menu;
import Controller.ControllerPetugas_Menu;
import Model.Aplikasi2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aziz
 */
public class Driver {
    public static void main(String[] args) {
         Aplikasi2 app = new Aplikasi2();
         ControllerAwal test = new ControllerAwal(app);
    }

}
