package org.launchcode.codingevents;

import org.launchcode.codingevents.data.EventData;
import org.launchcode.codingevents.models.Event;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodingEventsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodingEventsApplication.class, args);
		Event event1 = new Event("Pie Eating Contest", "No forks allowed", "pieman@eatme.com");
		Event event2 = new Event("Fashion Show for Nerds", "Also known as a convention", "pinky@powerranger.com");
		Event event3 = new Event("LOSERS CLUB", "NO COOL PPL ALLOWED", "iamlame@dumb.com");
		EventData.add(event1);
		EventData.add(event2);
		EventData.add(event3);
	}


}
