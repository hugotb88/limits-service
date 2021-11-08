# limits-service
Limits Service, part of the microservicesrest project course

@ConfigurationProperties("reference")
Used to retrieve values from a propertiesFile


#Using Spring Profiles 
- url of repo with the .properties files
  https://github.com/hugotb88/03.microservices
  
#For the following configurations, if the Spring Cloud  Config Server is configured, the application will take the cloud config,
#if not, it will take the active profile

#Spring profiles for default, dev and QA (Connected to properties files in git repo and Spring Config Server)
spring.profiles.active = dev

#Spring profile in cloud
spring.cloud.config.profile = qa