package com.example.productApp.commands.productCommands;


import java.util.HashMap;

public class DeleteProductCommand extends ProductCommand{

    @Override
    public Object execute(HashMap<String, Object> map) {
        return getProductService().deleteProduct((String)map.get("productId"));
    }
}
