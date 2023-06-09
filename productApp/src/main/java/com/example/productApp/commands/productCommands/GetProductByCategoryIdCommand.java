package com.example.productApp.commands.productCommands;


import java.util.HashMap;

public class GetProductByCategoryIdCommand extends ProductCommand {


    @Override
    public Object execute(HashMap<String, Object> map)  {
        return getProductService().getProductsByCategoryId((String)map.get("category_id"));
    }
}
