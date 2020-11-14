package Model;
//Model 추상클래스
import Shape.Shape;
public abstract class List {
	public List() {};
	
	public abstract void Add(Shape shape);
	public abstract void Delete(int index) throws Exception;
	
	public abstract Shape getList(int index);
	public abstract int getCount();
}