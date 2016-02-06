package com.meetup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.util.TimeZone;

/**
 * The Application
 */
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	private static void setTimeZone(final Environment env) {
		/*If app.timezone is abset set default timezone to UTC*/
		final String appTimeZone = env.getProperty("app.timezone", "Etc/UTC");
		TimeZone.setDefault(TimeZone.getTimeZone(appTimeZone));
	}
}
