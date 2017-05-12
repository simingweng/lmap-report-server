package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * The rows of a result table.
 */
@ApiModel(description = "The rows of a result table.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:30.864Z")

public class IetflmapreportreportRow   {
  @JsonProperty("value")
  private List<String> value = new ArrayList<String>();

  public IetflmapreportreportRow value(List<String> value) {
    this.value = value;
    return this;
  }

  public IetflmapreportreportRow addValueItem(String valueItem) {
    this.value.add(valueItem);
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public List<String> getValue() {
    return value;
  }

  public void setValue(List<String> value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IetflmapreportreportRow ietflmapreportreportRow = (IetflmapreportreportRow) o;
    return Objects.equals(this.value, ietflmapreportreportRow.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IetflmapreportreportRow {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

