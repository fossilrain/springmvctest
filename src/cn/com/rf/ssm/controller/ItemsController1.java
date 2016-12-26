package cn.com.rf.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import cn.com.rf.ssm.po.Item;

/**
 * 实现Controller接口
 * @author RainFossil
 *
 */
public class ItemsController1 implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
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
