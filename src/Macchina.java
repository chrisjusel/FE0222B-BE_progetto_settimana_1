
public class Macchina {
	private String nome;
	private int cilindrata;
	private String targa;
	private int prezzo;
	private String colore;
	private int marceTotali;
	private boolean motoreAcceso;
	private int marciaCorrente;
	
	public Macchina(String nome, int cilindrata, String targa, int prezzo, String colore, int marceTotali) {
		setNome(nome);
		setCilindrata(cilindrata);
		setTarga(targa);
		setPrezzo(prezzo);
		setColore(colore);
		setMarceTotali(marceTotali);
	}
	
	public void accendiMotore() {
		if(!isMotoreAcceso()) {
			//se la macchina non è accesa
			cambiaMarcia(0);
			//metto a folle
			setMotoreAcceso(true);
			//accendo il motore
		}
	}
	
	public void spegniMotore() {
		if(isMotoreAcceso()) {
			//se la macchina è accesa
			if(getMarciaCorrente() != 0) {
				//se la marcia corrente è diversa da folle
				cambiaMarcia(0);
				//metti a folle
			}
			setMotoreAcceso(false);
			//spegni il motore
		}

	}
	
	public void cambiaMarcia(int marciaCorrente) {
		if(marciaCorrente >= 0 && marciaCorrente <= marceTotali) {
			//se la marcia che imposto è dentro il range delle marce della macchina
			if(getMarciaCorrente() != marciaCorrente) {
				//se la marcia che è innestata non è la marcia che voglio impostare
				setMarciaCorrente(marciaCorrente);
				//innesto la marcia
			}
		}
	}
	
	public String stampaInformazioni() {
		if(nome != null && targa != null) {
			return "Modello: " + nome + "\nCilindrata: " + cilindrata + "\nColore: " + colore + "\nPrezzo: " + prezzo + "\nMarce: " + marceTotali + "\nTarga: " + targa;
		} else {
			return "La macchina non esiste";
		}
	}
	
	public void scalaMarcia() {
		int marciaScalata = getMarciaCorrente()-1;
		
		if(marciaScalata >= 0 && marciaScalata <= getMarceTotali()) {
			//se la marcia che imposto è dentro il range delle marce della macchina
			setMarciaCorrente(marciaScalata);
		}
			
	}
	
	public void aumentaMarcia() {
		int marciaIncrementata = marciaCorrente+1;
		
		if(marciaIncrementata >= 0 && marciaIncrementata <= getMarceTotali()) {
			//se la marcia che imposto è dentro il range delle marce della macchina
			setMarciaCorrente(marciaIncrementata);
		}
		
	}

	
	public int getValore() {
		return prezzo;
	}
	
	public String getNome() {
		return nome;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public String getTarga() {
		return targa;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public String getColore() {
		return colore;
	}

	public int getMarceTotali() {
		return marceTotali;
	}

	public boolean isMotoreAcceso() {
		return motoreAcceso;
	}

	public int getMarciaCorrente() {
		return marciaCorrente;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	private void setTarga(String targa) {
		this.targa = targa;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	private void setMarceTotali(int marceTotali) {
		this.marceTotali = marceTotali;
	}

	private void setMotoreAcceso(boolean motoreAcceso) {
		this.motoreAcceso = motoreAcceso;
	}

	private void setMarciaCorrente(int marciaCorrente) {
		this.marciaCorrente = marciaCorrente;
	}
}
