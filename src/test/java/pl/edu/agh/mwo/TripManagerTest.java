package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Set;

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
		assertEquals(tripManager.getTrips().size(),1);
	}
	
	@Test
	public void testRemoveTrip() {
		tripManager.addTrip(trip);
		tripManager.removeTrip(trip);
		assertEquals(tripManager.getTrips().size(),0);
	}
	
	@Test
	public void testGetTrips() {
		Set<Trip> t = tripManager.getTrips();
		assertEquals(t.size(),0);
	}
	
	@Test
	public void testFindTrip() {
		trip.name = "Warszawa";
		tripManager.addTrip(trip);
		Trip t = tripManager.findTrip("Warszawa");
		assertEquals(t.name, "Warszawa");
	}
	
	@Test
	public void testNoTripToBeFound() {
		trip.name = "Kalisz";
		tripManager.addTrip(trip);
		Trip t = tripManager.findTrip("Warszawa");
		assertNull(t);
	}
	
}
