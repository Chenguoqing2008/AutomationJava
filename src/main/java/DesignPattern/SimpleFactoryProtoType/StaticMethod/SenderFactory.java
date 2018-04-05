package DesignPattern.SimpleFactoryProtoType.StaticMethod;


import DesignPattern.SimpleFactoryProtoType.MailSender;
import DesignPattern.SimpleFactoryProtoType.SMSSender;
import DesignPattern.SimpleFactoryProtoType.Sender;

public class SenderFactory {

    public static Sender createSmsSender(){
        return new SMSSender();
    }

    public static Sender createMailSender(){
        return new MailSender();
    }
}
