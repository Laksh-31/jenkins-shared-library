def call(String ProjectName, String ImageTag, String DockerHubUser) 
// In above line we are passing the arguments for projectname , imagetag, and dockerhubusername
{
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
