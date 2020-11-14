package View;

import java.util.InputMismatchException;
import java.util.Scanner;

import Model.List;
//뷰를 상속받아 이를 실체화
public class ConsoleView extends View{
	
	private static final Scanner sc = new Scanner(System.in);
	
	private static int mainMenu;
	
	// MAIN MENU	
	@Override
	public void MainMenu() {
		System.out.println("\n[1] 도형 추가 [2] 도형 변경 [3] 도형 삭제 [4] 도형 전체 출력 [0] 종료 ");
		System.out.print("원하는 기능을 선택하세요 : ");
	}
	@Override
	public void SelectMainMenu() {
		try {
			mainMenu = sc.nextInt();
			if(mainMenu < 0 || 4 < mainMenu ) throw new Exception();
		} catch(InputMismatchException e) {
			System.out.print("메뉴를 숫자로 입력해주세요.");
			sc.next();
		}catch (Exception e) {
			System.out.print("없는 메뉴입니다.");
		}
	}
	
	// INSERT MENU
	@Override
	public void InsertShapeMenu() {
		System.out.println("*** 도형 추가 ***");
		System.out.println("[T] 이등변삼각형 [R] 직사각형 [D] 마름모 [C] 원 [Q] 취소");
		System.out.print("추가할 도형을 선택하세요 : ");
	}
	@Override
	public char SelectInsertShape() {
		char ch = sc.next().charAt(0);
		return ch;
	}
	@Override
	public float[] InputShapeCenter() {
		float[] center = new float[2];
		System.out.println("중심점을 위한 두 개의 정수를 입력하세요 예)0 0 : ");
		center[0] = sc.nextInt();
		center[1] = sc.nextInt();
		return center;
	}
	@Override
	public float[] InputShapeLength() {
		float[] length = new float[2];
		System.out.println("높이와 너비를 위한 두 개의 정수를 입력하세요 예)0 0 : ");
		length[0] = sc.nextInt();
		length[1] = sc.nextInt();
		return length;
	}
	@Override
	public float InputShapeRadius() {
		System.out.println("반지름을 위한 정수 하나를 입력하세요 : ");
		return sc.nextInt();
	}
	@Override
	public void InsertMessage() {
		System.out.println("가 추가되었습니다.");
	}
	// UPDATE & DELETE MENU
	@Override
	public int SelectShape() {
		int index = -1;
		try {
			  index = sc.nextInt()-1;
		} catch(InputMismatchException e) {
			System.out.print("선택할 도형의 번호를 입력해야 합니다.");
			sc.next();
		}
		return index;
	}
	@Override
	public void UpdateShapeMenu() {
		System.out.println("*** 도형 변경 ***");
		System.out.println("위 목록에서 변경하고자 하는 도형 번호를 선택하세요 (0은 취소) : ");
		
	}
	
	@Override
	public void DeleteShapeMenu() {
		System.out.println("*** 도형 삭제 ***");
		System.out.println("위 목록에서 삭제하고자 하는 도형 번호를 선택하세요 (0은 취소) : ");
	}
	
	// PRINT ALL
	@Override
	public void PrintAllShape(List list) {
		System.out.println("*** 전체 도형(면적 오름차순) ***");
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
		System.out.println("취소되었습니다.");
	}
	@Override
	public void ShapeTypeErrorMessage() {
		System.out.println("도형 입력이 잘못되었습니다.");
	}
	@Override
	public void ShapeOutOfIndexMessage() {
		System.out.println("번호에 해당하는 도형이 없습니다.");
	}
}
