package com.study.microservice.api.composite.product;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProductCompositeService {

	@GetMapping(
		value = "/product-composit/{productId}",
		produces = MediaType.APPLICATION_JSON_VALUE
	)
	ProductAggregate getProduct(@PathVariable int productId);
}