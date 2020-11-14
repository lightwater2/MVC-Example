package Shape;

public class Rhombus extends Shape {
	private float height;
	private float width;
	public Rhombus(float[] center, float[] length){
		super(center);
		this.height = length[0];
		this.width = length[1];
		this.area = this.height * this.width/2;
		this.point = new float[][]{
			{this.center[0]+this.width/2, this.center[1]},
			{this.center[0], this.center[1]+this.height/2},
			{this.center[0]-this.width/2, this.center[1]},
			{this.center[0], this.center[1]-this.height/2}
		};
		this.Draw();
		System.out.println("�� �����Ǿ����ϴ�.");
	}
	@Override
	public void Draw() {
		super.Draw();
		System.out.print(" ����="+ this.height +" �ʺ�=" + this.width +" ����=" + this.area);	
	}
}
