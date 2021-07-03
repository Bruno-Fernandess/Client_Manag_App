package com.example.client_manag_app.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
//@RequestMapping("/api")
public class ClientController {

    //@Autowired ClientRepository repo;
    @Autowired ClientService service;

    @GetMapping("/clients")
    public List<Client> getAllClients() {
        return service.findAll();
    }

    @GetMapping("/clients/{name}")
    public ResponseEntity<List<Client>> findByName(@PathVariable("name") String name) {
        List<Client> cls_name = service.getClientsWithName(name);
        return new ResponseEntity<List<Client>>(cls_name, HttpStatus.OK);
    }

    @PostMapping("/clients/client")
    public ResponseEntity<Client> createClient(@RequestBody Client cl) {
        Client new_cl = service.save(cl);
        return new ResponseEntity<Client>(new_cl, HttpStatus.OK);
    }


    @GetMapping("/clients/client/{nif}")
    public ResponseEntity<Client> getClientByNif(@PathVariable("nif") String nif) {
        Client cl = service.getClientByNIF(nif);
        return new ResponseEntity<Client>(cl, HttpStatus.OK);
    }


    @PutMapping("/clients/client/{id}")
    public ResponseEntity<Client> updateClient(@PathVariable("id") Integer id, @RequestBody Client cl) {
        Client up_cl = service.save(cl);
        return new ResponseEntity<Client>(up_cl, HttpStatus.OK);
    }


    @DeleteMapping("/clients/client/{id}")
    public ResponseEntity<HttpStatus> deleteClient(@PathVariable("id") Integer id) {
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }





}
