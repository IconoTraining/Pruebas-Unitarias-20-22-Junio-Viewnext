import static org.mockito.Mockito.*;

import java.time.LocalDateTime;

import BackyardSwitcher;
import SmartHomeController;
import TimeUtils;
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






//    @Test
//    void SiDetectaMovimientoYEsEveningEnciendeLaBombilla() {
//
//        class BackyardSwitcherFake implements SwitcherInterface {
//
//            public boolean turnOnCalled = false;
//
//            public void turnOn() {
//                this.turnOnCalled = true;
//            }
//
//            public void turnOff() {
//
//            }
//        }
//
//        LocalDateTime fakeTime = LocalDateTime.now().withHour(20);
//        TimeUtils timeUtils = new TimeUtils();
//        BackyardSwitcherFake fakeSwitcher = new BackyardSwitcherFake();
//
//        SmartHomeController controller = new SmartHomeController(fakeSwitcher);
//
//        controller.actuateLights(true, fakeTime);
//        assertTrue(fakeSwitcher.turnOnCalled);
//    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Test
//	void SiDetectaMovimientoYEsEveningEnciendeLaBombilla() {
//		// Set up
//		TimeUtils timeUtils = mock(TimeUtils.class);
//		when(timeUtils.getTimeOfDay(isA(LocalDateTime.class))).thenReturn("Night");
//		
//		SwitcherInterface switcher = mock(BackyardSwitcher.class);
//		
//		LocalDateTime time = LocalDateTime.now();
//		
//		SmartHomeController controller = new SmartHomeController();
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
//		TimeUtils timeUtils = mock(TimeUtils.class);
//		when(timeUtils.getTimeOfDay(isA(LocalDateTime.class))).thenReturn("Evening");
//		
//		SwitcherInterface switcher = mock(BackyardSwitcher.class);
//		
//		LocalDateTime time1 = LocalDateTime.now().withHour(19).withMinute(10).withSecond(0);
//		
//		SmartHomeController controller = new SmartHomeController();
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
//		SwitcherInterface mockSwitcher2 = mock(BackyardSwitcher.class);
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
//		TimeUtils timeUtils = mock(TimeUtils.class);
//		when(timeUtils.getTimeOfDay(isA(LocalDateTime.class))).thenReturn("Evening");
//		
//		SwitcherInterface mockSwitcher1 = mock(BackyardSwitcher.class);
//		
//		LocalDateTime time1 = LocalDateTime.now();
//		
//		SmartHomeController controller = new SmartHomeController();
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
//		SwitcherInterface mockSwitcher2 = mock(BackyardSwitcher.class);
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
