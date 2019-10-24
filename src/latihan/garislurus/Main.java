package latihan.garislurus;

public class Main {

	public static void main(String[] args) {
		Koordinat koordinat = new Koordinat(2,10,5,7);
		Koordinat koordinat2 = new Koordinat(5,1,3,12);
		System.out.println("Garis yang melalui titik ("
				+ koordinat.getX1()+","+koordinat.getY1()+")"+" dan "+"(" + koordinat.getX2()+","+koordinat.getY2()+")"
				+ " memiliki gradien sebesar " + koordinat.hitungGradien()
		);
		System.out.println("Garis yang melalui titik ("
				+koordinat2.getX1()+","+koordinat2.getY1()+")"+" dan "+"(" + koordinat2.getX2()+","+koordinat2.getY2()+")"
				+ " memiliki gradien sebesar " + koordinat2.hitungGradien()
		);

	}

}
