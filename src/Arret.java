
public class Arret {


	
	private int nbVoyageurMonte;
	private int nbVoyageur;
	private int busEstla;
	
	public Arret() {
		nbVoyageur=0;
		busEstla=0;
		nbVoyageurMonte=0;
	}
	
	public synchronized void goArret() {
		nbVoyageur++;
		System.out.println("nom Thread :"+Thread.currentThread().getName()+" il y a  "+nbVoyageur+ " voyageur(s) à l'arret");
	}
	
	public synchronized void waitBus() {
		
		try {
			System.out.println("nom Thread :"+Thread.currentThread().getName()+" est en attente");
			wait();
			
		} catch (Exception e) {
			
		}
	}
	
	public synchronized void monterBus() {
		while(nbVoyageurMonte==Bus.nmbclient || busEstla==0) {
			this.waitBus();
		}
		nbVoyageurMonte++;
		nbVoyageur--;
		System.out.println("nom Thread :"+Thread.currentThread().getName()+" le bus contient "+nbVoyageurMonte);
		System.out.println("il reste "+nbVoyageur+" voyageur(s) à l'arret");
	}
	
	public synchronized void stationner() {
		while(busEstla==1) {
			try {
				wait();
			} catch (Exception e) {
				
			}
			
		}
		
		busEstla++;
		nbVoyageurMonte=0;
		System.out.println("nom Thread :"+Thread.currentThread().getName()+" le bus a garé");
		notifyAll();
		
	}
	public synchronized void voyager() {
		System.out.println("nom Thread :"+Thread.currentThread().getName()+" le bus est partis");
		busEstla --;
		notifyAll();
	}

}
