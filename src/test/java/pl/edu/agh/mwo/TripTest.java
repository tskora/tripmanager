package pl.edu.agh.mwo;

import org.junit.Before;
import org.junit.Test;

public class TripTest {

	Trip trip;
	Photo photo;
	
	@Before
	public void setUp() throws Exception {
		trip = new Trip();
		photo = new Photo();
	}

	@Test
	public void testAddPhoto() {
		trip.addPhoto(photo);
	}
	
	@Test
	public void testGetPhotos() {
		trip.getPhotos();
	}

}
