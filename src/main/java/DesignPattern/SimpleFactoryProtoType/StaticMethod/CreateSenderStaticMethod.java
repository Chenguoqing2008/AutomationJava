package DesignPattern.SimpleFactoryProtoType.StaticMethod;

import DesignPattern.SimpleFactoryProtoType.Sender;

public class CreateSenderStaticMethod {

    public  static void main(String[] args){
        Sender sender = SenderFactory.createMailSender();
        sender.sender();
    }
}
