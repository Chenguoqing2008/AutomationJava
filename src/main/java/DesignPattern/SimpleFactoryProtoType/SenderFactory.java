package DesignPattern.SimpleFactoryProtoType;

public class SenderFactory {

    public Sender produceSender(String type){

        if(type.equals("mail")){
            return new MailSender();
        }
        else if(type.equals("sms")){
            return new SMSSender();
        }else {
            System.out.println("请输入正确的类型。");
            return null;
        }
    }
}
