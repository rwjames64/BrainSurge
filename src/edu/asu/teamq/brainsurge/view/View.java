package edu.asu.teamq.brainsurge.view;

import edu.asu.teamq.brainsurge.authentication.User;
import edu.asu.teamq.brainsurge.content.Content;

/**
 * The View interface provides the format method to return HTML content given
 * the content and user.
 */
public interface View {

	public String format(Content content, User user);
}