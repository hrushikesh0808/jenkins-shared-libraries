def call(String url, String branch){
  echo "This is cloning the code from git"
  git url: "${url}", branch: "${branch}"
  echo "Code Cloning Successful"
}
