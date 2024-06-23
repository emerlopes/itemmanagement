package br.com.emerlopes.itemmanagement.infrastructure.integrations.customerauthentication;

import br.com.emerlopes.itemmanagement.application.shared.CustomResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Optional;

@FeignClient(name = "customerauthentication", url = "http://localhost:8080")
public interface CustomerauthenticationClient {

    @GetMapping("/auth/validate")
    Optional<CustomResponseDTO<CustomerauthenticationResponseDTO>> getCustomerAuthentication(
            @RequestHeader("Authorization") String authorization
    );

    @GetMapping("/users/login/{login}")
    Optional<CustomResponseDTO<CustomerauthenticationResponseDTO>> getCustomerByLogin(
            @RequestHeader("Authorization") String authorization,
            @PathVariable("login") String login
    );

}
