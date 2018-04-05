package DesignPattern.FactoryMethodProtoType;

public class SMSSender implements Sender {
    @Override
    public void sender() {
        System.out.println("Send sms message.");
    }
}
