package models

import javax.inject.Inject

@javax.inject.Singleton
class UserDao @Inject()() {

  def lookupUser(u: User): Boolean = {
      val plainText = u.password;
      val stored = PasswordFactory.hash("pass");
      val isMatch = PasswordFactory.verify(plainText, stored);

      if (u.username == "user" && isMatch) true else false
  }

}
