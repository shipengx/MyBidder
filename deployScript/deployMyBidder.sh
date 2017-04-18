 #!/bin/bash
 #
 #
 
 rm /opt/apache-tomcat/webapps/ROOT.war
 rm -rf /opt/apache-tomcat/webapps/ROOT
 
 cp /Users/sxu/code/workspace/MyBidder/target/MyBidder.war /opt/apache-tomcat/webapps/ROOT.war
 
 
 