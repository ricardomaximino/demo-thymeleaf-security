###Generate SSL Certificate
* keytool -genkey -alias webappsecurity -storetype PKCS12 -keyalg RSA -keysize 2048 -keystore cert.p12 -validity 3650

###Packaging the App
* mvn clean install

###Running with docker

* docker build -f docker/Dockerfile -t webapp-image .

* docker run --rm --name webapp -p 8443:8443 webapp-imag

###Credentials
* admn:password

* user:password