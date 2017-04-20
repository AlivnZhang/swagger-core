/*
 * 
 * 
 *
 * 
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.models.security;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SecurityScheme
 *
 * @link https://github.com/OAI/OpenAPI-Specification/blob/3.0.0-rc0/versions/3.0.md#securitySchemeObject
 */

public class SecurityScheme {
  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    APIKEY("apiKey"),
    
    HTTP("http"),
    
    OAUTH2("oauth2"),
    
    OPENIDCONNECT("openIdConnect");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;
  @JsonProperty("description")
  private String description = null;
  @JsonProperty("name")
  private String name = null;
  /**
   * Gets or Sets in
   */
  public enum InEnum {
    HEADER("header"),
    
    QUERY("query");

    private String value;

    InEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InEnum fromValue(String text) {
      for (InEnum b : InEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("in")
  private InEnum in = null;
  @JsonProperty("scheme")
  private String scheme = null;
  @JsonProperty("bearerFormat")
  private String bearerFormat = null;
  @JsonProperty("flow")
  private OAuthFlows flow = null;
  @JsonProperty("openIdConnectUrl")
  private String openIdConnectUrl = null;
  private java.util.Map<String, Object> extensions = null;

  /**
   * returns the type property from a SecurityScheme instance.
   *
   * @return TypeEnum type
   **/
  @ApiModelProperty(required = true, value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public SecurityScheme type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * returns the description property from a SecurityScheme instance.
   *
   * @return String description
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SecurityScheme description(String description) {
    this.description = description;
    return this;
  }

  /**
   * returns the name property from a SecurityScheme instance.
   *
   * @return String name
   **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SecurityScheme name(String name) {
    this.name = name;
    return this;
  }

  /**
   * returns the in property from a SecurityScheme instance.
   *
   * @return InEnum in
   **/
  @ApiModelProperty(value = "")
  public InEnum getIn() {
    return in;
  }

  public void setIn(InEnum in) {
    this.in = in;
  }

  public SecurityScheme in(InEnum in) {
    this.in = in;
    return this;
  }

  /**
   * returns the scheme property from a SecurityScheme instance.
   *
   * @return String scheme
   **/
  @ApiModelProperty(value = "")
  public String getScheme() {
    return scheme;
  }

  public void setScheme(String scheme) {
    this.scheme = scheme;
  }

  public SecurityScheme scheme(String scheme) {
    this.scheme = scheme;
    return this;
  }

  /**
   * returns the bearerFormat property from a SecurityScheme instance.
   *
   * @return String bearerFormat
   **/
  @ApiModelProperty(value = "")
  public String getBearerFormat() {
    return bearerFormat;
  }

  public void setBearerFormat(String bearerFormat) {
    this.bearerFormat = bearerFormat;
  }

  public SecurityScheme bearerFormat(String bearerFormat) {
    this.bearerFormat = bearerFormat;
    return this;
  }

  /**
   * returns the flow property from a SecurityScheme instance.
   *
   * @return OAuthFlows flow
   **/
  @ApiModelProperty(value = "")
  public OAuthFlows getFlow() {
    return flow;
  }

  public void setFlow(OAuthFlows flow) {
    this.flow = flow;
  }

  public SecurityScheme flow(OAuthFlows flow) {
    this.flow = flow;
    return this;
  }

  /**
   * returns the openIdConnectUrl property from a SecurityScheme instance.
   *
   * @return String openIdConnectUrl
   **/
  @ApiModelProperty(value = "")
  public String getOpenIdConnectUrl() {
    return openIdConnectUrl;
  }

  public void setOpenIdConnectUrl(String openIdConnectUrl) {
    this.openIdConnectUrl = openIdConnectUrl;
  }

  public SecurityScheme openIdConnectUrl(String openIdConnectUrl) {
    this.openIdConnectUrl = openIdConnectUrl;
    return this;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityScheme securityScheme = (SecurityScheme) o;
    return Objects.equals(this.type, securityScheme.type) &&
        Objects.equals(this.description, securityScheme.description) &&
        Objects.equals(this.name, securityScheme.name) &&
        Objects.equals(this.in, securityScheme.in) &&
        Objects.equals(this.scheme, securityScheme.scheme) &&
        Objects.equals(this.bearerFormat, securityScheme.bearerFormat) &&
        Objects.equals(this.flow, securityScheme.flow) &&
        Objects.equals(this.openIdConnectUrl, securityScheme.openIdConnectUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, description, name, in, scheme, bearerFormat, flow, openIdConnectUrl);
  }


  public java.util.Map<String, Object> getExtensions() {
    return extensions;
  }

  public void addExtension(String name, Object value) {
    if(this.extensions == null) {
      this.extensions = new java.util.HashMap<>();
    }
    this.extensions.put(name, value);
  }

  public void setExtensions(java.util.Map<String, Object> extensions) {
    this.extensions = extensions;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityScheme {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    in: ").append(toIndentedString(in)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    bearerFormat: ").append(toIndentedString(bearerFormat)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    openIdConnectUrl: ").append(toIndentedString(openIdConnectUrl)).append("\n");
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
