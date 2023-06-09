package com.example.productApp.commands.categoryCommands;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class GetAllCategoriesCommand extends CategoryCommand {


    @Override
    public Object execute(HashMap<String, Object> map)  {
        return getService().getAllCategories();
    }
}
