import java.time.LocalDateTime;



public class SmartHomeController
{
	// @Inject / @Autowired
	private LocalDateTime time;
	
	// @Inject / @Autowired
	private TimeUtils timeUtils;
	
	// @Inject / @Autowired
	private SwitcherInterface backyardSwitcher;
	
	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public TimeUtils getTimeUtils() {
		return timeUtils;
	}

	public void setTimeUtils(TimeUtils timeUtils) {
		this.timeUtils = timeUtils;
	}

	public SwitcherInterface getBackyardSwitcher() {
		return backyardSwitcher;
	}

	public void setBackyardSwitcher(SwitcherInterface backyardSwitcher) {
		this.backyardSwitcher = backyardSwitcher;
	}

	public LocalDateTime getLastMotionTime() {
		return lastMotionTime;
	}

	public void setLastMotionTime(LocalDateTime lastMotionTime) {
		this.lastMotionTime = lastMotionTime;
	}

	private LocalDateTime lastMotionTime;
	
//	public SmartHomeController(LocalDateTime time, TimeUtils timeUtils, BackyardSwitcher backyardSwitcher) {
//		this.lastMotionTime = time;
//		this.timeUtils = timeUtils;
//		this.backyardSwitcher = backyardSwitcher;
//	}

	public void actuateLights(boolean motionDetected)
    {		
		// LocalDateTime time = LocalDateTime.now();
		
        // Update the time of last motion.
        if (motionDetected) {
            this.lastMotionTime = this.time;
        }
        
        // If motion was detected in the evening or at night, turn the light on.
        // TimeUtils timeUtils = new TimeUtils();
        String timeOfDay = this.timeUtils.getTimeOfDay(time); 
        
        // BackyardSwitcher backyardSwitcher = new BackyardSwitcher();
        if (motionDetected && (timeOfDay == "Evening" || timeOfDay == "Night")) {
        	this.backyardSwitcher.turnOn();
        }
        // If no motion is detected for one minute, or if it is morning or day, turn the light off.
        else if (this.time.isAfter(this.lastMotionTime.plusSeconds(60)) || (timeOfDay == "Morning" || timeOfDay == "Afternoon")){
        	this.backyardSwitcher.turnOff();
        }
    }
	
}