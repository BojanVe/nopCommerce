  
node {
	stage ('nopCommerce Register'){
		git "https://github.com/BojanVe/nopCommerce.git"
		}
	stage ('Build'){
    	dir("") {
	   bat "mvn clean install"
       }
       	dir("target") {
	   bat "java -jar OrderBDD-0.0.1-SNAPSHOT.jar"
       }
		}
}
