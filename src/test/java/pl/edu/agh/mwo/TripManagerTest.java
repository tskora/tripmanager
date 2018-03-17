package pl.edu.agh.mwo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
 
public class TripManagerTest {
	
	@Test
	public void testAddPhoto() {
		Photo photo = new Photo();
		Trip trip = new Trip();
		trip.addPhoto(photo);
	}
	
	@Test
	public void testGetPhotos() {
		Trip trip = new Trip();
		trip.getPhotos();
	}
	
}
