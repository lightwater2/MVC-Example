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
		System.out.println("가 생성되었습니다.");
	}
	@Override
	public void Draw() {
		super.Draw();
		System.out.print(" 반지름="+ this.radius +" 면적=" + this.area);
	}
}
