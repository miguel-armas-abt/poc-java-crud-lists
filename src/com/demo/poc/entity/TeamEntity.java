package com.demo.poc.entity;

public class TeamEntity {

  private Long id;
  private String name;
  private String coach;
  private String stadium;
  private String city;

  public TeamEntity() {
  }

  public TeamEntity(Long id, String name, String coach, String stadium, String city) {
    this.id = id;
    this.name = name;
    this.coach = coach;
    this.stadium = stadium;
    this.city = city;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCoach() {
    return coach;
  }

  public void setCoach(String coach) {
    this.coach = coach;
  }

  public String getStadium() {
    return stadium;
  }

  public void setStadium(String stadium) {
    this.stadium = stadium;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  @Override
  public String toString() {
    return "{ " +
        "\"id\": " + id + ", " +
        "\"name\": \"" + name + "\", " +
        "\"coach\": \"" + coach + "\", " +
        "\"stadium\": \"" + stadium + "\", " +
        "\"city\": \"" + city + "\"" +
        " }";
  }
}
