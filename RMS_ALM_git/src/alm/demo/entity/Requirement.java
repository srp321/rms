package alm.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	public void setId(Integer id) {
		this.id = id;
	}


	public Requirement() {
		super();
		System.out.println("inside Requirement()");

	}
	
	
	public Requirement(String title, String description, String shortTitle,
			String creator,int id) {
		super();
		this.id=id;
		this.title = title;
		this.description = description;
		this.shortTitle = shortTitle;
		this.creator = creator;
	}

	


	@Override
	public String toString() {
		return "Requirement [id=" + id + ", title=" + title + ", description="
				+ description + ", shortTitle=" + shortTitle + ", creator="
				+ creator + "]";
	}
}

