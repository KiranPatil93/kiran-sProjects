package examples.users;

import com.intuit.karate.junit5.Karate;

class UsersRunner {
    
    @Karate.Test
    Karate testUsers() {
        return Karate.run("Pages/addNewBuyer.feature").tags("@readcsvfile").relativeTo(getClass());
    }    

}
