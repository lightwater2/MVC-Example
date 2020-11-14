package View;

import java.util.InputMismatchException;
import java.util.Scanner;

import Model.List;
//�並 ��ӹ޾� �̸� ��üȭ
public class ConsoleView extends View{
	
	private static final Scanner sc = new Scanner(System.in);
	
	private static int mainMenu;
	
	// MAIN MENU	
	@Override
	public void MainMenu() {
		System.out.println("\n[1] ���� �߰� [2] ���� ���� [3] ���� ���� [4] ���� ��ü ��� [0] ���� ");
		System.out.print("���ϴ� ����� �����ϼ��� : ");
	}
	@Override
	public void SelectMainMenu() {
		try {
			mainMenu = sc.nextInt();
			if(mainMenu < 0 || 4 < mainMenu ) throw new Exception();
		} catch(InputMismatchException e) {
			System.out.print("�޴��� ���ڷ� �Է����ּ���.");
			sc.next();
		}catch (Exception e) {
			System.out.print("���� �޴��Դϴ�.");
		}
	}
	
	// INSERT MENU
	@Override
	public void InsertShapeMenu() {
		System.out.println("*** ���� �߰� ***");
		System.out.println("[T] �̵�ﰢ�� [R] ���簢�� [D] ������ [C] �� [Q] ���");
		System.out.print("�߰��� ������ �����ϼ��� : ");
	}
	@Override
	public char SelectInsertShape() {
		char ch = sc.next().charAt(0);
		return ch;
	}
	@Override
	public float[] InputShapeCenter() {
		float[] center = new float[2];
		System.out.println("�߽����� ���� �� ���� ������ �Է��ϼ��� ��)0 0 : ");
		center[0] = sc.nextInt();
		center[1] = sc.nextInt();
		return center;
	}
	@Override
	public float[] InputShapeLength() {
		float[] length = new float[2];
		System.out.println("���̿� �ʺ� ���� �� ���� ������ �Է��ϼ��� ��)0 0 : ");
		length[0] = sc.nextInt();
		length[1] = sc.nextInt();
		return length;
	}
	@Override
	public float InputShapeRadius() {
		System.out.println("�������� ���� ���� �ϳ��� �Է��ϼ��� : ");
		return sc.nextInt();
	}
	@Override
	public void InsertMessage() {
		System.out.println("�� �߰��Ǿ����ϴ�.");
	}
	// UPDATE & DELETE MENU
	@Override
	public int SelectShape() {
		int index = -1;
		try {
			  index = sc.nextInt()-1;
		} catch(InputMismatchException e) {
			System.out.print("������ ������ ��ȣ�� �Է��ؾ� �մϴ�.");
			sc.next();
		}
		return index;
	}
	@Override
	public void UpdateShapeMenu() {
		System.out.println("*** ���� ���� ***");
		System.out.println("�� ��Ͽ��� �����ϰ��� �ϴ� ���� ��ȣ�� �����ϼ��� (0�� ���) : ");
		
	}
	
	@Override
	public void DeleteShapeMenu() {
		System.out.println("*** ���� ���� ***");
		System.out.println("�� ��Ͽ��� �����ϰ��� �ϴ� ���� ��ȣ�� �����ϼ��� (0�� ���) : ");
	}
	
	// PRINT ALL
	@Override
	public void PrintAllShape(List list) {
		System.out.println("*** ��ü ����(���� ��������) ***");
		for(int i=0;i<list.getCount();i++) {
			System.out.print("["+ (i+1) + "] ");
			list.getList(i).Draw();
			list.getList(i).PointDraw();
		}
	}
	
	// Boilerplate
	@Override
	public int getMainMenu() {
		return mainMenu;
	}
	@Override
	public void CancelMessage() {
		System.out.println("��ҵǾ����ϴ�.");
	}
	@Override
	public void ShapeTypeErrorMessage() {
		System.out.println("���� �Է��� �߸��Ǿ����ϴ�.");
	}
	@Override
	public void ShapeOutOfIndexMessage() {
		System.out.println("��ȣ�� �ش��ϴ� ������ �����ϴ�.");
	}
}
