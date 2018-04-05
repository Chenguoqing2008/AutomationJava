package DesignPattern.FactoryMethodProtoType;


public class SMSFactory implements Provider {
    @Override
    public Sender produce() {
        return new SMSSender();
    }
}
