package DesignPattern.ISPPrinciple.AfterISP;

public class Admin implements ICommodityForAdmin {
	public String GetCommodity(String Commodity) {
		String a = "查询";
		System.out.println("类Admin实现接口ICommodity的查询方法");
		return a;
	}
	public String Insert(String Insert) {
		String b = "插入";
		System.out.println("类Admin实现接口ICommodity的插入方法");
		return b;
	}
	public String Update(String Update) {
		String c = "修改";
		System.out.println("类Admin实现接口ICommodity的修改方法");
		return c;
	}
	public String Delete(String Delete) {
		String d = "删除";
		System.out.println("类Admin实现接口ICommodity的删除方法");
		return d;
	}
	}
