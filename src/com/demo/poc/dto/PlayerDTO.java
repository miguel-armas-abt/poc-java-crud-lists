package com.demo.poc.dto;

public class PlayerDTO {

  private String name;
  private String teamName;

  public PlayerDTO(String name, String teamName) {
    this.name = name;
    this.teamName = teamName;
  }

  public PlayerDTO() {}

  public void setName(String name) {
    this.name = name;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }

  public String getName() {
    return name;
  }

  public String getTeamName() {
    return teamName;
  }

  @Override
  public String toString() {
    return "SoccerResponse{" +
        "playerName='" + name + '\'' +
        ", teamName='" + teamName + '\'' +
        '}';
  }
}
