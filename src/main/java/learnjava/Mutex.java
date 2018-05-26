package learnjava;


//public class Mutex extends Thread{
//	
//	private Semaphore mutex;
//	
//	public Mutex(Semaphore mutex,String name){
//		super(name);
//		this.mutex = mutex;
//		start();
//	}
//	
//	public void run(){
//		
//		while(true){
//			
//			System.out.println("Get/Create "+getName());
//			mutex.down();
//			System.out.println("Enter critical section "+getName());
//			try {
//				sleep((int)(Math.random()*1000));
//			} catch (InterruptedException e) {}
//			System.out.println("Leave critical section "+getName());
//			mutex.up();
//			System.out.println("Byebye "+getName());
//		}
//		
//	}
//
//	public static void main(String[] args) {
//		
//		int initialCounter = 5;
//		Semaphore mutexSemaphore = new Semaphore(initialCounter);
//		for (int i = 0; i < 10; i++) {
//			new Mutex(mutexSemaphore, "thread " + i);
//		}
//
//	}
//
//}
