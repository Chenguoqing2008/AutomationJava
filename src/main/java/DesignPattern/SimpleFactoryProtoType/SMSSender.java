package DesignPattern.SimpleFactoryProtoType;

public class SMSSender implements Sender {
    @Override
    public void sender() {
        System.out.println("Send SMS message.");
    }
}
