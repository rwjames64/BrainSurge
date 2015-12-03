package edu.asu.teamq.brainsurge.content;

import java.util.Map;

import edu.asu.teamq.brainsurge.authentication.User;

/**
 * The ContentHanlder serves as Model and communicates with the database to
 * obtain and update the content for the site.
 */
public interface ContentHandler {

	/**
	 * Get the content associated with the page request given the provided
	 * parameters
	 * 
	 * @param user		The user requesting the content
	 * @param page		The page being requested
	 * @param params	The provided parameters
	 * @return			The content object
	 */
	public Content get(User user, String page, Map<String, String[]> params);
}