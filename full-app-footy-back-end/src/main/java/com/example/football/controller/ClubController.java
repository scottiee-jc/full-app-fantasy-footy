package com.example.football.controller;

import com.example.football.model.Club;
import com.example.football.repo.ClubRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/clubs")
@CrossOrigin("http://localhost:3000")
public class ClubController {

    // wired in the club repo
    private ClubRepository clubRepository;

    // constructor with club repo as a param, calling a specific club repo
    public ClubController(ClubRepository clubRepository){
        this.clubRepository = clubRepository;
    }

    @GetMapping
    Collection<Club> getAll() {
        return clubRepository.getAll();
    }

    @GetMapping("/{id}")
    Club get(@PathVariable Long id) {
        return clubRepository.get(id);
    }
    // gets the information associated with a specific club by connecting
    // to the club repo and accessing the HashMap containing the unique Id for the club

    @PostMapping
    void create(@RequestBody Club club) {
        clubRepository.add(club);
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id){
        clubRepository.delete(id);
    }
}
