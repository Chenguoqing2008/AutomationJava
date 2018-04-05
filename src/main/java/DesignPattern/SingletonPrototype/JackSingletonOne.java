package DesignPattern.SingletonPrototype;

/*����ʽ������*/
public class JackSingletonOne {
	private static JackSingletonOne lazySingleton = null;

	private JackSingletonOne() {
	}

	synchronized public static JackSingletonOne getInstance() {
		if (lazySingleton == null) {
			lazySingleton = new JackSingletonOne();
		}
		return lazySingleton;
	}
}
