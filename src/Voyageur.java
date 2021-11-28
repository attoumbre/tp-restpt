
public class Voyageur extends Thread{
	
	private static int clientInitNumber;
	private Billeterie billeterie;
	
	private Arret arret;
	
	public Voyageur(Arret arret, Billeterie billeterie) {
		 super(null, null, "Voyageur-" + nextClientNum());
		this.arret = arret ;
		this.billeterie = billeterie;
	}
	
	private synchronized static int nextClientNum() {
        return clientInitNumber++;
    }
	
	public void run() {
		//le client achette un ticket 
		billeterie.achat();
		//il se rend à l'arret de bus
		arret.goArret();
		
		//attendre le bus
		 
		 arret.waitBus();
        //il attend si pas de bus sinon monte dans le bus
		arret.monterBus();
	}

}
