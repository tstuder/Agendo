
public class CommandLineFrontend implements Frontend{
	
	Backend backend;
	
	public CommandLineFrontend(Backend myBackend) {
		// TODO Auto-generated constructor stub
		this.backend=myBackend;
	}

	@Override
	public void run() {
		//Write code that keeps looping (for/while loop)
		//Prompt -- "What do you want to do (add, del, list)"
		// If they typed add then
			//ASking the user to type in a task description and a due date

	 System.out.print("Enter your name and press Enter: ");
	 
		//String text=prompt("Please describe the task");
		//String date=prompt("What date is it due?:");
				
	
		//this.backend.addTask(text, date);
		
		// If they typed del then
			//Ask what task to del
		// If they type list then
			//list all tasks
		
	}
	
}
