package learnjava;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokeMethod {

	public static void main(String[] args)  {
		/*
		 *  Ҫ��ȡprint(int,int)����
		 *  1.Ҫ��ȡһ���������ǻ�ȡ�����Ϣ����ȡ�����Ϣ����Ҫ��ȡ������
		 */
		
		A a1 = new A();
		Class c = a1.getClass();
		
		/*
		 * 2. ��ȡ�������ƺͲ����б�
		 * getMethod��ȡ����public�ķ���
		 * getDeclaredMethod���Լ������ķ���
		 */
		//c.getMethod(name, parameterTypes);
		//c.getDeclaredMethod(name, parameterTypes);
			Method m;
			try {
				m = c.getMethod("print", int.class,int.class);
				//�����ķ������
				//a1.print(10, 20); �����ķ����������m���������з������ú�a1.print���õ�Ч����һ����
				Object o = m.invoke(a1, new Object[]{10,20});	
				System.out.println("====================================");
				m = c.getMethod("print", String.class,String.class);
				Object o1 = m.invoke(a1, "hello","world");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	}
}

class A{
	
	public void print(int a, int b){
		
		System.out.println(a+b);
	}
	
	public void print(String a,String b){
		
		System.out.println(a.toUpperCase() + "," + b.toLowerCase());
	}
}
