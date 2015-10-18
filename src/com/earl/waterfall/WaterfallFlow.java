package com.earl.waterfall;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Earl    
 *
 */
public class WaterfallFlow extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 跳转到part1的页面，并模拟了一组数据用于填充到jsp页面中
	 * @return
	 */
	public String toPage(){
		ArrayList<Map<String, Object>> studentList=new ArrayList<Map<String, Object>>();
		for(int i=0;i<4;i++){
			Map<String, Object> studentMap=new HashMap<String, Object>();
			studentMap.put("id", i);
			studentMap.put("name", "Earl"+i);
			studentMap.put("age", 18+i);
			studentList.add(studentMap);
		}
		
		ServletActionContext.getRequest().setAttribute("studentList", studentList);
		
		return SUCCESS;
	}
	
	/**
	 * 通过Ajax动态的访问这个加载后的方法，模拟一组数据用于填充到part2的页面中
	 * @return
	 */
	public String  waterfall() {
		ArrayList<Map<String, Object>> teacherList=new ArrayList<Map<String, Object>>();
		for(int i=0;i<4;i++){
			Map<String, Object> studentMap=new HashMap<String, Object>();
			studentMap.put("id", i);
			studentMap.put("name", "Jack"+i);
			studentMap.put("age", 20+i);
			teacherList.add(studentMap);
		}
		
		ServletActionContext.getRequest().setAttribute("teacherList", teacherList);
		
		
		return SUCCESS;
	}

}
