//Nama: Chairil Fauzi Firmansyah
//NIM: 230401010024
//Kelas; IF503
//Nama Mata Kuliah: Pemrograman Berorientasi Objek

import java.sql.*;
public class JDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/pbo_db";
        String user = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM mahasiswa");
            while (rs.next()) {
                System.out.println("Nama: " + rs.getString("nama"));
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}