import java.util.*;

class Employee {
    int empId;
    String designation;
    Map<Integer, String> map;

    Employee(int empId, String designation) {
        this.empId = empId;
        this.designation = designation;
        map = new HashMap<>();
    }

    public void addEmployee(int empId, String designation) {
        map.put(empId, designation);
    }

    public void updateDesignation(int employeeID, String newDesignation) {
        map.put(employeeID, newDesignation);
    }
}

class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee(0, "");
        while (sc.hasNext()) {
            String command = sc.next();
            if (command.equals("A")) {
                int employeeID = sc.nextInt();
                String designation = sc.next();
                emp.addEmployee(employeeID, designation);
            } else if (command.equals("U")) {
                int employeeID = sc.nextInt();
                String newDesignation = sc.next();
                emp.updateDesignation(employeeID, newDesignation);
                System.out.println(employeeID + " " + newDesignation);
            }
        }

        sc.close();
    }
}