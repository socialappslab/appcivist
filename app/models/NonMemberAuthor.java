package models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.annotations.ApiModel;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import models.misc.Views;

@Entity
@JsonInclude(Include.NON_EMPTY)
@ApiModel(value="NonMemberAuthor", description="Author of contributions who are not users of the platform")
public class NonMemberAuthor extends Model {

    @Id
    @GeneratedValue
    private Long id;

    @JsonView(Views.Public.class)
    private String name;

    @JsonView(Views.Public.class)
    private String email;

    @JsonView(Views.Public.class)
    private URL url;

    @JsonView(Views.Public.class)
    private String gender;

    @JsonView(Views.Public.class)
    private Integer age;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "nonMemberAuthors")
    private List<Contribution> contributions;

    @Transient
    @JsonView(Views.Public.class)
    private List<CustomFieldDefinition> customFieldDefinitions;

    @Transient
    @JsonView(Views.Public.class)
    private List<CustomFieldValue> customFieldValues;

    /**
     * The find property is an static property that facilitates database query creation
     */
    public static Finder<Long, NonMemberAuthor> find = new Finder<>(NonMemberAuthor.class);

    /*
     * Basic Data operations
     */
    public static NonMemberAuthor read(Long themeId) {
        return find.ref(themeId);
    }

    public static List<NonMemberAuthor> findAll() {
        return find.all();
    }

    public static NonMemberAuthor create(NonMemberAuthor author) {
        author.save();
        author.refresh();
        return author;
    }

    public static NonMemberAuthor createObject(NonMemberAuthor author) {
        author.save();
        return author;
    }

    public static void delete(Long id) {
        find.ref(id).delete();
    }

    public static void update(Long id) {
        find.ref(id).update();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public URL getUrl() {
		return url;
	}

	public void setUrl(URL url) {
		this.url = url;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

    public List<Contribution> getContributions() {
        return contributions;
    }

    public void setContributions(List<Contribution> contributions) {
        this.contributions = contributions;
    }

    public List<CustomFieldDefinition> getCustomFieldDefinitions() {
        List<CustomFieldDefinition> customFieldDefinitionsList = new ArrayList<CustomFieldDefinition>();
        for (Contribution c: contributions) {
            customFieldDefinitionsList.addAll(c.getResourceSpace().getCustomFieldDefinitions());
        }
        return customFieldDefinitionsList;
    }

    public void setCustomFieldDefinitions(List<CustomFieldDefinition> customFieldDefinitions) {
        this.customFieldDefinitions = customFieldDefinitions;
    }

    public List<CustomFieldValue> getCustomFieldValues() {
        List<CustomFieldValue> customFieldValuesList = new ArrayList<CustomFieldValue>();
        for (Contribution c: contributions) {
            customFieldValuesList.addAll(c.getResourceSpace().getCustomFieldValues());
        }
        return customFieldValuesList;
    }

    public void setCustomFieldValues(List<CustomFieldValue> customFieldValues) {
        this.customFieldValues = customFieldValues;
    }
}
