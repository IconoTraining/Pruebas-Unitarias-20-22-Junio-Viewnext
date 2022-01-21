package advanced;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;

class TimeUtilsTest {

	@Test
	void entreLas0yLas6DevuelveNight() {
		LocalDateTime time = LocalDateTime.now().withHour(0);
		TimeUtils myClass = new TimeUtils();
  		String output = myClass.getTimeOfDay(time);
  		assertEquals("Night", output);
	}

	@Test
	void ALas1DevuelveNight() {
		LocalDateTime time = LocalDateTime.now().withHour(1);
		TimeUtils myClass = new TimeUtils();
  		String output = myClass.getTimeOfDay(time);
  		assertEquals("Night", output);
	}

	@Test
	void ALas5DevuelveNight() {
		LocalDateTime time = LocalDateTime.now().withHour(5);
		TimeUtils myClass = new TimeUtils();
  		String output = myClass.getTimeOfDay(time);
  		assertEquals("Night", output);
	}

	@Test
	void entreLas6yLas12DevuelveMorning() {
		LocalDateTime time = LocalDateTime.now().withHour(6);
		TimeUtils myClass = new TimeUtils();
  		String output = myClass.getTimeOfDay(time);
  		assertEquals("Morning", output);
	}

	@Test
	void ALas12DevuelveAfternoon() {
		LocalDateTime time = LocalDateTime.now().withHour(12);
		TimeUtils myClass = new TimeUtils();
  		String output = myClass.getTimeOfDay(time);
  		assertEquals("Afternoon", output);
	}

	@Test
	void ALas18DevuelveEvening() {
		LocalDateTime time = LocalDateTime.now().withHour(18);
		TimeUtils myClass = new TimeUtils();
  		String output = myClass.getTimeOfDay(time);
  		assertEquals("Evening", output);
	}
}