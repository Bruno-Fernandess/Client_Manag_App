package com.example.client_manag_app;


import com.example.client_manag_app.client.Client;
import com.example.client_manag_app.client.ClientRepository;
import com.example.client_manag_app.client.ClientService;
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
public class ClientServiceTests {

    @Autowired private ClientService service;

    @Test
    public void GetClientsWithNameTest(){
      //test
    }

    @Test
    public void GetClientByNIF(){
        //test
    }

}
