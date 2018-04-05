package DesignPattern.FactoryMethodProtoType;

public class MailSender implements Sender {
    @Override
    public void sender() {
        System.out.println("Send mail message.");
    }
}
