package utils;

import java.util.HashMap;
import java.util.Map;

public class GlobalDataConfigKeys {

	private static final Map<String, String> CONFIG_DEFAULTS= new HashMap<String, String>();

	// AppCivist Instance Configuration Keys	
	public static final String APPCIVIST_INSTANCE_API_KEY = "appcivist.instance.api-key"; //:** a generated secret code that can be use by apps to connect to the API and access information of //assemblies, campaigns, working groups and contributions on this instance. 
	public static final String APPCIVIST_INSTANCE_ASSEMBLY_NETWORK = "appcivist.instance.assembly-network"; 	//:** if TRUE, it allows COORDINATORS of the principal assembly to create new and manage other assemblies //under the principal one. 
	public static final String APPCIVIST_INSTANCE_ASSEMBLY_NETWORK_CAMPAIGN_LIMIT = "appcivist.instance.assembly-network-campaign-limit"; 		//:** number of ongoing Campaign (per assembly) that can be created in the network.
	public static final String APPCIVIST_INSTANCE_ASSEMBLY_NETWORK_LIMIT  = "appcivist.instance.assembly-network-limit"; //:** number of Assemblies that can be created in the network.
	public static final String APPCIVIST_INSTANCE_ASSEMBLY_NETWORK_WORKING_GROUP_LIMIT = "appcivist.instance.assembly-network-working-group-limit";	//:** number of Working Groups (per assembly and campaign) that can be created in the network.
	public static final String APPCIVIST_INSTANCE_ETHERPAD_API_KEY = "appcivist.instance.etherpad-api-key"; 	//:** (only for COORDINATORS) configures the Etherpad API key in case the coordinators decide to use //their own etherpad server instance
	public static final String APPCIVIST_INSTANCE_ETHERPAD_BASE_URL = "appcivist.instance.etherpad-base-url"; 	//:** Base URL of the Etherpad server in use by this instance
	public static final String APPCIVIST_INSTANCE_INSTANCE_DOMAIN = "appcivist.instance.domain"; 	//:** domain registered to the instance (when Signing in, the server will determine the principal //assembly associated to the user by reading the domain from where the request is coming from)
	public static final String APPCIVIST_INSTANCE_INSTANCE_THEME = "appcivist.instance.theme";	//:** a URL that points to a CSS files that will overwrite the color scheme of the site for this assembly
	
	// Assembly Level Configuration Keys
	public static final String APPCIVIST_ASSEMBLY_DISABLE_NEW_MEMBERSHIPS = "appcivist.assembly.disable-new-memberships"; // only coordinators can add new members to the assembly, by uploading users for them.   
	public static final String APPCIVIST_ASSEMBLY_ENABLE_FORUM = "appcivist.assembly.enable-forum"; // if TRUE, an assembly page will be the home page after signing in (this assembly page has not been designed yet)
	public static final String APPCIVIST_ASSEMBLY_ENABLE_MODERATOR_ROLE = "appcivist.assembly.enable-moderator-role"; // if TRUE, members can also have the role MODERATOR, which allows a member to delete content (comments, proposals, ideas, etc.)
	public static final String APPCIVIST_ASSEMBLY_HAS_REGISTRATION_FORM = "appcivist.assembly.has-registration-form"; // if TRUE, to join the assembly, users must fill in a registration form
	public static final String APPCIVIST_ASSEMBLY_HAS_REGISTRATION_FORM_ID = "appcivist.assembly.has-registration-form-id"; // an ID that represents an internal registration form use 
	public static final String APPCIVIST_ASSEMBLY_HAS_REGISTRATION_FORM_URL = "appcivist.assembly.has-registration-form-url"; // a URL to an external registration form
	public static final String APPCIVIST_ASSEMBLY_MEMBERSHIP_INVITATION_BY_MEMBERS = "appcivist.assembly.membership-invitation-by-members"; // if TRUE, regular members can invite other users to join, otherwise only COORDINATORS have this right
	public static final String APPCIVIST_ASSEMBLY_MEMBERSHIP_TYPE = "appcivist.assembly.membership-type"; // REGISTRATION (other users ask to join), INVITATION (members invite other users) or INVITATION_AND_REGISTRATION. 
	
