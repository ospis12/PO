// Maciej Dudek
// Pracownia PO, czwartek, s.108
// L5, z1 Kolejka i Hierarchia
// 2018-04-12
package Hierarchia;

//Klasa abstrakcyjna 

public abstract class Stopien_wojskowy implements Comparable<Stopien_wojskowy>{
	protected String imie;
	protected String nazwisko;
	public int compareTo(Stopien_wojskowy o) {return 0;}
}
