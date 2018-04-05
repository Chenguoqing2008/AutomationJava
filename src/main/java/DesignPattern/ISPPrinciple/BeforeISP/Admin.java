package DesignPattern.ISPPrinciple.BeforeISP;

public class Admin implements ICommodity {
	public String GetCommodity(String Commodity) {
		String a = "a1";
		System.out.println("类Admin实现ICommodity的查询方法");
		return a;
	}

	public String Insert(String Insert) {
		String b = "需要";
		System.out.println("类Admin实现ICommodity的插入方法");
		return b;
	}

	public String Update(String Update) {
		String c = "c1";
		System.out.println("类Admin实现ICommodity的修改方法");
		return c;
	}

	public String Delete(String Delete) {
		String d = "Delete";
		System.out.println("类Admin实现ICommodity的删除方法");
		return d;
	}

}
