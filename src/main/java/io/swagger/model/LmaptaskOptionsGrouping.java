package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.IetflmapreportreportOption;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * LmaptaskOptionsGrouping
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:30.864Z")

public class LmaptaskOptionsGrouping   {
  @JsonProperty("option")
  private List<IetflmapreportreportOption> option = new ArrayList<IetflmapreportreportOption>();

  public LmaptaskOptionsGrouping option(List<IetflmapreportreportOption> option) {
    this.option = option;
    return this;
  }

  public LmaptaskOptionsGrouping addOptionItem(IetflmapreportreportOption optionItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LmaptaskOptionsGrouping lmaptaskOptionsGrouping = (LmaptaskOptionsGrouping) o;
    return Objects.equals(this.option, lmaptaskOptionsGrouping.option);
  }

  @Override
  public int hashCode() {
    return Objects.hash(option);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LmaptaskOptionsGrouping {\n");
    
    sb.append("    option: ").append(toIndentedString(option)).append("\n");
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

