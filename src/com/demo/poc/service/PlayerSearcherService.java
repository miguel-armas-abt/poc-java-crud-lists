package com.demo.poc.service;

import com.demo.poc.repository.PlayerRepository;
import com.demo.poc.repository.TeamRepository;
import com.demo.poc.dto.PlayerDTO;
import com.demo.poc.mapper.PlayerMapper;
import com.demo.poc.entity.PlayerEntity;
import com.demo.poc.entity.TeamEntity;

public class PlayerSearcherService {

  private final PlayerRepository playerRepository;
  private final TeamRepository teamRepository;
  private final PlayerMapper playerMapper;

  public PlayerSearcherService() {
    playerRepository = new PlayerRepository();
    teamRepository = new TeamRepository();
    playerMapper = new PlayerMapper();
  }

  public PlayerDTO findById(Long id) {
    PlayerEntity player = playerRepository.findById(id);
    Long teamId = player.getTeamId();
    TeamEntity team = teamRepository.findById(teamId);

    return playerMapper.toDTO(player, team);
  }

}