	// Campaign Level Configuration Keys
	public static final String APPCIVIST_CAMPAIGN_CONTRIBUTION_TYPE_PRINCIPAL = "appcivist.campaign.contribution-type-principal"; // what type of contribution is the displayed at the center of the page if a timeline with components is disabled (e.g., these campaigns is centered around PROPOSALS or IDEAS)    
	public static final String APPCIVIST_CAMPAIGN_CONTRIBUTION_TYPES = "appcivist.campaign.contribution-types"; // and array that contains the list of contribution TYPES collected in this campaign (IDEA, PROPOSAL, NOTE, etc.)  
	public static final String APPCIVIST_CAMPAIGN_DISABLE_DISCUSSIONS = "appcivist.campaign.disable-discussions"; // if TRUE, the comment sections in the campaign dashboard is disabled 
	public static final String APPCIVIST_CAMPAIGN_DISABLE_ETHERPAD = "appcivist.campaign.disable-etherpad"; // if TRUE, proposals do not have an etherpad extended text attached, only a description field. 
	public static final String APPCIVIST_CAMPAIGN_DISABLE_EXTENDED_FEEDBACK = "appcivist.campaign.disable-extended-feedback"; // if TRUE, extended feedback is disabled 
	public static final String APPCIVIST_CAMPAIGN_DISABLE_EXTENDED_FEEDBACK_PUBLIC = "appcivist.campaign.disable-extended-feedback-public"; // if TRUE, extended feedback is disabled in the public site
	public static final String APPCIVIST_CAMPAIGN_DISABLE_EXTENDED_NEW_CONTRIBUTIONS  = "appcivist.campaign.disable-new-contributions"; // if TRUE, contributions can only be imported by COORDINATORS, members will not be able to create ideas or proposals
	public static final String APPCIVIST_CAMPAIGN_DISABLE_INFORMAL_VOTING = "appcivist.campaign.disable-informal-voting"; // if TRUE, up and down votes are disabled
	public static final String APPCIVIST_CAMPAIGN_DISABLE_INFORMAL_VOTING_PUBLIC = "appcivist.campaign.disable-informal-voting-public"; // if TRUE, up and down votes are disabled in the public site
	public static final String APPCIVIST_CAMPAIGN_DISABLE_PUBLIC_DISCUSSIONS = "appcivist.campaign.disable-public-discussions"; // if TRUE, the comment sections is hidden in public site
	public static final String APPCIVIST_CAMPAIGN_DISABLE_PUBLIC_SITE = "appcivist.campaign.disable-public-site"; // if TRUE, the campaign does not have a public site
	public static final String APPCIVIST_CAMPAIGN_EXTENDED_FEEDBACK_PASSWORD = "appcivist.campaign.extended-feedback-password"; // if TRUE, extended feedback is disabled 
	public static final String APPCIVIST_CAMPAIGN_HIDE_TIMELINE = "appcivist.campaign.hide-timeline"; // if TRUE, the timeline of the campaign is hidden and the campaign has only one stage
	public static final String APPCIVIST_CAMPAIGN_SHOW_ASSEMBLY_LOGO = "appcivist.campaign.show-assembly-logo"; // if TRUE, show the assembly logo in the campaign dashboard
	
	// Component Level Configuration Keys
	public static final String APPCIVIST_COMPONENT_CONTRIBUTION_TYPE_PRINCIPAL = "appcivist.component.contribution-type-principal"; // what type of contribution is the displayed at the center of the page when this component in the timeline is current (e.g., in Idea Collection, the main contribution type will be IDEAS)
	
	// Working Group Configuration Keys
	public static final String APPCIVIST_WG_DISABLE_PUBLIC_SITE = "appcivist.wg.disable-public-site"; // if TRUE, the working group is not available in the public site
	public static final String APPCIVIST_WG_ENABLE_MODERATOR_ROLE = "appcivist.wg.enable-moderator-role"; // if TRUE, members can also have the role MODERATOR, which allows a member to delete content (comments, proposals, ideas, etc.)
	public static final String APPCIVIST_WG_HAS_REGISTRATION_FORM = "appcivist.wg.has-registration-form"; // if TRUE, to join the assembly, users must fill in a registration form
	public static final String APPCIVIST_WG_HAS_REGISTRATION_FORM_ID = "appcivist.wg.has-registration-form-id"; // an ID that represents an internal registration form use 
	public static final String APPCIVIST_WG_HAS_REGISTRATION_FORM_URL = "appcivist.wg.has-registration-form-url"; // a URL to an external registration form
	public static final String APPCIVIST_WG_MEMBERSHIP_INVITATION_BY_MEMBERS = "appcivist.wg.membership-invitation-by-members"; // if TRUE, regular members can invite other users to join, otherwise only COORDINATORS have this right
	public static final String APPCIVIST_WG_MEMBERSHIP_TYPE = "appcivist.wg.membership-type"; // REGISTRATION (other users ask to join), INVITATION (members invite other users) or INVITATION_AND_REGISTRATION. 
	
