package com.example.client_manag_app.client;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientRepository extends CrudRepository<Client,Integer> {

public Client findClientByNif(String nif);
public List<Client> findAllByNameContains(String name);

}