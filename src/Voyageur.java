
public class Voyageur extends Thread{
	
	private Billeterie billeterie;
	
	private Arret arret;
	
	public Voyageur(Arret arret, Billeterie billeterie) {
		this.arret = arret ;
		this.billeterie = billeterie;
	}
	
	
	public void run() {
		//le client achette un ticket 
		billeterie.achat();
		//il se rend à l'arret de bus
        try { Thread.sleep(100); } catch(InterruptedException e) {}
        //il attend si pas de bus sinon monte dans le bus
		arret.monterBus();
	}

}
