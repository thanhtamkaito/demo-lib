repositories {
    mavenCentral()
    maven {
        name = "GitHubPackages"
        url = uri("https://maven.pkg.github.com/thanhtamkaito/demo-lib")
        credentials {
            username = "thanhtamkaito"
            password = "xxxxxxxxxxxxxxxxxx"
            println "GitHubPackages build.gradle\n\tusername=$username\n\ttoken=$password"
        }
    }
}

dependencies {
    implementation 'org.springframework.boot:spring-boot-starter'

    //###  Add depedency  
    implementation 'com.example:demo-lib:0.1'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
}
