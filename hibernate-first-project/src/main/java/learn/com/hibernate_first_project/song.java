package learn.com.hibernate_first_project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class song {
	
	@Id
	@Column(name="songid")
	private int id;
	
	@Column(name="songName")
	private String songName;
	
	@Column(name="singer")
	private String artist;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	
	
	

}
