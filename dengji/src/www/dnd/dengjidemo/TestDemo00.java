package www.dnd.dengjidemo;

import java.util.Scanner;

public class TestDemo00 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 
		 90分以上 A级
		 * 
		 * 80~89 B级
		 * 
		 * 70~79 C级
		 * 
		 * 60~69 D级
		 * 
		 * 60分以下 E级
		 */
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		System.out.println("请输入分数：");
		score = scanner.nextInt();
		System.out.println(score);
		if (score == 100) {
			System.out.println("A");
		} else {
			switch (score / 10) {
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				System.out.println("E");
				break;
			default:
				System.out.println("输入有误");
			}
		}
	}

}
