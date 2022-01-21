package advanced;

import java.time.LocalDateTime;



public class SmartHomeController
{
	private LocalDateTime lastMotionTime;

	public void actuateLights(boolean motionDetected)
    {		
		LocalDateTime time = LocalDateTime.now();
		
        // Nos anotamos la hora para llevar cuenta de la última vez que se detectó movimiento
        if (motionDetected) {
            this.lastMotionTime = time;
        }
        
        TimeUtils timeUtils = new TimeUtils();
        String timeOfDay = timeUtils.getTimeOfDay();
        
        BackyardSwitcher backyardSwitcher = new BackyardSwitcher();
        // Si se ha detectado movimiento durante Evening o Night, encendemos la luz
        if (motionDetected && (timeOfDay == "Evening" || timeOfDay == "Night")) {
        	backyardSwitcher.turnOn();
        }
        // Si no se ha detectado movimiento desde hace 1 minuto o más, or o si es morning o si es afternoon, apagamos la luz.
        else if (time.isAfter(this.lastMotionTime.plusSeconds(60)) || (timeOfDay == "Morning" || timeOfDay == "Afternoon")){
        	backyardSwitcher.turnOff();
        }

        // En los casos que no sean los anteriores, ni encendemos ni apagamos la luz. La dejamos como esté.
    }
	
}