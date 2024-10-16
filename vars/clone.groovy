def call(String url, String branch){ // here we called a string function url and branch. 
                                     //This will help to call any url in arguments and same for branch as well.
   echo "This is cloning the code"
   git url: "${url}", branch: "${branch}"
   echo "cloning is successfull"
} // we are using shared libraries and code will be running from here instead of jenkins
