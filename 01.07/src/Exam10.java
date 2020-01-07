import java.util.Scanner;

class UpDownGame extends Thread {
	private int time;
	private boolean game;
	
	public UpDownGame() {
		game =false;
		time=0;
	}
	
	public void setGame() {
		game= !game; // 현재 진행하는거에 반대로 
		
	}
	
	public void startGame() {
		int comsu = (int)(Math.random()*100)+1;
		
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("컴퓨터 수 : ");
			int su = input.nextInt();
			if(comsu==su) {
				System.out.println(time+"초 만에 맞췄습니다.");
				return;
			}
			else if( comsu <su ) {
				System.out.println("입력한 수보다 작은 수 입니다");
			}
			else 
			{
				System.out.println("해당 보다 큰수 입니다");
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
