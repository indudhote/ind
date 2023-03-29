package Play;

public class Song {
	public String name;
	   public String userName ;
	  static int length;
	  

	   public Song(String songName, String userName) {
	      this.name = name;
	      this.userName =userName ;
	      
	   }
	   public void setName(String songName) {
	      name = songName;
	   }
	   public String getName() {
	      return name;
	   }
	  
	  
	   public void setUserName(String userName) {
	      this.userName = userName;
	   }
	   
	  
		  
		   public String getUserName() {
		      return userName;
		   }
		   public void setLength(int h, int m, int s) {
		       length = (h*3600 + m*60 + s);
		      if(h==0) {
		         length = (m*60+s);
		      }   
		   }
		   public int getLength() {
		      return length;
		   }

		   public String toString() {
		      return "Title: " + getName() + ", user: " + getUserName() ;
		   }
		
		    


}

	



