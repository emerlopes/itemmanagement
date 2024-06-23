package br.com.emerlopes.itemmanagement.infrastructure.integrations.customerauthentication;

import lombok.Data;

@Data
public class CustomerauthenticationResponseDTO {
    private String username;
    private String role;
}
