
public class Arret {

	// nb de place occupées
	private int nbplace=0;

	
	
	//savoir quand le bus est là
	private Boolean busEstla= false;
	
	
	public synchronized void monterBus() {
		while(nbplace==15 || !busEstla) {
			try {
				wait();
			} catch (Exception e) {
				
			}
		}
		nbplace++;
		System.out.println("nom Thread :"+Thread.currentThread().getName()+" le bus contient "+nbplace);
	}
	
	public synchronized void garerBus() {
		while(busEstla) {
			try {
				wait();
			} catch (Exception e) {
				
			}
			
		}
		
		busEstla=true;
		System.out.println("nom Thread :"+Thread.currentThread().getName()+" le bus a garé");
		notifyAll();
		
	}
	public synchronized void roulerBus() {
		System.out.println("nom Thread :"+Thread.currentThread().getName()+" le bus est partis");
		busEstla = false;
		nbplace=0;
		notifyAll();
	}

}
