package org.example;

public class RegistrationUtil {
    boolean validationUserInput(String username,String passWord,String confirmPassword)
        if (username.isEmpty() || passWord.isEmpry() || confirmPassword.ismpty()){
            return false;
       }
        if (!passWord.equals(confirmPassword)){
            return false;
       }else{
          return true;
       }

}
