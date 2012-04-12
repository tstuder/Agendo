public class Agendo{
	
	public static void main(String[] args) {
		Backend myBackend=new InMemoryBackend();
		
		Frontend myFrontend=new CommandLineFrontend(myBackend);
		
		myFrontend.run();
		
				
		
 }
 
}
