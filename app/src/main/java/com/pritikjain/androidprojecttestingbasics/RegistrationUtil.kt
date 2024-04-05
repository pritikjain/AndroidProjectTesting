package com.pritikjain.androidprojecttestingbasics

object  RegistrationUtil {

    private val existingUsers = listOf("Peter", "Carl")

    /**
     * the input is not valid if ....
     * ... the username/password is empty
     * ... the username is already taken
     * ... the confirmedPassword is not the same as the real password
     * ... the password contains less than 2 digits
     */
    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmPassword: String

    ): Boolean {
        if(username.isEmpty() || password.isEmpty()) {
            return false
        }
        if(username in existingUsers){
            return false
        }
        if(password != confirmPassword) {
            return false
        }
        if(password.count{ it.isDigit()} < 2) {
            return false
        }

        return true
    }

}