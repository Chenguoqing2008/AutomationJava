package DesignPattern.DecoratorPattern;

public abstract class AbstractPrint extends User {

    protected   User user;

    public AbstractPrint(User user){
        this.user = user;
    }

    public void getUserAlias(){
        System.out.println("You are Mr. Chen");
    }
}
