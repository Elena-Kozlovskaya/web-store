package com.kozlovskaya.store.front;

import com.kozlovskaya.store.common.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FrontService {

    private final RestTemplate restTemplate;

    public List<ProductDto> getAll() {
        return restTemplate.getForObject("http://product-service/api/v1/products", List.class);
    }
}
