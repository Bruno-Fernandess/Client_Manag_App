package com.example.client_manag_app;

import com.example.client_manag_app.client.Client;
import com.example.client_manag_app.client.ClientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;
import java.util.Optional;

@DataJpaTest
// run tests against real database
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
// keep changes in db
@Rollback(false)

public class ClientRepositoryTests {

    @Autowired private ClientRepository repo;

    @Test
    public void AddClientTest(){
        Client cl = new Client();
        cl.setName("miguel jose");
        cl.setAddress("Rua yy");
        cl.setNif("888888889");
        cl.setPhone_nr("933333334");
        repo.save(cl);

        //test
    }

    @Test
    public void GetClientTest(){
        Integer client_id = 1;
        Optional<Client> op_cl = repo.findById(client_id);
        System.out.println(op_cl.get());

        //test

    }

    @Test
    public void UpdateClientTest(){
        Integer client_id = 1;
        Optional<Client> op_cl = repo.findById(client_id);
        Client cl = op_cl.get();
        cl.setAddress("Avenida xx");
        repo.save(cl);

        //test
    }

    @Test
    public void DeleteClientTest(){
        Integer client_id = 2;
        repo.deleteById(client_id);

        //test
    }

    @Test
    public void ClientsListTest(){
        Iterable<Client> cls = repo.findAll();

        for(Client cl : cls)
            System.out.println(cl);

        //test
    }

    @Test
    public void GetClientByNIFTest(){
        String client_nif = "888888889";
        Client cl = repo.findClientByNif(client_nif);
        System.out.println(cl);

        //test

    }

    @Test
    public void GetClientsWithNameTest(){
        String client_name = "miguel";
        List<Client> cl_lst = repo.findAllByNameContaining(client_name);
        System.out.println(cl_lst);

        //test

    }



}
