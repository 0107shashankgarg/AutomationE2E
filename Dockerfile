FROM shashankgarg0107/automation_e2e
RUN apt-get update
RUN curl https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb -o /chrome.deb
RUN dpkg -i /chrome.deb || apt-get install -yf
RUN rm /chrome.deb
#RUN apt-get install -y allure

#RUN mvn clean

#RUN mvn -f pom.xml dependency:go-offline
WORKDIR /usr/AutomationE2E
COPY ./pom.xml /usr/AutomationE2E
COPY ./src /usr/AutomationE2E/src
COPY ./driver /usr/AutomationE2E/driver
COPY ./configs /usr/AutomationE2E/configs

RUN mvn clean test -Dtest=DockerTest
#RUN CHMOD -R 777  /usr/AutomationE2E/


#dowmloaf and install a dependency if required
#VOLUME /usr/automation_fm/test

#tell the image what to do when it start
#as a contianer


CMD ["mvn","-o", "clean" ,"test" ,"-Dtest=Junit5Assertionest" ,"-Dselenide.browser=chrome" ,"-Dselenide.isheadless=true"]
#CMD ["mvn","-o", "clean" ,"test"  ,"-Dselenide.browser=chrome" ,"-Dselenide.isheadless=true"]