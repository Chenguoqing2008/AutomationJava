package DesignPattern.OpenClosePrinciple.girlshoes;

public class GirlShoe implements IShoe {
	  private String name;
	  private String type;
	  private int value;
	public  GirlShoe(String name2,String type2,int value2)
	{
	   this.name = name2;
     this.type = type2;
     this.value = value2;
	}
	public String getName() {
		return this.name;
	}
	public String getType() {
		return this.type;
	}
	public int getValue() {
		 return this.value;
	}
}
