package ����Date��;

import java.time.Clock;
import java.time.LocalDateTime;
import java.util.Date;

public class TimeTest {
	public static void main(String[] args) {
		Date date = new Date();//�����ʱ���ʾ
		System.out.println(date);
		final Clock clock = Clock.systemUTC();
		System.out.println(clock.instant());
		System.out.println(clock.millis());
		final LocalDateTime datetime = LocalDateTime.now();
		final LocalDateTime datetimeFromClock = LocalDateTime.now(clock);
		System.out.println(datetime);
		System.out.println(datetimeFromClock);
	}
}