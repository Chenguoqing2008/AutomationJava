package DesignPattern.DemeterPrinciple.case1.beforedemeterprinciple;

import java.util.ArrayList;
import java.util.List;

public class CompanyManager {

    public List<Employee> getAllEmployee() {

        List<Employee> companyEmpolyeeList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Employee employee = new Employee();
            employee.setID(i);
            companyEmpolyeeList.add(employee);
        }

        return companyEmpolyeeList;
    }

    public void printAllEmployee(SubCompanyManager subCompanyManager){

        List<SubEmployee> subEmployeeList = subCompanyManager.SubCompanyManager();
        for (SubEmployee subEmployee:subEmployeeList)
        {
            System.out.println("SubCompany employee list is: " + subEmployee.getID());
        }

        List<Employee> employeeList = this.getAllEmployee();
        for (Employee employee:employeeList)
        {
            System.out.println("Company employee list is: " + employee.getID());
        }

      }

}
