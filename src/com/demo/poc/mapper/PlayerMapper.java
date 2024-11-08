package com.demo.poc.mapper;

import com.demo.poc.dto.PlayerDTO;
import com.demo.poc.entity.PlayerEntity;
import com.demo.poc.entity.TeamEntity;

public class PlayerMapper {

  public PlayerDTO toDTO(PlayerEntity player, TeamEntity team) {
    PlayerDTO currentPlayer = new PlayerDTO();
    currentPlayer.setName(player.getName());
    currentPlayer.setTeamName(team.getName());
    return currentPlayer;
  }

}
