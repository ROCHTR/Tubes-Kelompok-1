/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Model.Barang;
import Model.Orang;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Aziz
 */
public class Database {

    private String server = "jdbc:mysql://localhost:3306/dbtubes", dbuser = "root", dbpass = "";
    private Statement st;
    private Connection con;

    public void connect() {
        try {
            con = DriverManager.getConnection(server, dbuser, dbpass);
            st = con.createStatement();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void saveBarang(Barang b) {
        try {
            String query = "";
            st.execute(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = st.getGeneratedKeys();
            int generatedId = -1;
            if (rs.next()) {
                generatedId = rs.getInt(1);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Barang getBarang(int idBarang) {
        Barang b = null;
        try {
            String query = "";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                b = new Barang(rs.getString(1), rs.getString(1), rs.getLong(3), rs.getInt(4));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return b;
    }

    public void updateBarang(Barang b) {
        try {
            String query = "";
            st.executeQuery(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public String[] getListIDBarang(){
        ArrayList<String> listId = new ArrayList<>();
        try {
            String query = "";
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                listId.add(rs.getString(1));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return listId.toArray(new String[0]);
    }
}
