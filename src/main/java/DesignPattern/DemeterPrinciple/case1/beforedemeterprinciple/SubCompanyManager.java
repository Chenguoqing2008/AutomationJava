package DesignPattern.DemeterPrinciple.case1.beforedemeterprinciple;

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

}
