package es.uv.prnr.p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseOperations {
    //TODO insertar
    public static void insertEmployee(Connection con, Employee e) {
	
    }
    
//TODO modificar
public static void updateEmployeeFirstName(Connection con, Employee e) {
	
}

//TODO eliminar
public static void deleteEmployee(Connection con, Employee e) {

}

//TODO consulta 1
public static void getEmployeesByTitle(Connection con, String title) {
    
}

//TODO consulta 2
public static void getDepartmentManagers(Connection con, String department ) {

}
  
  //Metodo para imprimir n items de un Result Set
 /*  private static void printResultSet(ResultSet rs, int items) throws SQLException {
    ResultSetMetaData rsmd = rs.getMetaData();
    int columnsNumber = rsmd.getColumnCount();
    int rows = 0; 
    while (rs.next() && items > rows) {
        rows ++;
        System.out.print("Row " + rows + ": ");
        for (int i = 1; i <= columnsNumber; i++) {
            if (i > 1) System.out.print(", ");
            String columnValue = rs.getString(i);
            System.out.print(rsmd.getColumnName(i) + " " + columnValue);
        }
        System.out.println("");
    }
}*/
	
}
