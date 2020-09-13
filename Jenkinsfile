  
node {
	stage ('nopCommerce Register'){
		git "https://github.com/BojanVe/nopCommerce.git"
		}
	stage ('Build'){
    	dir("comtest") {
	   sh "mvn clean install"
       }
       	dir("comtest/target") {
	   sh "java -jar com.test-1.0-SNAPSHOT.jar"
       }
		}
}
