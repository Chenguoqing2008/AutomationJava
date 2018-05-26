package learnjava;



//public class Semaphore {
//	
//	int counter = 0;
////	
//	public Semaphore(int init){
//		 
//		this.counter = init;	
//	}
//	
//	public synchronized void down() {
//		
//		while(counter == 0){
//			try {
//				wait();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		counter--;
//	}
//
//	public synchronized void up(){
//		
//		counter++;
//		notify();
//	}
//}
