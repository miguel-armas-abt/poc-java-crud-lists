package com.demo.poc;

import com.demo.poc.dto.PlayerDTO;
import com.demo.poc.service.PlayerSearcherService;

public class Main {
  public static void main(String[] args) {
    PlayerSearcherService playerSearcherService = new PlayerSearcherService();
    PlayerDTO teamPlayerDTO = playerSearcherService.findById(2L);
    System.out.println(teamPlayerDTO);
  }
}