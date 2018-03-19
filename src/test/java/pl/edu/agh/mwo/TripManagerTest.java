package pl.edu.agh.mwo;

import org.junit.Before;
import org.junit.Test;
 
public class TripManagerTest {
	
	TripManager tripManager;
	Trip trip;
	Photo photo;
	
	@Before
	public void setUp() throws Exception {
		tripManager = new TripManager();
		trip = new Trip();
		photo = new Photo();
	}
	
	@Test
	public void testAddTrip() {
		tripManager.addTrip(trip);
	}
	
	@Test
	public void testRemoveTrip() {
		tripManager.removeTrip(trip);
	}
	
	@Test
	public void testGetTrips() {
		tripManager.getTrips();
	}
	
	@Test
	public void testFindTrip() {
		tripManager.findTrip("Warszawa");
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
