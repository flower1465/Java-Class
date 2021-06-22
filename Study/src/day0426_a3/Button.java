package day0426_a3;

public class Button {

	interface OnClickListener {
		void onClick();
	}
	
	OnClickListener listener;
	
	void setOnclickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
}
