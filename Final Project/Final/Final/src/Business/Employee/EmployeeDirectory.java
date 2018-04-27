/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Organization.Organization;
import java.util.ArrayList;

/**
 *
 * @author Hello
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name, Organization organization){
        Employee employee = new Employee();
        employee.setName(name);
        employee.setOrganization(organization);
        employeeList.add(employee);
        return employee;
    }
    
    
    public void deleteEmployee(Employee e) {
        employeeList.remove(e);
    }
}