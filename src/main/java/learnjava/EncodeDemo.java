package learnjava;

public class EncodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String demoString = "�����ı�ABC";
		 byte[] byts = demoString.getBytes();
		 for (byte bit:byts) {
			System.out.print(Integer.toHexString(bit & 0xff) + " "); 
			
		}
	}

}
