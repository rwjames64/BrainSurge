/**
 * 
 */
package edu.asu.teamq.brainsurge.view;

import edu.asu.teamq.brainsurge.authentication.User;
import edu.asu.teamq.brainsurge.content.Content;

/**
 * @author james
 *
 */
public class ViewImpl implements View {

	/* (non-Javadoc)
	 * @see edu.asu.teamq.brainsurge.view.View#format(edu.asu.teamq.brainsurge.content.Content, edu.asu.teamq.brainsurge.authentication.User)
	 */
	@Override
	public String format(Content content, User user) {
		StringBuilder string = new StringBuilder();
		string.append("File Not Found (404)");
		return string.toString();
	}

}