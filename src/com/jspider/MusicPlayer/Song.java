package com.jspider.MusicPlayer;

public class Song {
	private int id;
	private String SongName;
	private String SingerName;
	private String MovieName;
	private String Composer;
	private String Lyrix;
	private String duration;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSongName() {
		return SongName;
	}
	public void setSongName(String songName) {
		SongName = songName;
	}
	public String getSingerName() {
		return SingerName;
	}
	public void setSingerName(String singerName) {
		SingerName = singerName;
	}
	public String getMovieName() {
		return MovieName;
	}
	public void setMovieName(String movieName) {
		MovieName = movieName;
	}
	public String getComposer() {
		return Composer;
	}
	public void setComposer(String composer) {
		Composer = composer;
	}
	public String getLyrix() {
		return Lyrix;
	}
	public void setLyrix(String lyrix) {
		Lyrix = lyrix;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	

}
