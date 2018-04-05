package DesignPattern.SimpleFactoryProtoType.MultipleMethod;

import DesignPattern.SimpleFactoryProtoType.Sender;

public class CreateSenderMultipleMethod {

    public  static void main(String[] args){
        SenderFactory senderFactory = new SenderFactory();
        Sender sender = senderFactory.createMailSender();
        sender.sender();
    }
}
