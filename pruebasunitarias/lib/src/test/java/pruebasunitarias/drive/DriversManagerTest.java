package pruebasunitarias.drive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DriversManagerTest {
	
	private DriversManager dm = new DriversManager();
	
	@DisplayName("Pruebas en el metodo passenger")
	
	@Test
	void isAddPassenger() {
		Passenger p1 = new Passenger("Jonathan","141298");
		dm.addPassenger(p1);
		assertEquals(p1,dm.getPassenger(p1.getId()));

	}
	
	@Test
	void isAddDriver() {
		Driver d1 = new Driver("Mau","240397",100);
		dm.addDriver(d1);
		assertEquals(d1,dm.getDriver(d1.getId()));
	}

}
