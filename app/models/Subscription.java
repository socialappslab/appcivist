package models;

import com.avaje.ebean.*;
import com.avaje.ebean.annotation.DbJson;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import enums.ContributionTypes;
import enums.SpaceTypes;
import enums.SubscriptionTypes;
import io.swagger.annotations.ApiModel;

import javax.persistence.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Entity
@JsonInclude(Include.NON_EMPTY)
@ApiModel(value = "Subscription", description = "Subsription for Notifications Support")
public class Subscription extends Model {
    @Id
    @GeneratedValue
    private Long id;

    @Transient
    private Long userId;

    @JsonInclude(Include.NON_EMPTY)
    @Column(name = "space_id")
    private Long spaceId;

    @JsonInclude(Include.NON_EMPTY)
    @Column(name = "space_type")
    @Enumerated(EnumType.STRING)
    private SpaceTypes spaceType;

    @JsonInclude(Include.NON_EMPTY)
    @Column(name = "subscription_type")
    @Enumerated(EnumType.STRING)
    private SubscriptionTypes subscriptionType;

    @Column(name = "newsletter_frecuency")
    private Integer newsletterFrecuency;

    @DbJson
    @Column(name = "ignored_events")
    @JsonInclude(Include.NON_EMPTY)
    private Map<String, Boolean> ignoredEvents;

    @DbJson
    @JsonInclude(Include.NON_EMPTY)
    @Column(name = "disabled_services")
    private Map<String, Boolean> disabledServices;

    @ManyToOne
    @JsonIgnore
    @Column(name = "user_id")
    private User user;

    @Column(name = "default_service")
    private Integer defaultService = null;

    @Column(name = "default_identity")
    private Integer defaultIdentity = null;

    public static Finder<Long, Subscription> find = new Finder<>(Subscription.class);

    public Subscription() {
        super();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(Long spaceId) {
        this.spaceId = spaceId;
    }

    public SpaceTypes getSpaceType() {
        return spaceType;
    }

    public void setSpaceType(SpaceTypes spaceType) {
        this.spaceType = spaceType;
    }

    public SubscriptionTypes getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(SubscriptionTypes subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public Integer getNewsletterFrecuency() {
        return newsletterFrecuency;
    }

    public void setNewsletterFrecuency(Integer newsletterFrecuency) {
        this.newsletterFrecuency = newsletterFrecuency;
    }

    public Map<String, Boolean> getIgnoredEvents() {
        return ignoredEvents;
    }

    public void setIgnoredEvents(HashMap<String, Boolean> ignoredEvents) {
        this.ignoredEvents = ignoredEvents;
    }

    public Map<String, Boolean> getDisabledServices() {
        return disabledServices;
    }

    public void setDisabledServices(HashMap<String, Boolean> disabledServices) {
        this.disabledServices = disabledServices;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getDefaultService() {
        return defaultService;
    }

    public void setDefaultService(Integer defaultService) {
        this.defaultService = defaultService;
    }

    public Integer getDefaultIdentity() {
        return defaultIdentity;
    }

    public void setDefaultIdentity(Integer defaultIdentity) {
        this.defaultIdentity = defaultIdentity;
    }

    public static List<Subscription> findByUserId(User u) {
        com.avaje.ebean.Query<Subscription> q = find.where().eq("user.userId",u.getUserId()).query();
        List<Subscription> membs = q.findList();
        return membs;
    }


}
