package com.xiedaimala.shopping_cart.product.view.validator;

import com.xiedaimala.shopping_cart.product.view.UpdateProductRequest;
import org.springframework.stereotype.Component;

@Component
public class UpdateProductRequestValidator {
    public boolean validate(UpdateProductRequest updateProductRequest) {
        if (updateProductRequest.getPrice() < 0)
            return false;
        return updateProductRequest.getName().length() > 0;
    }
}
