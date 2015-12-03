/**
 * 
 */
package edu.asu.teamq.brainsurge.content;

import java.util.Map;

/**
 * A content object representing a 404 when content is not available for the
 * request page and provided parameters.
 */
public class NotFoundContent extends Content {

	private String page;
	private Map<String, String[]> params;
	
	public NotFoundContent() {
		
	}
	
	public NotFoundContent(String page, Map<String, String[]> params) {
		this.page = page;
		this.params = params;
	}

	/**
	 * @return the page
	 */
	public String getPage() {
		return page;
	}

	/**
	 * @param page the page to set
	 */
	public void setPage(String page) {
		this.page = page;
	}

	/**
	 * @return the params
	 */
	public Map<String, String[]> getParams() {
		return params;
	}

	/**
	 * @param params the params to set
	 */
	public void setParams(Map<String, String[]> params) {
		this.params = params;
	}
}