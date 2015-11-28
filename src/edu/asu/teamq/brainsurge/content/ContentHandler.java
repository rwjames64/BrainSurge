/**
 * 
 */
package edu.asu.teamq.brainsurge.content;

import edu.asu.teamq.brainsurge.authentication.User;

/**
 * @author james
 *
 */
public interface ContentHandler {

	public Content get(User user, String request);
}