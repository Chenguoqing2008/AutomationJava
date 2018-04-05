package DesignPattern.FactoryMethodProtoType.case1;

public class IndustryFactory implements IMachineFactory {   
//  @Override  
	   public XiaoMing CreateXiaoMing() {   
	       return new Industry();   
	    }   
	 
	}  
