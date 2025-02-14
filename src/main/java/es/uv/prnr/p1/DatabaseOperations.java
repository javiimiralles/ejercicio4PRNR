package es.uv.prnr.p1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


public class DatabaseOperations {

    public static void insertEmployee(Connection con, Employee e) {
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO employees VALUES (?, ?, ?, ?, ?, ?)");
            stmt.setInt(1, e.getId());
            stmt.setDate(2, Date.valueOf(e.getBirthDate()));
            stmt.setString(3, e.getFirstName());
            stmt.setString(4, e.getLastName());
            stmt.setString(5, e.getGender().toString());
            stmt.setDate(6, Date.valueOf(e.getHireDate()));
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    // TODO modificar
    public static void updateEmployeeFirstName(Connection con, Employee e) {

    }

    // TODO eliminar
    public static void deleteEmployee(Connection con, Employee e) {

    }

    // TODO consulta 1
    public static void getEmployeesByTitle(Connection con, String title) {

    }

    // TODO consulta 2
    public static void getDepartmentManagers(Connection con, String department) {

    }

    // Metodo para imprimir n items de un Result Set
    private static void printResultSet(ResultSet rs, int items) throws SQLException {
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnsNumber = rsmd.getColumnCount();
        int rows = 0;
        while (rs.next() && items > rows) {
            rows++;
            System.out.print("Row " + rows + ": ");
            for (int i = 1; i <= columnsNumber; i++) {
                if (i > 1)
                    System.out.print(", ");
                String columnValue = rs.getString(i);
                System.out.print(rsmd.getColumnName(i) + " " + columnValue);
            }
            System.out.println("");
        }
    }

}
