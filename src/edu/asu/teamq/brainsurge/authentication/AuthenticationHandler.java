/**
 * 
 */
package edu.asu.teamq.brainsurge.authentication;

/**
 * @author james
 *
 */
public interface AuthenticationHandler {

	public User getUser(String token);
}