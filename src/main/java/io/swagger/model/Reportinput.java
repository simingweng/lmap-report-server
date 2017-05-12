package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.IetflmapreportreportResult;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * Reportinput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:30.864Z")

public class Reportinput   {
  @JsonProperty("date")
  private String date = null;

  @JsonProperty("agent-id")
  private String agentId = null;

  @JsonProperty("group-id")
  private String groupId = null;

  @JsonProperty("measurement-point")
  private String measurementPoint = null;

  @JsonProperty("result")
  private List<IetflmapreportreportResult> result = new ArrayList<IetflmapreportreportResult>();

  public Reportinput date(String date) {
    this.date = date;
    return this;
  }

   /**
   * The date and time when this result report was sent to a collector.
   * @return date
  **/
  @ApiModelProperty(required = true, value = "The date and time when this result report was sent to a collector.")
  @NotNull
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public Reportinput agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }

   /**
   * The agent-id of the agent from which this report originates.
   * @return agentId
  **/
  @ApiModelProperty(value = "The agent-id of the agent from which this report originates.")
  public String getAgentId() {
    return agentId;
  }

  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }

  public Reportinput groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * The group-id of the agent from which this report originates.
   * @return groupId
  **/
  @ApiModelProperty(value = "The group-id of the agent from which this report originates.")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public Reportinput measurementPoint(String measurementPoint) {
    this.measurementPoint = measurementPoint;
    return this;
  }

   /**
   * The measurement-point of the agent from which this report originates.
   * @return measurementPoint
  **/
  @ApiModelProperty(value = "The measurement-point of the agent from which this report originates.")
  public String getMeasurementPoint() {
    return measurementPoint;
  }

  public void setMeasurementPoint(String measurementPoint) {
    this.measurementPoint = measurementPoint;
  }

  public Reportinput result(List<IetflmapreportreportResult> result) {
    this.result = result;
    return this;
  }

  public Reportinput addResultItem(IetflmapreportreportResult resultItem) {
    this.result.add(resultItem);
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")
  public List<IetflmapreportreportResult> getResult() {
    return result;
  }

  public void setResult(List<IetflmapreportreportResult> result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportinput reportinput = (Reportinput) o;
    return Objects.equals(this.date, reportinput.date) &&
        Objects.equals(this.agentId, reportinput.agentId) &&
        Objects.equals(this.groupId, reportinput.groupId) &&
        Objects.equals(this.measurementPoint, reportinput.measurementPoint) &&
        Objects.equals(this.result, reportinput.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, agentId, groupId, measurementPoint, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportinput {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    measurementPoint: ").append(toIndentedString(measurementPoint)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

