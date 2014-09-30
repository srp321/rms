package alm.demo.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import alm.demo.entity.Requirement;


@Repository 
public class RequirementDAOImpl implements RequirementDAO {
	
	@PersistenceContext
	@Autowired
	private EntityManager emf;

	@Override
	public boolean addRequirement(Requirement Requirement) throws Exception{
		System.out.println("in add dao");
		emf.persist(Requirement);
		return true;
	}
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Requirement> getAllRequirements() throws Exception{
		// TODO Auto-generated method stub
		return (ArrayList<Requirement>) emf.createQuery("from Requirement r" ).getResultList();
	}
	@Override
	public boolean updateRequirement(Requirement Requirement) throws Exception{
		System.out.println("in add dao");
		
		int id=Requirement.getId();
		System.out.println("id is init: "+id);
		String title=Requirement.getTitle();
		String shortTitle=Requirement.getShortTitle();
		String description=Requirement.getDescription();
		String subject=Requirement.getSubject();
		String type=Requirement.getType();
		String status=Requirement.getStatus();
		String version=Requirement.getVersion();
		String priority=Requirement.getPriority();
		String contributor=Requirement.getContributor();
		String elaboration=Requirement.getElaboration();
		
		System.out.println("id is here: "+id);
		System.out.println(title+" "+description);
		
		Requirement req=emf.find(Requirement.class, id);
		
		System.out.println(req);
		System.out.println("id is: "+id);
		
		req.setTitle(title);
		req.setShortTitle(shortTitle);
		req.setDescription(description);
		req.setSubject(subject);
		req.setType(type);
		req.setStatus(status);
		req.setVersion(version);
		req.setPriority(priority);
		req.setContributor(contributor);
		req.setElaboration(elaboration);
		
		emf.persist(req);
		
		return true;
	}
}
