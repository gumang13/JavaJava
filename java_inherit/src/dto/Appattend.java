package dto;

import able.Attendance;

public class Appattend implements Attendance{
            private boolean present = false;
	@Override
	public void checkIn() {
		present = true;
		System.out.println("QR 출석 완료.");		
	}

	@Override
	public void checkOut() {
		present = false;
		System.out.println("QR 퇴실 완료.");
	}

	@Override
	public boolean isPresent() {
		return present;
	}

}
