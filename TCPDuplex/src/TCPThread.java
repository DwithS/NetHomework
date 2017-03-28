
public class TCPThread extends Thread{
	private static int ID = -1;
	
	private int id = -1;
	public TCPThread(){
		ID++;
		this.id=ID;
	}
	
	public void run(){
		System.out.println("Thread " +id + " Activated");
		
		
		
		System.out.println("Thread " +id + " Deactivated");
	}
}
