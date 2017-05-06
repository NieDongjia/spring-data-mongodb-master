package com.djn.cn.spring.mongodbframework.base.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 
 * @ClassName IndexController
 * @Description 系统跳转
 * @author BigJia-Perfect
 * @date 2017年5月5日 上午1:02:45
 *
 */
@Controller
public class IndexController {
	@RequestMapping("/index")
	public String toLogin(){
		return "index";
	}
}
