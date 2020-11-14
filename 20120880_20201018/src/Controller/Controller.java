package Controller;

import View.View;
import Model.List;
import Shape.*;

public class Controller {
	private static View view;
	private static List list;
	
	public Controller(View vi, List lt){
		view = vi;
		list = lt;
	}
	public void SelectMainMenu() {
		view.MainMenu();
		view.SelectMainMenu();
	}
	public boolean ExcuteMainMenu() {
		int mainMenu = view.getMainMenu();
		
		if(mainMenu == 1) 
		{
			Insert();
		}
		else if(mainMenu == 2) 
		{
			Update();
		}
		else if(mainMenu == 3) 
		{
			Delete();
		}
		else if(mainMenu == 4) 
		{
			PrintAll();
		}
		else if(mainMenu == 0)
		{
			return false;
		}
		return true;
	}
	
	// ExcuteMainMenu() branch functions
	private void Insert() {
		view.InsertShapeMenu();
		int insertMenu = view.SelectInsertShape();
		if(insertMenu == 'Q' || insertMenu == 'q') {
			view.CancelMessage();
		}
		else if(insertMenu == 'T' || insertMenu == 't') {
			list.Add(new Triangle(view.InputShapeCenter(), view.InputShapeLength()));
		}
		else if(insertMenu == 'R' || insertMenu == 'r') {
			list.Add(new Rectangle(view.InputShapeCenter(), view.InputShapeLength()));
		}
		else if(insertMenu == 'D' || insertMenu == 'd') {
			list.Add(new Rhombus(view.InputShapeCenter(), view.InputShapeLength()));
		}
		else if(insertMenu == 'C' || insertMenu == 'c') {
			list.Add(new Circle(view.InputShapeCenter(), view.InputShapeRadius()));
		} else {
			view.ShapeTypeErrorMessage();
		}
	}
	private void Update() {
		view.PrintAllShape(list);
		view.UpdateShapeMenu();
		int index = view.SelectShape();
		if(index == -1) {
			return;
		}
		try {
			list.Delete(index);
			this.Insert(); //Delete()와 차이점
		} catch(Exception e) {
			view.ShapeOutOfIndexMessage();
		}
	}
	private void Delete() {
		view.PrintAllShape(list);
		view.DeleteShapeMenu();
		int index = view.SelectShape();
		if(index == -1) {
			return;
		}
		try {
			list.Delete(index);
		} 
		catch(Exception e) {
			view.ShapeOutOfIndexMessage();
		}
	}
	private void PrintAll() {
		view.PrintAllShape(list);
	}
}
