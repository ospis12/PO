// Maciej Dudek
// Pracownia PO, czwartek, s.108
// L5, z1 Kolejka i Hierarchia
// 2018-04-12
package Hierarchia;

//Klasa Pułkownik

public class Pulkownik extends Stopien_wojskowy {
	public Pulkownik(String imie,String nazw) {
		this.imie=imie;
		this.nazwisko=nazw;
	}
	//Prównanie z obiektem obiektów abstrakcyjnych Stopien_wojskowy
	@Override
	public int compareTo(Stopien_wojskowy o) {
		if(o instanceof Pulkownik) {
			if(nazwisko.compareTo(o.nazwisko)==0)
				return imie.compareTo(o.imie);
			return nazwisko.compareTo(o.nazwisko);
		}else if(o instanceof General)
			return 1;
		else if(o instanceof Major)
			return -1;
		//Zapewnienie założenia Otwarte-Zamknietę
		return -1*(o.compareTo(this));
	}
}
