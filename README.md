# BrainSurge

## Description
This is a proof of concept for a class project representing an educational portal to verify the feasability of creating the application using a Java based server.

## Key Classes
### src.edu.asu.teamq.brainsurge.RequestHandler
The RequestHandler behaves as the controller handling all web requests. This handler parses the request and passes the data through to each component to build the response.
### src.edu.asu.teamq.brainsurge.authentication.AuthenticationHandlerImpl
At this point, the AuthenticationHandler is a basic stub class that simply returns a User object.
### src.edu.asu.teamq.brainsurge.content.ContentHandlerImpl
This is another stub class to create a Content object to be formatted by the View. Since there is no content available, it just creates a NotFoundContent object.
### src.edu.asu.teamq.brainsurge.view.ViewImpl
This is the final stub class that creates a String from the Content object created in the ContentHandler. In the final product, this String will be the HTML for the web page.

## Running with JBoss Developer Studio
Go to JBoss Developer studio's workspace on the command line
```
git clone https://github.com/rwjames64/BrainSurge.git
```
1. Select **File->Import Projects from Folders**
2. Select the folder for BrainSurge that was cloned from git
3. Select **Import raw project(I'll configure it later)**
4. Click **Finish**
5. In the project explorer, right click on the BrainSurge project
6. Select **Configure->Convert to Faceted Form...**
7. **Java** should already be enabled
8. Select **Dynamic Web Module** and **JBoss Web Services Core**
9. Click **Further configuration required...** towards the bottom
10. If you have not configured a server runtime, you will need to click **Next** to configure it, otherwise click **OK**
11. Refresh the project, then right click and select **Build Path->Configure Build Path...**
12. Click **Add Library...**
13. Select **Server Runtime**
14. Select the JBoss server runtime
15. Click **Finish**
16. Click **OK**, you might need to refresh the project again
17. Open the Servers window, right click on the server, and select **Add and Remove...**
18. Select BrainSurge and click **Add >**
19. Click **Finish**
20. Right click on the server and click **Start**
21. After the Server finishes loading, open any web browser and go to http://localhost:8080/BrainSurge/video?id=3217

## Additional Notes
The RequestHandler is configured to accept all requests within the local path of where BrainSurge is deployed to the server.
