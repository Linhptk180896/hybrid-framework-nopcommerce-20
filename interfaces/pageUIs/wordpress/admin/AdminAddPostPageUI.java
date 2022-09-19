package pageUIs.wordpress.admin;

public class AdminAddPostPageUI {
	public static final String POST_TITLE = "xpath=//h1[@aria-label='Add title']";
	public static final String POST_BODY_BEFORE_CLICK = "xpath=//p[@role='button' and contains(@class,'block-editor-default-block-appender')]";
	public static final String POST_BODY_AFRER_CLICK = "xpath=//p[@role='document' and contains(@class,'block-editor-rich-text')]";
	public static final String PRE_PUBLISH_BUTTON = "xpath=//div[@class='edit-post-header__settings']//button[text()='Publish']";
	public static final String PUBLISH_BUTTON = "xpath=//div[@class='editor-post-publish-panel']//button[text()='Publish']";
	public static final String POST_PUBLISHED_MESSAGE = "xpath=//div[@class='components-snackbar']//div[contains(text(),'published')]";
	
}
