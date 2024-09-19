public class Artwork{
	private String title;
	private int year;
	private Artist artist;

	Artwork(String title, int year, Artist artist){
	this.title = title;
	this.year = year;
	this.artist = new Artist(a.getname);
	}

	Artwork(Artwork a){
	this.title = a.gettitle();
	this.year = a.getyear();

	}


	Artwork(String title, int year){
	this.title = title;
	this.year = year;
	this.artist = artist;
	}

	public String gettitle(){
		return title;
	}
	public int getyear(){
		return year;
	}
	public Artist getartist(){
		return artist;
	}


	public void display(){
		System.out.println("title is" + title);
		System.out.println("year is" + year);
		System.out.println("artist is" + a.getname());
		
	}
		

}