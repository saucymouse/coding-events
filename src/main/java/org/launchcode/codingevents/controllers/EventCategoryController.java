package org.launchcode.codingevents.controllers;

import org.launchcode.codingevents.data.EventCategoryRepository;
import org.launchcode.codingevents.models.Event;
import org.launchcode.codingevents.models.EventCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
//CASE MATTERS---eventCategories must match casing of directory and directory must be lowercase
@RequestMapping("eventcategories")
public class EventCategoryController {

    @Autowired
    private EventCategoryRepository eventCategoryRepository;

    @GetMapping
    public String displayAllEvents(Model model) {
        model.addAttribute("title", "All Categories");
        model.addAttribute("categories", eventCategoryRepository.findAll());
        return "eventcategories/index";
    }

    @GetMapping("create")
    public String renderCreateEventCategoryForm(Model model, @ModelAttribute EventCategory eventCategory) {
        model.addAttribute("title", "Create Category");
//        model.addAttribute(new EventCategory());
        return "eventcategories/create";
    }

    @PostMapping("create")
    public String processCreateEventCategoryForm(Model model, @ModelAttribute @Valid EventCategory eventCategory, Errors errors) {
        model.addAttribute("title", "Create Category");
        if (errors.hasErrors()) {
            return "eventcategories/create";
        } else {
            eventCategoryRepository.save(eventCategory);
            return "redirect:";
        }
    }

}
