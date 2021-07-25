package CoreJavaA3;

import java.util.ArrayList;

public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Movie_details{
	private String mov_Name;
	private String lead_actor;
	private String lead_actress;
	private String genre;
	
	public Movie_details(String mov_Name, String lead_actor, String lead_actress, String genre) {
		this.mov_Name = mov_Name;
		this.lead_actor = lead_actor;
		this.lead_actress = lead_actress;
		this.genre = genre;
	}
	public String getMov_Name() {
		return mov_Name;
	}
	public void setMov_Name(String mov_Name) {
		this.mov_Name = mov_Name;
	}
	public String getLead_actor() {
		return lead_actor;
	}
	public void setLead_actor(String lead_actor) {
		this.lead_actor = lead_actor;
	}
	public String getLead_actress() {
		return lead_actress;
	}
	public void setLead_actress(String lead_actress) {
		this.lead_actress = lead_actress;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
}

class Movie_DetailsList
{
	static ArrayList<Movie_details> list=new ArrayList<>();
	static {
		list.add(new Movie_details("DDLG","sakhan","Kajor","Romantic") );
		list.add(new Movie_details("xyz","sakhan","Kajor","Romantic") );
		list.add(new Movie_details("pqr","sakhan","Kajor","Romantic") );
	}
	public static void add_movie(Movie_details m) {
		list.add(m);		
	}
	public static void remove_movie(Movie_details m) {
		list.remove(m);		
	}
	public static void remove_AllMovies() {
		list.clear();
	}
	
	public static Movie_details find_movie_By_mov_Name(String name)
	{
		Movie_details movieDetails = null;
		for(Movie_details md: list){
			if(md.getMov_Name().equals(name)) {
				movieDetails =  md;
			}
		}
		return movieDetails;
		
	}
}
