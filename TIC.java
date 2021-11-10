package TEMA2;

public class TIC extends Thread{
	
	public void run() {
		while(true) {
			System.out.println("TIC");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		TAC tac = new TAC();
		TIC tic = new TIC();
		tic.start();
		tac.start();
		
		
	}

}
