package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;

import java.util.Set;

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
		assertEquals(trip.getPhotos().size(),1);
	}
	
	@Test
	public void testGetPhotos() {
		Set<Photo> photos = trip.getPhotos();
		assertEquals(photos.size(),0);
	}

}
