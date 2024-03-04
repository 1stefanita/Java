public class Birou {
    public Sertar Sertar1;
    public Sertar Sertar2;
    private int l;
    private int L;
    private int H;
    	
   public Birou(Sertar jysk1 , Sertar jysk2, int latime,  int Lungime , int inaltime )
   {
	   Sertar1 = jysk1;
	   Sertar2 = jysk2;
	   l = latime;
	   L = Lungime;
	   H = inaltime;
	   
   }
    public void afisare() {
    	System.out.println("printeaza "+l+", "+L+", "+H);
    	Sertar1.afisare();
    	Sertar2.afisare();
    	
    }
}
