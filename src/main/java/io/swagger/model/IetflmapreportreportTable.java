package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.IetflmapreportreportRow;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * A list of result tables.
 */
@ApiModel(description = "A list of result tables.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:30.864Z")

public class IetflmapreportreportTable   {
  @JsonProperty("column")
  private List<String> column = new ArrayList<String>();

  @JsonProperty("row")
  private List<IetflmapreportreportRow> row = new ArrayList<IetflmapreportreportRow>();

  public IetflmapreportreportTable column(List<String> column) {
    this.column = column;
    return this;
  }

  public IetflmapreportreportTable addColumnItem(String columnItem) {
    this.column.add(columnItem);
    return this;
  }

   /**
   * Get column
   * @return column
  **/
  @ApiModelProperty(value = "")
  public List<String> getColumn() {
    return column;
  }

  public void setColumn(List<String> column) {
    this.column = column;
  }

  public IetflmapreportreportTable row(List<IetflmapreportreportRow> row) {
    this.row = row;
    return this;
  }

  public IetflmapreportreportTable addRowItem(IetflmapreportreportRow rowItem) {
    this.row.add(rowItem);
    return this;
  }

   /**
   * Get row
   * @return row
  **/
  @ApiModelProperty(value = "")
  public List<IetflmapreportreportRow> getRow() {
    return row;
  }

  public void setRow(List<IetflmapreportreportRow> row) {
    this.row = row;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IetflmapreportreportTable ietflmapreportreportTable = (IetflmapreportreportTable) o;
    return Objects.equals(this.column, ietflmapreportreportTable.column) &&
        Objects.equals(this.row, ietflmapreportreportTable.row);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column, row);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IetflmapreportreportTable {\n");
    
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    row: ").append(toIndentedString(row)).append("\n");
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

