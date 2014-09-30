package alm.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import alm.demo.service.RequirementService;
import alm.demo.service.RequirementServiceImpl;


@Controller
public class RequirementController {

	@Autowired
	private RequirementService RequirementService;
	
	public RequirementService getRequirementService() {
		return RequirementService;
	}
	public void setRequirementService(RequirementServiceImpl RequirementService) {
		this.RequirementService = RequirementService;
	}
	@RequestMapping(value="/Requirement", method=RequestMethod.POST)
	public String submitRequirement(@RequestBody alm.demo.entity.Requirement Requirement) throws Exception{
		System.out.println("in adding new requirement");
		System.out.println(Requirement);
		RequirementService.addRequirement(Requirement);
		return "";
	}
	@RequestMapping(value="/RequirementsAll", method=RequestMethod.GET)
	public @ResponseBody ArrayList<alm.demo.entity.Requirement> getRequirements() throws NumberFormatException, Exception 
	{		
		System.out.println("in viewing all requirement");
		 ArrayList<alm.demo.entity.Requirement> temp=RequirementService.getAllRequirements();
			if(temp!=null)
			{
				return temp;
			}
			else
			{
				throw new Exception("ID not Found");
			}
	}
	
	@RequestMapping(value="/Update", method=RequestMethod.POST)
	public String updateRequirement(@RequestBody alm.demo.entity.Requirement Requirement) throws Exception{
		System.out.println("in updating requirement");
		System.out.println(Requirement);
		RequirementService.updateRequirement(Requirement);
		return "";
	}
	
	@RequestMapping(value="/Requirement/delete", method=RequestMethod.DELETE)
	public String deleteRequirement(@RequestBody alm.demo.entity.Requirement Requirement) throws Exception{
		System.out.println("in deleting requirement");
		return "";
	}
	
}
