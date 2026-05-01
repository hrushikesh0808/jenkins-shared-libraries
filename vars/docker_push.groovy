def call(String Project, String ImageTag, String dockerhubuser) {
withCredentials ([username Password (credentialsId: 'dockerHubCred', passwordVariable: 'dockerHubpass', usernameVariable: 'dockerhubuser')])
}
sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
