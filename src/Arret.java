
public class Arret {


	
	private int nbVoyageurMonte;
	private int nbVoyageur;
	private Boolean busEstla;
	
	public Arret() {
		nbVoyageur=0;
		busEstla=false;
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
		while(nbVoyageurMonte==Bus.nmbclient || !busEstla) {
			this.waitBus();
		}
		nbVoyageurMonte++;
		nbVoyageur--;
		System.out.println("nom Thread :"+Thread.currentThread().getName()+" le bus contient "+nbVoyageurMonte);
		System.out.println("il reste "+nbVoyageur+" voyageur(s) à l'arret");
	}
	
	public synchronized void stationner() {
		while(busEstla) {
			try {
				wait();
			} catch (Exception e) {
				
			}
			
		}
		
		busEstla=true;
		nbVoyageurMonte=0;
		System.out.println("nom Thread :"+Thread.currentThread().getName()+" le bus a garé");
		notifyAll();
		
	}
	public synchronized void voyager() {
		System.out.println("nom Thread :"+Thread.currentThread().getName()+" le bus est partis");
		busEstla=false;
		notifyAll();
	}

}
