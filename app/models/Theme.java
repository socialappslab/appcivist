package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.util.List;

@Entity
public class Theme extends AppCivistBaseModel {
	@Id
	@GeneratedValue
    private Long themeId;
    private String title;
    private String description;
    private String icon;
    private String cover; 

    /**
	 * The find property is an static property that facilitates database query creation
	 */
    public static Finder<Long, Theme> find = new Finder<>(Theme.class);

    /*
	 * Getters and Setters
	 */
    public Long getThemeId() {
        return themeId;
    }

    public void setThemeId(Long themeId) {

        this.themeId = themeId;
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
    
    public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	/*
	 * Basic Data operations
	 */
    public static Theme read(Long themeId) {
        return find.ref(themeId);
    }

    public static List<Theme> findAll() {
        return find.all();
    }

    public static Theme create(Theme theme) {
        theme.save();
        theme.refresh();
        return theme;
    }

    public static Theme createObject(Theme theme) {
        theme.save();
        return theme;
    }

    public static void delete(Long id) {
        find.ref(id).delete();
    }

    public static void update(Long id) {
        find.ref(id).update();
    }
}