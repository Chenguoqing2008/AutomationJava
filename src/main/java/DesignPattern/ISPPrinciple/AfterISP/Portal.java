package DesignPattern.ISPPrinciple.AfterISP;

 public class Portal implements ICommodityForPortal {
		public String GetCommodity(String Commodity) {
			String a = "查询";
			System.out.println("类Portal实现接口ICommodity的查询方法");
			return a;
		}
	}
