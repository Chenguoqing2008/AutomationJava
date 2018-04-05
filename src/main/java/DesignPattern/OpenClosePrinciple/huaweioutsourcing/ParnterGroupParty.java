package DesignPattern.OpenClosePrinciple.huaweioutsourcing;

public class ParnterGroupParty implements OutSourcingEmployee {


    @Override
    public OutSourcingMember basicRequirement(HuaweiPONeedAbility huaweiPONeedAbility) {

        OutSourcingMember  partner = null;

        if(huaweiPONeedAbility.getSpecialAbility().equals("CommonPartner")){
            partner =new CommonPartner(huaweiPONeedAbility);
        }
//        if(huaweiPONeed.partnerGrade.equals("ConsultantPartner")){
//            partner = new ConsultantPartner();
//        }

        return partner;
    }

    public static void main(String[] args){

        ParnterGroupParty parnterGroupParty = new ParnterGroupParty();
        CommonPartner outSourcingMember = (CommonPartner) parnterGroupParty.basicRequirement(()-> "CommonPartner");
        outSourcingMember.getConsultantPartnerAnnouncement();
        outSourcingMember.canEndurePressure();
        outSourcingMember.canOverTimeWork();
        outSourcingMember.canProgramming();

    }
}
