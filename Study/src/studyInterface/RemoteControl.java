package studyInterface;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 1;
	
	public abstract void turnOn();
	abstract void turnOff();
	void setVolume(int volume);
	
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("음소거 되었습니다.");
		} else {
			System.out.println("음소거가 꺼졌습니다.");
		}
	}
	
	public static void changeBattery() {
		System.out.println("건전기 교환");
	}
}