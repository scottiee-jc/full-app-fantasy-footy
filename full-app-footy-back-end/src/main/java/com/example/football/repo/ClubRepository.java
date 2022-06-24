package com.example.football.repo;

import com.example.football.model.Club;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

@Repository
public class ClubRepository {
    private Map<Long, Club> clubMap = new HashMap();
    {
        clubMap.put(1L, new Club(1l, "Liverpool FC", "Jordan Henderson", "Jurgen Klopp"));
        clubMap.put(2L, new Club(2L, "Manchester City", "Kevin De Bruyne", "Pep Guardiola"));
        clubMap.put(3L, new Club(3L, "Barcelona", "Gavi","Xavi"));
        clubMap.put(4L, new Club(4L, "Rangers", "Aaron Ramsey", "Giovanni van Bronckhorst"));
        clubMap.put(5L, new Club(5L, "Borussia Dortmund", "Jude Bellingham", "Edin Terzić"));
    }

    public Collection<Club> getAll() {
        return clubMap.values();
    }

    public Club get(Long id) {
        return clubMap.get(id);
    }

    public void add(Club club){
        var nextId = Long.valueOf(clubMap.size()+1);
        club.setId(nextId);
        clubMap.put(nextId, club);
    }
    // to add a new club, you create a new variable nextId
    // this sets the Long value of the variable to the value of the size of the club map +1
    // you call the club object called as a param, using its inbuilt setId method in its model class
    // you set the Id of the new club object to the nextId var you have just created
    // you then add this to the clubMap using a put method that:
    // 1. creates the new clb id first
    // 2. adds the associated values from the club object constructor

    public void delete(Long id) {
        if (!clubMap.containsKey(id)) {
            throw new NoSuchElementException("No element with given id: " + id);
        }
        clubMap.remove(id);
    }

    // this next one is a delete method that accepts a club id as a param
    // uses an if loop to assess whether the clubMap contains an id...
    // if it doesn't, it throws an inbuilt exception with the string we give it
    // otherwise, it removes the club from the HashMap

}
