
public class Bus extends Thread {
	private static int busInitNumber;
	
	private Arret arret;
	static final int nmbclient=15;
	public Bus(Arret arret) {
		super(null, null, "Bus-" + nextBusNum());
		this.arret = arret;
		setDaemon(true); 
	}
	
	private synchronized static int nextBusNum() {
        return busInitNumber++;
    }
	public void run() {
		while(true) {
			//le bus voyage
			try { Thread.sleep(10); } catch(InterruptedException e) {}
			 //garer le bus qi la place a l'arret est libre
			arret.stationner();
			//stationner pendnant un temps
	        try { Thread.sleep(2); } catch(InterruptedException e) {}
	        //il attend si pas de bus sinon monte dans le bus
			arret.voyager();
		}
		
	}

}
