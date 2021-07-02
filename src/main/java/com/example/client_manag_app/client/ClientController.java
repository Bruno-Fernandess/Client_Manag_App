package com.example.client_manag_app.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
//@RequestMapping("/api")
public class ClientController {

    @Autowired ClientRepository repo;

    @GetMapping("/clients")
    public List<Client> getAllClients() {
        return (List<Client>) repo.findAll();
    }
}
