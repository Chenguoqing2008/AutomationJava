package DesignPattern.DemeterPrinciple.case1.beforedemeterprinciple;

public class AllCompanyInfo {


    public static void main(String[] args){
        CompanyManager companyManager = new CompanyManager();
        companyManager.printAllEmployee(new SubCompanyManager());

    }
}
