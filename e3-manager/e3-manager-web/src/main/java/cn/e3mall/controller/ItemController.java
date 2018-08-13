package cn.e3mall.controller;

import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/item")
public class ItemController {

    @Resource
    private ItemService itemService;

    @RequestMapping("/{itemId}")
    @ResponseBody
//    private TbItem getItemById(@PathVariable Long itemId) {
    public String getItemById(@PathVariable(value = "id")  Long id) {
//        TbItem tbItem = itemService.getItemById(itemId);
        return "item";
    }
}
