package alm.demo.dao;

import java.util.ArrayList;

public interface RequirementDAO {
	public boolean addRequirement(alm.demo.entity.Requirement Requirement) throws Exception;
	public ArrayList<alm.demo.entity.Requirement> getAllRequirements() throws Exception;
}
