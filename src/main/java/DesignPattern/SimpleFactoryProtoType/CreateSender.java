package DesignPattern.SimpleFactoryProtoType;

public class CreateSender {
    public static void main(String[] args){
        SenderFactory senderFactory = new SenderFactory();
        Sender sender = senderFactory.produceSender("sms");
        sender.sender();
    }
}
