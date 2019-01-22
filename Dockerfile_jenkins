FROM jenkins/jenkins:latest

RUN /usr/local/bin/install-plugins.sh git matrix-auth workflow-aggregator build-name-setter credentials-binding timestamper sonar build-pipeline-plugin jenkins-multijob-plugin subversion

RUN apt-get update 
RUN apt-get install wget -y
RUN apt-get install unzip -y
RUN mkdir /opt/gradle/
RUN mkdir /opt/ant/
RUN mkdir /opt/maven
RUN wget https://gradle.org/next-steps/?version=4.10.3&format=all
RUN wget http://ftp.halifax.rwth-aachen.de/apache//ant/binaries/apache-ant-1.10.5-bin.zip
RUN wget http://www.gutscheine.org/mirror/apache/maven/maven-3/3.6.0/binaries/apache-maven-3.6.0-bin.zip
RUN unzip -d /opt/gradle/ gradle-4.10.2-all.zip
RUN unzip -d /opt/maven/ apache-maven-3.6.0-bin.zip
RUN unzip -d /opt/ant/ apache-ant-1.10.5-bin.zip
RUN export PATH=$PATH:/opt/gradle/gradle-4.10.3/bin
RUN export PATH=$PATH:/opt/maven/apache-maven-3.6.0-bin/bin/
RUN export PATH=$PATH:/opt/ant/apache-ant-1.10.5/bin/
RUN mkdir /var/logs
RUN rm apache-ant-1.10.5-bin.zip apache-maven-3.6.0-bin.zip gradle-4.10.2-all.zip
ENV JENKINS_USER admin
ENV JENKINS_PASS admin

# Skip initial setup
ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false

COPY executors.groovy /usr/share/jenkins/ref/init.groovy.d/
COPY default-user.groovy /usr/share/jenkins/ref/init.groovy.d/
