package com.example.client_manag_app.client;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ClientService {

    @Autowired private ClientRepository repo;

    public Client getClientByNIF(){
        return new Client();
    }

    public List<Client> getClientsWithName(){
        return new ArrayList<>();
    }

}
