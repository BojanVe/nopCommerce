  
node {
	stage ('nopCommerce Register'){
		git "https://github.com/BojanVe/nopCommerce.git"
		}
	stage ('Build'){
    	dir("comtest") {
	   bat "mvn clean install"
       }
       	dir("target") {
	   bat "java -jar com.test-1.0-SNAPSHOT.jar"
       }
		}
}
