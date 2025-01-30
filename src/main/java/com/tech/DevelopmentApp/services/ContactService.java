package com.tech.DevelopmentApp.services;

import com.tech.DevelopmentApp.Model.Contact;
import com.tech.DevelopmentApp.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public Contact saveContact(Contact contact) {
        return contactRepository.save(contact);
    }
}