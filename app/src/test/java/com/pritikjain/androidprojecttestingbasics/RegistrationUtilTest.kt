package com.pritikjain.androidprojecttestingbasics



import com.google.common.truth.Truth.assertThat
import com.pritikjain.androidprojecttestingbasics.Utils.RegistrationUtil
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            username = "",
            password = "123",
            confirmPassword = "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`(){
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Priti",
            password = "123",
            confirmPassword = "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Carl",
            password = "123",
            confirmPassword = "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password return false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Priti",
            password = "",
            confirmPassword = ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `incorrectly confirmed password returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Priti",
            password = "123456",
            confirmPassword = "abcdefg"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password contains less than 2 digits`(){
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Priti",
            password = "abcdefg5",
            confirmPassword = "abcdefg5"
        )
        assertThat(result).isFalse()
    }

}