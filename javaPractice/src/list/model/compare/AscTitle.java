package list.model.compare;

import java.util.Comparator;

import list.model.vo.Music;

public class AscTitle implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		String standard = o1.getTitle();
		String object = o2.getTitle();
		
		return standard.compareTo(object);
	}
}
