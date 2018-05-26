package learnjava;

import java.lang.reflect.Method;

public class ClassUtil {

	  /*
	   * ��ȡclass���API
	   * ���������Ϣ��������ĳ�Ա��������Ա����
	   * @param obj�ö������������Ϣ
	   */
   
	public static void printClassMessage(Object obj){
		
		//����ȡ�����Ϣ ����Ҫ��ȡ���������
		
		Class c = obj.getClass(); //��������Ǹ�����Ķ���c���Ǹ������������
		
		//��ȡ�������
		System.out.println("��������ǣ� "+c.getName());
		
		/*
		 * Method�࣬��������
		 * һ����Ա��������һ��Method����
		 * getMethods()������ȡ�������е�public�ĺ�������������̳ж�����
		 * getDeclaredMethods()��ȡ�ǵ����и����Լ������ķ��������ʷ���Ȩ��
		 */
		Method[] msMethods = c.getMethods();
		//c.getDeclaredMethods();
		for (int i = 0; i < msMethods.length; i++) {
			//�õ�����ֵ���͵�������
			Class returnTypeClass = msMethods[i].getReturnType();
			System.out.println(returnTypeClass.getName() + " ");
			//�õ���������
			System.out.print(msMethods[i].getName() + "(");
			//��ȡ���������� -->�õ����ǲ����б�����͵�������
			Class[] paramType = msMethods[i].getParameterTypes();
			for (Class class1:paramType) {
				System.out.print(class1.getName()+",");
			}
			System.out.print(" )");
		}
	}
	
}
