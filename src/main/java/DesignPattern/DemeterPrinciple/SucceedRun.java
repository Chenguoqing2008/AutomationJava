package DesignPattern.DemeterPrinciple;

public class SucceedRun {
    public static void main(String[] args) 
    {   
        SomeMan jack = new SomeMan();   
        jack.setLinkMan(new LinkMan());   
        jack.getLinkMan().playWithSomeGirl();   
    }   
}  
