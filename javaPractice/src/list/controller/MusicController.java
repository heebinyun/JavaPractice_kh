package list.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import list.model.compare.AscTitle;
import list.model.vo.Music;

public class MusicController {

	private List<Music> list = new ArrayList<Music>();
	
	public boolean addList(Music music) {
		return list.add(music);
	}
	
	public int addAtZero(Music music) {
		list.add(0, music);
		if(list.contains(music)) return 1;
		else 					 return 0;
	}
	
	public List<Music> printAll(){
		return list;
	}
	
	public Music searchMusic(String title) {
		for(int i=0; i<list.size(); i++) {
			Music music = list.get(i);
			if(title.equals(music.getTitle())) {
				return list.get(i);
			}
		}
		return null;
	}
	
	public Music removeMusic(String title) {
		for(int i=0; i<list.size(); i++) {
			Music music = list.get(i);
			if(title.equals(music.getTitle())) {
				return list.remove(i);
			}
		}
		return null;
	}
	
	public Music setMusic(String title, Music music) {
		for(int i=0; i<list.size(); i++) {
			Music iMusic = list.get(i);
			if(title.equals(iMusic.getTitle())) {
				return list.set(i, music);
			}
		}
		return null;
	}
	
	public int acsTitle() {
		list.sort(new AscTitle());
		return 1;
	}
	
	public int descSinger() {
		Collections.sort(list);
		return 1;
	}
}
