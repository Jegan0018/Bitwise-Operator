package LibrarayManagement;

import java.util.ArrayList;

public class DisplayBooks {
	public void displayBooks(ArrayList<Books> arrayList,int bookId) {
		System.out.println("---------------------------------------------------");
		for (int i = 0; i < arrayList.size(); i++) {
			Books b = arrayList.get(i);
			System.out.println("Book Id :" + b.bookId);
			System.out.println("Book Name :" + b.bookName);
			System.out.println("Price :" + b.price);
			System.out.println("**********************");
		}
		System.out.println("---------------------------------------------------");
	}
}
