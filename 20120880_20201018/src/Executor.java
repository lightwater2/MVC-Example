import Controller.Controller;
import View.ConsoleView;
import Model.ShapeList;
public class Executor {
	// Model-View-Controller initialization
	private static ShapeList list = new ShapeList();
	private static ConsoleView view = new ConsoleView();
	private static Controller controller = new Controller(view, list);
	public static void main(String args[]) {
		boolean repeat = true;
		while(repeat) {
			controller.SelectMainMenu();
			repeat = controller.ExcuteMainMenu();
		}
	}
}