package DesignPattern.OpenClosePrinciple.huaweioutsourcing;

public class ConsultantPartner extends HuaweiPONeed {

    public static final String PartnerPO = "ConsultantPartner";

    public ConsultantPartner() {
        super();
    }

    public void getConsultantPartnerAnnouncement(){
        System.out.println("I am consultant, i can handle tricky problems.");
    }
}
