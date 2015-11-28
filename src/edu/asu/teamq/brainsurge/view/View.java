package edu.asu.teamq.brainsurge.view;

import edu.asu.teamq.brainsurge.authentication.User;
import edu.asu.teamq.brainsurge.content.Content;

public interface View {

	public String format(Content content, User user);
}