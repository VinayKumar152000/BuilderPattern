package builder;

import java.util.*;

import car_components.*;

public class CarWithBuilder {

	// Required Components
	private Engine engine;
	private Fuel fuel;
	private Steering steering;
	private List<Seat> seats;

	// Optional Components

	private AirBags airBags;
	private CentralLock centralLock;
	private MusicSystem musicSystem;
	private SunRoof sunRoof;

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {

		// Required Components
		private Engine engine;
		private Fuel fuel;
		private Steering steering;
		private List<Seat> seats;

		// Optional Components

		private AirBags airBags;
		private CentralLock centralLock;
		private MusicSystem musicSystem;
		private SunRoof sunRoof;

		public Builder withEngine(final Engine engine) {
			this.engine = engine;
			return this;
		}

		public Builder withFuel(final Fuel fuel) {
			this.fuel = fuel;
			return this;
		}

		public Builder withSteering(final Steering steering) {
			this.steering = steering;
			return this;
		}

		public Builder withSeats(final List<Seat> seats) {
			this.seats = seats;
			return this;
		}

		public Builder withAirBags(final AirBags airBags) {
			this.airBags = airBags;
			return this;
		}

		public Builder withCentralLock(final CentralLock centralLock) {
			this.centralLock = centralLock;
			return this;
		}

		public Builder withMusicSystem(final MusicSystem musicSystem) {
			this.musicSystem = musicSystem;
			return this;
		}

		public Builder withSunRoof(final SunRoof sunRoof) {
			this.sunRoof = sunRoof;
			return this;
		}

		public CarWithBuilder build() {
			if (this.engine == null || this.fuel == null || this.steering == null || this.seats == null) {
				throw new RuntimeException("All Required Fields are not Mentioned");
			}

			CarWithBuilder car = new CarWithBuilder();
			car.engine = engine;
			car.fuel = fuel;
			car.seats = seats;
			car.steering = steering;
			car.airBags = airBags;
			car.centralLock = centralLock;
			car.musicSystem = musicSystem;
			car.sunRoof = sunRoof;
			return car;

		}
	}
}
