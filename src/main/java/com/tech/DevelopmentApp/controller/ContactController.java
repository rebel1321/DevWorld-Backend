package com.tech.DevelopmentApp.controller;

import com.tech.DevelopmentApp.Model.Contact;
import com.tech.DevelopmentApp.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping("/submit")
    public ResponseEntity<String> submitContactForm(@RequestBody Contact contact) {
        try {
            contactService.saveContact(contact);
            return ResponseEntity.ok("Message has been sent successfully!");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("An error occurred. Please try again.");
        }
    }
}
