import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import advanced.TimeUtils;
import org.junit.jupiter.api.Test;

class TimeUtilsTest {

	// ¿Cómo?
	
	
//	@Test
//	void getTimeOfDay() {
//
//		LocalDateTime time = LocalDateTime.now();
//		advanced.TimeUtils myClass = new advanced.TimeUtils();
//		String output = myClass.getTimeOfDay();
//		
//	    if (time.getHour() >= 0 && time.getHour() < 6)
//	    {
//	        assertEquals("Night", output);
//	    }
//	    else if (time.getHour() < 12)
//	    {
//	    	assertEquals("Morning", output); 
//	    }
//	    else if (time.getHour() < 18)
//	    {
//	    	assertEquals("Afternoon", output);
//	    }
//	    else {
//	    	assertEquals("Evening", output);
//	    }
//	}
	
	// Cambiar la hora del sistema y después probar
//	@BeforeAll
//	static void initAll() {
//		// Guardo la hora actual
//	}
//	
//	@AfterAll
//	static void tearDownAll() {
//		// Restuaro la hora
//	}
//	
//	@Test
//	void ALas0DevuelveNight() {
//		// Cambiar la hora del sistema a las 00:00
//		advanced.TimeUtils myClass = new advanced.TimeUtils();
//  		String output = myClass.getTimeOfDay();
//  		assertEquals("Night", output);
//	}
//	
//	@Test
//	void ALas1DevuelveNight() {
//		// Cambiar la hora del sistema a las 01:00
//		advanced.TimeUtils myClass = new advanced.TimeUtils();
//  		String output = myClass.getTimeOfDay();
//  		assertEquals("Night", output);
//	}
//	
//	@Test
//	void ALas6DevuelveMorning() {
//		// Cambiar la hora del sistema a las 06:00
//		advanced.TimeUtils myClass = new advanced.TimeUtils();
//  		String output = myClass.getTimeOfDay();
//  		assertEquals("Morning", output);
//	}
//	
//	@Test
//	void ALas12DevuelveAfternoon() {
//		advanced.TimeUtils myClass = new advanced.TimeUtils();
//  		String output = myClass.getTimeOfDay();
//  		assertEquals("Afternoon", output);
//	}
//	
//	@Test
//	void ALas18DevuelveEvening() {
//		advanced.TimeUtils myClass = new advanced.TimeUtils();
//  		String output = myClass.getTimeOfDay();
//  		assertEquals("Evening", output);
//	}

	// Cambiar la variable time en tiempo de ejecución depurando 
	
	
	
	
//	// Generar una variable time en tiempo de ejecución
//	@Test
//	void entreLas0yLas6DevuelveNight() {
//		LocalDateTime time = LocalDateTime.now().withHour(0);
//		TimeUtils myClass = new TimeUtils();
//  		String output = myClass.getTimeOfDay(time);
//  		assertEquals("Night", output);
//	}
//
//	@Test
//	void ALas1DevuelveNight() {
//		LocalDateTime time = LocalDateTime.now().withHour(1);
//		TimeUtils myClass = new TimeUtils();
//  		String output = myClass.getTimeOfDay(time);
//  		assertEquals("Night", output);
//	}
//
//	@Test
//	void ALas5DevuelveNight() {
//		LocalDateTime time = LocalDateTime.now().withHour(5);
//		TimeUtils myClass = new TimeUtils();
//  		String output = myClass.getTimeOfDay(time);
//  		assertEquals("Night", output);
//	}
//
//	@Test
//	void entreLas6yLas12DevuelveMorning() {
//		LocalDateTime time = LocalDateTime.now().withHour(6);
//		TimeUtils myClass = new TimeUtils();
//  		String output = myClass.getTimeOfDay(time);
//  		assertEquals("Morning", output);
//	}
//
//	@Test
//	void ALas12DevuelveAfternoon() {
//		LocalDateTime time = LocalDateTime.now().withHour(12);
//		TimeUtils myClass = new TimeUtils();
//  		String output = myClass.getTimeOfDay(time);
//  		assertEquals("Afternoon", output);
//	}
//
//	@Test
//	void ALas18DevuelveEvening() {
//		LocalDateTime time = LocalDateTime.now().withHour(18);
//		TimeUtils myClass = new TimeUtils();
//  		String output = myClass.getTimeOfDay(time);
//  		assertEquals("Evening", output);
//	}
	
}
