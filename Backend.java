
public interface Backend {

	String[] listTasks();
	void addTask(String text, String date);
	void delTask(int index);
}
