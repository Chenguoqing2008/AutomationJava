package DesignPattern.FactoryMethodProtoType;

public class FactoryMethodCreator {

    public  static void main(String[] args){
          MailFactory mailFactory = new MailFactory();
          Sender mailsender = mailFactory.produce();
          mailsender.sender();
    }
}
