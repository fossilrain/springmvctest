package cn.com.rf.ssm.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

import cn.com.rf.ssm.po.Item;

/**
 * 实现HttpRequestHandler接口
 * @author RainFossil
 *
 */
public class ItemsController2 implements HttpRequestHandler{

	@Override
	public void handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
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
		
		arg0.setAttribute("itemList", li);
		arg0.getRequestDispatcher("/WEB-INF/jsp/items/itemlist.jsp").forward(arg0, arg1);
		
		//该种方法的处理器可以通过arg1(response),设置响应的数据格式，如响应json数据.
	}

}
