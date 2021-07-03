package com.example.client_manag_app;

import com.example.client_manag_app.client.Client;
import com.example.client_manag_app.client.ClientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

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
        cl.setName("joao");
        cl.setAddress("Rua xx");
        cl.setNif("999999999");
        cl.setPhone_nr("911111111");
        repo.save(cl);

        //test here
    }


}
