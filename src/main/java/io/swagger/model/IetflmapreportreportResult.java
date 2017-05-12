package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.IetflmapreportreportMetric;
import io.swagger.model.IetflmapreportreportOption;
import io.swagger.model.IetflmapreportreportTable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * IetflmapreportreportResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:30.864Z")

public class IetflmapreportreportResult   {
  @JsonProperty("metric")
  private List<IetflmapreportreportMetric> metric = new ArrayList<IetflmapreportreportMetric>();

  @JsonProperty("option")
  private List<IetflmapreportreportOption> option = new ArrayList<IetflmapreportreportOption>();

  @JsonProperty("schedule-name")
  private String scheduleName = null;

  @JsonProperty("action-name")
  private String actionName = null;

  @JsonProperty("task-name")
  private String taskName = null;

  @JsonProperty("start")
  private String start = null;

  @JsonProperty("end")
  private String end = null;

  @JsonProperty("tag")
  private List<String> tag = new ArrayList<String>();

  @JsonProperty("conflict")
  private List<String> conflict = new ArrayList<String>();

  @JsonProperty("table")
  private List<IetflmapreportreportTable> table = new ArrayList<IetflmapreportreportTable>();

  public IetflmapreportreportResult metric(List<IetflmapreportreportMetric> metric) {
    this.metric = metric;
    return this;
  }

  public IetflmapreportreportResult addMetricItem(IetflmapreportreportMetric metricItem) {
    this.metric.add(metricItem);
    return this;
  }

   /**
   * Get metric
   * @return metric
  **/
  @ApiModelProperty(value = "")
  public List<IetflmapreportreportMetric> getMetric() {
    return metric;
  }

  public void setMetric(List<IetflmapreportreportMetric> metric) {
    this.metric = metric;
  }

  public IetflmapreportreportResult option(List<IetflmapreportreportOption> option) {
    this.option = option;
    return this;
  }

  public IetflmapreportreportResult addOptionItem(IetflmapreportreportOption optionItem) {
    this.option.add(optionItem);
    return this;
  }

   /**
   * Get option
   * @return option
  **/
  @ApiModelProperty(value = "")
  public List<IetflmapreportreportOption> getOption() {
    return option;
  }

  public void setOption(List<IetflmapreportreportOption> option) {
    this.option = option;
  }

  public IetflmapreportreportResult scheduleName(String scheduleName) {
    this.scheduleName = scheduleName;
    return this;
  }

   /**
   * The name of the schedules that produced the result.
   * @return scheduleName
  **/
  @ApiModelProperty(value = "The name of the schedules that produced the result.")
  public String getScheduleName() {
    return scheduleName;
  }

  public void setScheduleName(String scheduleName) {
    this.scheduleName = scheduleName;
  }

  public IetflmapreportreportResult actionName(String actionName) {
    this.actionName = actionName;
    return this;
  }

   /**
   * The name of the action in the schedule that produced the result.
   * @return actionName
  **/
  @ApiModelProperty(value = "The name of the action in the schedule that produced the result.")
  public String getActionName() {
    return actionName;
  }

  public void setActionName(String actionName) {
    this.actionName = actionName;
  }

  public IetflmapreportreportResult taskName(String taskName) {
    this.taskName = taskName;
    return this;
  }

   /**
   * The name of the task that produced the result.
   * @return taskName
  **/
  @ApiModelProperty(value = "The name of the task that produced the result.")
  public String getTaskName() {
    return taskName;
  }

  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }

  public IetflmapreportreportResult start(String start) {
    this.start = start;
    return this;
  }

   /**
   * The date and time when the measurement producing this result started.
   * @return start
  **/
  @ApiModelProperty(required = true, value = "The date and time when the measurement producing this result started.")
  @NotNull
  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  public IetflmapreportreportResult end(String end) {
    this.end = end;
    return this;
  }

   /**
   * The date and time when the measurement producing this result stopped.
   * @return end
  **/
  @ApiModelProperty(value = "The date and time when the measurement producing this result stopped.")
  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

  public IetflmapreportreportResult tag(List<String> tag) {
    this.tag = tag;
    return this;
  }

  public IetflmapreportreportResult addTagItem(String tagItem) {
    this.tag.add(tagItem);
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @ApiModelProperty(value = "")
  public List<String> getTag() {
    return tag;
  }

  public void setTag(List<String> tag) {
    this.tag = tag;
  }

  public IetflmapreportreportResult conflict(List<String> conflict) {
    this.conflict = conflict;
    return this;
  }

  public IetflmapreportreportResult addConflictItem(String conflictItem) {
    this.conflict.add(conflictItem);
    return this;
  }

   /**
   * Get conflict
   * @return conflict
  **/
  @ApiModelProperty(value = "")
  public List<String> getConflict() {
    return conflict;
  }

  public void setConflict(List<String> conflict) {
    this.conflict = conflict;
  }

  public IetflmapreportreportResult table(List<IetflmapreportreportTable> table) {
    this.table = table;
    return this;
  }

  public IetflmapreportreportResult addTableItem(IetflmapreportreportTable tableItem) {
    this.table.add(tableItem);
    return this;
  }

   /**
   * Get table
   * @return table
  **/
  @ApiModelProperty(value = "")
  public List<IetflmapreportreportTable> getTable() {
    return table;
  }

  public void setTable(List<IetflmapreportreportTable> table) {
    this.table = table;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IetflmapreportreportResult ietflmapreportreportResult = (IetflmapreportreportResult) o;
    return Objects.equals(this.metric, ietflmapreportreportResult.metric) &&
        Objects.equals(this.option, ietflmapreportreportResult.option) &&
        Objects.equals(this.scheduleName, ietflmapreportreportResult.scheduleName) &&
        Objects.equals(this.actionName, ietflmapreportreportResult.actionName) &&
        Objects.equals(this.taskName, ietflmapreportreportResult.taskName) &&
        Objects.equals(this.start, ietflmapreportreportResult.start) &&
        Objects.equals(this.end, ietflmapreportreportResult.end) &&
        Objects.equals(this.tag, ietflmapreportreportResult.tag) &&
        Objects.equals(this.conflict, ietflmapreportreportResult.conflict) &&
        Objects.equals(this.table, ietflmapreportreportResult.table);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, option, scheduleName, actionName, taskName, start, end, tag, conflict, table);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IetflmapreportreportResult {\n");
    
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    option: ").append(toIndentedString(option)).append("\n");
    sb.append("    scheduleName: ").append(toIndentedString(scheduleName)).append("\n");
    sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    conflict: ").append(toIndentedString(conflict)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
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

