package DesignPattern.OpenClosePrinciple.huaweioutsourcing;

public class CommonPartner extends HuaweiPONeed {

    private String PartnerPO;

    public CommonPartner(HuaweiPONeedAbility huaweiPONeedAbility) {
        super();
        this.PartnerPO = huaweiPONeedAbility.getSpecialAbility();
    }

    public void getConsultantPartnerAnnouncement(){
        System.out.println("I am consultant, i can handle tricky problems.");
    }
}
