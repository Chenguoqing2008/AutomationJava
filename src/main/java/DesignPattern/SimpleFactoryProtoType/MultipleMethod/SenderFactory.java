package DesignPattern.SimpleFactoryProtoType.MultipleMethod;

import DesignPattern.SimpleFactoryProtoType.MailSender;
import DesignPattern.SimpleFactoryProtoType.SMSSender;
import DesignPattern.SimpleFactoryProtoType.Sender;

public class SenderFactory {

    public Sender createSmsSender(){
        return new SMSSender();
    }

    public Sender createMailSender(){
        return new MailSender();
    }
}
