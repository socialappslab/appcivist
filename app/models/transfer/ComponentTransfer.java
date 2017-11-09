package models.transfer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFormat;
import enums.ComponentTypes;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class ComponentTransfer {
	private Long componentId;
	private String title;
	private String description;
	private String key;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm a z")
	private Date startDate;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm a z")
	private Date endDate;
	private UUID uuid = UUID.randomUUID();
	private int position; 
	private int timeline;
	private Boolean linked;
	private List<ComponentMilestoneTransfer> milestones = new ArrayList<>();
	private List<ComponentMilestoneTransfer> deletedMilestones = new ArrayList<>();
	private List<ContributionTransfer> contributions = new ArrayList<>();
	private List<VotingBallotTransfer> ballots = new ArrayList<>();
	private List<ContributionTemplateTransfer> templates = new ArrayList<>();
	private List<ConfigsTransfer> configs = new ArrayList<>();

	public ComponentTypes getType() {
		return type;
	}

	public void setType(ComponentTypes type) {
		this.type = type;
	}

	@Enumerated(EnumType.STRING)
	private ComponentTypes type;
	
	public ComponentTransfer() {
		super();
	}

	public Long getComponentId() {
		return componentId;
	}

	public void setComponentId(Long componentId) {
		this.componentId = componentId;
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

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getTimeline() {
		return timeline;
	}

	public void setTimeline(int timeline) {
		this.timeline = timeline;
	}

	public Boolean getLinked() {
		return linked;
	}

	public void setLinked(Boolean linked) {
		this.linked = linked;
	}

	public List<ComponentMilestoneTransfer> getDeletedMilestones() {
		return deletedMilestones;
	}

	public void setDeletedMilestones(List<ComponentMilestoneTransfer> milestones) {
		this.deletedMilestones = milestones;
	}

	public List<ComponentMilestoneTransfer> getMilestones() {
		return milestones;
	}

	public void setMilestones(List<ComponentMilestoneTransfer> milestones) {
		this.milestones = milestones;
	}

	public List<ContributionTransfer> getContributions() {
		return contributions;
	}

	public void setContributions(List<ContributionTransfer> contributions) {
		this.contributions = contributions;
	}

	public List<VotingBallotTransfer> getBallots() {
		return ballots;
	}

	public void setBallots(List<VotingBallotTransfer> ballots) {
		this.ballots = ballots;
	}

	public List<ContributionTemplateTransfer> getTemplates() {
		return templates;
	}

	public void setTemplates(List<ContributionTemplateTransfer> templates) {
		this.templates = templates;
	}

	public List<ConfigsTransfer> getConfigs() {
		return configs;
	}

	public void setConfigs(List<ConfigsTransfer> configs) {
		this.configs = configs;
	}
}
