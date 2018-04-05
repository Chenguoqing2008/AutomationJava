package DesignPattern.ISPPrinciple.BeforeISP;

public  class Portal implements ICommodity {
	public String GetCommodity(String Commodity) {
		String a = "xx";
		System.out.println("类Portal实现接口ICommodity的查询方法");
		return a;
	}
	//对于类Portal来说，Insert\Update\Delete不是必需的，但是由于接口ICommodity中有这3个方法，
	//所以在实现过程中即使这3个方法的方法体为空，也要将这3个没有作用的方法进行实现。
	public String Insert(String Insert) {
		String b = "不需要";
		System.out.println("类Portal不需要插入方法");
		return b;
	}
	public String Update(String Update) {
		String c = "null";
		System.out.println("类Portal不需要修改方法");
		return c;
	}
	public String Delete(String Delete) {
		String d="null";
		System.out.println("类Portal不需要删除方法");
		return d;
	}
}