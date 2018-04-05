package DesignPattern.OpenClosePrinciple.huaweioutsourcing;

public class HuaweiPONeed extends OutSourcingMember {

//    String partnerGrade;
//
//    public HuaweiPONeed(String partnerGrade){
//        this.partnerGrade = partnerGrade;
//    }
//
//    public HuaweiPONeed(){
//    }

    @Override
    public void canProgramming() {
        System.out.println("you can programming.");
    }

    @Override
    public void canOverTimeWork() {
        System.out.println("you can endure the overtime work");
    }

    @Override
    public void canEndurePressure() {
        System.out.println("you can work under pressure.");
    }
}
