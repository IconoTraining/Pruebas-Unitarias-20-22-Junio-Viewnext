package advanced;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito.mock;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SmartHomeControllerTest {

    @Test
	void siDetectaMovimientoYEsEveningEnciendeLaBombilla_mockManual() {

		class BackyardSwitcherFake implements SwitcherInterface {

			public boolean turnOnCalled = false;

			public void turnOn() {
				this.turnOnCalled = true;
			}

			public void turnOff() {

			}
		}

		LocalDateTime fakeTime = LocalDateTime.now().withHour(20);
		TimeUtils timeUtils = new advanced.TimeUtils();
		BackyardSwitcherFake fakeSwitcher = new BackyardSwitcherFake();

		SmartHomeController controller = new advanced.SmartHomeController(fakeSwitcher);

		controller.actuateLights(true, fakeTime);
		assertTrue(fakeSwitcher.turnOnCalled);
	}


//	@Test
//	void siDetectaMovimientoYEsEveningEnciendeLaBombilla_fakeTimeUtils() {
//
//		LocalDateTime fakeTime = LocalDateTime.now().withHour(20);
//
//		TimeUtils fakeTimeUtils = mock(TimeUtils.class);
//		when(fakeTimeUtils.getTimeOfDay(isA(LocalDateTime.class))).thenReturn("Evening");
//
//		BackyardSwitcher fakeSwitcher = mock(BackyardSwitcher.class);
//
//		SmartHomeController controller = new SmartHomeController(fakeSwitcher, fakeTimeUtils);
//
//		controller.actuateLights(true, fakeTime);
//
//		verify(fakeSwitcher).turnOn();
//	}

	@Test
	void SiDetectaMovimientoYEsEveningEnciendeLaBombilla() {
		// Set up
		SwitcherInterface switcher = mock(BackyardSwitcher.class);
		LocalDateTime fakeTime = LocalDateTime.now().withHour(20);

		SmartHomeController controller = new SmartHomeController(switcher);;

		// Act
		controller.actuateLights(true, fakeTime);

		// Assert
		verify(switcher).turnOn();
	}

	@Test
	void SiPasaMenosDelTiempoEstipuladoSinDetectarMovimientoLaBombillaSeQuedaComoEsté() {
		// SetUp - parte 1:
		// Llamo a actuateLights:
		// - Con detección de movimiento
		// - Siendo Evening
		// - para que se encienda la bombilla
		TimeUtils timeUtils = mock(TimeUtils.class);
		SwitcherInterface mockSwitcher = mock(BackyardSwitcher.class);
		LocalDateTime time1 = LocalDateTime.now().withHour(19).withMinute(10).withSecond(00);

		SmartHomeController controller = new SmartHomeController(mockSwitcher);
		controller.actuateLights(true, time1);

		// SetUp - parte 2:
		// Setup para llamar a actuateLights:
		// - SIN detección de movimiento
		// - Siendo Evening
		// - Habiendo pasado menos tiempo del necesario (59 segundos)
		// - Para VERIFICAR que NO se actúa sobre la bombilla

		LocalDateTime time2 = LocalDateTime.now().withHour(19).withMinute(10).withSecond(59);
		// Fin del Setup

		// Act
		controller.actuateLights(false, time2);

		// Assert
		verify(mockSwitcher, never()).turnOn();
		verify(mockSwitcher, never()).turnOff();
	}

	@Test
	void SiPasaElTiempoEstipuladoSinDetectarMovimientoSeApagaLaBombilla() {
		// SetUp - parte 1:
		// Llamo a actuateLights:
		// - Con detección de movimiento
		// - Siendo Evening
		// - para que se encienda la bombilla
		TimeUtils timeUtils = mock(TimeUtils.class);
		SwitcherInterface mockSwitcher = mock(BackyardSwitcher.class);
		LocalDateTime time1 = LocalDateTime.now().withHour(19).withMinute(10).withSecond(00);

		SmartHomeController controller = new SmartHomeController(mockSwitcher);
		controller.actuateLights(true, time1);

		// SetUp - parte 2:
		// Setup para llamar a actuateLights:
		// - SIN detección de movimiento
		// - Siendo Evening
		// - Habiendo pasado el tiempo necesario
		// - Para VERIFICAR que se apaga la bombilla
		LocalDateTime time2 = LocalDateTime.now().withHour(19).withMinute(11).withSecond(01);

		// Fin del Setup

		// Act
		controller.actuateLights(false, time2);

		// Assert
		verify(mockSwitcher).turnOff();
	}
}