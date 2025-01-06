pipeline {	
	agent any	
	tools {	    
		maven 'my-maven'		
		jdk 'jdk-17'	
	}	
	stages {        
		stage('Clone'){			
			steps {git url:'https://github.com/AbhinavSdr/eureka-service-registery.git', branch:'master'}
		}
		stage('Build'){			
			steps {bat "mvn clean install -DskipTests"}		
		}
		// stage('Pre-Deploy'){
		// 	steps{bat "docker rm -f eureka-cntr"
		// 				"docker rmi -f eureka-img"}
		}		
		stage('Deploy') {			
			steps { bat "docker run -p 9411:9411 -d --name zipkin-cntr --network my-net openzipkin/zipkin"
						bat "docker build -t eureka-img ."			    
			            	bat "docker run -p 9761:8761 -d --name eureka-cntr --network my-net eureka-img"}		
		}		
	}
}