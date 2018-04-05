package DesignPattern.FactoryMethodProtoType;


public class MailFactory implements Provider {

    @Override
    public Sender produce() {
          return new MailSender();
    }
}
