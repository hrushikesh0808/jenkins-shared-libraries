def call(String ProjectName, String ImageTag, String DockerHubUser){
    sh "docket build -t $(DockerHubUser)/$(ProjectName):$(ImageTag) ."
}
