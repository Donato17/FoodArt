package model.prodotto;

public class ProdottoBean {

	private int idProdotto;
	private String titolo;
	private String descrizione;
	private String unitaMisuta;
	private float prezzo;
	private float quantitaMinima;
	private float quantitaDisponibile;
	private String cittaProvenienza;
	private String provinciaProvenienza;
	private int idCategoria;
	
	public ProdottoBean() {
		this.idProdotto = -1;
	}

	public int getIdProdotto() {
		return idProdotto;
	}

	public void setIdProdotto(int idProdotto) {
		this.idProdotto = idProdotto;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getUnitaMisuta() {
		return unitaMisuta;
	}

	public void setUnitaMisuta(String unitaMisuta) {
		this.unitaMisuta = unitaMisuta;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public float getQuantitaMinima() {
		return quantitaMinima;
	}

	public void setQuantitaMinima(float quantitaMinima) {
		this.quantitaMinima = quantitaMinima;
	}

	public float getQuantitaDisponibile() {
		return quantitaDisponibile;
	}

	public void setQuantitaDisponibile(float quantitaDisponibile) {
		this.quantitaDisponibile = quantitaDisponibile;
	}

	public String getCittaProvenienza() {
		return cittaProvenienza;
	}

	public void setCittaProvenienza(String cittaProvenienza) {
		this.cittaProvenienza = cittaProvenienza;
	}

	public String getProvinciaProvenienza() {
		return provinciaProvenienza;
	}

	public void setProvinciaProvenienza(String provinciaProvenienza) {
		this.provinciaProvenienza = provinciaProvenienza;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
}
