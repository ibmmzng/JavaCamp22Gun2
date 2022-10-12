package day2homework;

public class Main {

	public static void main(String[] args) {
		String yeniMesaj=sehirVer();
		System.out.println(yeniMesaj);
		int say=topla(5,12);
		System.out.println(say);
		int toplam=topla2(10,16,25,28,30);
		System.out.println(toplam);
		
		// Class
		CustomerManager customerManager=new CustomerManager();
		CustomerManager customerManager2=new CustomerManager();
		customerManager.Add();
		
		
		//DörtÝÞlem
		DortIslem dortIslem=new DortIslem();
		dortIslem.Carp(5, 8);
		int sonuç=dortIslem.Topla(9,7,6);
		System.out.println(sonuç);
		
		// Field or Attribute
		Product product=new Product(); // Yapýcý Blok(Constructor) çalýþýr.
		product.setName("Laptop");;
		product.setDescription("Asus Laptop");;
		product.setId(5);
		product.setPrice(5000);
		product.setStockAmount(5000);
		
		//CONSTRUCTOR
		//Product product=new Product(1,"Laptop", "Asus laptop", 5000,20);
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
		
		//-----------Encapsulation-----------
		System.out.println(product.getKod());
		
		//-----------Inheritance-----------
		Customer customer=new Customer();
		Employee employee=new Employee();
		
		EmployeManager employeManager=new EmployeManager();
		CustomerManager customerManager3=new CustomerManager();
		customerManager3.List();
		
		//-----Ýnheritnce Demo-----------
			
		KrediUI kredýUI=new KrediUI();
		kredýUI.KrediHesapla(new AskerKrediManager());
		
					
	}
	// ----------Metodlar--------
	public static void ekle() {
		System.out.println("Eklendi.");
	}
	public static void sil() {
		System.out.println("Silindi.");
	}
	public static void guncelle() {
		System.out.println("Güncellendi.");
	}
	public static int topla(int say1, int say2) {
		return say1+say2;
	}
	public static int topla2(int... sayýlar) { // Dizi mantýðýnda deðer gönderiri.
		int toplam=0;
		for(int sayý:sayýlar) {
			toplam=toplam+sayý;
		}
		return toplam;
	}
	public static String sehirVer() {
		return "Ankara";
	}
		
}
