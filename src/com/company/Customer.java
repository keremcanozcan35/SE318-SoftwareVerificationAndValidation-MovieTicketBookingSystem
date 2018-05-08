package com.company;

import java.sql.*;
import java.util.List;

public class Customer {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://80.211.16.77/movie";

    //  Database credentials
    static final String USER = "movieuser";
    static final String PASS = "-";

    public void Payment() {
        //TODO: Payment tablosunun içinde film adı uyuşan bütün girdilerinin koltuk numaralarını topla(while rs.next)
        //TODO: 5 ten büyük ve 10dan küçükse array2 ye at,0 ile 5 arasındaysa array1 olcak, koltuğu numarasını ait oldugu arraydaki alt çizgiyi X ile replace edilcek.
        //TODO: bütün arrayleri alt altta listele
        System.out.println("Please choose your seat!");
        //TODO: seati database payment tablosunun koltuk şeyini hazırla(Kredi kartını almadan hazırlama)
        System.out.println("Credit card number: ");
        System.out.println("Expired date of your card: ");
        System.out.println("CCV: ");
        //TODO: payment tablosunun içinde kullanıcının adına eşit olduğu rowlardaki film adı ve koltuk numarasını çek

    }

    public void listFilms() {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Connection");
        } catch (Exception ex) {
        }
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            String query = "SELECT * FROM Movies";
            Statement stmt2 = conn.createStatement();
            ResultSet rs = stmt2.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("Name");
                String type = rs.getString("Type");
                String duration = rs.getString("Duration");
                String director = rs.getString("Director");
                String imdb = rs.getString("IMDB");
                String description = rs.getString("Description");
                System.out.println("ID: " + id + "\n" + "Name: " + name + "\n" + "Type: " + type + "\n" + "Duration: " + duration + "\n" + "Director: " + director + "\n" + "IMDB: " + imdb + "\n" + "Description: " + description);
                System.out.println("----------------------------------------------------");
            }

        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        System.out.println("\n\n");
    }
}
