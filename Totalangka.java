package totalangka;
public class Totalangka {
    public static void main(String[] args) {
        int[] angka = new int[5];
		int x = 1;
		for (int i = 0; i < angka.length; i++) {
			angka[i] = x;
			x++;
		}
		int total = 0;
		for (int i = 0; i < angka.length; i++) {
			total+=angka[i];
		}
	System.out.println(total);
    }
}
