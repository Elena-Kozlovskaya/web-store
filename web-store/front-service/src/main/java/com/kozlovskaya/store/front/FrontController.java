package com.kozlovskaya.store.front;

import com.kozlovskaya.store.common.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/front")
@RequiredArgsConstructor
@CrossOrigin("*")
public class FrontController {

    private final FrontService frontService;

    @GetMapping("/products")
    public List<ProductDto> getProducts() {
        return frontService.getAll();
    }

}
