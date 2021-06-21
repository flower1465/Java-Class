package day0420_3;

public class Button {
	
	interface OnClickListener {
		void onClick();
	}
	
	OnClickListener listener;
	
	void serOnClickListener (OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
}
