/**
 * 
 */
package edu.asu.teamq.brainsurge.authentication;

/**
 * The AuthenticationHandler processes the information for authentication and
 * associates it with a particular user. This handler communicates with the user
 * database to determine the user as well as their appropriate roles.
 */
public interface AuthenticationHandler {

	public User getUser(String token);
}