import java.util.HashMap;


public class InMemoryBackend implements Backend{

	HashMap tasks;
		
	public String[] listTasks() {
		//Writeing the code to actually return a list of all the tasks
		return null;
	}

	public void addTask(String text, String date) {
		tasks.put(text, date);
		
		//Writethe code to add a task
	}

	public void delTask(int index) {
		//Write code to actually delete a task
	}

}
