package com.grapheople.lifeisquest.domain;

import org.joda.time.DateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * @author Steven Jee
 * @since v.
 */
@Entity
@ToString
@Data
public class Quest {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private long id;
  private String title;
  private String body;
  private String writer;
  private float action_latitude;
  private float action_longitude;
  private String action_location;
  private float completion_latitude;
  private float completion_longitude;
  private String completion_location;
  private String img1;
  private String img2;
  private DateTime sTime;
  private DateTime eTime;
  private int reward;
  private boolean isCompleted;

  private Quest() {}

  public Quest(String title, String body, String writer, float action_latitude, float action_longitude, String action_location, float completion_latitude, float completion_longitude, String completion_location, String img1, String img2, DateTime sTime, DateTime eTime, int reward, boolean isCompleted) {
    this.title = title;
    this.body = body;
    this.writer = writer;
    this.action_latitude = action_latitude;
    this.action_longitude = action_longitude;
    this.action_location = action_location;
    this.completion_latitude = completion_latitude;
    this.completion_longitude = completion_longitude;
    this.completion_location = completion_location;
    this.img1 = img1;
    this.img2 = img2;
    this.sTime = sTime;
    this.eTime = eTime;
    this.reward = reward;
    this.isCompleted = isCompleted;
  }
}
