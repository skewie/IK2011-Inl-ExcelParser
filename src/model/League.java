/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Jeff
 */
public class League {
    private int id;
    private String name;
    private ArrayList<Team> teams;
    
    public League() {
        teams = new ArrayList();
    }
    
    public League(String name) {
        this.name = name;
        teams = new ArrayList();
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void addTeam(Team team) {
        teams.add(team);
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }
    
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
