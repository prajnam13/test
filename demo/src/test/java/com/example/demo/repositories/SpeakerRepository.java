package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Session;

public interface SpeakerRepository extends JpaRepository<Session, Long> {

}
