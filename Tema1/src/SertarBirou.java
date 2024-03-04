
public class SertarBirou {

	public static void main(String[] args) {
		Sertar Matei = new Sertar(12,32,15);
		Matei.afisare();	
		Sertar Sertar1 = new Sertar(5,7,10);
		Sertar Sertar2 = new Sertar(4,8,12);
		Birou CasaAlba = new Birou (Sertar1, Sertar2, 10, 15, 20);
		CasaAlba.afisare();
	}
	

}
