package Shape;

public class Circle extends Shape{
	private final static float pi = 3.14f;
	private float radius;
	public Circle(float[] center, float radius){
		super(center);
		this.radius = radius;
		area = radius * radius*pi;
		this.point = new float[][]{
			{this.center[0]+(float)Math.sqrt(radius), this.center[1]+(float)Math.sqrt(radius)},
			{this.center[0]+(float)Math.sqrt(radius), this.center[1]-(float)Math.sqrt(radius)},
			{this.center[0]-(float)Math.sqrt(radius), this.center[1]+(float)Math.sqrt(radius)},
			{this.center[0]-(float)Math.sqrt(radius), this.center[1]-(float)Math.sqrt(radius)}
		};
		this.Draw();
		System.out.println("�� �����Ǿ����ϴ�.");
	}
	@Override
	public void Draw() {
		super.Draw();
		System.out.print(" ������="+ this.radius +" ����=" + this.area);
	}
}
