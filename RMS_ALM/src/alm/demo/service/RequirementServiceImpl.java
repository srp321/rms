package alm.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import alm.demo.dao.RequirementDAO;
import alm.demo.entity.Requirement;


@Service
public class RequirementServiceImpl implements RequirementService{
	@Autowired
	private RequirementDAO RequirementDAO;
	@Override
	@Transactional
	public boolean addRequirement(Requirement Requirement)throws Exception {
		// TODO Auto-generated method stub
		System.out.println("in add service");
		return RequirementDAO.addRequirement(Requirement);
	}
	@Override
	@Transactional
	public ArrayList<Requirement> getAllRequirements() throws Exception{
		// TODO Auto-generated method stub
		return RequirementDAO.getAllRequirements();
	}
}
