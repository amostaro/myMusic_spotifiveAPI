package com.ciandt.summit.bootcamp2022.infrastructure.configuration.feign;


import com.ciandt.summit.bootcamp2022.infrastructure.configuration.security.dto.CreateAuthorizerRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name ="token-autentication", url="https://grupo5-tokenprovider.herokuapp.com")
public interface AuthenticationApiIntegration {

    @PostMapping("/api/v1/token")
    String getToken();

    @PostMapping("/api/v1/token/authorizer")
    void isValidToken(CreateAuthorizerRequest createAuthorizerRequestData);


}
