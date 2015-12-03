/**
 * 
 */
package edu.asu.teamq.brainsurge.view;

import java.util.Map;

import edu.asu.teamq.brainsurge.authentication.User;
import edu.asu.teamq.brainsurge.content.Content;
import edu.asu.teamq.brainsurge.content.NotFoundContent;

/**
 * Implementation of the View interface to serve as a proof of concept.
 */
public class ViewImpl implements View {

	/* (non-Javadoc)
	 * @see edu.asu.teamq.brainsurge.view.View#format(edu.asu.teamq.brainsurge.content.Content, edu.asu.teamq.brainsurge.authentication.User)
	 */
	@Override
	public String format(Content content, User user) {
		StringBuilder string = new StringBuilder();
		
		if (NotFoundContent.class.isInstance(content)) {
			NotFoundContent nfContent = (NotFoundContent) content;
			Map<String, String[]> params = nfContent.getParams();
			string.append("File Not Found (404)");
			string.append("\nPage: ").append(nfContent.getPage());
			
			for (String key : params.keySet()) {
				string.append("\nKey : ").append(key);
				
				for (String value : params.get(key)) {
					string.append("\nValue : ").append(value);
				}
			}
			
		}
		
		return string.toString();
	}

}