package com.demo.poc.repository;

import com.demo.poc.entity.PlayerEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PlayerRepository {

  private static final PlayerEntity[] PLAYERS = {
      new PlayerEntity(1L, "Kylian Mbappé", "Delantero", 24, 1L),
      new PlayerEntity(2L, "Vinícius Jr.", "Delantero", 23, 1L),
      new PlayerEntity(3L, "Robert Lewandowski", "Delantero", 35, 2L),
      new PlayerEntity(4L, "Pedri", "Centrocampista", 21, 2L),
      new PlayerEntity(5L, "Neymar Jr.", "Delantero", 31, 3L),
      new PlayerEntity(6L, "Lionel Messi", "Delantero", 36, 3L)
  };

  private List<PlayerEntity> soccerPlayers;

  public PlayerRepository() {
    soccerPlayers = new ArrayList<>(Arrays.asList(PLAYERS));
  }

  public void add(PlayerEntity player) {
    this.soccerPlayers.add(player);
  }

  public List<PlayerEntity> findAll() {
    this.soccerPlayers.sort(Comparator.comparing(PlayerEntity::getId));
    return this.soccerPlayers;
  }

  public PlayerEntity findById(Long id) {
    if(id == null)
      throw new IllegalArgumentException("Id must not be null");

    PlayerEntity selected = null;
    for (PlayerEntity player: this.soccerPlayers) {
      if(id.equals(player.getId())) {
        selected = player;
        break;
      }
    }

    if (selected == null) {
      throw new IllegalArgumentException("Player with id '" + id + "' not found");
    }

    return selected;
  }

  public void deleteById(Long id) {
    List<PlayerEntity> modifiedList = new ArrayList<>();

    for (PlayerEntity player: this.soccerPlayers) {
      if(!id.equals(player.getId()))
        modifiedList.add(player);
    }

    this.soccerPlayers = modifiedList;
  }
}
