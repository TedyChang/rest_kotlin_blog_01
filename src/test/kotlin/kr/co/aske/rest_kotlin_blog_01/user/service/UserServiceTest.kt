package kr.co.aske.rest_kotlin_blog_01.user.service

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName

internal class UserServiceTest {
    private val service: UserService = UserService()

    @Test
    fun login_it_should_success() {
        // given
        // when
        val got = service.login()

        // then
        assertEquals("token", got)
    }
}