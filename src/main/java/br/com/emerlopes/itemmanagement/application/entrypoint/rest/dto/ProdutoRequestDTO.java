package br.com.emerlopes.itemmanagement.application.entrypoint.rest.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.experimental.Accessors;

@Data
@Getter
@Builder
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProdutoRequestDTO {
    private String name;
    private String description;
    private Double price;
    private Integer quantity;
}
