package com.example.football.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
public class Club {

    private Long id;
    private String name;
    private String footballer;
    private String manager;


    public Club() {
    }

    public Club(Long id, String name, String footballer, String manager) {
        this.id = id;
        this.name = name;
        this.footballer = footballer;
        this.manager = manager;
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

    public String getFootballer() {
        return footballer;
    }

    public void setFootballer(String footballer) {
        this.footballer = footballer;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
}
