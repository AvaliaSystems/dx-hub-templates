package io.avalia.${{ values.name | replace("-", "") }}.api.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class Greeting {
  private String message;
  private String color;
  private Date timestamp;
}
