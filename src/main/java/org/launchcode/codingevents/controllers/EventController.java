package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String displayAllEvents(Model model) {
        List<String> events = Arrays.asList("Code With Pride", "Strange Loop", "Apple WWDC", "SpringOne Platform");
        model.addAttribute("events", events);
        return "events/index";
    }

    public String renderCreateEvent() {
        return "events/create";
    }

}
