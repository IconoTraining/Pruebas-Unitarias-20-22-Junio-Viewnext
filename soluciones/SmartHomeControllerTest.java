import static org.mockito.Mockito.*;

import java.time.LocalDateTime;

import advanced.BackyardSwitcher;
import advanced.SmartHomeController;
import advanced.TimeUtils;
import org.junit.jupiter.api.Test;

class SmartHomeControllerTest {
	
//	@Test
//	void siDetectaMovimientoYEsEveningEnciendeLaBombilla() {
//
//		LocalDateTime fakeTime = LocalDateTime.now().withHour(20);
//
//		TimeUtils fakeTimeUtils = mock(TimeUtils.class);
//		when(fakeTimeUtils.getTimeOfDay(isA(LocalDateTime.class))).thenReturn("Evening");
//
//		BackyardSwitcher fakeSwitcher = mock(BackyardSwitcher.class);
//
//		SmartHomeController controller = new SmartHomeController();
//		controller.setTime(fakeTime);
//		controller.setTimeUtils(fakeTimeUtils);
//		controller.setBackyardSwitcher(fakeSwitcher);
//
//		controller.actuateLights(true);
//
//		verify(fakeSwitcher).turnOn();
//	}
	
	
	
	
	
	
//	@Test
//	void SiDetectaMovimientoYEsEveningEnciendeLaBombilla() {
//		
//		class advanced.BackyardSwitcher implements advanced.SwitcherInterface {
//			
//			public boolean turnOnCalled = false;
//			
//			public void turnOn() {
//				this.turnOnCalled = true;
//			}
//			
//			public void turnOff() {
//				
//			}
//		}
//		
//		LocalDateTime fakeTime = LocalDateTime.now().withHour(20);
//		advanced.TimeUtils timeUtils = new advanced.TimeUtils();
//		advanced.BackyardSwitcher fakeSwitcher = new advanced.BackyardSwitcher();
//		
//		advanced.SmartHomeController controller = new advanced.SmartHomeController();
//		controller.setTime(fakeTime);
//		controller.setTimeUtils(timeUtils);
//		controller.setBackyardSwitcher(fakeSwitcher);
//		
//		controller.actuateLights(true);
//		assertTrue(fakeSwitcher.turnOnCalled);
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Test
//	void SiDetectaMovimientoYEsEveningEnciendeLaBombilla() {
//		// Set up
//		advanced.TimeUtils timeUtils = mock(advanced.TimeUtils.class);
//		when(timeUtils.getTimeOfDay(isA(LocalDateTime.class))).thenReturn("Night");
//		
//		advanced.SwitcherInterface switcher = mock(advanced.BackyardSwitcher.class);
//		
//		LocalDateTime time = LocalDateTime.now();
//		
//		advanced.SmartHomeController controller = new advanced.SmartHomeController();
//		controller.setTimeUtils(timeUtils);
//		controller.setBackyardSwitcher(switcher);
//		controller.setTime(time);
//		
//		// Act
//		controller.actuateLights(true);
//		
//		// Assert
//		verify(switcher).turnOn();
//	}
//	
//	@Test
//	void SiPasaMenosDelTiempoEstipuladoSinDetectarMovimientoLaBombillaSeQuedaComoEsté() {
//		// SetUp - parte 1:
//		// Llamo a actuateLights:
//		// - Con detección de movimiento
//		// - Siendo Evening 
//		// - para que se encienda la bombilla
//		
//		advanced.TimeUtils timeUtils = mock(advanced.TimeUtils.class);
//		when(timeUtils.getTimeOfDay(isA(LocalDateTime.class))).thenReturn("Evening");
//		
//		advanced.SwitcherInterface switcher = mock(advanced.BackyardSwitcher.class);
//		
//		LocalDateTime time1 = LocalDateTime.now().withHour(19).withMinute(10).withSecond(0);
//		
//		advanced.SmartHomeController controller = new advanced.SmartHomeController();
//		controller.setTimeUtils(timeUtils);
//		controller.setBackyardSwitcher(switcher);
//		controller.setTime(time1);
//		
//		controller.actuateLights(true);
//		
//		// SetUp - parte 2:
//		// Setup para llamar a actuateLights:
//		// - SIN detección de movimiento
//		// - Siendo Evening 
//		// - Habiendo pasado menos tiempo del necesario (59 segundos)
//		// - Para VERIFICAR que NO se actúa sobre la bombilla
//				
//		LocalDateTime time2 = LocalDateTime.now().withHour(19).withMinute(10).withSecond(59);
//		
//		advanced.SwitcherInterface mockSwitcher2 = mock(advanced.BackyardSwitcher.class);
//		
//		controller.setTime(time2);
//		controller.setBackyardSwitcher(mockSwitcher2);
//		
//		// Fin del Setup
//		
//		// Act
//		controller.actuateLights(false);
//		
//		// Assert
//		verify(mockSwitcher2, never()).turnOn();
//		verify(mockSwitcher2, never()).turnOff();
//	}
//	
//	@Test
//	void SiPasaElTiempoEstipuladoSinDetectarMovimientoSeApagaLaBombilla() {
//		// SetUp - parte 1:
//		// Llamo a actuateLights:
//		// - Con detección de movimiento
//		// - Siendo Evening 
//		// - para que se encienda la bombilla
//		advanced.TimeUtils timeUtils = mock(advanced.TimeUtils.class);
//		when(timeUtils.getTimeOfDay(isA(LocalDateTime.class))).thenReturn("Evening");
//		
//		advanced.SwitcherInterface mockSwitcher1 = mock(advanced.BackyardSwitcher.class);
//		
//		LocalDateTime time1 = LocalDateTime.now();
//		
//		advanced.SmartHomeController controller = new advanced.SmartHomeController();
//		controller.setTimeUtils(timeUtils);
//		controller.setBackyardSwitcher(mockSwitcher1);
//		controller.setTime(time1);
//		controller.actuateLights(true);
//		
//		// SetUp - parte 2:
//		// Setup para llamar a actuateLights:
//		// - SIN detección de movimiento
//		// - Siendo Evening 
//		// - Habiendo pasado el tiempo necesario
//		// - Para VERIFICAR que se apaga la bombilla
//		
//		advanced.SwitcherInterface mockSwitcher2 = mock(advanced.BackyardSwitcher.class);
//		
//		LocalDateTime time2 = LocalDateTime.now().withHour(19).withMinute(11).withSecond(01); 
//		
//		controller.setTime(time2);
//		controller.setBackyardSwitcher(mockSwitcher2);
//		
//		// Fin del Setup
//		
//		// Act
//		controller.actuateLights(false);
//		
//		// Assert 
//		verify(mockSwitcher2).turnOff();
//	}

}
