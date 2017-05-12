package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.IetflmapreportreportMetric;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * LmapmetricsGrouping
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:30.864Z")

public class LmapmetricsGrouping   {
  @JsonProperty("metric")
  private List<IetflmapreportreportMetric> metric = new ArrayList<IetflmapreportreportMetric>();

  public LmapmetricsGrouping metric(List<IetflmapreportreportMetric> metric) {
    this.metric = metric;
    return this;
  }

  public LmapmetricsGrouping addMetricItem(IetflmapreportreportMetric metricItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LmapmetricsGrouping lmapmetricsGrouping = (LmapmetricsGrouping) o;
    return Objects.equals(this.metric, lmapmetricsGrouping.metric);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LmapmetricsGrouping {\n");
    
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
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

