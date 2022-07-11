package com.cdac.app;

import java.time.LocalDate;

import com.cdac.dao.AlbumSongDao;
import com.cdac.entity.Album;
import com.cdac.entity.Song;

public class AlbumSongExample {
 
	public static void main(String[] args) {
		
		AlbumSongDao dao=new AlbumSongDao();
		
		//Album album=new Album();
 		/*album.setName("HITS OF 2022");
	album.setCopyRight("Amazon MUSIC");
		album.setRelease_Date(LocalDate.of(2022, 10, 20));
 	dao.save(album);*/
		
		Album album1 = (Album) dao.fetchById(Album.class, 5);
		Song song=new Song();
		song.setTitle("ABC");
		song.setArtist("ABHIJEET");
		song.setDuration(5.45);
		song.setAlbum(album1);
		
		dao.save(song);
		//List<Song> l=dao.fetchSongsSungBy(")
		
}
}