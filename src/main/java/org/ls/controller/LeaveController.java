package org.ls.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.ls.entity.LeaveSituation;
import org.ls.service.LeaveSituationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LeaveController {
	
	@Autowired
	private LeaveSituationService service;
	
	@GetMapping("leaveManagement")
	public String leaveManagement() {
		return "leaveManagement";
	}
	
	@GetMapping("applyLeaveForm")
	public String toApplyLeaveForm(HttpServletRequest request, Model model, RedirectAttributes flashModel) {
		
		LocalDateTime dateTime = LocalDateTime.now();
		String now = dateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
		model.addAttribute("now", now);
		
		String isPjax = request.getHeader("X-PJAX");
		if ("true".equals(isPjax)) {
			return "applyLeave";
		}
		// 重定向后依然可以获取数据。
		flashModel.addFlashAttribute("selectItem", "applyLeave");
		return "redirect:/leaveManagement";
	}
	
	@GetMapping("queryLeaveList")
	public String queryLeaveList(HttpServletRequest request, Model model, HttpSession session, RedirectAttributes flashModel) {
		String isPjax = request.getHeader("X-PJAX");
		if ("true".equals(isPjax)) {
			String username = (String)session.getAttribute("username");
			List<LeaveSituation> leaveList = service.queryLeaveList(username);
			model.addAttribute("leaveList", leaveList);
			return "leaveList";
		}
		flashModel.addFlashAttribute("selectItem", "queryLeave");
		return "redirect:/leaveManagement";
	}
	
	@PostMapping("applyLeave")
	public String applyLeave(@ModelAttribute LeaveSituation leave,Model model,HttpSession session) {
		String username = (String)session.getAttribute("username");
		LeaveSituation leave1= service.insertLeave(leave,username);
		if (leave1!=null) {
			return "redirect:/queryLeaveList";
		}
		 model.addAttribute("message", "请假申请失败！");
		 return "applyLeave" ;
	}
}
