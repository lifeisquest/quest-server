package com.grapheople.lifeisquest.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.joda.time.LocalDateTime;
import org.springframework.data.annotation.CreatedDate;

/**
 * @author Steven Jee
 * @since v.
 */
@Entity
@ToString
@Data
@Table(name = "quest")
public class Quest {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private long id;
  private String title;
  private String body;
  private long writer_id;
  private String writer;
  private float action_latitude;
  private float action_longitude;
  private String action_location;
  private float completion_latitude;
  private float completion_longitude;
  private String completion_location;
  private String img1;
  private String img2;
  @CreatedDate
  @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyyMMdd", timezone="Asia/Seoul")
  private DateTime s_time;
  @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyyMMdd", timezone="Asia/Seoul")
  private DateTime e_time;
  private int reward;
  private int isCompleted;

  private Quest() {}

  public Quest(String title, String body, long writer_id, String writer, float action_latitude, float action_longitude, String action_location, float completion_latitude, float completion_longitude, String completion_location, String img1, String img2, DateTime s_time, DateTime e_time, int reward, int isCompleted) {
    this.title = title;
    this.body = body;
    this.writer_id = writer_id;
    this.writer = writer;
    this.action_latitude = action_latitude;
    this.action_longitude = action_longitude;
    this.action_location = action_location;
    this.completion_latitude = completion_latitude;
    this.completion_longitude = completion_longitude;
    this.completion_location = completion_location;
    this.img1 = img1;
    this.img2 = img2;
    this.s_time = s_time;
    this.e_time = e_time;
    this.reward = reward;
    this.isCompleted = isCompleted;
  }
}
