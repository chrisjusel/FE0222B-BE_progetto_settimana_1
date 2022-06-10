
public class Runnable {

	public static void main(String[] args) {
		Macchina m1 = new Macchina("Fiat punto", 1200, "AA BB CC", 5000, "grigio", 5);
		Macchina m2 = new Macchina("Toyota Yaris", 1400, "CC DD EE", 7000, "rosso", 5);
		Macchina m3 = new Macchina("Pegout 208", 1600, "EE FF GG", 9000, "blu", 5);
		Macchina m4 = new Macchina("Citroen c4", 1600, "HH II LL", 12000, "nero", 5);
		Macchina m5 = new Macchina("Ford fiesta", 1600, "MM NN OO", 10000, "blu", 5);
		
		Macchina [] auto = {m1,m2,m3,m4,m5};
		
		if(auto.length != 0 && auto != null) {
			System.out.println("La macchina piu' costosa e': \n");
			System.out.println(infoMacchinaPiuCostosa(auto).stampaInformazioni());
			System.out.println("-----------------------------");
			Macchina macchinaByTarga = infoMacchina(auto, "MM NN OO"); 
			
			if(macchinaByTarga != null)
				System.out.println("La macchina con la targa richiesta e': \n" + macchinaByTarga.stampaInformazioni());
			else 
				System.out.println("La macchina con la targa richiesta non e' stata trovata");
			
			System.out.println("-----------------------------");
			System.out.println("La macchina con il colore richiesto e': \n");
			infoMacchinaColore(auto, "blu");
		} else {
			System.out.println("Non sono presenti macchine nell'autofficina");
		}
		
		
//		TEST METODI AUTO		
//		System.out.println("-----------------------------");
		
//		m1.accendiMotore();
//		m1.aumentaMarcia();
//		m1.aumentaMarcia();
//		m1.cambiaMarcia(5);
//		m1.scalaMarcia();
//		m1.scalaMarcia();
//		m1.spegniMotore();
//		System.out.println(m1.stampaInformazioni() + "\nMarcia Corrente: " + m1.getMarciaCorrente() + "\nMotore acceso: " + m1.isMotoreAcceso());
	}

	static Macchina infoMacchinaPiuCostosa(Macchina[] auto) {
		Macchina temp = null;
		//creo una macchina temporanea settata a null
		int max = 0;
		//creo un valore max che conserverà il più alto prezzo di una macchina
		if (auto != null) {
			//se l'array esiste
			for (int i = 0; i < auto.length; i++) {
				//per ogni elemento dell'array
				if (auto[i].getValore() > max) {
					//controllo se il prezzo della macchina corrente è più grande di max
					temp = auto[i];
					//se si, a temp assegno la macchina corrente
					max = temp.getValore();
					//max assume il prezzo della macchina corrente
				}
			}
		}
		return temp;
	}

	static Macchina infoMacchina(Macchina[] auto, String targa) {
		Macchina temp = null;
		//creo una macchina temporanea settata a null
		if (auto != null) {
			//se l'array esiste
			for (int i = 0; i < auto.length; i++) {
				//per ogni elemento dell'array
				if (auto[i].getTarga().equals(targa)) {
					//controllo se la targa della macchina corrente
					//è uguale alla targa passta in input al metodo
					temp = auto[i];
					//se si, assegno la macchina corrente a temp
				}
			}
		}
		return temp;
	}

	static void infoMacchinaColore(Macchina[] auto, String colore) {
		int counter = 0;
		//inizializzo un contatore a 0
		if (auto != null) {
			//se l'array esiste
			for (int i = 0; i < auto.length; i++) {
				//per ogni elemento dell'array
				if (auto[i].getColore().equals(colore)) {
					//controllo se il colore della macchina corrente è uguale
					//al colore che passo in input
					System.out.println(auto[i].stampaInformazioni() + "\n");
					//se si, stampo la macchina corrente
					counter += 1;
					//ed incremento il contatore di 1
				}
			}
		}
		if(counter == 0) {
			//se il contatore è rimasto 0
			System.out.println("Non sono presenti macchine del colore scelto");
			//vuol dire che non sono state trovate auto di quel colore
			//e stampo un messaggio
		}
	}
}
