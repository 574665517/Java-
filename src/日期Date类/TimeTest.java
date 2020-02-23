package 日期Date类;

import java.time.Clock;
import java.time.LocalDateTime;
import java.util.Date;

public class TimeTest {
	public static void main(String[] args) {
		Date date = new Date();//老外的时间表示
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