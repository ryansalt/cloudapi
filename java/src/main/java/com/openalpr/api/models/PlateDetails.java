/**
 * OpenALPR Cloud API
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.openalpr.api.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.openalpr.api.models.Coordinate;
import com.openalpr.api.models.PlateCandidate;
import com.openalpr.api.models.RegionOfInterest;
import com.openalpr.api.models.VehicleDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * PlateDetails
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T16:12:49.437-05:00")
public class PlateDetails   {
  @SerializedName("plate")
  private String plate = null;

  @SerializedName("matches_template")
  private Integer matchesTemplate = null;

  @SerializedName("requested_topn")
  private Integer requestedTopn = null;

  @SerializedName("processing_time_ms")
  private BigDecimal processingTimeMs = null;

  @SerializedName("confidence")
  private BigDecimal confidence = null;

  @SerializedName("region")
  private String region = null;

  @SerializedName("region_confidence")
  private BigDecimal regionConfidence = null;

  @SerializedName("coordinates")
  private List<Coordinate> coordinates = new ArrayList<Coordinate>();

  @SerializedName("candidates")
  private List<PlateCandidate> candidates = new ArrayList<PlateCandidate>();

  @SerializedName("vehicle_region")
  private RegionOfInterest vehicleRegion = null;

  @SerializedName("vehicle")
  private VehicleDetails vehicle = null;

  public PlateDetails plate(String plate) {
    this.plate = plate;
    return this;
  }

   /**
   * Best plate number for this plate
   * @return plate
  **/
  @ApiModelProperty(example = "null", value = "Best plate number for this plate")
  public String getPlate() {
    return plate;
  }

  public void setPlate(String plate) {
    this.plate = plate;
  }

  public PlateDetails matchesTemplate(Integer matchesTemplate) {
    this.matchesTemplate = matchesTemplate;
    return this;
  }

   /**
   * Indicates whether the plate matched a regional text pattern
   * @return matchesTemplate
  **/
  @ApiModelProperty(example = "null", value = "Indicates whether the plate matched a regional text pattern")
  public Integer getMatchesTemplate() {
    return matchesTemplate;
  }

  public void setMatchesTemplate(Integer matchesTemplate) {
    this.matchesTemplate = matchesTemplate;
  }

  public PlateDetails requestedTopn(Integer requestedTopn) {
    this.requestedTopn = requestedTopn;
    return this;
  }

   /**
   * The max number of results requested
   * @return requestedTopn
  **/
  @ApiModelProperty(example = "null", value = "The max number of results requested")
  public Integer getRequestedTopn() {
    return requestedTopn;
  }

  public void setRequestedTopn(Integer requestedTopn) {
    this.requestedTopn = requestedTopn;
  }

  public PlateDetails processingTimeMs(BigDecimal processingTimeMs) {
    this.processingTimeMs = processingTimeMs;
    return this;
  }

   /**
   * Number of milliseconds to process the license plate
   * @return processingTimeMs
  **/
  @ApiModelProperty(example = "null", value = "Number of milliseconds to process the license plate")
  public BigDecimal getProcessingTimeMs() {
    return processingTimeMs;
  }

  public void setProcessingTimeMs(BigDecimal processingTimeMs) {
    this.processingTimeMs = processingTimeMs;
  }

  public PlateDetails confidence(BigDecimal confidence) {
    this.confidence = confidence;
    return this;
  }

   /**
   * Confidence percentage that the plate number is correct
   * @return confidence
  **/
  @ApiModelProperty(example = "null", value = "Confidence percentage that the plate number is correct")
  public BigDecimal getConfidence() {
    return confidence;
  }

  public void setConfidence(BigDecimal confidence) {
    this.confidence = confidence;
  }

  public PlateDetails region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Specified or detected region (e.g., tx for Texas)
   * @return region
  **/
  @ApiModelProperty(example = "null", value = "Specified or detected region (e.g., tx for Texas)")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public PlateDetails regionConfidence(BigDecimal regionConfidence) {
    this.regionConfidence = regionConfidence;
    return this;
  }

   /**
   * Confidence percentage that the plate region is correct
   * @return regionConfidence
  **/
  @ApiModelProperty(example = "null", value = "Confidence percentage that the plate region is correct")
  public BigDecimal getRegionConfidence() {
    return regionConfidence;
  }

  public void setRegionConfidence(BigDecimal regionConfidence) {
    this.regionConfidence = regionConfidence;
  }

  public PlateDetails coordinates(List<Coordinate> coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  public PlateDetails addCoordinatesItem(Coordinate coordinatesItem) {
    this.coordinates.add(coordinatesItem);
    return this;
  }

   /**
   * The X/Y coordinates of the license plate in the image Four coordinates are provided that form a polygon starting from the top-left and moving clockwise ending in the bottom left 
   * @return coordinates
  **/
  @ApiModelProperty(example = "null", value = "The X/Y coordinates of the license plate in the image Four coordinates are provided that form a polygon starting from the top-left and moving clockwise ending in the bottom left ")
  public List<Coordinate> getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(List<Coordinate> coordinates) {
    this.coordinates = coordinates;
  }

  public PlateDetails candidates(List<PlateCandidate> candidates) {
    this.candidates = candidates;
    return this;
  }

  public PlateDetails addCandidatesItem(PlateCandidate candidatesItem) {
    this.candidates.add(candidatesItem);
    return this;
  }

   /**
   * All the top N candidates that could be the correct plate number
   * @return candidates
  **/
  @ApiModelProperty(example = "null", value = "All the top N candidates that could be the correct plate number")
  public List<PlateCandidate> getCandidates() {
    return candidates;
  }

  public void setCandidates(List<PlateCandidate> candidates) {
    this.candidates = candidates;
  }

  public PlateDetails vehicleRegion(RegionOfInterest vehicleRegion) {
    this.vehicleRegion = vehicleRegion;
    return this;
  }

   /**
   * Get vehicleRegion
   * @return vehicleRegion
  **/
  @ApiModelProperty(example = "null", value = "")
  public RegionOfInterest getVehicleRegion() {
    return vehicleRegion;
  }

  public void setVehicleRegion(RegionOfInterest vehicleRegion) {
    this.vehicleRegion = vehicleRegion;
  }

  public PlateDetails vehicle(VehicleDetails vehicle) {
    this.vehicle = vehicle;
    return this;
  }

   /**
   * Get vehicle
   * @return vehicle
  **/
  @ApiModelProperty(example = "null", value = "")
  public VehicleDetails getVehicle() {
    return vehicle;
  }

  public void setVehicle(VehicleDetails vehicle) {
    this.vehicle = vehicle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlateDetails plateDetails = (PlateDetails) o;
    return Objects.equals(this.plate, plateDetails.plate) &&
        Objects.equals(this.matchesTemplate, plateDetails.matchesTemplate) &&
        Objects.equals(this.requestedTopn, plateDetails.requestedTopn) &&
        Objects.equals(this.processingTimeMs, plateDetails.processingTimeMs) &&
        Objects.equals(this.confidence, plateDetails.confidence) &&
        Objects.equals(this.region, plateDetails.region) &&
        Objects.equals(this.regionConfidence, plateDetails.regionConfidence) &&
        Objects.equals(this.coordinates, plateDetails.coordinates) &&
        Objects.equals(this.candidates, plateDetails.candidates) &&
        Objects.equals(this.vehicleRegion, plateDetails.vehicleRegion) &&
        Objects.equals(this.vehicle, plateDetails.vehicle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plate, matchesTemplate, requestedTopn, processingTimeMs, confidence, region, regionConfidence, coordinates, candidates, vehicleRegion, vehicle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlateDetails {\n");
    
    sb.append("    plate: ").append(toIndentedString(plate)).append("\n");
    sb.append("    matchesTemplate: ").append(toIndentedString(matchesTemplate)).append("\n");
    sb.append("    requestedTopn: ").append(toIndentedString(requestedTopn)).append("\n");
    sb.append("    processingTimeMs: ").append(toIndentedString(processingTimeMs)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    regionConfidence: ").append(toIndentedString(regionConfidence)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    candidates: ").append(toIndentedString(candidates)).append("\n");
    sb.append("    vehicleRegion: ").append(toIndentedString(vehicleRegion)).append("\n");
    sb.append("    vehicle: ").append(toIndentedString(vehicle)).append("\n");
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