	static {
		// AppCivist Instance Configuration Default Values		
		CONFIG_DEFAULTS.put(APPCIVIST_INSTANCE_ASSEMBLY_NETWORK, "FALSE");
		CONFIG_DEFAULTS.put(APPCIVIST_INSTANCE_ASSEMBLY_NETWORK_CAMPAIGN_LIMIT, "1");
		CONFIG_DEFAULTS.put(APPCIVIST_INSTANCE_ASSEMBLY_NETWORK_LIMIT, "10");
		CONFIG_DEFAULTS.put(APPCIVIST_INSTANCE_ASSEMBLY_NETWORK_WORKING_GROUP_LIMIT, "10");
		CONFIG_DEFAULTS.put(APPCIVIST_INSTANCE_ETHERPAD_API_KEY, "http://localhost:9001");
		CONFIG_DEFAULTS.put(APPCIVIST_INSTANCE_ETHERPAD_BASE_URL, "3dca6eb8e4f2b5ea5216a88e49d7a63c09da0d7c793d0734b708058e0a687a19");
		
		// Assembly Configuration Default Values
		CONFIG_DEFAULTS.put(APPCIVIST_ASSEMBLY_DISABLE_NEW_MEMBERSHIPS, "FALSE");
		CONFIG_DEFAULTS.put(APPCIVIST_ASSEMBLY_ENABLE_FORUM, "FALSE");
		CONFIG_DEFAULTS.put(APPCIVIST_ASSEMBLY_ENABLE_MODERATOR_ROLE, "FALSE");
		CONFIG_DEFAULTS.put(APPCIVIST_ASSEMBLY_HAS_REGISTRATION_FORM, "FALSE");
		CONFIG_DEFAULTS.put(APPCIVIST_ASSEMBLY_MEMBERSHIP_INVITATION_BY_MEMBERS, "FALSE");
		CONFIG_DEFAULTS.put(APPCIVIST_ASSEMBLY_MEMBERSHIP_TYPE, "INVITATION_AND_REGISTRATION");
		
		// Campaign Configuration Default Values
		CONFIG_DEFAULTS.put(APPCIVIST_CAMPAIGN_CONTRIBUTION_TYPE_PRINCIPAL, "PROPOSAL");
		CONFIG_DEFAULTS.put(APPCIVIST_CAMPAIGN_CONTRIBUTION_TYPES, "IDEA, PROPOSAL, COMMENT");
		CONFIG_DEFAULTS.put(APPCIVIST_CAMPAIGN_DISABLE_DISCUSSIONS, "TRUE");
		CONFIG_DEFAULTS.put(APPCIVIST_CAMPAIGN_DISABLE_ETHERPAD, "FALSE");
		CONFIG_DEFAULTS.put(APPCIVIST_CAMPAIGN_DISABLE_EXTENDED_FEEDBACK, "FALSE");
		CONFIG_DEFAULTS.put(APPCIVIST_CAMPAIGN_DISABLE_EXTENDED_FEEDBACK_PUBLIC, "FALSE");
		CONFIG_DEFAULTS.put(APPCIVIST_CAMPAIGN_DISABLE_EXTENDED_NEW_CONTRIBUTIONS , "FALSE");
		CONFIG_DEFAULTS.put(APPCIVIST_CAMPAIGN_DISABLE_INFORMAL_VOTING, "FALSE");
		CONFIG_DEFAULTS.put(APPCIVIST_CAMPAIGN_DISABLE_INFORMAL_VOTING_PUBLIC, "FALSE");
		CONFIG_DEFAULTS.put(APPCIVIST_CAMPAIGN_DISABLE_PUBLIC_DISCUSSIONS, "FALSE");
		CONFIG_DEFAULTS.put(APPCIVIST_CAMPAIGN_DISABLE_PUBLIC_SITE, "FALSE");
		CONFIG_DEFAULTS.put(APPCIVIST_CAMPAIGN_EXTENDED_FEEDBACK_PASSWORD, "a44@c1v1st");
		CONFIG_DEFAULTS.put(APPCIVIST_CAMPAIGN_HIDE_TIMELINE, "FALSE");
		CONFIG_DEFAULTS.put(APPCIVIST_CAMPAIGN_SHOW_ASSEMBLY_LOGO, "FALSE");
		
		// Component Level Configuration Default Values
		CONFIG_DEFAULTS.put(APPCIVIST_COMPONENT_CONTRIBUTION_TYPE_PRINCIPAL,"PROPOSAL"); 
		
		// Working Group Level Configuration Default Values
		CONFIG_DEFAULTS.put(APPCIVIST_WG_DISABLE_PUBLIC_SITE, "FALSE");
		CONFIG_DEFAULTS.put(APPCIVIST_WG_ENABLE_MODERATOR_ROLE, "FALSE");
		CONFIG_DEFAULTS.put(APPCIVIST_WG_HAS_REGISTRATION_FORM, "FALSE");
		CONFIG_DEFAULTS.put(APPCIVIST_WG_MEMBERSHIP_INVITATION_BY_MEMBERS, "FALSE");
		CONFIG_DEFAULTS.put(APPCIVIST_WG_MEMBERSHIP_TYPE, "INVITATION_AND_REGISTRATION");

    }
	
}