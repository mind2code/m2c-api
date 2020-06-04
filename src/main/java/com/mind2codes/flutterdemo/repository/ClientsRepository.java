package com.mind2codes.flutterdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mind2codes.flutterdemo.domain.Clients;

@Repository
public interface ClientsRepository extends JpaRepository<Clients, Long> {

}
