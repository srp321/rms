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
}
