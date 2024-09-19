public class Test{
	public static void main(String[] args){
		Artist a = new Artist();
		a.display();
		Artist ae1 = new Artist("alia");
	
		Artwork aw1 = new Artwork("title", 2024, ae1);
		aw1.display();

		Artwork aw2 = new Artwork("title", 2024, new Artist("alia"));


	}
}