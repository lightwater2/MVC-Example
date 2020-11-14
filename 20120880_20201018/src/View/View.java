package View;
import Model.List;
//뷰 추상클래스.
public abstract class View {
	// MAIN MENU
	public abstract void MainMenu();
	public abstract void SelectMainMenu();
	
	// INSERT MENU
	public abstract void InsertShapeMenu();
	public abstract char SelectInsertShape();
	public abstract float[] InputShapeCenter();
	public abstract float[] InputShapeLength();
	public abstract float InputShapeRadius();
	
	// UPDATE&DELETE MENU
	public abstract int SelectShape();
	public abstract void UpdateShapeMenu();
	public abstract void DeleteShapeMenu();
	
	// PRINT ALL
	public abstract void PrintAllShape(List list);

	// Boilerplate
	public abstract int getMainMenu();
	public abstract void InsertMessage();
	public abstract void CancelMessage();
	public abstract void ShapeTypeErrorMessage();
	public abstract void ShapeOutOfIndexMessage();
}
