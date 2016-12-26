package cn.com.rf.ssm.controller.annotation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.com.rf.ssm.po.Item;

/**
 * 注解方式开发Handler
 * @author RainFossil
 *
 */
@Controller//使用Controller标示它是一个控制器
public class ItemsController3 {
	
	@RequestMapping("/queryItemsA")
	public ModelAndView queryItems() throws Exception{
		List<Item> li=new ArrayList<Item>();
		Item item=new Item();
		item.setName("item1");
		item.setPrice("1.0");
		item.setDetail("商品描述1");
		li.add(item);
		
		item=new Item();
		item.setName("item2");
		item.setPrice("2.0");
		item.setDetail("商品描述2");
		li.add(item);
		
		ModelAndView mav=new ModelAndView();
		//相当于request.setAttribute();
		mav.addObject("itemList", li);
		//指定视图
		mav.setViewName("/WEB-INF/jsp/items/itemlist.jsp");
		
		return mav;
	}
}
