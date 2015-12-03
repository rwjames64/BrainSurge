/**
 * 
 */
package edu.asu.teamq.brainsurge.content;

import java.util.Map;

import edu.asu.teamq.brainsurge.authentication.User;

/**
 * Implementation of the ContentHandler interface for use as a proof of concept.
 */
public class ContentHandlerImpl implements ContentHandler {

	/* (non-Javadoc)
	 * @see edu.asu.teamq.brainsurge.content.ContentHandler#get(edu.asu.teamq.brainsurge.authentication.User, java.lang.String)
	 */
	@Override
	public Content get(User user, String page, Map<String, String[]> params) {
		// TODO Auto-generated method stub
		return new NotFoundContent(page, params);
	}

}
