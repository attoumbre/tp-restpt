
public class Billeterie {
	private int billet =0 ;
	
	public synchronized void achat() {

		billet++;
		System.out.println("nom Thread :"+Thread.currentThread().getName()+" le nombre de billet acheté est: "+billet);
	}

}
