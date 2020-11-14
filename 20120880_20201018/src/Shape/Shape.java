package Shape;

public abstract class Shape {
	protected float[][] point;
	protected float[] center;
	protected float area;
	protected Shape() {
		center = new float[2];
	}
	protected Shape(float[] center){
		this.center = center;
		area = 0;
	}
	public void Draw() {
		System.out.print("<" + this.getClass().getSimpleName() + ">");
		System.out.print(" 중심=("+ this.center[0] +", "+ this.center[1] + ")");
	}
	public void PointDraw() {
		System.out.print(" -> 꼭지점은 ");
		for(int i=0;i<point.length;i++)
		{
			System.out.print("(" + point[i][0] + ", " + point[i][1] + ") ");
		}
		System.out.print("\n");
	}
	public float getArea() { return area; }
}
