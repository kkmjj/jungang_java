import java.util.Scanner;

class UpDownGame extends Thread {
	private int time;
	private boolean game;
	
	public UpDownGame() {
		game =false;
		time=0;
	}
	
	public void setGame() {
		game= !game; // ���� �����ϴ°ſ� �ݴ�� 
		
	}
	
	public void startGame() {
		int comsu = (int)(Math.random()*100)+1;
		
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("��ǻ�� �� : ");
			int su = input.nextInt();
			if(comsu==su) {
				System.out.println(time+"�� ���� ������ϴ�.");
				return;
			}
			else if( comsu <su ) {
				System.out.println("�Է��� ������ ���� �� �Դϴ�");
			}
			else 
			{
				System.out.println("�ش� ���� ū�� �Դϴ�");
			}
		}
	}
	
	
	public void run() {
		setGame();
		while(game)
		{
			time++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class Exam10 {

	public static void main(String[] args) {
		
		UpDownGame game = new UpDownGame();
		game.start();
		game.startGame();
		

	}

}
