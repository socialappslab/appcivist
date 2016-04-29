package models.transfer;

import java.util.ArrayList;
import java.util.List;

public class CampaignSummaryTransfer {
	private String title;
	private String shortname;
	private String goal;	
	private List<ConfigTransfer> configs = new ArrayList<>();
	private List<ThemeTransfer> themes = new ArrayList<>();
	private List<WorkingGroupTransfer> workingGroups = new ArrayList<>();
	private CampaignTemplateTransfer template;
	private CampaignTimelineEdgeTransfer timelineEdges;
	public CampaignSummaryTransfer() {
		super();
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getShortname() {
		return shortname;
	}
	public void setShortname(String shortname) {
		this.shortname = shortname;
	}
	public String getGoal() {
		return goal;
	}
	public void setGoal(String goal) {
		this.goal = goal;
	}
	public List<ConfigTransfer> getConfigs() {
		return configs;
	}
	public void setConfigs(List<ConfigTransfer> configs) {
		this.configs = configs;
	}
	public List<ThemeTransfer> getThemes() {
		return themes;
	}
	public void setThemes(List<ThemeTransfer> themes) {
		this.themes = themes;
	}
	public List<WorkingGroupTransfer> getWorkingGroups() {
		return workingGroups;
	}
	public void setWorkingGroups(List<WorkingGroupTransfer> workingGroups) {
		this.workingGroups = workingGroups;
	}
	public CampaignTemplateTransfer getTemplate() {
		return template;
	}
	public void setTemplate(CampaignTemplateTransfer template) {
		this.template = template;
	}
	public CampaignTimelineEdgeTransfer getTimelineEdges() {
		return timelineEdges;
	}
	public void setTimelineEdges(CampaignTimelineEdgeTransfer timelineEdges) {
		this.timelineEdges = timelineEdges;
	}
}