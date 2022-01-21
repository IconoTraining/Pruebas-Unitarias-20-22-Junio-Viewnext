package advanced;

import java.time.LocalDateTime;



public class SmartHomeController
{
	private LocalDateTime lastMotionTime;

	public void actuateLights(boolean motionDetected)
    {		
		LocalDateTime time = LocalDateTime.now();
		
        // Update the time of last motion.
        if (motionDetected) {
            this.lastMotionTime = time;
        }
        
        // If motion was detected in the evening or at night, turn the light on.
        TimeUtils timeUtils = new TimeUtils();
        String timeOfDay = timeUtils.getTimeOfDay();
        
        BackyardSwitcher backyardSwitcher = new BackyardSwitcher();
        if (motionDetected && (timeOfDay == "Evening" || timeOfDay == "Night")) {
        	backyardSwitcher.turnOn();
        }
        // If no motion is detected for one minute, or if it is morning or day, turn the light off.
        else if (time.isAfter(this.lastMotionTime.plusSeconds(60)) || (timeOfDay == "Morning" || timeOfDay == "Afternoon")){
        	backyardSwitcher.turnOff();
        }
    }
	
}