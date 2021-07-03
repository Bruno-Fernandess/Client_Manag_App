package com.example.client_manag_app.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired private ClientRepository repo;

    public List<Client> findAll(){
        return (List<Client>) repo.findAll();
    }

    public void deleteById(Integer id){
        repo.deleteById(id);
    }

    public Client save(Client cl) {
        repo.save(cl);
        return cl;
    }

    public Client findById(Integer id){
        Optional<Client> cl = repo.findById(id);
        return cl.get();
    }

    public Client getClientByNIF(String nif){
        return repo.findClientByNif(nif);
    }

    public List<Client> getClientsWithName(String name){
        return repo.findAllByNameContaining(name);
    }

}
