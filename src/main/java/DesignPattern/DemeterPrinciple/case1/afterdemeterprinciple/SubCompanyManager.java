package DesignPattern.DemeterPrinciple.case1.afterdemeterprinciple;

import java.util.ArrayList;
import java.util.List;

public class SubCompanyManager {

    public List<SubEmployee> SubCompanyManager() {

        List<SubEmployee> subCompanyEmpolyeeList = new ArrayList<>();

        for (int i = 11; i < 20; i++) {
            SubEmployee subEmployee = new SubEmployee();
            subEmployee.setID(i);
            subCompanyEmpolyeeList.add(subEmployee);
        }
        return  subCompanyEmpolyeeList;
    }

    public  void printAllSubCompanyEmployee(List<SubEmployee> subEmployeeList){

        for (SubEmployee subEmployee:subEmployeeList)
        {
            System.out.println("SubCompany employee list is: " + subEmployee.getID());
        }
    }

}
