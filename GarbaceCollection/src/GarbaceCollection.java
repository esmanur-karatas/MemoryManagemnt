public class GarbaceCollection {

	public static void main(String[] args) {
		Fruit f1 = new Fruit("Elma");// unreferanced object
		System.out.println(f1.getName());
		
//		bir objenin referansı null yapılması 
//		durumunda unreferenced meydana geliyor.
//		null değer atamamıza rağmen elma hala heap te yer kaplıyor.
		f1 = null;
		try {
			System.out.println(f1.getName());
		}catch(NullPointerException n ) {
			System.out.println(n.getMessage());
		}
		
//		f2 objesine eşitlendiğinde f2 objesinin önceki referans
//		gösterdiği alanın adresi gösterilmiyor f2 yerinin adresi gösterilmez hale gelir.
		Fruit f2 = new Fruit("Armut"); //Unreferanced object
		Fruit f3 = new Fruit("Çilek");
		
		f2 = f3;
		System.out.println(f2.getName());
		System.out.println(f3.getName());
		
//		anonim object oluşturusak adresi bilinmez oluşturulan
//		objenin heap' teki adresi elimizde yoktur.
		System.out.println(new Fruit("Karpuz").getName()); // unreferanced object
	    
	    Fruit f4 = new Fruit("Kavun");
	    f3 = f4;
	    f2 = f4;
	    
//	    f1 null
//	    f2 f3 f4 kavun bölgesinin adresini tutuyor.
	    
//	    kavun bölgesi 3 tane olduğu için üçüünü de null yaparsak kavun bölgesi de çöpe gider.
	    f4 = null;
	    f3 = null;
	    f2 = null;
//		Gereksiz yer kaplayan alanlar silinmeli garbace collectionlarla
	    System.gc();
	}

}
