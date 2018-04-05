package DesignPattern.DecoratorPattern;

public class PrintWord extends AbstractPrint {

    public PrintWord(User user) {
        super(user);
    }

    public void editWord(){
        user.print();
        System.out.println("You are editing word.");
    }

    public static void main(String[] args){
        User printUser = new PrintUser();
        PrintWord printword = new PrintWord(printUser);

        printword.editWord();
        printword.getUserAlias();

    }
}
