package interface_design;

public class Computer2 {
	private USB usb;
	                // 參數多型 (任何實作USB的物件都能傳入)
	public void setUSB(USB usb) {
		this.usb = usb;
	}
	
	public void workWithUSB() {
		usb.work();
	}
}
