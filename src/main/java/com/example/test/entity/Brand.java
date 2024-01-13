package com.example.test.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String Logo;

    public Brand() {
    }

    public Brand(String name, String logo) {
        this.name = name;
        Logo = logo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return Logo;
    }

    public void setLogo(String logo) {
        Logo = logo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Brand{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", Logo='").append(Logo).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
