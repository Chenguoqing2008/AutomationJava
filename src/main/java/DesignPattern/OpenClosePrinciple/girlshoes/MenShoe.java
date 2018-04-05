package DesignPattern.OpenClosePrinciple.girlshoes;

public class MenShoe implements IShoe
{
		  private String name;
		  private String type;
		  private int value;
		public  MenShoe(String name1,String type1,int value1)
		{
		   this.name = name1;
           this.type = type1;
           this.value = value1;
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
