
public class Reseau {
	
	static final int NB_VOYAGEUR = 100;
	static final int NB_BUS = 7;
	private Arret arret;
	private Billeterie billeterie;
	private Bus[] bus = new Bus[NB_BUS];
	private Voyageur[] voyageur = new Voyageur[NB_VOYAGEUR];
	public Reseau() {
		arret = new Arret();
		billeterie = new Billeterie();
		
		for(int i = 0; i < NB_BUS; i++) {
			bus[i] = new Bus(arret);
		}
		
		for(int i=0; i< NB_VOYAGEUR; i++) {
			voyageur[i] = new Voyageur(arret,billeterie);
		}
		
		
		
		voyageur[1].start();
		voyageur[2].start();
		voyageur[3].start();
		voyageur[4].start();
		voyageur[5].start();
		voyageur[6].start();
		voyageur[7].start();
		voyageur[8].start();
		voyageur[9].start();
		voyageur[10].start();
		voyageur[11].start();
		voyageur[12].start();
		voyageur[13].start();
		voyageur[14].start();
		voyageur[15].start();
		voyageur[16].start();
		voyageur[17].start();
		voyageur[18].start();
		voyageur[19].start();
		voyageur[20].start();
		voyageur[21].start();
		voyageur[22].start();
		voyageur[23].start();
		voyageur[24].start();
		voyageur[25].start();
		voyageur[26].start();
		voyageur[27].start();
		voyageur[28].start();
		voyageur[29].start();
		voyageur[30].start();
		voyageur[31].start();
		voyageur[32].start();
		voyageur[33].start();
		bus[1].start();
		bus[2].start();
		bus[4].start();
		bus[5].start();
		bus[3].start();
		bus[6].start();
		
		
		try {
			voyageur[1].join();
			voyageur[2].join();
			voyageur[3].join();
			voyageur[4].join();
			voyageur[5].join();
			voyageur[6].join();
			voyageur[7].join();
			voyageur[8].join();
			voyageur[9].join();
			voyageur[10].join();
			voyageur[11].join();
			voyageur[12].join();
			voyageur[13].join();
			voyageur[14].join();
			voyageur[15].join();
			voyageur[16].join();
			voyageur[17].join();
			voyageur[18].join();
			voyageur[19].join();
			voyageur[20].join();
			voyageur[21].join();
			voyageur[22].join();
			voyageur[23].join();
			voyageur[24].join();
			voyageur[25].join();
			voyageur[26].join();
			voyageur[27].join();
			voyageur[28].join();
			voyageur[29].join();
			voyageur[30].join();
			voyageur[31].join();
			voyageur[32].join();
			voyageur[33].join();
			bus[1].join();
			bus[2].join();
			bus[4].join();
			bus[5].join();
			bus[3].join();
			bus[6].join();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {
		    new Reseau();
		  }
	
}
