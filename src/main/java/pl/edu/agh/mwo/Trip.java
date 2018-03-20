package pl.edu.agh.mwo;

import java.util.HashSet;
import java.util.Set;

public class Trip {
	
	public String name;
	public String description;
	private Set<Photo> photos = new HashSet<Photo>();

	public void addPhoto(Photo photo) {
		photos.add(photo);
	}

	public Set<Photo> getPhotos() {
		return photos;
	}

}
