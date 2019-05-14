public class Book {

	private String author;
	private String genre;
	private int pageNumber;
	private String publisher;

	
		public void getAuthor(String author){
			this.author = author;
		}
		public String setAuthor(){
			return author;
		}

		public void setGenre(String genre){
			this.genre = genre;
		}
		public String getGenre(){
			return genre;
		}
		
		public void setPublisher(String publisher){
			this.publisher = publisher;
		}
		public String getPublisher(){
			return publisher;
		}
	
}