import builder.CarWithBuilder;
import car_components.*;
import java.util.*;

public class Runner {

	public static void main(String args[]) {
		
		//we can create car class objects by passing null for the fields we don't want in constructor, or we can
		//create different constructors for different fields that we want, it's not a good approach
		
		//we can also use getters and setters to make object but in case of getters and setters there is code redability
		//problem we may miss some field to set,
		
		//we can reintialize the properties with setter with new property,but in case of builder we are first assigning
		//field to builder than we are building our object there is not chance of mistake
		
		final Engine engine = new Engine();
        final List<Seat> seats = new ArrayList<>();
        final Steering steering = new Steering();
        final SunRoof sunRoof = new SunRoof();
        final AirBags airBags = new AirBags();
        final MusicSystem musicSystem = new MusicSystem();
        final CentralLock centralLock = new CentralLock();

		
        //we can make car object for desired fields we want
		CarWithBuilder car = CarWithBuilder.builder().withEngine(engine).withSeats(seats).withSteering(steering).withAirBags(airBags).build();
        
	}
}
