package ca.sheridan.assignment3.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactDataRepository extends JpaRepository<Contact, Integer> {
}
