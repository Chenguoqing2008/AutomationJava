package DesignPattern.FactoryMethodProtoType.case1;

/**  
 *
 * @author jianghc  
 *   
*/  
public class Client {   


   public static void main(String[] args) {   
  
        IMachineFactory factory=new BecilityFactory();   
       XiaoMing becility=factory.CreateXiaoMing();   
       becility.SkillOne();   
       becility.SkillTwo();   
       //becility.Industry();             
      IMachineFactory factory2=new IndustryFactory();   
       XiaoMing industry=factory2.CreateXiaoMing();   
      // industry.SkillOne();   
     //  industry.SkillTwo();   
       industry.Industry();  
   }   
 }  