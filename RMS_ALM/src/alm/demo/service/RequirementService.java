package alm.demo.service;

import java.util.ArrayList;

import alm.demo.entity.Requirement;

public interface RequirementService {
	public boolean addRequirement(Requirement Requirement)throws Exception;
	public ArrayList<Requirement> getAllRequirements()throws Exception;
}
