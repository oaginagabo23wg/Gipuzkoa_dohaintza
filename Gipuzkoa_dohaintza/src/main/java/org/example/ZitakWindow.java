package org.example;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class ZitakWindow extends JFrame {
    private JTable citasTable;
    private DefaultTableModel tableModel;
    JPanel edukia;

    public ZitakWindow() {
        setTitle("Lista de Citas");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla

        edukia = new JPanel();
        add(edukia);


        // Obtener las citas de la base de datos y agregarlas a la tabla
        obtenerCitasDeBD();

        // Hacer visible la ventana
        setVisible(true);
    }

    // Método para obtener las citas de la base de datos y agregarlas a la tabla
    private void obtenerCitasDeBD() {
        String url = "jdbc:oracle:thin:@10.14.4.121:1521:ORCLCDB";
        String user = "janire";
        String password = "zubiri";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection(url, user, password);
            if (conn != null) {
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM administraria");

                // Agregar cada cita a la tabla
                while (resultSet.next()) {
                    int id = resultSet.getInt("id_langilea");
                    String cliente = resultSet.getString("eremua");
                    edukia.add(new JLabel(cliente));
                }
                resultSet.close();
                statement.close();
                conn.close();
            } else {
                System.out.println("Konexioa egiterakoan errore bat egon da.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

