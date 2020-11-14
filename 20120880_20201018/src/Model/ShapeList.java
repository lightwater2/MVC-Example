package Model;

import java.util.ArrayList;
import Shape.Shape;

public class ShapeList extends List{
	private static ArrayList<Shape> list;
	public ShapeList() {
		super();
		list = new ArrayList<Shape>();
	}
	@Override
	public void Add(Shape shape) { //insertSortedAdd
		if(list.size() == 0) {
			list.add(shape);
			return;
		}
		for(int i=0;i<list.size();i++) 
		{	
			if( list.get(i).getArea() > shape.getArea() ) 
			{
				list.add(i, shape);
				return;
			} 
			else if(list.size()-i == 1) 
			{
				list.add(shape);
				return;
			}
		}
	};
	@Override
	public void Delete(int index) throws Exception {
		try {
			list.get(index);
			list.remove(index);
		}
		catch(IndexOutOfBoundsException e) {
			throw new Exception();
		}
	};
	@Override
	public Shape getList(int index) {
		return list.get(index);
	}
	@Override
	public int getCount() {
		return list.size();
	}
}
