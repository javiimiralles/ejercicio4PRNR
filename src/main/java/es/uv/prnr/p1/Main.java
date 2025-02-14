package es.uv.prnr.p1;

import java.sql.Connection;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee(1, "Edgar", "Cood", LocalDate.of(1923,8,19), LocalDate.now(), Employee.Gender.M);
        Connection conn = DatabaseConnector.connect();
        DatabaseOperations.insertEmployee(conn, e);
        //DatabaseOperations.setFirstName("Edgar F.");
		//DatabaseOperations.updateEmployeeFirstName(e);
		//DatabaseOperations.deleteEmployee(e);
		//DatabaseOperations.getEmployeesByTitle("Engineer");
		//DatabaseOperations.getDepartmentManagers("Development");
    }

  
}