package DesignPattern.IOCPrinciple;

public class EmployeeFamily implements Employee {

    @Override
    public void doCoding(Coder coder) {
        coder.runProgram();
    }

    public static void main(String[] args){

        EmployeeFamily employeeFamily = new EmployeeFamily();
        JuniorProgrammer juniorProgrammer = new JuniorProgrammer();
        SeniorProgrammer seniorProgrammer = new SeniorProgrammer();
        employeeFamily.doCoding(juniorProgrammer);
        employeeFamily.doCoding(seniorProgrammer);

    }
}
