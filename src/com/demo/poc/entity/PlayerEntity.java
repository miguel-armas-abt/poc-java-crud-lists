package com.demo.poc.entity;

public class PlayerEntity {

  private Long id;
  private String name;
  private String position;
  private Integer age;
  private Long teamId;

  public PlayerEntity() {
  }

  public PlayerEntity(Long id, String name, String position, int age, Long teamId) {
    this.id = id;
    this.name = name;
    this.position = position;
    this.age = age;
    this.teamId = teamId;
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

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Long getTeamId() {
    return teamId;
  }

  public void setTeamId(Long teamId) {
    this.teamId = teamId;
  }

  @Override
  public String toString() {
    return "{ " +
        "\"id\": " + id + ", " +
        "\"name\": \"" + name + "\", " +
        "\"position\": \"" + position + "\", " +
        "\"age\": " + age + ", " +
        "\"teamId\": " + teamId +
        " }";
  }

}
