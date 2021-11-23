
public class Bus extends Thread {
	
	private Arret arret;
	
	public Bus(Arret arret) {
		this.arret = arret;
	}
	public void run() {
		//le bus voyage
		try { Thread.sleep(100); } catch(InterruptedException e) {}
		 //garer le bus qi la place a l'arret est libre
		arret.garerBus();
		//stationner pendnant un temps
        try { Thread.sleep(100); } catch(InterruptedException e) {}
        //il attend si pas de bus sinon monte dans le bus
		arret.roulerBus();
	}

}
