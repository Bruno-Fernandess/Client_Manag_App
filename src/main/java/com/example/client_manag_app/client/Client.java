package com.example.client_manag_app.client;

import javax.persistence.*;

@Entity
@Table(name="clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false, length = 75)
    private String name;

    @Column(unique = true, nullable = false, length = 9)
    private String nif;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone_nr;




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_nr() {
        return phone_nr;
    }

    public void setPhone_nr(String phone_nr) {
        this.phone_nr = phone_nr;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nif='" + nif + '\'' +
                ", address='" + address + '\'' +
                ", phone_nr='" + phone_nr + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (!id.equals(client.id)) return false;
        if (!name.equals(client.name)) return false;
        if (!nif.equals(client.nif)) return false;
        if (!address.equals(client.address)) return false;
        return phone_nr.equals(client.phone_nr);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + nif.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + phone_nr.hashCode();
        return result;
    }
}
