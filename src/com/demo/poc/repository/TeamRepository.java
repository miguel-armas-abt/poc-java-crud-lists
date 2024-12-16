package com.demo.poc.repository;

import com.demo.poc.entity.TeamEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TeamRepository {

  private static final TeamEntity[] TEAMS = {
      new TeamEntity(1L, "Real Madrid", "Carlo Ancelotti", "Santiago Bernabéu", "Madrid"),
      new TeamEntity(2L, "FC Barcelona", "Xavi Hernández", "Camp Nou", "Barcelona"),
      new TeamEntity(3L, "Paris Saint-Germain", "Luis Enrique", "Parc des Princes", "París"),
      new TeamEntity(4L, "Manchester City", "Pep Guardiola", "Etihad Stadium", "Manchester"),
      new TeamEntity(5L, "Bayern Múnich", "Thomas Tuchel", "Allianz Arena", "Múnich")
  };

  private final List<TeamEntity> soccerTeams;

  public TeamRepository() {
    soccerTeams = new ArrayList<>(Arrays.asList(TEAMS));
  }

  public TeamEntity findById(Long id) {
    if(id == null)
      throw new IllegalArgumentException("Id must not be null");

    TeamEntity selected = null;
    for(TeamEntity team: this.soccerTeams) {
      if(id.equals(team.getId())) {
        selected = team;
        break;
      }
    }

    if (selected == null) {
      throw new IllegalArgumentException("Team with id '" + id + "' not found");
    }

    return selected;
  }

}
