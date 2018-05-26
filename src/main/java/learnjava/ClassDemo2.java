package learnjava;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ClassDemo2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Class c1 = int.class ;//int��������
        Class c2 = String.class; // String��������ͣ�
        Class c3 = Double.class;
        Class c4 = Void.class;
        
        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c3.getSimpleName());
        System.out.println(c4.getName());
        
      
                
	}

}
