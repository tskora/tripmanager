package pl.edu.agh.mwo;

import java.util.HashSet;
import java.util.Set;

public class TripManager {
	
	private Set<Trip> trips = new HashSet<Trip>();

	public void addTrip(Trip trip) {	
		trips.add(trip);
	}

	public void removeTrip(Trip trip) {
		trips.remove(trip);
	}

	public Set<Trip> getTrips() {
		return trips;
	}

	public Trip findTrip(String string) {
		for (Trip t : trips) {
			if (t.name.equals(string)) {
				return t;
			}
		}
		return null;
	}


}
