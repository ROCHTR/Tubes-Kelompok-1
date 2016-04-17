/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;

/**
 *
 * @author Aziz
 */
public class ObjectManager {

    private File file = new File("Test.dat");

    public ObjectManager(Object obj)
    {
        //jika file tidak ada
        if (!file.exists())
        {
            try
            {
                //buat file baru
                file.createNewFile();

                //file biar tidak kosong
                if (saveObject(obj))
                {

                }
            } catch (IOException ex)
            {
                ex.printStackTrace();
            }
        }
    }
    public boolean saveObject(Object obj) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream() {
                FileOutputStream fos = new FileOutputStream(file);
            };
            oos.writeObject(obj);
            oos.flush();
            oos.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Object readObject() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            return ois.readObject();

        } catch (EOFException ex) {
            System.out.println("Object Tidak ada !!!");
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
