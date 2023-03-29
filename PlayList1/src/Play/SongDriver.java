package Play;

public class SongDriver {
	 public static void main(String[] args) {
		 PlayList one = new PlayList();

	     Song song1 = new Song("Hotline Bling", "Drake");
	     Song song2 = new Song("What Do You Mean?", "Justin");
	     Song song3 = new Song("Watch Me", "Sile");
	     Song song4 = new Song("679", "rty");
	     Song song5 = new Song("Can't Feel My Face", "pqr");
	     Song song6 = new Song("Good for You", "xyz");
	     Song song7 = new Song("If You", "abc");

	     one.add(song1);               
	     one.add(song2);               
	     one.add(song3);                
	     one.add(song4);                
	     one.add(song5);               
	     one.add(song6);                
	     one.add(song7);


	     one.print();

	     one.remove("679");   

	     one.print();

	     one.remove("Watch Me");

	     one.print(); 

	     one.clear();
	     one.print();
	}
	}
}
