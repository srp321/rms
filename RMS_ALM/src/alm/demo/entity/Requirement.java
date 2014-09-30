package alm.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@XmlRootElement
public class Requirement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(length = 30)
	private String title;

	@Column(length = 250)
	private String description;

	@Column(length = 10)
	private String shortTitle;

	@Column(length = 30)
	private String creator;
	
	@Column(length = 30)
	private String contributor;

	@Column(length = 30)
	private String type;

	@Column(length = 30)
	private String constraints;

	@Column(length = 30)
	private String links;

	@Column(length = 30)
	private String elaboration;

	@Column(length = 30)
	private String elaboratedBy;

	@Column(length = 30)
	private String parent;

	@Column(length = 30)
	private String priority;

	@Column(length = 30)
	private String status;
	
	@Temporal(TemporalType.DATE)
	private Date createdOn;

	@Temporal(TemporalType.DATE)
	private Date modified;

	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getShortTitle() {
		return shortTitle;
	}
	public void setShortTitle(String shortTitle) {
		this.shortTitle = shortTitle;
	}

	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	
	public String getContributor() {
		return contributor;
	}
	public void setContributor(String contributor) {
		this.contributor = contributor;
	}
	
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	
	public Date getModified() {
		return modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getConstraints() {
		return constraints;
	}
	public void setConstraints(String constraints) {
		this.constraints = constraints;
	}
	
	public String getLinks() {
		return links;
	}
	public void setLinks(String links) {
		this.links = links;
	}
	
	public String getElaboration() {
		return elaboration;
	}
	public void setElaboration(String elaboration) {
		this.elaboration = elaboration;
	}
	
	public String getElaboratedBy() {
		return elaboratedBy;
	}
	public void setElaboratedBy(String elaboratedBy) {
		this.elaboratedBy = elaboratedBy;
	}
	
	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent;
	}
	
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public Requirement() {
		super();
		System.out.println("inside Requirement()");

	}
	
	
	public Requirement(int id, String title, String description, String shortTitle,
			String creator, String contributor, Date modified, String type,
			String constraints, String links, String elaboration,
			String elaboratedBy, String parent, String priority, String status) {
		super();
		this.id=id;
		this.title = title;
		this.description = description;
		this.shortTitle = shortTitle;
		this.creator = creator;
		this.contributor = contributor;
		this.modified = modified;
		this.type = type;
		this.constraints = constraints;
		this.links = links;
		this.elaboration = elaboration;
		this.elaboratedBy = elaboratedBy;
		this.parent = parent;
		this.priority = priority;
		this.status = status;
	}
	


	@Override
	public String toString() {
		return "Requirement [id=" + id + ", title=" + title + ", description="
				+ description + ", shortTitle=" + shortTitle + ", creator="
				+ creator + ", contributor=" + contributor + ", modified="
				+ modified + ", type=" + type + ", constraints=" + constraints
				+ ", links=" + links + ", elaboration=" + elaboration
				+ ", elaboratedBy=" + elaboratedBy + ", parent=" + parent
				+ ", priority=" + priority + ", status=" + status + "]";
	}

}

