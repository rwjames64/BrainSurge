/**
 * 
 */
package edu.asu.teamq.brainsurge.content;

import edu.asu.teamq.brainsurge.authentication.User;

/**
 * @author james
 *
 */
public class ContentHandlerImpl implements ContentHandler {

	/* (non-Javadoc)
	 * @see edu.asu.teamq.brainsurge.content.ContentHandler#get(edu.asu.teamq.brainsurge.authentication.User, java.lang.String)
	 */
	@Override
	public Content get(User user, String request) {
		// TODO Auto-generated method stub
		return new NotFoundContent();
	}

}
