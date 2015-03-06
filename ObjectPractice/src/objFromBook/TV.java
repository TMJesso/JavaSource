package objFromBook;

public class TV {
	int channel = 1; // default channel is 1
	int volumeLevel = 1; // default volume level is 1
	boolean on = false; // tv is off
	
	public TV() {
	}
	
	public void turnOn() {
		this.on = true;
	}
	
	public void turnOff() {
		this.on = false;
	}
	
	public void setChannel(int newChannel) {
		if (this.on && newChannel >= 1 && newChannel <= 120) {
			this.channel = newChannel;
		}
	}
	
	public void setVolume(int newVolumeLevel) {
		if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7) {
			this.volumeLevel = newVolumeLevel;
		}
	}
	
	public void channelUp() {
		if (this.on && this.channel < 120) {
			this.channel++;
		}
	}
	
	public void channelDown() {
		if (this.on && this.channel > 1) {
			this.channel--;
		}
	}
	
	public void volumeUp() {
		if (this.on && this.volumeLevel < 7) {
			this.volumeLevel++;
		}
	}
	
	public void volumeDown() {
		if (this.on && this.volumeLevel > 1) {
			this.volumeLevel--;
		}
	}
}
