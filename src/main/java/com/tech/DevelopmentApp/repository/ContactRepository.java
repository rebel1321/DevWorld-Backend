package com.tech.DevelopmentApp.repository;

import com.tech.DevelopmentApp.Model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
