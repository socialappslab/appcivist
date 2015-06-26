package models;

import java.util.Date;

import javax.persistence.MappedSuperclass;

import com.avaje.ebean.Model;
import utils.GlobalData;

@MappedSuperclass
public class AppCivistBaseModel extends Model {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8474507825226089899L;
	/** 
	 * Properties that are common to all the entities in the model
	 * 
	 */
	private Date creation = new Date(); // by Default, the creation is NOW
	private Date lastUpdate = new Date(); // by Default, the creation is NOW
	private String lang = GlobalData.DEFAULT_LANGUAGE; // defaults language to English 
													 // TODO get the language automatically from 
													 // from the requests that creates it
	
	// Fields to implement 'soft' deletion 
	private Date removal = null;
	private Boolean removed = false;
			
	/**
	 * Empty constructor
	 */
	public AppCivistBaseModel() {
		super();
	}
	
	public AppCivistBaseModel(Date creation, String lang) {
		super();
		this.creation = creation;
		this.lang = lang;
	}

	/** 
	 * Constructor with a specific language
	 * @param lang
	 */
	public AppCivistBaseModel(String lang) {
		super();
		this.lang = lang;
	}

	public Date getCreation() {
		return creation;
	}

	public void setCreation(Date creation) {
		this.creation = creation;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Date getRemoval() {
		return removal;
	}

	public void setRemoval(Date removal) {
		this.removal = removal;
	}

	public Boolean getRemoved() {
		return removed;
	}

	public void setRemoved(Boolean removed) {
		this.removed = removed;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}
	
	public void updateNow() {
		this.lastUpdate = new Date();
	}
	
	public void softRemove() {
		this.removal = new Date();
		this.removed = true;
		this.save();
	}
	
	public static void softRemove(AppCivistBaseModel baseAppcivistObject) {
		baseAppcivistObject.removal = new Date();
		baseAppcivistObject.removed = true;
		baseAppcivistObject.save();
	}
}
