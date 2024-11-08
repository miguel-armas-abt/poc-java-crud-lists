package com.demo.poc.service;

import com.demo.poc.dao.PlayerDAO;
import com.demo.poc.dao.TeamDAO;
import com.demo.poc.dto.PlayerDTO;
import com.demo.poc.mapper.PlayerMapper;
import com.demo.poc.entity.PlayerEntity;
import com.demo.poc.entity.TeamEntity;

public class PlayerSearcherService {

  private final PlayerDAO playerDAO;
  private final TeamDAO teamDAO;
  private final PlayerMapper playerMapper;

  public PlayerSearcherService() {
    playerDAO = new PlayerDAO();
    teamDAO = new TeamDAO();
    playerMapper = new PlayerMapper();
  }

  public PlayerDTO findById(Long id) {
    PlayerEntity player = playerDAO.findById(id);
    Long teamId = player.getTeamId();
    TeamEntity team = teamDAO.findById(teamId);

    return playerMapper.toDTO(player, team);
  }

}
